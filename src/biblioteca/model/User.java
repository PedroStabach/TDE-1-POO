package src.biblioteca.model;

import java.util.ArrayList;

public class User {
    private String nome;
    private int ID;
    private ArrayList<Livro> Historico;

    public static int proximoID = 1;
    
    //construtor
    public User(String nome) {
        this.nome = nome;
        this.ID = proximoID++;
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

    public void emprestarLivro(Livro livro) {
        Historico.add(livro);
        System.out.println(Historico);
    }
}
