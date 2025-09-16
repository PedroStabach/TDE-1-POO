package src.biblioteca.model;

import java.time.LocalDate;

public class Professor extends User {
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public LocalDate calcularPrazoDevolucao() {
        return LocalDate.now().plusDays(17);
    }
}
