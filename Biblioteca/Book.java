public class Book {
    private String title;
    private String author;
    private boolean Available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.Available = true; // O livro inicialmente está disponível para alugar
    }
   
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public boolean isAvailable() {
        return Available;
    }
    
    public void rentBook() {
        if (Available) {
            Available = false;
            System.out.println("Livro '" + title + "' foi alugado.");
        } else {
            System.out.println("Livro '" + title + "' não está disponível para alugar.");
        }
    }

    public void returnBook() {
        if (!Available) {
            Available = true;
            System.out.println("Livro '" + title + "' foi devolvido.");
        } else {
            System.out.println("Livro '" + title + "' não foi alugado.");
        }
    }
}