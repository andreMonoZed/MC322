import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Loan {
    private Book book;
    private Member member;
    private LocalDateTime dueDate;

    public Loan(Book book, Member member, LocalDateTime dueDate) {
        this.book = book;
        this.member = member;
        this.dueDate = dueDate;
    }
    
    public Book getBook() {
        return book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
    
    public Member getMember() {
        return member;
    }
    
    public void setMember(Member member) {
        this.member = member;
    }
    
    public LocalDateTime getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
    
    public boolean isOverdue() {
        return LocalDateTime.now().isAfter(dueDate);
    }

    public long daysUntilDue() {
        return ChronoUnit.DAYS.between(LocalDateTime.now(), dueDate);
    }
}