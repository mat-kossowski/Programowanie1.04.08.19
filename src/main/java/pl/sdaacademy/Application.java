package pl.sdaacademy;

import java.lang.reflect.Array;
import java.util.*;

import static pl.sdaacademy.Nationality.*;

public class Application {
    public static void main(String[] args) {

        Author author1 = new Author("Henryk", "Sienkiewicz", 1846, PL);
        Author author3 = new Author("Adam", "Mickiewicz", 1798, PL);

        Author author2 = new Author();

        author2.setFirstname("Stephen");
        author2.setLastname("King");
        author2.setBirthyear(1947);
        author2.setNatrion(USA);


        List<Author> authors = Arrays.asList(author1, author2, author3,
                new Author("Juliusz", "Słowacki", 1849, PL),
                new Author("Joanne Murray", "Rowling", 1965, ENG),
                new Author("William", "Shakespeare", 1564, ENG));


        System.out.println(groupByNation(authors));

    }

    public static void showByNation(List<Author> authors, Nationality natrion) {

        for (Author author : authors) {
            if (author.getNatrion().equals(natrion)) {
                System.out.println(author);
            }
        }

    }

    public static void showModernAuthors(List<Author> authors, int birthYear) {

        for (Author author : authors) {
            int limitYear = 1900;
            if (author.getBirthyear() > limitYear) {
                System.out.println(author);
            }
        }
    }

    public static void showByNationAndBirthyear(List<Author> authors, Nationality nation) {
        for (Author author : authors) {
            if ((author.getBirthyear() > 1800) && (author.getNatrion().equals(nation))) {
                System.out.println(author);
            }
        }
    }
    private static Map<Nationality, List<Author>> groupByNation(List<Author> authors) {
        Map<Nationality, List<Author>> map = new HashMap<>();
        for (Author author : authors) {
            map.putIfAbsent(author.getNatrion(), new ArrayList<>());
            map.get(author.getNatrion()).add(author);
        }
        return map;
    }

}
