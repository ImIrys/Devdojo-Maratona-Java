package br.com.devdojo.java.marathon.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
