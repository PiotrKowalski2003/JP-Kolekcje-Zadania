package CarsComparison;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 10. Stwórz klasę reprezentującą samochód z polami, takimi jak marka, model i rok produkcji.
 * Napisz komparator, który sortuje samochody najpierw według marki, a następnie według modelu.
 * Stwórz listę samochodów i posortuj ją za pomocą tego komparatora. Wyświetl posortowaną listę.
 * Rozwiń zadanie, aby tym razem użyć niestandardowego komparatora, który sortuje samochody na podstawie rocznika od
 * najstarszego do najnowszego. Wyświetl wynik i porównaj go z poprzednim.
 */

public class CarComparison {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "RAV4", 2024));
        cars.add(new Car("Mercedes-Benz", "EQB", 2023));
        cars.add(new Car("Toyota", "C-HR", 2025));
        cars.add(new Car("BMW", "M8", 2024));

        System.out.println("Lista przed sortowaniem: ");
        cars.forEach(System.out::println);

        // Komparator - marka - model
        Comparator<Car> brandModelComparator = Comparator.comparing(Car::getBrand).thenComparing(Car::getModel);
        // Lista - posortowana
        List<Car> sortedByBrandModelList = new ArrayList<>(cars);
        sortedByBrandModelList.sort(brandModelComparator);
        System.out.println("\nLista posortowana - marka - model ");
        sortedByBrandModelList.forEach(System.out::println);

        // Komparator - rocznik - od najsatrszego
        Comparator<Car> yearComparator = Comparator.comparingInt(Car::getYear);
        cars.sort(yearComparator);
        System.out.println("\nLista posortowana - od najstarszego:");
        cars.forEach(System.out::println);
    }
}
