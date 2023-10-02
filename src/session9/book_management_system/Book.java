package session9.book_management_system;

public class Book {

    public String title;
    public Author author;

    public Book(String title) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return author.getName();
    }
}
