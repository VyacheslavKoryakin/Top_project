package HomeWorkOOP;

public class Author {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInfo() {
        return name + " " + surname;
    }
}
