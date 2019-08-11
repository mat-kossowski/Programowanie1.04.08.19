package pl.sdaacademy.books;

import java.util.List;

public interface BooksRepository {
    List<Book> findAll();

    List<Book> findByAfterReleaseYear(int release);

    List<Book> searchByPhrase(String phrase);
}