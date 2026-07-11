package complex_tasks_chistiy_code.url_shortener;

public abstract class ShortenerFactory {
    abstract ShorteningStrategy createStrategy();
}
