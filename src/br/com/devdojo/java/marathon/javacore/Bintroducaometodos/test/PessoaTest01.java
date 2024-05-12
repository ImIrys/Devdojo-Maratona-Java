package br.com.devdojo.java.marathon.javacore.Bintroducaometodos.test;

import br.com.devdojo.java.marathon.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ellora");
        pessoa.setIdade(5);

       // pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
