package complex_tasks_chistiy_code.url_shortener;

public class Main {
    public static void main(String[] args) {
        //Конфигурация библиотеки с выбранной стратегией сокращения
        UrlShortenerService urlShortenerService = new UrlShortenerService(new Base62ShorteningFactory(), InMemoryStorage.getInstance());


        // Сокращение URL
        String shortUrl = urlShortenerService.shortenUrl("https://example.com/very/long/ur1");
        System.out.println("Short URL: " + shortUrl);

        // Восстановление URL
        String longUrl = urlShortenerService.expandUrl(shortUrl);
        System.out.println("Original URL: " + longUrl);
    }
}
