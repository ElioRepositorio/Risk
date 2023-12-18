package Servidor;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ServerHilo extends Thread {

    private Socket skCliente = null;
    private int contadorCliente;

    public ServerHilo() {
    }

    public ServerHilo(Socket socket, int contador) //Contructor con el socket, contador(identificador) y numero generado por cliente.
    {

        this.skCliente = socket;
        this.contadorCliente = contador;

    }

    public boolean tienesFichero(String peticionArchivo) {

        boolean esta = false;
        String servidorArchivo = null; //Cremos un directorio en las carpetas del programa para poder trabajar con la ruta relativa del ordenador que tenga el servidor
        String rutaRelativaTexto = ".\\src\\archivos_del_servidor";

        Path rutaRelativa = Paths.get(rutaRelativaTexto);
        try {
            List<Path> elementos = Files.walk(rutaRelativa) //recojemos los path del directorio 
                    .collect(Collectors.toList());
            elementos.remove(0);  // Eliminamos la ruta 0 correspondiente al directorio padre

            for (Path elemento : elementos) {

                servidorArchivo = elemento.getFileName().toString();

                if (peticionArchivo.equalsIgnoreCase(servidorArchivo)) {
                    esta = true;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerHilo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al buscar el archivo");
        }
        return esta;
    }

    public byte[] dameFichero(String peticionArchivo) {

        byte[] archivoBytes = null;
        try {
            String rutaRelativaTexto = ".\\src\\archivos_del_servidor";

            String rutaCompleta = rutaRelativaTexto + "\\" + peticionArchivo;
            Path rutaCompletapath = Paths.get(rutaCompleta);

            archivoBytes = Files.readAllBytes(rutaCompletapath);

        } catch (IOException ex) {
            Logger.getLogger(ServerHilo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problemas al copiar los bytes");
        }
        return archivoBytes;
    }

    @Override
    public void run() {

        System.out.println("Cliente "+ contadorCliente +" conectado");
        DataInputStream flujo_entrada = null;
        DataOutputStream flujo_salida = null;
        try {
            flujo_entrada = new DataInputStream(skCliente.getInputStream());
            flujo_salida = new DataOutputStream(skCliente.getOutputStream());

            flujo_salida.writeUTF("Bienvenido a el servidor de apuntes de lenguajes de programacion escriba un lenguaje de programacion y descarguese sus apuntes (Ejemplo java)");

            String peticionArchivo = flujo_entrada.readUTF();

            boolean tienes = this.tienesFichero(peticionArchivo);

            if (tienes) {
                byte[] ficheroBytes = this.dameFichero(peticionArchivo);

                flujo_salida.writeUTF("Aqui tiene su Archivo "+ peticionArchivo );
                flujo_salida.write(ficheroBytes, 0, ficheroBytes.length);

            } else {
                flujo_salida.writeUTF("No tenemos archivos sobre esa peticion");
            }

        } catch (IOException ex) {
            Logger.getLogger(ServerHilo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                flujo_entrada.close();
                flujo_salida.close();
                skCliente.close();
                System.out.println("Cliente "+ contadorCliente +" desconectado");
            } catch (IOException ex) {
                Logger.getLogger(ServerHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
