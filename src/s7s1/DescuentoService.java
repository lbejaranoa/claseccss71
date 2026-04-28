/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;


public class DescuentoService {
    public double obtenerDescuento(String tipoCliente){
        switch(tipoCliente.toUpperCase()){
            case "VIP": 
                return 0.20;
            case "FRECUENTE": 
                return 0.10;
            default: 
                return 0.0;
        }
    }
}
