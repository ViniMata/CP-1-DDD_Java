package Restaurante_Exercicio;

import java.util.ArrayList;
import java.util.List;


public class Restaurante {
    private List<Prato> cardapio = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public List<Prato> getCardapio(){
        return new ArrayList<>(cardapio);
    }
    public List<Pedido> getPedidos(){
        return new ArrayList<>(pedidos);
    }

    public void adicionarPrato(Prato prato){
        cardapio.add(prato);
        System.out.println("Prato adicionado: " + prato);
    }
    public void removerPrato(Prato prato){
        cardapio.remove(prato);
        System.out.println("Prato removido: " + prato);
    }
    public Pedido criarPedido(String cliente){
        Pedido pedido = new Pedido(cliente);
        pedidos.add(pedido);
        System.out.println("Pedido criado: " + pedido);
        return pedido;
    }
    public void calcularTotalPedido(Pedido pedido) {
        pedido.calcularTotal();
        System.out.println("Total calculado para pedido " + pedido.getNumeroPedido() + ": " + pedido.getTotal());
    }
    public void verPedido(Pedido pedido) {
        System.out.println("Detalhes do Pedido #" + pedido.getNumeroPedido() + ":");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Pratos: " + pedido.getPratos());
        System.out.println("Total: " + pedido.getTotal());
    }
}

