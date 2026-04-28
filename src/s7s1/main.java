/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;

/**
 *
 * @author flea_
 */
public class main {
    public static void main (String[] args){
        /*
        CalculadoraEnvio calculadoraEnvio= new CalculadoraEnvio(); 
        TipoEnvio envio= new EnvioAereo();
        double costo= calculadoraEnvio.CalcularCosto(envio, 5);
        System.out.println("El costo de envio es: "+costo);
        */
        
        Sender sender= new Sender();
        EnvioCorreo envioCorreo= new EnvioCorreo();
        System.out.println(sender.Envio(envioCorreo, "mi mensaje"));
        
    }
}
