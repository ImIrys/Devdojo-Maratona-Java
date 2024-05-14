package br.com.devdojo.java.marathon.javacore.Gassociacao.test;

import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Jogador;
import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        //Criando o array
        Jogador[] jogadores = {jogador, jogador2};

        // referenciamento
        jogador.setTime(time);
        jogador2.setTime(time);

        //jogador dentro do time
        time.setJogadores(jogadores); //array

        System.out.println("=== JOGADOR ===");
        jogador.imprime();

        System.out.println("=== TIME ===");
        time.imprime();
    }

}
