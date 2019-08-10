package pl.sdaacademy.books;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return authors.stream()
                .filter(author -> author.getNatrion().equals(nationality))
                .collect(Collectors.toList());

    }

    @Override
    public List<Author> findAfterBirthYear(int birthYear) {
        return authors.stream()
                .filter(author -> author.getBirthyear() >= birthYear)
                .collect(Collectors.toList());


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


