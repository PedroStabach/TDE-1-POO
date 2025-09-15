package src.biblioteca.model;

public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private String ISBN;
    private int quantidade = 0;

    Livro(String titulo, String autor, String ano, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
    } 
    Livro(String titulo, String autor, String ano, String ISBN, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
        this.quantidade = quantidade;
    } 
}
