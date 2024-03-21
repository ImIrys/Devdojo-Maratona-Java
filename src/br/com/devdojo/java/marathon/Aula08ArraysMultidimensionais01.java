package br.com.devdojo.java.marathon;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Primeiro array de 12 posições = meses do ano
        // Quantidade de posições representam os dias no ano.
        // 1 = janeiro = 31 dias/ 2 = fevereiro = 28 dias ...

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
