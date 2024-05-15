package br.com.devdojo.java.marathon.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        //Chamar a classe do JAVA responsável por fazer a leitura dos dados do teclado
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = input.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para seu sexo:");
        char sexo = input.next().charAt(0);// pega a primeira posição da palavra que foi convertida para um array.
        System.out.println("----------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }
}
