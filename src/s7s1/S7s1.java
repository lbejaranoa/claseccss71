/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s7s1;

/**
 *
 * @author flea_
 */
public class S7s1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pedido pedido= new Pedido(0,"VIP");
        System.out.println(pedido.getMonto());
        System.out.println(pedido.getTipoCliente());
        PedidoService pedidoService= new PedidoService();
        double totalPago=pedidoService.calcularTotal(pedido);
        System.out.println(totalPago);
    }
    
}
