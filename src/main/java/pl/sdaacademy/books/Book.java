package pl.sdaacademy.books;

public class Book {


    private String name;
    private int releaseYear;
    private int pages;
    private Author author;


    public Book() {
    }

    public Book(String name, int releaseYear, int pages, Author author) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }




    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", pages=" + pages +
                ", author=" + author.getFirstname() +" " + author.getLastname()+
                '}';
    }
}
