package pl.sdaacademy.books;

import java.util.Objects;

public class Author {

    String firstname;
    String lastname;
    int birthyear;
    private Nationality natrion;

    public Author() {
    }

    public Author(String firstname, String lastname, int birthyear, Nationality natrion) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
        this.natrion = natrion;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthyear=" + birthyear +
                ", natrion=" + natrion +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public Nationality getNatrion() {
        return natrion;
    }

    public void setNatrion(Nationality natrion) {
        this.natrion = natrion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return birthyear == author.birthyear &&
                Objects.equals(firstname, author.firstname) &&
                Objects.equals(lastname, author.lastname) &&
                natrion == author.natrion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, birthyear, natrion);
    }


    public String getFullName(){
        return firstname + " " + lastname;
    }
}
