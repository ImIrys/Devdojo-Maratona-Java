package br.com.devdojo.java.marathon.javacore.Lclassesabstratas.test;

import br.com.devdojo.java.marathon.javacore.Lclassesabstratas.domain.Desenvolvedor;
import br.com.devdojo.java.marathon.javacore.Lclassesabstratas.domain.Funcionario;
import br.com.devdojo.java.marathon.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ellora", 10000);
        Desenvolvedor dev1 = new Desenvolvedor("Irys", 15000);
        System.out.println(gerente);
        System.out.println(dev1);
    }
}
