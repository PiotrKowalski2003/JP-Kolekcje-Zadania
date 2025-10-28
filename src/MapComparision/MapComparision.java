package MapComparision;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 03.Stwórz aplikację, która umożliwia użytkownikowi przechowywanie par klucz-wartość w mapie typu HashMap i TreeMap.
 * Po dodaniu kilku elementów, zwróć uwagę na różnice w kolejności kluczy w obu mapach.
 */

public class MapComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();

        System.out.println("Wprowadz pary klucz-wartosc lub 's' aby zakonczyc");
        while (true) {
            System.out.println("\nKlucz lub 's' aby zakonczyc");
            String key =  scanner.nextLine();
            if (key.equalsIgnoreCase("s")) {break;}

            System.out.println("Wartosc: ");
            String value = scanner.nextLine();

            hashMap.put(key, value);
            treeMap.put(key, value);
            System.out.println("Pomyslnie dodano");
        }

        System.out.println("\nHashMap:");
        hashMap.forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("TreeMap:");
        treeMap.forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\nHashMap - brak uporzadkowania");
        System.out.println("TreeMap - automatycznie sortowanie kluczy");
    }
}
