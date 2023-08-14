import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> collectionOfBooks;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.collectionOfBooks = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress() {
        this.address = address;
    }

    public void addBook(Book book) {
        collectionOfBooks.add(book);
    }

    public void removeBook(Book book) {
        collectionOfBooks.remove(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : collectionOfBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}