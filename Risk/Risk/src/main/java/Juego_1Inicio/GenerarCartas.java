/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_1Inicio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ManTequila
 */

public class GenerarCartas {

    String nombrePais;
    String figura;

    public GenerarCartas(String nombrePais, String figura) {
        this.nombrePais = nombrePais;
        this.figura = figura;
    }

    public static ArrayList<GenerarCartas> crearCartas() {
        ArrayList<String> nombresPaises = new ArrayList<>();

        // América del Norte
        nombresPaises.add("Alaska");
        nombresPaises.add("Alberta");
        nombresPaises.add("América Central");
        nombresPaises.add("Estados Unidos del Este");
        nombresPaises.add("Groenlandia");
        nombresPaises.add("Territorios del Noroeste");
        nombresPaises.add("Ontario");
        nombresPaises.add("Quebec");
        nombresPaises.add("Estados Unidos del Oeste");

        // América del Sur
        nombresPaises.add("Argentina");
        nombresPaises.add("Brasil");
        nombresPaises.add("Perú");
        nombresPaises.add("Venezuela");

        // Europa
        nombresPaises.add("Gran Bretaña");
        nombresPaises.add("Islandia");
        nombresPaises.add("Europa del Norte");
        nombresPaises.add("Escandinavia");
        nombresPaises.add("Europa del Sur");
        nombresPaises.add("Ucrania");
        nombresPaises.add("Europa Occidental");

        // África
        nombresPaises.add("Congo");
        nombresPaises.add("África Oriental");
        nombresPaises.add("Egipto");
        nombresPaises.add("Madagascar");
        nombresPaises.add("África del Norte");
        nombresPaises.add("Sudáfrica");

        // Asia
        nombresPaises.add("Afganistán");
        nombresPaises.add("China");
        nombresPaises.add("India");
        nombresPaises.add("Irkutsk");
        nombresPaises.add("Japón");
        nombresPaises.add("Kamchatka");
        nombresPaises.add("Oriente Medio");
        nombresPaises.add("Mongolia");
        nombresPaises.add("Siam");
        nombresPaises.add("Siberia");
        nombresPaises.add("Ural");
        nombresPaises.add("Yakutia");

        // Oceanía
        nombresPaises.add("Australia Oriental");
        nombresPaises.add("Indonesia");
        nombresPaises.add("Nueva Guinea");
        nombresPaises.add("Australia Occidental");

        // Shuffle para seleccionar aleatoriamente las figuras
        Collections.shuffle(nombresPaises);

        // Dividir la lista en tercios
        int tercio = nombresPaises.size() / 3;

        // Crear el ArrayList de cartas
        ArrayList<GenerarCartas> cartas = new ArrayList<>();

        // Asignar figuras
        for (int i = 0; i < nombresPaises.size(); i++) {
            String figura;
            if (i < tercio) {
                figura = "Artilleria"
                        + ""
                        + ""
                        + "";
            } else if (i < 2 * tercio) {
                figura = "Caballeria";
            } else {
                figura = "Infanteria";
            }

            GenerarCartas carta = new GenerarCartas(nombresPaises.get(i), figura);
            cartas.add(carta);
        }

        return cartas;
    }

    // Método para robar una carta del ArrayList de cartas
    public static GenerarCartas robarCarta(ArrayList<GenerarCartas> cartas)
    {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas para robar.");
            return null;
        }

        // Obtener una carta aleatoria
        int indiceCarta = (int) (Math.random() * cartas.size());
        GenerarCartas cartaRobada = cartas.get(indiceCarta);

        // Eliminar la carta robada del ArrayList
        cartas.remove(indiceCarta);

        return cartaRobada;
    }
}
