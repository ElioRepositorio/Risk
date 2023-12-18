/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_1Inicio;

import Servidor.Jugador;
import java.util.ArrayList;

/**
 *
 * @author ManTequila
 */
public class Pais {
   
    String nombre;
    Jugador propietario=null;
    ArrayList <String> paises_Limitofes;
    int tropas=0;

    public Pais(String nombre, ArrayList <String> paises_Limitofes) {
        this.nombre = nombre;
        this.propietario=null;
        this.paises_Limitofes = paises_Limitofes;
        this.tropas=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    public ArrayList<String> getPaises_Limitofes() {
        return paises_Limitofes;
    }

    public void setPaises_Limitofes(ArrayList<String> paises_Limitofes) {
        this.paises_Limitofes = paises_Limitofes;
    }

    public int getTropas() {
        return tropas;
    }

    public void setTropas(int tropas) {
        this.tropas = tropas;
    }


    
    
    
    
}
