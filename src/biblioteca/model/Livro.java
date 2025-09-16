package src.biblioteca.model;

public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private String ISBN;
    private int quantidade = 1;
    private int quantidadeTotal = quantidade;

    public Livro(String titulo, String autor, String ano, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
    } 
    public Livro(String titulo, String autor, String ano, String ISBN, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
        this.quantidade = quantidade;
    } 
    public Livro(String titulo, String autor, String ano, String ISBN, int quantidade, int quantidadeTotal) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
        this.quantidade = quantidade;
        this.quantidadeTotal = quantidadeTotal;
    } 
    
    public String getTitulo () {
        return this.titulo;
    }
    public int getQuantidade () {
        return this.quantidade;
    }
    public int getQuantidadeTotal () {
        return this.quantidadeTotal;
    }
    public String emprestar() {
        if(this.quantidade >= 1) {
            this.quantidade--;
            return "livro emprestado com sucesso";
        } else {
            return "erro ao emprestar livro.";
        }
    }
}
