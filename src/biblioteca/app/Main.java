package src.biblioteca.app;

import java.util.ArrayList;
import java.util.List;

import src.biblioteca.service.LivroService;
import src.biblioteca.model.Aluno;
import src.biblioteca.model.Livro;
import src.biblioteca.model.Professor;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        Aluno a1 = new Aluno("aluno");
        Professor p1 = new Professor("professor");
        livros.add(new Livro("1", "asda", "qwds", "sdfs", 10, 10));
        livros.add(new Livro("2", "asda", "qwds", "sdfs", 5));

        LivroService svc = new LivroService();
        svc.listagemLivros(livros);
        
        p1.emprestarLivro(livros.get(1));

        svc.emprestimosAtivados(livros);

    }
}
