public class livro {
    private String titulo;
    private String autor;
    private String ano;
    private String ISBN;
    private int quantidade = 0;

    livro(String titulo, String autor, String ano, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
    } 
    livro(String titulo, String autor, String ano, String ISBN, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
        this.quantidade = quantidade;
    } 
}
