public class User {
    private String nome;
    private int ID;

    // sobrecarga de construtor
    User(String nome, int ID) {
        this.nome = nome;
        this.ID = ID;
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
