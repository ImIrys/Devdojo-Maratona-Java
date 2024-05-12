package br.com.devdojo.java.marathon.javacore.Gassociacao.test;

import br.com.devdojo.java.marathon.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Dodo");
        Jogador jogador2 = new Jogador("Fred");
        Jogador jogador3 = new Jogador("Zico");
        // Formas de criar o array:
        // Jogador[] jogadores = new Jogador[3];
        // Jogador[] jogadores = new Jogador[] {jogador1, jogador2, jogador3};
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
