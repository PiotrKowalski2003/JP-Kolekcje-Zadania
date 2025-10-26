package PeopleSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 05.Stwórz listę obiektów reprezentujących osoby, gdzie każda osoba ma imię i wiek.
 * Napisz komparator, który sortuje tę listę na podstawie wieku.
 * Następnie posortuj listę za pomocą komparatora i wyświetl wynik.
 */

public class PeopleSort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Dodawanie osob do listy
        people.add(new Person("Piotr", 22));
        people.add(new Person("Piotr", 23));
        people.add(new Person("Joanna", 22));
        people.add(new Person("Monika", 19));
        people.add(new Person("Jan", 25));
        people.add(new Person("Dominik", 23));

        // Lista przed sortowaniem
        System.out.println("\nLista przed posortowaniem: ");
        people.forEach(System.out::println);

        // Komparator - wzgledem wieku
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);
        people.sort(ageComparator);

        // Lista po sortowaniu - wiek
        System.out.println("\nLista po sortowaniu: ");
        people.forEach(System.out::println);

    }
}
