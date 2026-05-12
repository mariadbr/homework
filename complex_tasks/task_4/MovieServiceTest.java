package complex_tasks.task_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    private MovieService<Double> movieService;

    @BeforeEach
    void setUp() {
        movieService = new MovieService<>();
    }

    /**
     * кейсы:
     * Avatar, Rating 5 -> [Avatar, [Rating 5]]
     * Avatar, Rating -5 -> InvalidRatingException
     */
    @Test
    public void addValidRatingTest() {
        int initialSize = movieService.getAll().size();
        Rating<Double> rating = new Rating<>(5.0);
        Movie movie = new Movie("Avatar");

        movieService.addRating(movie, rating);

        assertEquals(initialSize + 1, movieService.getAll().size());
    }

    @Test
    public void addInvalidRatingTest() {
        int initialSize = movieService.getAll().size();
        Rating<Double> rating = new Rating<>(-5.0);
        Movie movie = new Movie("Avatar");

        assertThrows(InvalidRatingException.class,
                () -> movieService.addRating(movie, rating),
                "Adding a movie with negative rating should lead to InvalidRatingException");
    }

    /**
     * кейсы:
     * [Avatar, List<8,10>] -> 6
     * [] -> NullPointerException
     */

    @Test
    public void getAverageRatingTest() {
        Movie movie = new Movie("Avatar");
        movieService.addRating(movie, new Rating<>(8.0));
        movieService.addRating(movie, new Rating<>(10.0));

        double actualResult = movieService.getAverageRating(movie);

        assertEquals(9.0, actualResult);
    }

    @Test
    public void getAverageRatingInEmptyMap() {
        Movie movie = new Movie("Silent Hill");
        assertThrows(NullPointerException.class,
                () -> movieService.getAverageRating(movie),
                "An attempt to find an average rating in empty map should lead to NullPointerException.");
    }

    @Test
    public void sortMoviesByRatingTest() {
        Movie movie = new Movie("Avatar");
        Movie movie2 = new Movie("Avatar 2");

        movieService.addRating(movie, new Rating<>(9.0));
        movieService.addRating(movie2, new Rating<>(8.5));

        List<Movie> list = movieService.sortMoviesByRating();

        assertAll(
                () -> assertEquals(movie, list.getFirst()),
                () -> assertEquals(movie2, list.get(1))
        );
    }
}
