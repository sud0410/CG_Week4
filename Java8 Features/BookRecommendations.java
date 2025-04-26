import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    String genre;
    double rating;

    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{title=" + title + ", genre=" + genre + ", rating=" + rating + "}";
    }
}

public class BookRecommendations {
    public static List<Book> recommendBooks(List<Book> books) {
        return books.stream()
                .filter(b -> "Science Fiction".equals(b.genre) && b.rating > 4.0)
                .sorted(Comparator.comparingDouble(b -> -b.rating))
                .limit(10)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Dune2", "Frank Herbert", "Science Fiction", 4.5),
                new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.2),
                new Book("Wings of fire", "DR.APJ", "Dystopian", 4.3)
        );
        List<Book> recommendations = recommendBooks(books);
        System.out.println("Recommended Books: " + recommendations);
    }
}
