import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;

public class App {

    /*
        Zadanie
        Oblicz sumaryczną cenę produktów (obiektów klasy Product), znajdujących się
        w przykładowej kolekcji bez powtórzeń.
    */

    public static void main(String[] args) {

        var products = Set.of(
                new Product("P1", new BigDecimal("10.1"), new BigDecimal("0.1")),
                new Product("P2", new BigDecimal("10.2"), new BigDecimal("0.2")),
                new Product("P3", new BigDecimal("10.3"), new BigDecimal("0.3"))
        );

        System.out.println("Total price = " + Product.getTotalPrice(products));
    }
}
