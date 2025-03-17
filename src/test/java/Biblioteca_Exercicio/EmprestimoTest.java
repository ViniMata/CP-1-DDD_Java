package Biblioteca_Exercicio;

import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class EmprestimoTest {
    private Emprestimo emprestimo;
    private Livro livro;
    private Membro membro;

    @Before
    public void setUp() {
        livro = new Livro("Livro Teste", "Autor Teste", "12345");
        membro = new Membro("Membro Teste", 1, "teste@fiap.com.br");
        emprestimo = new Emprestimo(livro, membro, new Date());
    }

    @Test
    public void testConstrutor() {
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(membro, emprestimo.getMembro());
        assertFalse(emprestimo.isDevolvido());
    }

    @Test
    public void testDevolver() {
        emprestimo.devolver();
        assertTrue(emprestimo.isDevolvido());
    }
}