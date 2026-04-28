/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;

/**
 *
 * @author flea_
 */
import java.util.function.Function;

public class CalculadoraFuncional {
    public static double aplicarDescuento(double monto, Function <Double,Double> estrategia){
        return estrategia.apply(monto);
    }
    public static void main(String[] args){
        double total= aplicarDescuento(100,m->m/0.8);
        System.out.println(total);
    }
}
