package pl.sdaacademy;

import java.util.Arrays;
import java.util.List;

import static pl.sdaacademy.Nationality.*;

public class ApplicationBook {
    public static void main(String[] args) {

        List<Author> authors = Arrays.asList(
                new Author("Stephen", "King", 1947, USA),
                new Author("Henryk", "Sienkiewicz", 1846, PL),
                new Author("Adam", "Mickiewicz", 1798, PL),
                new Author("Juliusz", "Słowacki", 1849, PL),
                new Author("Joanne Murray", "Rowling", 1965, ENG),
                new Author("William", "Shakespeare", 1564, ENG)

        );

        List<Book> books = Arrays.asList(
                new Book("W pustyni i w puszczy", 1910, 300, authors.get(1)),
                new Book("Krzyżacy", 1900, 1000, authors.get(1)),
                new Book("Dziady III", 1832, 250, authors.get(2)),
                new Book("Dziady I", 1860, 350, authors.get(2)),
                new Book("Zielona mila", 1996, 290, authors.get(0)),
                new Book("Balladyn", 1839, 400, authors.get(3)),
                new Book("Harry Potter i Czara ognia", 2005, 650, authors.get(4)),
                new Book("Harry Potter i Ksiaze Polkrwi", 2009, 800, authors.get(4)),
                new Book("Romeo i Julia", 1595, 34, authors.get(5))
        );
        System.out.println("średnia stron: ");
        System.out.println(books.stream()
                .mapToInt(book -> book.getPages())
                .sum() / (double) books.size());


        books.stream()
                .filter(book -> book.getReleaseYear() < 2000)
                .filter(book -> book.getPages() > 300)
                .map(book -> book.getName())
                .forEach(bookTitle -> System.out.println(bookTitle));


        findBooksByAuthot(books, authors.get(0));


    }

    public static void findBooksByAuthot(List<Book> books, Author author) {

        books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .forEach(book -> System.out.println(book));

    }


}

