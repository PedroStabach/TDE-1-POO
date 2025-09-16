package src.biblioteca.service;

import java.util.ArrayList;
import java.util.List;
import src.biblioteca.model.Livro;

public class LivroService {
    public void listagemLivros(List<Livro> livros) {        
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}
