package br.com.devdojo.java.marathon.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituradoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e responderei SIM ou NÃO:");

        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }
}
