package complex_tasks.task_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    private InventoryService inventoryService;

    @BeforeEach
    void setUp() {
        inventoryService = new InventoryService();
    }

    /**
     * кейсы:
     *  isInventoryOpen = true
     *     [] add(Makeup, Concealer) -> [Makeup, List[Concealer]]
     *  isInventoryOpen = false
     *     [] add(Makeup, Concealer) -> []
     */

    @Test
    public void addProductWithInventoryOpen() {
        Product product = new Product("Concealer", 55.5, "Makeup");

        inventoryService.addProduct("Makeup", product);

        assertEquals(product.getName(), inventoryService.getAllByCategory("Makeup").getFirst().getName());
        assertEquals(product.getPrice(), inventoryService.getAllByCategory("Makeup").getFirst().getPrice());
    }

    @Test
    public void AddProductWithInventoryClosed() {
        InventoryService.setIsInventoryOpen(false);

        Product product = new Product("Water", 10.0, "Liquids");

        inventoryService.addProduct("Liquids", product);

        assertThrows(OutOfStockException.class, () ->
                inventoryService.getAllByCategory("Liquids"));
    }

    /**
     *  [Category, List<Product>]  -> get(category) -> Product product
     *  []  -> get(category) -> OutOfStockException
     */

    @Test
    public void getProductByCategoryTest() {
        Product product = new Product("Water", 10.0, "Liquids");

        inventoryService.addProduct("Liquids", product);

        Product actualResult = inventoryService.getProductByCategory("Liquids");

        assertEquals(product, actualResult);
    }

    @Test
    public void getProductByCategoryWhenNotPresentTest() {
        Product product = new Product("Water", 10.0, "Liquids");

        inventoryService.addProduct("Liquids", product);

        assertThrows(OutOfStockException.class, () ->
                        inventoryService.getProductByCategory("Makeup"),
                "An attempt to get product in empty category should lead to OutOfStockException.");
    }

    @Test
    public void filterByPriceTest() {
        Product product = new Product("Water", 10.0, "Liquids");
        Product product2 = new Product("Makeup", 40.5, "Mascara");

        inventoryService.addProduct("Water", product);
        inventoryService.addProduct("Makeup", product2);

        List<Product> list = inventoryService.filterByPrice(20.0);

        assertAll(
                () -> assertEquals(product2.getName(), list.getFirst().getName()),
                () -> assertEquals(1, list.size())
        );
    }

    /**
     * [Food, List<Bread, Tuna>] -> getAllByCategory(Food) -> List<Bread, Tuna>
     * [] -> getAllByCategory(Food) -> OutOfStockException
     */

    @Test
    public void getAllByCategoryTest() {
        Product product = new Product("Bread", 3.0, "Food");
        Product product2 = new Product("Tuna", 22.0, "Food");

        inventoryService.addProduct("Food", product);
        inventoryService.addProduct("Food", product2);

        List<Product> list = inventoryService.getAllByCategory("Food");

        assertAll(
                () -> assertEquals(2, list.size()),
                () -> assertEquals(list.getFirst().getName(), product.getName()),
                () -> assertEquals(list.get(1).getName(), product2.getName())
        );
    }

    @Test
    public void getAllByCategoryWhenNotPresentTest() {
        Product product = new Product("Tuna", 22.0, "Food");

        inventoryService.addProduct("Food", product);

        assertThrows(OutOfStockException.class, () ->
                inventoryService.getAllByCategory("Electronics"),
                "An attempt to get all products by the category with no products available should lead to OutOfStockException.");
    }
}
