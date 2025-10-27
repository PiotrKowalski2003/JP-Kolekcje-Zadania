package CityPopulation;

import java.util.TreeMap;

/**
 * 06.Stwórz mapę TreeMap, w której klucze reprezentują nazwy miast, a wartości ilości ludności.
 * Napisz komparator, który sortuje mapę według ilości ludności. Wyświetl posortowaną mapę.
 */
public class CityPopulation {
    public static void main(String[] args) {
        // TreeMap
        TreeMap<String, Integer> cities = new TreeMap<>();
        cities.put("Warszawa", 1863845);
        cities.put("Wroclaw", 672882);
        cities.put("London", 9840740);
        cities.put("Los Angeles", 3822238);
        cities.put("New York", 7936530);


        TreeMap<String, Integer> citiesByPopulation = new TreeMap<>(
                (city1, city2) -> {
                    int populationCompare = cities.get(city2).compareTo(cities.get(city1));
                    return populationCompare != 0 ? populationCompare : city1.compareTo(city2);
                }
        );
        citiesByPopulation.putAll(cities);

        // Posorotwana TreeMap
        System.out.println("\nPosortowana TreeMap - malejaco: ");
        citiesByPopulation.forEach((city, population)->System.out.println(city + " - " + population));
    }
}
