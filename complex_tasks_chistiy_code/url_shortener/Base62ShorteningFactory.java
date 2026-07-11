package complex_tasks_chistiy_code.url_shortener;

public class Base62ShorteningFactory extends ShortenerFactory{
    @Override
    ShorteningStrategy createStrategy() {
        return new Base62ShorteningStrategy();
    }
}
