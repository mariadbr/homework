package complex_tasks_chistiy_code.url_shortener;

public class UrlShortenerService {
    private ShorteningStrategy shorteningStrategy;
    private UrlStorage urlStorage;

    public UrlShortenerService(ShortenerFactory shortenerFactory, UrlStorage urlStorage) { //фабрика или все-таки стратегия?
        this.shorteningStrategy = shortenerFactory.createStrategy();
        this.urlStorage = urlStorage;
    }

    public String shortenUrl(String longUrl) {
        String shortUrl = shorteningStrategy.shortenUrl(longUrl);

        urlStorage.saveUrlPair(shortUrl, longUrl);

        return shortUrl;
    }

    public String expandUrl(String shortUrl) {
        return urlStorage.getLongUrl(shortUrl);
    }



}
