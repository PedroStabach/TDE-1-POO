import src.biblioteca.model.Livro;

package src.biblioteca.service;
public class LivroService {
    public void listagemLivros(Livro[] livros) {
        for(int i = 0; i < livros.length ; i++) {
            System.out.println(livros[i].getTitulo());
        }
    }
}
