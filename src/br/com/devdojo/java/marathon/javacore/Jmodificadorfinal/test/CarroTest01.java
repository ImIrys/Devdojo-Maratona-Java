package br.com.devdojo.java.marathon.javacore.Jmodificadorfinal.test;

import br.com.devdojo.java.marathon.javacore.Jmodificadorfinal.domain.Carro;
import br.com.devdojo.java.marathon.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Tanjiro");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
