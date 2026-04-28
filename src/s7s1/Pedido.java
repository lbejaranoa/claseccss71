/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;

public class Pedido {
    private double monto; 
    private String tipoCliente; 
    
    public Pedido(double monto,String tipoCliente){
        this.monto=monto;
        this.tipoCliente=tipoCliente;
    }
    
    public double getMonto() {
        return monto;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
