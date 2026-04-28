/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;

/**
 *
 * @author flea_
 */
public class CalculadoraEnvio {
    public double CalcularCosto(TipoEnvio tipoenvio,double peso){
        return tipoenvio.calcular(peso);
    }
    
}
