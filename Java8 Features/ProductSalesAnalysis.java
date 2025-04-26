import java.util.*;
import java.util.stream.Collectors;

class Sale {
    String productId;
    int quantity;
    double price;

    public Sale(String productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalRevenue() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Sale{productId=" + productId + ", quantity=" + quantity + ", price=" + price + "}";
    }
}

public class ProductSalesAnalysis {
    public static List<Sale> analyzeSales(List<Sale> sales) {
        return sales.stream()
                .filter(s -> s.quantity > 10)
                .sorted(Comparator.comparingDouble(Sale::getTotalRevenue).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
                new Sale("P1", 15, 20.0),
                new Sale("P2", 5, 100.0),
                new Sale("P3", 20, 50.0)
        );
        List<Sale> topSales = analyzeSales(sales);
        System.out.println("Top Sales: " + topSales);
    }
}
