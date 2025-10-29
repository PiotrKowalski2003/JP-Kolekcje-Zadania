package ProductComparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 08.Stwórz klasę reprezentującą produkt z polami, takimi jak nazwa i cena.
 * Zaimplementuj interfejs Comparable, aby produkty były porównywane na podstawie ceny.
 * Stwórz listę produktów i posortuj ją za pomocą Collections.sort(). Następnie wyświetl posortowaną listę.
 * Zmodyfikuj zadanie, aby tym razem użyć własnego komparatora do sortowania produktów według nazwy.
 * Wyświetl wynik i porównaj go z poprzednim.
 */
public class ProductComparision {
    public static void main(String[] args) {
        List<ProductComparable> products = new ArrayList<>();

        products.add(new  ProductComparable("Table", 599.99));
        products.add(new  ProductComparable("Chair", 279.99));
        products.add(new  ProductComparable("Armchair", 699.99));
        products.add(new  ProductComparable("Sofa", 1684.99));

        // kopia listy - shallow copy
        List<ProductComparable> productsCopy = new ArrayList<>(products);


        System.out.println("Lista przed sortowaniem:");
        products.forEach(System.out::println);

        Collections.sort(products);

        System.out.println("\nLista po sortowaniu:");
        products.forEach(System.out::println);

        // wlasny comparator
        System.out.println("\n------ Comparator wedlug nazwy ----");
        System.out.println("Przed sortowaniem:");
        productsCopy.forEach(System.out::println);

        Collections.sort(productsCopy, new NameComparator());   // metoda sort() wywoluje metode compare()
        System.out.println("Po sortowaniu:");
        productsCopy.forEach(System.out::println);

    }
}
