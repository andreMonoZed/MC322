import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
    	Library library = new Library("Biblioteca Central Cesar Lattes", 
    			                      "R. Sérgio Buarque de Holanda, 421 - Cidade Universitária, Campinas - SP");
    	
    	Book book = new Book("The Art of War", "Sun Tzu");
    	
    	Member member = new Member("Joaozinho", "+55 69 1234-5678");
    	
    	Loan loan = new Loan(book, member, LocalDateTime.now().plusDays(7));
    }
}