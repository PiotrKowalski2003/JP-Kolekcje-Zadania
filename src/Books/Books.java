package Books;

import java.util.Objects;

/**
 * 7.Zaimplementuj klasę reprezentującą książkę z polami takimi jak: tytuł, autor i numer ISBN.
 * Napisz metody equals() i hashCode(), aby porównywały książki na podstawie numeru ISBN.
 * Następnie stwórz HashSet i dodaj kilka książek o tym samym numerze ISBN, a także kilka różnych. Przeanalizuj wynik.
 */

class Book{
    private String title;
    private String author;
    private String ISBN;

    // Konstruktor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Gettery i Settery
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getISBN() {return ISBN;}

    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setISBN(String ISBN) {this.ISBN = ISBN;}

    // Metody
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    @Override
    public String toString() {
        return "Book[ " + title + ", " + author + ", ISBN=" + ISBN + "]";
    }
}
