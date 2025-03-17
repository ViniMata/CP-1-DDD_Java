package Restaurante_Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private List<Prato> pratos = new ArrayList<>();
    private double total;

    public Pedido(String cliente){
        this.numeroPedido = gerarNumeroPedidoUnico();
        this.cliente = cliente;
        this.total = 0.0;
    }
    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
        calcularTotal(); // Recalcula o total ao adicionar
    }
    private int gerarNumeroPedidoUnico() {
        return (int) (Math.random() * 1000) + 1; // Número aleatório entre 1 e 1000
    }
    public void calcularTotal() {
        total = pratos.stream().mapToDouble(Prato::getPreco).sum();
    }
    public int getNumeroPedido(){
        return numeroPedido;
    }
    public String getCliente(){
        return cliente;
    }
    public List<Prato> getPratos(){
        return new ArrayList<>(pratos);
    }

    public double getTotal(){
        return total;

    }
    @Override
    public String toString() {
        return "Pedido{numeroPedido=" + numeroPedido + ", cliente='" + cliente + "', pratos=" + pratos + ", total=" + total + "}";
    }
}
