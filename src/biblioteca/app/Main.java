package src.biblioteca.app;

import src.biblioteca.model.Aluno;


public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("BSI", "ALUNO");
        Aluno a2 = new Aluno("BSI", "ALUNO");
        System.out.println(a1.getNome());
        System.out.println(a1.getID());
        System.out.println(a2.getID());

        
    }
}
