class ReservaLivro {
    public static void reservarLivro(Book book) {
        if (book.isAvailable()) {
            System.out.println("Reservando o livro '" + book.getTitle() + "'.");
            book.rentBook();
        } else {
            System.out.println("O livro '" + book.getTitle() + "' está indisponível para reserva.");
            
        }
    }
}
