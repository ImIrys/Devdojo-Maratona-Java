package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.test;

import br.com.devdojo.java.marathon.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nomeFuncionario = "Irys Lopes";
        funcionario.idadeFuncionario = 32;
        funcionario.salarioFuncionario = new double[]{1200, 987.32, 2000};
         // arrays são variáveis de referência, criamos um objeto array.

        funcionario.imprimeDados();
    }
}