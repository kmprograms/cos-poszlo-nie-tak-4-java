import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private BigDecimal price;
    private BigDecimal discount;

    public Product(String name, BigDecimal price, BigDecimal discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public BigDecimal totalPrice() {
        return price.multiply(BigDecimal.ONE.subtract(discount));
    }

    public static BigDecimal getTotalPrice(Set<Product> products) {
        return products
                .stream()
                .map(Product::totalPrice)
                .peek(tPrice -> System.out.println(tPrice))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(discount, product.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, discount);
    }
}
