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
public class GenerarPaises {

    public static void generaTablero() {

        ArrayList<Pais> paises = new ArrayList<>();

        //AMERICA
        //Alaska
        ArrayList<String> limitrofesAlaska = new ArrayList<>();
        limitrofesAlaska.add("Kamchatka");
        limitrofesAlaska.add("Territorios del Noroeste");
        limitrofesAlaska.add("Alberta");
        Pais alaska = new Pais("Alaska", limitrofesAlaska);

        //Alberta
        ArrayList<String> limitrofesAlberta = new ArrayList<>();
        limitrofesAlberta.add("Alaska");
        limitrofesAlberta.add("Territorios del Noroeste");
        limitrofesAlberta.add("Ontario");
        limitrofesAlberta.add("Estados Unidos del Oeste");
        Pais alberta = new Pais("Alberta", limitrofesAlberta);

        //America central
        ArrayList<String> limitrofesAmericaCentral = new ArrayList<>();
        limitrofesAmericaCentral.add("Venezuela");
        limitrofesAmericaCentral.add("Estados Unidos del Este");
        limitrofesAmericaCentral.add("Estados Unidos del Oeste");
        Pais americaCentral = new Pais("América Central", limitrofesAmericaCentral);

        //Estados Unidos del Este
        ArrayList<String> limitrofesEsteEstadosUnidos = new ArrayList<>();
        limitrofesEsteEstadosUnidos.add("Quebec");
        limitrofesEsteEstadosUnidos.add("Estados Unidos del Oeste");
        limitrofesEsteEstadosUnidos.add("Ontario");
        limitrofesEsteEstadosUnidos.add("América Central");
        Pais esteEstadosUnidos = new Pais("Estados Unidos del Este", limitrofesEsteEstadosUnidos);

        //territoriosNoroeste
        ArrayList<String> limitrofesTerritoriosNoroeste = new ArrayList<>();
        limitrofesTerritoriosNoroeste.add("Alaska");
        limitrofesTerritoriosNoroeste.add("Alberta");
        limitrofesTerritoriosNoroeste.add("Ontario");
        Pais territoriosNoroeste = new Pais("Territorios del Noroeste", limitrofesTerritoriosNoroeste);

        //ontario
        ArrayList<String> limitrofesOntario = new ArrayList<>();
        limitrofesOntario.add("Estados Unidos del este");
        limitrofesOntario.add("Estados Unidos del Oeste");
        limitrofesOntario.add("Territorios del Noroeste");
        limitrofesOntario.add("Quebec");
        Pais ontario = new Pais("Ontario", limitrofesOntario);

        //quebec
        ArrayList<String> limitrofesQuebec = new ArrayList<>();
        limitrofesQuebec.add("Estados Unidos del Este");
        limitrofesQuebec.add("Ontario");
        limitrofesQuebec.add("Groenlandia");
        Pais quebec = new Pais("Quebec", limitrofesQuebec);

        //groenlandia
        ArrayList<String> limitrofesGroenlandia = new ArrayList<>();
        limitrofesGroenlandia.add("Quebec");
        limitrofesGroenlandia.add("Islandia");
        Pais groenlandia = new Pais("Groenlandia", limitrofesGroenlandia);

        //Estados Unidos del Oeste
        ArrayList<String> limitrofesOesteEstadosUnidos = new ArrayList<>();
        limitrofesOesteEstadosUnidos.add("Alberta");
        limitrofesOesteEstadosUnidos.add("Ontario");
        limitrofesOesteEstadosUnidos.add("Estados Unidos del Este");
        limitrofesOesteEstadosUnidos.add("América Central");
        Pais oesteEstadosUnidos = new Pais("Estados Unidos del Oeste", limitrofesOesteEstadosUnidos);

        //AMERICA DEL SUR
        //Argentina
        ArrayList<String> limitrofesArgentina = new ArrayList<>();
        limitrofesArgentina.add("Brasil");
        limitrofesArgentina.add("Perú");
        Pais argentina = new Pais("Argentina", limitrofesArgentina);

        //Brasil
        ArrayList<String> limitrofesBrasil = new ArrayList<>();
        limitrofesBrasil.add("Argentina");
        limitrofesBrasil.add("Perú");
        limitrofesBrasil.add("Africa del Norte");
        limitrofesBrasil.add("Venezuela");
        Pais brasil = new Pais("Brasil", limitrofesBrasil);

        //Peru
        ArrayList<String> limitrofesPeru = new ArrayList<>();
        limitrofesPeru.add("Argentina");
        limitrofesPeru.add("Brasil");
        limitrofesPeru.add("Venezuela");
        Pais peru = new Pais("Perú", limitrofesPeru);

        //Venezuela
        ArrayList<String> limitrofesVenezuela = new ArrayList<>();
        limitrofesVenezuela.add("Brasil");
        limitrofesVenezuela.add("America Central");
        limitrofesVenezuela.add("Perú");
        Pais venezuela = new Pais("Venezuela", limitrofesVenezuela);

        // AFRICA
        //Congo
        ArrayList<String> limitrofesCongo = new ArrayList<>();
        limitrofesCongo.add("África Oriental");
        limitrofesCongo.add("Africa del Sur");
        limitrofesCongo.add("África del Norte");
        Pais congo = new Pais("Congo", limitrofesCongo);

        //Africa Oriental
        ArrayList<String> limitrofesAfricaOriental = new ArrayList<>();
        limitrofesAfricaOriental.add("Congo");
        limitrofesAfricaOriental.add("Egipto");
        limitrofesAfricaOriental.add("Madagascar");
        limitrofesAfricaOriental.add("Africa del Norte");
        limitrofesAfricaOriental.add("Africa del Sur");
        Pais africaOriental = new Pais("África Oriental", limitrofesAfricaOriental);

        //Egipto
        ArrayList<String> limitrofesEgipto = new ArrayList<>();
        limitrofesEgipto.add("África Oriental");
        limitrofesEgipto.add("África del Norte");
        limitrofesEgipto.add("Europa del Sur");
        limitrofesEgipto.add("Oriente Medio");
        Pais egipto = new Pais("Egipto", limitrofesEgipto);

        //Madagascar
        ArrayList<String> limitrofesMadagascar = new ArrayList<>();
        limitrofesMadagascar.add("África Oriental");
        limitrofesMadagascar.add("Africa del Sur");
        Pais madagascar = new Pais("Madagascar", limitrofesMadagascar);

        //Africa del Norte 
        ArrayList<String> limitrofesAfricaNorte = new ArrayList<>();
        limitrofesAfricaNorte.add("Egipto");
        limitrofesAfricaNorte.add("Europa del Sur");
        limitrofesAfricaNorte.add("Brasil");
        limitrofesAfricaNorte.add("Europa Occidental");
        Pais africaNorte = new Pais("África del Norte", limitrofesAfricaNorte);

        //Africa del Sur
        ArrayList<String> limitrofesSudafrica = new ArrayList<>();
        limitrofesSudafrica.add("Congo");
        limitrofesSudafrica.add("África Oriental");
        limitrofesSudafrica.add("Madagascar");
        Pais sudafrica = new Pais("Africa del Sur", limitrofesSudafrica);

        //EUROPA
        //Hijos de la Gran bretaña
        ArrayList<String> limitrofesGranBretaña = new ArrayList<>();
        limitrofesGranBretaña.add("Islandia");
        limitrofesGranBretaña.add("Escandinavia");
        limitrofesGranBretaña.add("Europa del Norte");
        limitrofesGranBretaña.add("Europa Occidental");
        Pais granBretaña = new Pais("Gran Bretaña", limitrofesGranBretaña);

        //Islandia
        ArrayList<String> limitrofesIslandia = new ArrayList<>();
        limitrofesIslandia.add("Groenlandia");
        limitrofesIslandia.add("Gran Bretaña");
        limitrofesIslandia.add("Escandinavia");
        Pais islandia = new Pais("Islandia", limitrofesIslandia);

        //Europa del Norte
        ArrayList<String> limitrofesEuropaNorte = new ArrayList<>();
        limitrofesEuropaNorte.add("Gran Bretaña");
        limitrofesEuropaNorte.add("Escandinavia");
        limitrofesEuropaNorte.add("Europa del Sur");
        limitrofesEuropaNorte.add("Europa Occidental");
        limitrofesEuropaNorte.add("Ucrania");
        Pais europaNorte = new Pais("Europa del Norte", limitrofesEuropaNorte);

        //Escandinavia 
        ArrayList<String> limitrofesEscandinavia = new ArrayList<>();
        limitrofesEscandinavia.add("Gran Bretaña");
        limitrofesEscandinavia.add("Islandia");
        limitrofesEscandinavia.add("Ucrania");
        limitrofesEscandinavia.add("Europa del Norte");
        Pais escandinavia = new Pais("Escandinavia", limitrofesEscandinavia);

        //Europa del sur
        ArrayList<String> limitrofesEuropaSur = new ArrayList<>();
        limitrofesEuropaSur.add("Europa del Norte");
        limitrofesEuropaSur.add("Ucrania");
        limitrofesEuropaSur.add("Oriente Medio");
        limitrofesEuropaSur.add("África del Norte");
        limitrofesEuropaSur.add("Egipto");
        limitrofesEuropaSur.add("Europa Occidental");
        Pais europaSur = new Pais("Europa del Sur", limitrofesEuropaSur);

        // Ucrania
        ArrayList<String> limitrofesUcrania = new ArrayList<>();
        limitrofesUcrania.add("Europa del Norte");
        limitrofesUcrania.add("Escandinavia");
        limitrofesUcrania.add("Afganistan");
        limitrofesUcrania.add("Europa del Sur");
        limitrofesUcrania.add("Oriente Medio");
        limitrofesUcrania.add("Ural");
        Pais ucrania = new Pais("Ucrania", limitrofesUcrania);

        // Europa Occidental
        ArrayList<String> limitrofesEuropaOccidental = new ArrayList<>();
        limitrofesEuropaOccidental.add("Gran Bretaña");
        limitrofesEuropaOccidental.add("Europa del Norte");
        limitrofesEuropaOccidental.add("Europa del Sur");
        limitrofesEuropaOccidental.add("Africa del Norte");
        Pais europaOccidental = new Pais("Europa Occidental", limitrofesEuropaOccidental);

        //OCEANIA
        //Australia Oriental
        ArrayList<String> limitrofesAustraliaOriental = new ArrayList<>();
        limitrofesAustraliaOriental.add("Nueva Guinea");
        limitrofesAustraliaOriental.add("Australia Occidental");
        Pais australiaOriental = new Pais("Australia Oriental", limitrofesAustraliaOriental);

        //Indonesia
        ArrayList<String> limitrofesIndonesia = new ArrayList<>();
        limitrofesIndonesia.add("Australia Occidental");
        limitrofesIndonesia.add("Nueva Guinea");
        limitrofesIndonesia.add("Siam");
        Pais indonesia = new Pais("Indonesia", limitrofesIndonesia);

        //Nueva Guinea 
        ArrayList<String> limitrofesNuevaGuinea = new ArrayList<>();
        limitrofesNuevaGuinea.add("Australia Oriental");
        limitrofesNuevaGuinea.add("Indonesia");
        limitrofesNuevaGuinea.add("Australia Occidental");
        Pais nuevaGuinea = new Pais("Nueva Guinea", limitrofesNuevaGuinea);

        // Australia Occidental
        ArrayList<String> limitrofesAustraliaOccidental = new ArrayList<>();
        limitrofesAustraliaOccidental.add("Nueva Guinea");
        limitrofesAustraliaOccidental.add("Indonesia");
        limitrofesAustraliaOccidental.add("Australia Oriental");
        Pais australiaOccidental = new Pais("Australia Occidental", limitrofesAustraliaOccidental);

        //ASIA
        //Afganistan
        ArrayList<String> limitrofesAfganistan = new ArrayList<>();
        limitrofesAfganistan.add("China");
        limitrofesAfganistan.add("India");
        limitrofesAfganistan.add("Oriente Medio");
        limitrofesAfganistan.add("Ural");
        limitrofesAfganistan.add("Ucrania");
        Pais afganistan = new Pais("Afganistán", limitrofesAfganistan);

        // China
        ArrayList<String> limitrofesChina = new ArrayList<>();
        limitrofesChina.add("Afganistán");
        limitrofesChina.add("India");
        limitrofesChina.add("Mongolia");
        limitrofesChina.add("Siam");
        limitrofesChina.add("Ural");
        limitrofesChina.add("Siberia");
        Pais china = new Pais("China", limitrofesChina);

        //India
        ArrayList<String> limitrofesIndia = new ArrayList<>();
        limitrofesIndia.add("Afganistán");
        limitrofesIndia.add("China");
        limitrofesIndia.add("Oriente Medio");
        limitrofesIndia.add("Siam");
        Pais india = new Pais("India", limitrofesIndia);

        //Irkutsk
        ArrayList<String> limitrofesIrkutsk = new ArrayList<>();
        limitrofesIrkutsk.add("Kamchatka");
        limitrofesIrkutsk.add("Mongolia");
        limitrofesIrkutsk.add("Siberia");
        limitrofesIrkutsk.add("Yakutia");
        Pais irkutsk = new Pais("Irkutsk", limitrofesIrkutsk);

        //Japon
        ArrayList<String> limitrofesJapon = new ArrayList<>();
        limitrofesJapon.add("Kamchatka");
        limitrofesJapon.add("Mongolia");
        Pais japon = new Pais("Japón", limitrofesJapon);

        //Kamchatka
        ArrayList<String> limitrofesKamchatka = new ArrayList<>();
        limitrofesKamchatka.add("Alaska");
        limitrofesKamchatka.add("Japón");
        limitrofesKamchatka.add("Mongolia");
        limitrofesKamchatka.add("Yakutia");
        limitrofesKamchatka.add("Irkutsk");
        Pais kamchatka = new Pais("Kamchatka", limitrofesKamchatka);

        //Oriente Medio
        ArrayList<String> limitrofesOrienteMedio = new ArrayList<>();
        limitrofesOrienteMedio.add("Afganistán");
        limitrofesOrienteMedio.add("India");
        limitrofesOrienteMedio.add("Ucrania");
        limitrofesOrienteMedio.add("Europa del Sur");
        limitrofesOrienteMedio.add("Egipto");
        Pais orienteMedio = new Pais("Oriente Medio", limitrofesOrienteMedio);

        //Mongolia
        ArrayList<String> limitrofesMongolia = new ArrayList<>();
        limitrofesMongolia.add("China");
        limitrofesMongolia.add("Irkutsk");
        limitrofesMongolia.add("Japón");
        limitrofesMongolia.add("Kamchatka");
        limitrofesMongolia.add("Siberia");
        Pais mongolia = new Pais("Mongolia", limitrofesMongolia);

        //Siam
        ArrayList<String> limitrofesSiam = new ArrayList<>();
        limitrofesSiam.add("China");
        limitrofesSiam.add("India");
        limitrofesSiam.add("Indonesia");
        Pais siam = new Pais("Siam", limitrofesSiam);

        //Siberia
        ArrayList<String> limitrofesSiberia = new ArrayList<>();
        limitrofesSiberia.add("China");
        limitrofesSiberia.add("Irkutsk");
        limitrofesSiberia.add("Mongolia");
        limitrofesSiberia.add("Ural");
        limitrofesSiberia.add("Yakutia");
        Pais siberia = new Pais("Siberia", limitrofesSiberia);

        //Ural
        ArrayList<String> limitrofesUral = new ArrayList<>();
        limitrofesUral.add("Afganistán");
        limitrofesUral.add("China");
        limitrofesUral.add("Siberia");
        limitrofesUral.add("Ucrania");
        Pais ural = new Pais("Ural", limitrofesUral);

        //
        ArrayList<String> limitrofesYakutia = new ArrayList<>();
        limitrofesYakutia.add("Irkutsk");
        limitrofesYakutia.add("Kamchatka");
        limitrofesYakutia.add("Siberia");
        Pais yakutia = new Pais("Yakutia", limitrofesYakutia);

        // Añadir todos los países al ArrayList
        paises.add(alaska);
        paises.add(alberta);
        paises.add(americaCentral);
        paises.add(esteEstadosUnidos);
        paises.add(territoriosNoroeste);
        paises.add(ontario);
        paises.add(quebec);
        paises.add(groenlandia);
        paises.add(oesteEstadosUnidos);
        paises.add(argentina);
        paises.add(brasil);
        paises.add(peru);
        paises.add(venezuela);
        paises.add(congo);
        paises.add(africaOriental);
        paises.add(egipto);
        paises.add(madagascar);
        paises.add(africaNorte);
        paises.add(sudafrica);
        paises.add(granBretaña);
        paises.add(islandia);
        paises.add(europaNorte);
        paises.add(escandinavia);
        paises.add(europaSur);
        paises.add(ucrania);
        paises.add(europaOccidental);
        paises.add(australiaOriental);
        paises.add(indonesia);
        paises.add(nuevaGuinea);
        paises.add(australiaOccidental);
        paises.add(afganistan);
        paises.add(china);
        paises.add(india);
        paises.add(irkutsk);
        paises.add(japon);
        paises.add(kamchatka);
        paises.add(orienteMedio);
        paises.add(mongolia);
        paises.add(siam);
        paises.add(siberia);
        paises.add(ural);
        paises.add(yakutia);
    }

