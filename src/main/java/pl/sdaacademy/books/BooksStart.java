package pl.sdaacademy.books;

import java.util.Scanner;

public class BooksStart {
    private BooksViews views;
    private AuthorsRepository authorsRepository;

    public BooksStart() {
        this.views = new BooksViews(new Scanner(System.in));
        this.authorsRepository = new InMemoryAuthorsRepository();
    }

    public void start() {
        boolean flag = true;
        do {
            int decision = views.startMenu();

            switch (decision) {
                case 1:
                    authorsView();
                    break;
                case 2:
                    booksView();
                    break;
                default:
                    flag = false;
            }


        } while (flag);
    }

    private void booksView() {
        System.out.println("Tutaj będa ksiązki");
    }

    private void authorsView() {
        boolean flag = true;
        do {
            int decision = views.authorsMenu(authorsRepository.findAll());


            switch (decision) {

                case 1:
                    //TODO
                default:
                    flag = false;
            }

        } while (flag);


    }
}
