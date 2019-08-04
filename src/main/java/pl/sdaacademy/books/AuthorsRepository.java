package pl.sdaacademy.books;

import java.util.List;

public interface AuthorsRepository {
    List<Author> findAll();



    List<Author> findByNation(Nationality nationality);
}
