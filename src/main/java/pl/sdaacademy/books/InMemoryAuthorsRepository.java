package pl.sdaacademy.books;

import java.util.ArrayList;
import java.util.List;

import static pl.sdaacademy.books.Nationality.*;
import static pl.sdaacademy.books.Nationality.ENG;

public class InMemoryAuthorsRepository implements AuthorsRepository {

    private List<Author> authors;

    public InMemoryAuthorsRepository() {
        this.authors = new ArrayList<>();
        init();
    }

    @Override
    public List<Author> findAll() {
        return new ArrayList<>(authors);
    }

    @Override
    public List<Author> findByNation(Nationality nationality) {
        //TODO
        return null;
    }


    private void init() {


        authors.add(new Author("Stephen", "King", 1947, USA));
        authors.add(new Author("Henryk", "Sienkiewicz", 1846, PL));
        authors.add(new Author("Adam", "Mickiewicz", 1798, PL));
        authors.add(new Author("Juliusz", "Słowacki", 1849, PL));
        authors.add(new Author("Joanne Murray", "Rowling", 1965, ENG));
        authors.add(new Author("William", "Shakespeare", 1564, ENG));


    }

}


