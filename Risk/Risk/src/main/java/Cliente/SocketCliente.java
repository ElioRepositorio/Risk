/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cliente;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elio
 */
public class SocketCliente {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;

        try {
            try (Socket direccion = new Socket("localhost", 1500)) {
                DataInputStream flujo_entrada = new DataInputStream(direccion.getInputStream());
                DataOutputStream flujo_salida = new DataOutputStream(direccion.getOutputStream());
                
                
                    
                    String mensaje = flujo_entrada.readUTF();
                    
                    System.out.println(mensaje);
                    
                    String peticionArchivo = sn.next();
                    flujo_salida.writeUTF(peticionArchivo);
                    
                    String archivo_siOno= flujo_entrada.readUTF();
                    System.out.println(archivo_siOno); //Mensaje si encuentra el archivo o no
                    
                    byte [] archivo=flujo_entrada.readAllBytes(); // Si lo encuentra manda el flujo de bytes del archivo completo y lo guarda en un array de byte
                    
                    if ("Aqui tiene su Archivo".equals(archivo_siOno)) salir=true;
                    
         
                    String textoArchivo =new String (archivo); //Pasar byte [] a String
                    System.out.println(textoArchivo);
                    
                    
            direccion.close();}

        } catch (IOException ex) {
            Logger.getLogger(SocketCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

     
    }

}