    public static ArrayList<Pais> repartirPaises(ArrayList<Pais> paises, int numeroJugadores) {
        // Asegúrate de que el número de jugadores sea válido
        if (numeroJugadores < 3 || numeroJugadores > 6) {
            System.out.println("Número de jugadores inválido.");
            return null;
        }

        // Mezcla el ArrayList de países para distribuirlos aleatoriamente
        Collections.shuffle(paises);

        // Calcula la cantidad de países que le tocará a cada jugador
        int paisesPorJugador = paises.size() / numeroJugadores;
        int paisesSobrantes = paises.size() % numeroJugadores;

        // Lista para almacenar los países asignados a los jugadores
        ArrayList<Pais> paisesAsignados = new ArrayList<>();

        // Asigna países a cada jugador
        for (int i = 0; i < numeroJugadores; i++) {
            // Cantidad de países asignados a este jugador
            int cantidadAsignada = paisesPorJugador;

            // Si hay países sobrantes, asigna uno más a este jugador
            if (paisesSobrantes > 0) {
                cantidadAsignada++;
                paisesSobrantes--;
            }

            // Obtiene los países para el jugador actual
            ArrayList<Pais> paisesJugador = new ArrayList<>(paises.subList(0, cantidadAsignada));

            // Elimina los países asignados del ArrayList general
            paises.removeAll(paisesJugador);

            // Agrega los países asignados a la lista general
            paisesAsignados.addAll(paisesJugador);
        }

        // Retorna la lista de países asignados a los jugadores
        return paisesAsignados;
    }
}
