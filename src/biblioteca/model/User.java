package src.biblioteca.model;
public class User {
    private String nome;
    private int ID;

    public static int proximoID = 1;
    
    public User(String nome) {
        this.nome = nome;
        this.ID = proximoID++;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public int getID() {
        return this.ID;
    }
}
