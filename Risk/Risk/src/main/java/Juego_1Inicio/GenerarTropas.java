/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_1Inicio;

/**
 *
 * @author ManTequila
 */
public class GenerarTropas {
    
        public static int generarTropasIniciales(int numJugadores) {
        switch (numJugadores) {
            case 3:
                return 35;
            case 4:
                return 30;
            case 5:
                return 25;
            case 6:
                return 20;
            default:
                // Puedes manejar otros casos según tus reglas
                return 0;
        }
    }
}
