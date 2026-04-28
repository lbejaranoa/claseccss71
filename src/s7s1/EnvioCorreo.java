/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7s1;

/**
 *
 * @author flea_
 */
public class EnvioCorreo implements Enviador {

    @Override
    public void envio(String Mensaje) {
        System.out.println("Enviado por correo:"+Mensaje);
    }
    
}
