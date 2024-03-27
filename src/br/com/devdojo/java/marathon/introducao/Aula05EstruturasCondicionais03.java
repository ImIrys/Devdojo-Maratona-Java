package br.com.devdojo.java.marathon.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 6000;
        // (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? "Vou conseguir doar 500,00" : "Não posso doar nada.";

        System.out.println(resultado);
    }
}
