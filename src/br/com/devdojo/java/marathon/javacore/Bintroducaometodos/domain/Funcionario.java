package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nomeFuncionario;
    private int idadeFuncionario;
    private double[] salarioFuncionario; // vai receber 3 salários na mesma variável (array)
    private double media;

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

        for (double salario : salarioFuncionario) {
            media += salario;
        }
        media /= salarioFuncionario.length;

        System.out.println("\nMédia salarial " + media);
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    public void setSalarioFuncionario(double[] salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public double[] getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public double getMedia() {
        return media;
    }
}
