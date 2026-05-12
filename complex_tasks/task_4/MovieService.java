package complex_tasks.task_4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService <T extends Number> {
    private final Map<Movie, List<Rating<T>>> ratingMap = new HashMap<>();

    public synchronized void addRating(Movie name, Rating<T> rating) {
        if (rating.getRating().doubleValue() <= 0 || rating.getRating().doubleValue() > 10) {
            throw new InvalidRatingException("Оценка должна быть в пределах от 1 до 10.");
        }
        if (ratingMap.containsKey(name)) {
            ratingMap.get(name).add(rating);
        } else {
            List<Rating<T>> list = new ArrayList<>();
            list.add(rating);
            ratingMap.put(name, list);
        }
    }

    public double getAverageRating(Movie name) {
        double average = ratingMap.get(name)
                .stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElseThrow(() -> new NullPointerException("Для фильма нет оценок."));
        return average;
    }

    public List<Movie> sortMoviesByRating() {
        return ratingMap.entrySet()
                .stream()
                .filter(e -> !e.getValue().isEmpty())
                .sorted(Comparator.comparing(
                        (Map.Entry<Movie, List<Rating<T>>> e) -> average(e.getValue()))
                        .reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public double average(List<Rating<T>> list) {
        return list.stream()
                .mapToDouble(e -> e.getRating().doubleValue())
                .average()
                .orElse(0.0);
    }

    public Map<Movie, List<Rating<T>>> getAll() {
        return Map.copyOf(ratingMap);
    }
}