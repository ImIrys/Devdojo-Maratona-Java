package br.com.devdojo.java.marathon.javacore.Csobrecargametodos.test;

import br.com.devdojo.java.marathon.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Demon Slayer","TV", 12, "Ação");

        anime.imprime();


    }
}
