package Biblioteca_Exercicio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private Livro livro;
    private Membro membro;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        livro = new Livro("Livro Teste", "Autor Teste", "12345");
        membro = new Membro("Membro Teste", 1, "teste@fiap.com.br");
    }

    @Test
    public void testAdicionarLivro() {
        biblioteca.adicionarLivro(livro);
        assertTrue(biblioteca.getLivros().contains(livro));
        assertEquals(1, biblioteca.getLivros().size());
    }
    @Test
    public void testRemoverLivro() {
        biblioteca.adicionarLivro(livro);
        biblioteca.removerLivro(livro);
        assertFalse(biblioteca.getLivros().contains(livro));
        assertEquals(0, biblioteca.getLivros().size());
    }

    @Test
    public void testRegistrarMembro() {
        biblioteca.registrarMembro(membro);
        assertTrue(biblioteca.getMembros().contains(membro));
        assertEquals(1, biblioteca.getMembros().size());
    }

    @Test
    public void testRegistrarEmprestimo() {
        biblioteca.adicionarLivro(livro);
        biblioteca.registrarMembro(membro);
        Emprestimo emprestimo = biblioteca.registrarEmprestimo(livro, membro);
        assertTrue(biblioteca.getEmprestimos().contains(emprestimo));
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(membro, emprestimo.getMembro());
        assertFalse(emprestimo.isDevolvido());
    }

    @Test
    public void testDevolverLivro() {
        biblioteca.adicionarLivro(livro);
        biblioteca.registrarMembro(membro);
        Emprestimo emprestimo = biblioteca.registrarEmprestimo(livro, membro);
        biblioteca.devolverLivro(emprestimo);
        assertTrue(emprestimo.isDevolvido());
    }
}

