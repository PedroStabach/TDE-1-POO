package src.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String nome;
    private int ID;
    private ArrayList<Livro> Historico;

    public static int proximoID = 1;
    
    //construtor
    public User(String nome) {
        this.nome = nome;
        this.ID = proximoID++;
        this.Historico = new ArrayList<>();
    }

    //getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public int getID() {
        return this.ID;
    }
    public List<Livro> getHistorico() {
        return this.Historico;
    }

    //metodos
    public void emprestarLivro(Livro livro) {
        this.Historico.add(livro);
        List<Livro> Livro = this.Historico;
        livro.emprestar();
        System.out.println(livro.getTitulo());
    }
    
    public void devolverLivro(Livro livro) {
        List<Livro> livros = this.Historico;
        if(livros.contains(livro)) {
            System.out.println("livro devolvido");
            livro.devolver();
        } else {
            System.out.println("livro nao encontrado");
        }
    }
}
