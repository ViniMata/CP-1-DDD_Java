package Restaurante_Exercicio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PratoTest {
    private Prato prato;

    @Before
    public void setUp() {
        prato = new Prato("Pizza", 25.0, "Pizza de calabresa");
    }

    @Test
    public void testConstrutor() {
        assertEquals("Pizza", prato.getNome());
        assertEquals(25.0, prato.getPreco(), 0.01);
        assertEquals("Pizza de calabresa", prato.getDescricao());
    }

    @Test
    public void testToString() {
        String expected = "Prato{nome='Pizza', preco=25.0, descricao='Pizza de calabresa'}";
        assertEquals(expected, prato.toString());
    }
}