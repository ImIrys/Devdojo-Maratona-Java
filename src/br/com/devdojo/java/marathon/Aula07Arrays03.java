package br.com.devdojo.java.marathon;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[6];
        nomes[0] = "Tanjiro";
        nomes[1] = "Sakura";
        nomes[2] = "Naruto";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
