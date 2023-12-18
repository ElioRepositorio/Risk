/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import Juego_1Inicio.GenerarCartas;
import Juego_1Inicio.Pais;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author ManTequila
 */
public class Jugador implements Runnable {
    
    String nombre;
    int color; //contructor color autoincremental e identificador  (para asignar colores distinto asi un color estara vinculado a un numero de jugador)
    String  objetivo;
    ArrayList <Pais> ListaPaises;   // metodo repartirPaises (al inicio)
    ArrayList <GenerarCartas> ListaCartas;   //metodo robarcarta (despues de atacar)
    private Socket socket;
    private ServidorRisk servidor;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;

    public Jugador(String nombre, Socket socket) {
        this.nombre = nombre;
        this.socket = socket;

        try {
            this.salida = new ObjectOutputStream(socket.getOutputStream());
            this.entrada = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        /* Lógica del jugador
        // Aquí manejarás las acciones del jugador, como colocar tropas, atacar, etc.
        // Deberás tener un bucle que escuche los mensajes del socket TCP.

 try (DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
             DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream())) {

            while (true) {
                // Notificar al cliente que es su turno
                outputStream.writeUTF("Es tu turno, Jugador " + playerIndex);

                // Esperar acciones del jugador
                String playerAction = inputStream.readUTF();
                // Procesar las acciones del jugador

                // Notificar al siguiente jugador que es su turno
                // Implementar lógica para reiniciar los turnos cuando todos los jugadores hayan jugado.
                outputStream.writeUTF("Turno del próximo jugador");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        */
        
        
        
    }
    
    
    public ArrayList<Pais> getListaPaises() {
        return ListaPaises;
    }

    public void setListaPaises(ArrayList<Pais> ListaPaises) {
        this.ListaPaises = ListaPaises;
    }

//public void atacar(Pais paisAtacante, Pais paisDefensor)

//public int calcularRefuerzos(ArrayList <Pais> ListaPaises)
   // contador
    
//public ArrayList <Pais> asignarRefuerzos (ArrayList <Pais> ListaPaises, int cantidadRefuerzos)
    

 
//    
}
