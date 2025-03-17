package Restaurante_Exercicio;

public class SistemaRestaurante {
    public static void main(String[] args){
        Restaurante restaurante = new Restaurante();

        restaurante.adicionarPrato(new Prato("Pizza", 25.0, "Pizza de calabresa"));
        restaurante.adicionarPrato(new Prato("Lasanha", 30.0, "Lasanha à bolonhesa"));

        Pedido pedido = restaurante.criarPedido("João Silva");
        pedido.adicionarPrato(new Prato("Pizza", 25.0, "Pizza de calabresa"));
        pedido.adicionarPrato(new Prato("Lasanha", 30.0, "Lasanha à bolonhesa"));
        restaurante.calcularTotalPedido(pedido);
        restaurante.verPedido(pedido);

        restaurante.removerPrato(new Prato("Lasanha", 30.0, "Lasanha à bolonhesa"));
    }
}
