/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_2Proceso;

/**
 *
 * @author ManTequila
 */
public class Atacar {

    /*
    metodo tirar dados ataque y metodo tirar dados defensa metodo resultado
    
    Para atacar, primero se indica con cuál territorio ataca, y cuál es atacado, después los jugadores tiran los dados, avisando previamente cuantos dados van a tirar y lanzándolos al mismo tiempo. El atacante podrá tirar 1, 2 o 3 dados, teniendo en cuenta que debe tener al menos un ejército más que el número de dados que desea tirar. Por otro lado, el defensor tirará 1 o 2 dados, aunque para poder tirar dos dados deberá tener al menos 2 ejércitos en su territorio. En ambos casos, mientras más dados lancen, más posibilidades tienen de ganar pero, a la vez, más batallones pueden perder.

Para decidir el resultado de una batalla, se compara el dado más grande de cada jugador, si el número del dado del atacante es mayor, el defensor pierde una armada del territorio atacado. Pero si el dado del defensor es más grande, el atacante pierde una armada y pasa el turno al siguiente jugador. Si ambos tiraron más de un dado, comparen ahora el segundo dado de cada uno, y repitan el proceso. En caso de empate, el defensor se ve favorecido y, por último, ningún jugador puede perder más de dos armadas por cada tirada de dados.
    
    public void atacar(Pais paisAtacante, Pais paisDefensor) {
        // Verificar si el ataque es válido según las reglas
        if (paises.contains(paisAtacante) && paisAtacante.esLimitrofe(paisDefensor) && paisAtacante.getEjercitos() >= 2) {
            // Realizar la batalla
            int tropasAtacante = paisAtacante.getEjercitos();
            int tropasDefensor = paisDefensor.getEjercitos();

            while (tropasAtacante >= 2 && tropasDefensor >= 1) {
                // Determinar cuántos dados lanzará cada jugador
                int dadosAtacante = (tropasAtacante >= 3) ? 3 : 1;
                int dadosDefensor = (tropasDefensor >= 2) ? 2 : 1;

                // Lanzar dados y aplicar resultados de la batalla
                int[] resultadosAtacante = lanzarDados(dadosAtacante);
                int[] resultadosDefensor = lanzarDados(dadosDefensor);

                aplicarResultadosBatalla(paisAtacante, paisDefensor, resultadosAtacante, resultadosDefensor);

                // Actualizar el número de tropas después de la batalla
                tropasAtacante = paisAtacante.getEjercitos();
                tropasDefensor = paisDefensor.getEjercitos();
            }
        } else {
            // El ataque no es válido
            // Mostrar mensaje al usuario o tomar otras acciones según tu implementación
        }
    }

     */
}
