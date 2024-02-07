package br.com.devdojo.java.marathon;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Oeradores Aritméticos + - / *
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        double divisao = (double) numero1 / numero2;
        int multiplicacao = numero1 * numero2;

        /*
        System.out.println(numero2-numero1+ " é a Subtração entre " +numero2+ " e " +numero1);
        System.out.println(numero2+numero1+ " é a Soma entre " +numero2+ " e " +numero1);
        System.out.println(numero2/numero1+ " é a Divisão de " +numero2+ " por " +numero1);
        System.out.println(numero2*numero1+ " é a Multiplicação entre " +numero2+ " e " +numero1);
         */

        System.out.println("A soma entre " +numero1+ " e " +numero2+ " é " +soma);
        System.out.println("A subtração entre " +numero1+ " e " +numero2+ " é " +subtracao);
        System.out.println("A divisão entre " +numero1+ " e " +numero2+ " é " +divisao);
        System.out.println("A multiplicação entre " +numero1+ " e " +numero2+ " é " +multiplicacao);

    }
}
