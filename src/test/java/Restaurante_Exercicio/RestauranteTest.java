package Restaurante_Exercicio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {
    private Restaurante restaurante;
    private Prato prato1;
    private Prato prato2;

    @Before
    public void setUp() {
        restaurante = new Restaurante();
        prato1 = new Prato("Pizza", 25.0, "Pizza de calabresa");
        prato2 = new Prato("Lasanha", 30.0, "Lasanha à bolonhesa");
    }

    @Test
    public void testAdicionarPrato() {
        restaurante.adicionarPrato(prato1);
        assertTrue(restaurante.getCardapio().contains(prato1));
        assertEquals(1, restaurante.getCardapio().size());
    }

    @Test
    public void testRemoverPrato() {
        restaurante.adicionarPrato(prato1);
        restaurante.removerPrato(prato1);
        assertFalse(restaurante.getCardapio().contains(prato1));
        assertEquals(0, restaurante.getCardapio().size());
    }

    @Test
    public void testCriarPedido() {
        Pedido pedido = restaurante.criarPedido("João Silva");
        assertTrue(restaurante.getPedidos().contains(pedido));
        assertEquals(1, restaurante.getPedidos().size());
        assertEquals("João Silva", pedido.getCliente());
        assertNotEquals(0, pedido.getNumeroPedido());
    }

    @Test
    public void testCalcularTotalPedido() {
        Pedido pedido = restaurante.criarPedido("João Silva");
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);
        restaurante.calcularTotalPedido(pedido);
        assertEquals(55.0, pedido.getTotal(), 0.01);
    }

    @Test
    public void testVerPedido() {
        Pedido pedido = restaurante.criarPedido("João Silva");
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);
        restaurante.calcularTotalPedido(pedido);


        System.out.println("Testando verPedido...");
        restaurante.verPedido(pedido);

        assertEquals(2, pedido.getPratos().size());
        assertEquals(55.0, pedido.getTotal(), 0.01);
    }
}