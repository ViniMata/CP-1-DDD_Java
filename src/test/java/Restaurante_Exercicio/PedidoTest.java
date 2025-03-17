package Restaurante_Exercicio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PedidoTest {
    private Pedido pedido;
    private Prato prato1;
    private Prato prato2;

    @Before
    public void setUp() {
        pedido = new Pedido("João Silva");
        prato1 = new Prato("Pizza", 25.0, "Pizza de calabresa");
        prato2 = new Prato("Lasanha", 30.0, "Lasanha à bolonhesa");
    }

    @Test
    public void testConstrutor() {
        assertNotEquals(0, pedido.getNumeroPedido());
        assertEquals("João Silva", pedido.getCliente());
        assertEquals(0, pedido.getPratos().size());
        assertEquals(0.0, pedido.getTotal(), 0.01);
    }

    @Test
    public void testAdicionarPrato() {
        pedido.adicionarPrato(prato1);
        assertEquals(1, pedido.getPratos().size());
        assertTrue(pedido.getPratos().contains(prato1));
        assertEquals(25.0, pedido.getTotal(), 0.01);
    }

    @Test
    public void testCalcularTotal() {
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);
        assertEquals(2, pedido.getPratos().size());
        assertEquals(55.0, pedido.getTotal(), 0.01);
    }

    @Test
    public void testToString() {
        pedido.adicionarPrato(prato1);
        String expected = "Pedido{numeroPedido=" + pedido.getNumeroPedido() + ", cliente='João Silva', pratos=[" + prato1.toString() + "], total=25.0}";
        assertTrue(pedido.toString().contains("João Silva") && pedido.toString().contains("25.0"));
    }
}