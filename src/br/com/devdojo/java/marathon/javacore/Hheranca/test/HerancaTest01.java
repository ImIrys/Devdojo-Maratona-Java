package br.com.devdojo.java.marathon.javacore.Hheranca.test;

import br.com.devdojo.java.marathon.javacore.Hheranca.domain.Endereco;
import br.com.devdojo.java.marathon.javacore.Hheranca.domain.Funcionario;
import br.com.devdojo.java.marathon.javacore.Hheranca.domain.Pessoa;

import javax.sound.midi.Soundbank;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Av. República do Chile");
        endereco.setCep("20031-170");

        Pessoa pessoa = new Pessoa("Irys");
        pessoa.setCpf("111.111.111-11");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Ellora");
        funcionario.setCpf("222.222.222-22");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("======================");

        funcionario.imprime();
    }
}
