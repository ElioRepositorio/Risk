/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_1Inicio;

/**
 *
 * @author ManTequila
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Objetivos {

    private int identificador;
    private String textoObjetivo;
    private boolean objetivoCumplido;

    public Objetivos(int identificador, String textoObjetivo) {
        this.identificador = identificador;
        this.textoObjetivo = textoObjetivo;
        this.objetivoCumplido = false;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getTextoObjetivo() {
        return textoObjetivo;
    }

    public boolean isObjetivoCumplido() {
        return objetivoCumplido;
    }

    public void setObjetivoCumplido(boolean objetivoCumplido) {
        this.objetivoCumplido = objetivoCumplido;
    }

    // Método para generar objetivos aleatorios
    public static List<Objetivos> generarObjetivos() {
        List<Objetivos> objetivos = new ArrayList<>();

        objetivos.add(new Objetivos(1, "Conquistar 24 territorios."));
        objetivos.add(new Objetivos(2, "Conquistar 18 territorios manteniendo 2 tropas en cada uno de ellos."));
        objetivos.add(new Objetivos(3, "Conquistar Asia y América del Sur."));
        objetivos.add(new Objetivos(4, "Conquistar Asia y África."));
        objetivos.add(new Objetivos(5, "Conquistar América del Norte y África."));
        objetivos.add(new Objetivos(6, "Conquistar América del Norte y Oceanía."));
        objetivos.add(new Objetivos(7, "Conquistar Europa, América del Sur y un tercer continente a tu elección."));
        objetivos.add(new Objetivos(8, "Conquistar Europa, Oceanía y un tercer continente a tu elección."));
        objetivos.add(new Objetivos(9, "Destruir todos los EJÉRCITOS. Si son tuyos, o si los destruye otro jugador durante la partida, entonces tu misión cambia a: Ocupar 24 TERRITORIOS."));

        // Mezcla los objetivos para asignar aleatoriamente
        Collections.shuffle(objetivos);

        return objetivos;
    }

    // Método para tomar un objetivo de forma aleatoria
    public static Objetivos tomarObjetivoAleatorio(List<Objetivos> objetivos) {
        if (objetivos.isEmpty()) {
            return null; // No hay objetivos disponibles
        }

        // Tomar el primer objetivo de la lista (ya que está mezclada aleatoriamente)
        Objetivos objetivo = objetivos.remove(0);

        return objetivo;
    }
    public boolean comprobarObjetivoCumplido(Objetivos objetivo, List<Pais> paisesConquistados) {
    // Implementa la lógica específica para cada tipo de objetivo
    switch (objetivo.getIdentificador()) {
        case 1:
            // Conquistar 24 territorios
            return paisesConquistados.size() >= 24;

        case 2:
            // Conquistar 18 territorios manteniendo 2 tropas en cada uno de ellos
            int territoriosCumplenRequisito = 0;
            for (Pais pais : paisesConquistados) {
                if (pais.getTropas() >= 2) { 
                    territoriosCumplenRequisito++;
                }
            }
            return territoriosCumplenRequisito >= 18;

        // Agrega más casos según sea necesario para los demás objetivos

        default:
            // Otros casos que no están implementados
            return false;
    }
}
}

/*

    //generar objetivos

        Conquistar 24 territorios.
        Conquistar 18 territorios manteniendo 2 tropas en cada uno de ellos.
        Conquistar Asia y América del Sur.
        Conquistar Asia y África.
        Conquistar América del Norte y África.
        Conquistar América del Norte y Oceanía.
        Conquistar Europa, América del Sur y un tercer continente a tu elección.
        Conquistar Europa, Oceanía y un tercer continente a tu elección.
        Destruir todos los EJÉRCITOS (aquí el color, hay 6). Si son tuyos, o si los destruye otro jugador durante la partida, entonces tu misión cambia a: Ocupar 24 TERRITORIOS.

    //Array List objetivos 
    //numero ramdom con size objetivos numobjetivos=numjugadores
    //reparte entre los jugadores
    





*/