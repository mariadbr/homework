package complex_tasks_chistiy_code.url_shortener;

public class Base62ShorteningStrategy implements ShorteningStrategy{
    @Override
    public String shortenUrl(String longUrl) {
        //заглушка сокращения логики url
        return new StringBuilder(longUrl).substring(0, 4);
    }
}
