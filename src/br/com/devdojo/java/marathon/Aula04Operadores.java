package br.com.devdojo.java.marathon;

public class Aula04Operadores {
    public static void main(String[] args) {
        // (1) Operadores Aritméticos: sempre retornam um valor nunérico
        // + - / *

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

        /*
        System.out.println("A soma entre " +numero1+ " e " +numero2+ " é " +soma);
        System.out.println("A subtração entre " +numero1+ " e " +numero2+ " é " +subtracao);
        System.out.println("A divisão entre " +numero1+ " e " +numero2+ " é " +divisao);
        System.out.println("A multiplicação entre " +numero1+ " e " +numero2+ " é " +multiplicacao);
        */

        // (2) Operador de Resto %
        int resto = 20 % 2; // O Resto de um número dividido por 2 - Se for 0 = =é uma valor PAR, se não for, é um valor ÍMPAR.
        System.out.println(resto);

        // (3) Operadores Lógicos: Sempre retornam um valor booleano TRUE ou FALSE
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);

        /*
         3 Tipos de Operadores Lógicos:
         && (AND)
         || (OR)
         ! (NOT)
         */

        /* AND &&
         É necessário ter todas as condições como verdadeiras
         para que o resultado final seja verdadeiro.
         */
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        /* OR ||
         Basta uma das condições ser verdadeira,
         que todo o resultado será verdadeiro.
         */
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStationCinco = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStationCinco || valorTotalContaPoupanca > valorPlayStationCinco;
        System.out.println("isPlayStationCincoCompravel " + isPlayStationCincoCompravel);

        /* (4) Operadores de Atribuição
         Atribue algo à variável.
         =
         +=
         -=
         *=
         /=
         %=
         */

        double bonus = 1800;
        bonus += 1000;  // o mesmo que dizer bonus = bonus + 1000;
        bonus -= 1000;  // o mesmo que dizer bonus = bonus - 1000;
        bonus *= 2; // o mesmo que dizer bonus = bonus * 2;
        bonus /= 2; // o mesmo que dizer bonus = bonus / 2;
        bonus %= 2; // o mesmo que dizer bonus = bonus % 2; Vai pegar o resto de 1800/2
        System.out.println(bonus);

        // ++ --
        int contador = 0;

        // Colocando os operadores DEPOIS, primeiro ele vai EXECUTAR e depois INCREMENTAR
        contador += 1; // contador = contador + 1;
        contador++; // contador += 1; // contador = contador + 1;
        contador--; // contador -= 1; // contador = contador - 1;

        // Colocando os operadores ANTES, primeiro ele vai INCREMENTAR e depois EXECUTAR.
        ++contador;
        --contador;

        int contador2 = 0;
        System.out.println(++contador2);










    }
}
