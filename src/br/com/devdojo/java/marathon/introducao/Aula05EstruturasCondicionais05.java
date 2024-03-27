package br.com.devdojo.java.marathon.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Utilizando SWITCH e dados os valores de 1 a 7,
        //Imprima o dia da semana, considerando 1 como Domingo.
        byte dia = 5;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana!!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }
}
