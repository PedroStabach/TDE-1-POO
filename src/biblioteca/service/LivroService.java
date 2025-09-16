package src.biblioteca.service;

import java.util.ArrayList;
import java.util.List;
import src.biblioteca.model.Livro;
import src.biblioteca.model.User;

public class LivroService {
    public void listagemLivros(List<Livro> livros) {        
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }

    public void emprestimosAtivados(List<Livro> livros) {      
        for (Livro livro : livros) {
            if (livro.getQuantidade() != livro.getQuantidadeTotal()) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    public void historicoEmprestimos(User user) {
        List<Livro> Historico = user.getHistorico();
        if(Historico.isEmpty()) {
            System.out.println("nenhum emprestimo realizado");
        } else {
            for(Livro livro: Historico) {
                System.out.println(livro.getTitulo());
            }
        }
    }
}
