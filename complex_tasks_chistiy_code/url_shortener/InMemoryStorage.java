package complex_tasks_chistiy_code.url_shortener;

import java.util.HashMap;

public class InMemoryStorage implements UrlStorage{
    //Singleton: Единственное хранилище всех URL
    private static InMemoryStorage inMemoryStorage;
    private HashMap<String, String> shortUrlLongUrlMap = new HashMap<>();

    private InMemoryStorage() {
    }

    public static InMemoryStorage getInstance() {
        if (inMemoryStorage == null) {
            inMemoryStorage = new InMemoryStorage();
        }
        return inMemoryStorage;
    }

    @Override
    public void saveUrlPair(String shortUrl, String longUrl) {
        shortUrlLongUrlMap.put(shortUrl, longUrl);
        System.out.println("New pair added successfully");
    }

    @Override
    public String getLongUrl(String shortUrl) {
        if (!shortUrlLongUrlMap.containsKey(shortUrl)) {
            System.out.println("No such url present");
            return null;
        }
        return shortUrlLongUrlMap.get(shortUrl);
    }
}
