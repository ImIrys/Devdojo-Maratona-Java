package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nomeFuncionario;
    public int idadeFuncionario;
    public double[] salarioFuncionario; // vai receber 3 salários na mesma variável (array)

    public void imprimeDados() {
        System.out.println(this.nomeFuncionario);
        System.out.println(this.idadeFuncionario);
        if (salarioFuncionario == null) {
            return;
        }
            for (double salario : salarioFuncionario) {
                System.out.print(salario + " ");
            }

        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarioFuncionario == null) {
            return;
        }
        double media = 0;

        for (double salario : salarioFuncionario) {
            media += salario;
        }
        media /= salarioFuncionario.length;

        System.out.println("\nMédia salarial " + media);
    }
}
