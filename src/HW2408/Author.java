package HW2408;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String getName() {
        return name;
    }

    private String getSurname() {
        return surname;
    }
}