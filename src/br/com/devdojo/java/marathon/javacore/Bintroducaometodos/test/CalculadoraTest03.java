package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.test;

import br.com.devdojo.java.marathon.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(2,3);
        System.out.println(resultado);
    }
}
