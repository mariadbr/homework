package complex_tasks_chistiy_code.url_shortener;

public interface UrlStorage {
    void saveUrlPair(String shortUrl, String longUrl);
    String getLongUrl(String shortUrl);
}
