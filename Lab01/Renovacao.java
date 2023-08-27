class RenovacaoLivro {
    public static void renovarLivro(Book book) {
        if (book.isAvailable()) {
            System.out.println("Renovando o livro '" + book.getTitle() + "'.");
            book.rentBook();
            // Lógica para renovar o livro
        } else {
            System.out.println("O livro '" + book.getTitle() + "' não pode ser renovado pois está disponível.");
        }
    }
}