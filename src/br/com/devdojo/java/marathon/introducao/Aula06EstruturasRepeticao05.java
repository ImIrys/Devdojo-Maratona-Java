package br.com.devdojo.java.marathon.introducao;

public class Aula06EstruturasRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes pode ser parcelado.
    // Condição - valor da parcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
