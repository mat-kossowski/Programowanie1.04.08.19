package pl.sdaacademy.books;

import java.util.List;
import java.util.Scanner;

public class BooksViews {
    private Scanner scanner;

    public BooksViews(Scanner scanner) {
        this.scanner = scanner;
    }

    public int startMenu() {
        System.out.println("1. Authors");
        System.out.println("2. Books");
        System.out.println("0. Koniec");
        return getDecision();
    }

    public int getDecision() {
        return scanner.nextInt();
    }

    public Nationality getNation() {
        String nationAsString = scanner.nextLine().trim();
        return Nationality.valueOf(nationAsString);
    }

    public int getBirthYear(){
        return readIntAndClearLine();

    }


    public int getDecisionAfterEnter() {
        return readIntAndClearLine();
    }

    public int authorsMenu(List<Author> authors) {
        authors.forEach(author -> System.out.println(author));
        System.out.println();
        System.out.println("1. Find by Nationality (PL, USA, ENG)");
        System.out.println("2. Find by after birthYear");
        System.out.println("0. Back");
        return getDecision();
    }
    public int booksMenu (List<Book> books){
        books.forEach(book -> System.out.println(book));
        System.out.println();
        System.out.println("1. Find by after releaseYear");
        System.out.println("2. Search by title");
        System.out.println("3. Search by author");
        System.out.println("0. Back");
        return getDecision();
    }

    public int getReleaseYear() {
        return readIntAndClearLine();
    }

    private int readIntAndClearLine(){
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public String getSearchPhrase() {
        String searchPhrase = scanner.nextLine().trim();
        return searchPhrase;
    }
}
