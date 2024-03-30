package br.com.devdojo.java.marathon.javacore.Aintroducaoclasses.test;

import br.com.devdojo.java.marathon.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroText01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Nissan March";
        carro1.modelo = "SV 1.6";
        carro1.ano = 2024;

        carro2.nome = "Jeep Renegade";
        carro2.modelo = "1.3 Turbo";
        carro2.ano = 2024;

        System.out.println("===================  1ª OPÇÃO: ===================");
        System.out.println(carro1.nome + ", " +carro1.modelo + ", " +carro1.ano);
        System.out.println("\n===================  2ª OPÇÃO: ===================");
        System.out.println(carro2.nome + ", " +carro2.modelo + ", " +carro2.ano);


    }

}
