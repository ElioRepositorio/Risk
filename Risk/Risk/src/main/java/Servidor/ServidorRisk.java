package Servidor;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorRisk {
    
    public static void main(String[] args) {
        
        try {
            
            ServerSocket servidor = new ServerSocket(1500);
            System.out.println("Servidor escuchando puerto "+1500
            );
            
            int idCliente=0;
            while(true){
                
                Socket direccion = servidor.accept();
                
                System.out.println("Cliente "+idCliente+" aceptado");
                
                ServerHilo hilo = new ServerHilo(direccion ,idCliente);
                idCliente++;

                hilo.start();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ServidorRisk.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("El servidor a petado, seguro que tienes el proceso ya activo");
        }
    }   
}

// Metodo Notificaciones (Paises inicio, colocaciondetropa, ataques, refuerzos, moverTropas) if notifycacion wait) (despertar y dormir todos los hilos)
/*

private void broadcastMensaje(String mensaje) {
        System.out.println("Retransmitiendo mensaje a todos los clientes: " + mensaje);
        for (PrintWriter escritor : clientes) {
            escritor.println(mensaje);
        }
    }

 */
// Metodo defensa  (despertar hilo defensor)
// Metodo es tu turno (despertar hilo que le toque)

//  Turno  
