package src.biblioteca.model;

import java.time.LocalDate;

public class Aluno extends User {
    public Aluno(String nome) {
        super(nome);
    }
    @Override
    public LocalDate calcularPrazoDevolucao() {
        return LocalDate.now().plusDays(7);
    }
}
