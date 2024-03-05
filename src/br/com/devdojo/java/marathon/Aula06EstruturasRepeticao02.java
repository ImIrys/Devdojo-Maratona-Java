package br.com.devdojo.java.marathon;

public class Aula06EstruturasRepeticao02 {
    public static void main(String[] args) {
        //Utilizando o FOR, imprima todos os números pares de 0 até 1000000.
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
