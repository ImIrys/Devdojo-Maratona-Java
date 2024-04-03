package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(35 - 3);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0; // a partir daqui ele retorna para acima
        }
        return num1 / num2; // linha não será executada
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else
            return num1 / num2;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero.");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Número 1: "+numero1);
        System.out.println("Número 2: "+numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int ... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}