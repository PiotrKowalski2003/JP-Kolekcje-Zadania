package Books;

import java.util.HashSet;
/**
 * 7.Zaimplementuj klasę reprezentującą książkę z polami takimi jak: tytuł, autor i numer ISBN.
 * Napisz metody equals() i hashCode(), aby porównywały książki na podstawie numeru ISBN.
 * Następnie stwórz HashSet i dodaj kilka książek o tym samym numerze ISBN, a także kilka różnych. Przeanalizuj wynik.
 */

public class Main {
    public static void main(String[] args) {

        // HashSet do przechowywania ksiazek
        HashSet<Book> booksSet = new HashSet<>();

        // Przykladowe ksiazki
        Book book1 = new Book("Gone to See the River Man", "Kristopher Triana", "978-1-941918-72-2");
        Book book2 = new Book("It", "Stephen King", "978-1-5011-7546-6");
        Book book3 = new Book("They All Died Screaming", "Kristopher Triana", "978-1-940250-45-8");
        Book book4 = new Book("Bird Box", "Josh Malerman", "978-0-06-225966-0");
        Book book5 = new Book("Gone to See the River Man - Part II", "Kristopher Triana", "978-1-941918-72-2");

        // Dodawanie ksiazek do HashSet
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);    // ten sam ISBN co book1

        System.out.println("Zawartosc HashSetu: ");
        for(Book book : booksSet) {
            System.out.println(book);
        }

        System.out.println("Liczba ksiazek HashSet: " + booksSet.size());

        System.out.println("-------------------");

        System.out.println("Czy ksiazki 1 i 5 zawieraja ten sam ISBN? "+ (book1.hashCode() == book5.hashCode()));
        System.out.println("Czy ksiazki 2 i 4 zawieraja ten sam ISBN? " + (book2.hashCode() == book3.hashCode()));

        System.out.println("-------------------");
        System.out.println("Stad, HashSet zawiera tylko unikalne ksiazki wedlug ISBN - identyfikuje duplikat i nie dodaje go ");


        // wyczyszczenie HashSetu
        booksSet.clear();
    }
}
