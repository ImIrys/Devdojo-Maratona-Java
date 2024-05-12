package br.com.devdojo.java.marathon.javacore.Gassociacao.test;

import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Jogador;
import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Dodo");
        Time time = new Time("Fluminense");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
