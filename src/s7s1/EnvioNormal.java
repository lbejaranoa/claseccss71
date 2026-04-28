/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;

/**
 *
 * @author flea_
 */
public class EnvioNormal implements TipoEnvio{
    
    @Override
    public double calcular(double peso) {
        return 10+peso*1.5;
    }
}
