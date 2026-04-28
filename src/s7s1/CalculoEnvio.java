/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;

/**
 *
 * @author flea_
 */
public class CalculoEnvio {
    public static double calcularEnvio (String tipoEnvio, double peso){
        if(tipoEnvio.equals("normal")){
            return 10+ peso*2;
        }
        else if(tipoEnvio.equals("express")){
            return 20+peso*3;
        }
        else if (tipoEnvio.equals("recojo")){
            return 0;
        }
        else if (tipoEnvio.equals("aero")){
            return 100+peso*2;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        double costo= calcularEnvio("express", 5);
        System.out.println("Costo envio: "+costo);
    }
}
