package br.com.devdojo.java.marathon;

public class Aula06EstruturasRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes pode ser parcelado.
    // Condição - valor da parcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + ": R$ " + valorParcela);
        }
    }
}
