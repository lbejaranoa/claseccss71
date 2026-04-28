/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;

/**
 *
 * @author flea_
 */
public class PedidoService {
    private DescuentoService descuentoService;
    
    public PedidoService(){
        this.descuentoService= new DescuentoService();
    }
    public double calcularTotal(Pedido pedido){
        try{
            double total=pedido.getMonto()/0;
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        if(pedido.getMonto()<=0){
            throw new PedidoInvalidoException("El monto debe de ser mayor a cero");
        }
        double descuento= descuentoService.obtenerDescuento(pedido.getTipoCliente());
        return pedido.getMonto()-(pedido.getMonto()*descuento);
    }
}
