public class Book {
    String name;
    String author;
    int bookYear;

    public Book(String name, Author author, int bookYear) {
        this.name = name;
        this.bookYear = bookYear;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String getName() {
        return name;
    }


    public int getBookYear() {
        return bookYear;
    }


}
