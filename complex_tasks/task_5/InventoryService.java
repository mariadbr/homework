package complex_tasks.task_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {
    private boolean isInventoryOpen = true;
    private final Map<String, List<Product>> productMap = new HashMap<>();

    public void setInventoryOpen(boolean isInventoryOpen) {
        this.isInventoryOpen = isInventoryOpen;
    }

    public void addProduct(String category, Product product) {
        if (!isInventoryOpen) {
            System.out.println("Товар не добавлен");
            return;
        }
        productMap.computeIfAbsent(category, k -> new ArrayList<>())
                .add(product);
    }

    public Product getProductByCategory(String category) {
        if (!productMap.containsKey(category) || productMap.get(category).isEmpty()) {
            throw new OutOfStockException("Товары в категории " + category + "  отсутствуют");
        }
        return productMap.get(category).getFirst();
    }

    public List<Product> filterByPrice(double minPrice) {
        return productMap.values()
                .stream()
                .flatMap(List::stream)
                .filter(e -> e.getPrice() >= minPrice)
                .collect(Collectors.toList());
    }

    public List<Product> getAllByCategory(String category) {
        if (!productMap.containsKey(category) || productMap.get(category).isEmpty()) {
            throw new OutOfStockException("Товары в категории " + category + "  отсутствуют");
        }
        return productMap.get(category);
    }
}
