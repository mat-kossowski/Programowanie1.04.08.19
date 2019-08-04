package pl.sdaacademy;

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

    public String getFirstname(String blolesław) {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname(String prus) {
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
}
