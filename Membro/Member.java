import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String contactInfo;
    private List<Book> rentedBooks;
    
    public Member(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.rentedBooks = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public String getContactInfo() {
        return contactInfo;
    }
    
    public Book findBookByTitle(String title) {
        for (Book book : rentedBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    //imcompleto
    public void rentBook(Book book) {
        rentedBooks.add(book);
        //implementar
    }
    //imcompleto
    public void returnBook(Book book) {
        rentedBooks.remove(book);
        //implementar
    }
}