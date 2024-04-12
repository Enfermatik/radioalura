package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Cancion micancion= new Cancion();
        micancion.setTitulo("Forever");
        micancion.setCantante("Kiss");

        Podcast mipodcast= new Podcast();
        mipodcast.setPresentador("Gabriela Aguiarda");
        mipodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            micancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            micancion.reproduce();
        }

        for (int i = 0; i < 500; i++) {
            mipodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            mipodcast.reproduce();
        }

        System.out.println("Total de reproducciones " + micancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta " + micancion.getTotalDeMeGusta());
        System.out.println("Total de reproducciones " + mipodcast.getTotalDeReproducciones());
        System.out.println("Total de me gusta " + mipodcast.getTotalDeMeGusta());

        MisFavoritos favoritos= new MisFavoritos();
        favoritos.adicione(mipodcast);
        favoritos.adicione(micancion);
    }
}
