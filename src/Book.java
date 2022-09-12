public class Book {
    String name;
    String author;
    int bookYear;

    public Book(String name, Author author, int bookYear) {
        this.name = name;
        this.bookYear = bookYear;
    }

    private void setName(String name) {
        this.name = name;
    }


    void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    private String getName() {
        return name;
    }


    private int getBookYear() {
        return bookYear;
    }


}
