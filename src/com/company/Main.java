package com.company;

import Clases.Aldeano;
import Clases.Elfo;
import Clases.Heroe;
import Clases.Personajes;

public class Main {

    public static void main(String[] args) {

        Aldeano aldeano = new Aldeano();
        aldeano.imprimirdatos();

        Heroe heroe = new Heroe();
        heroe.imprimirdatos();
        heroe.Atacar();

        Elfo elfo = new Elfo();
        elfo.imprimirdatos();
        elfo.Atacar();

    }
}
