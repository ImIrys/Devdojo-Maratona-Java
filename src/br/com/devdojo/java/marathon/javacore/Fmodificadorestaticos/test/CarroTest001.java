package br.com.devdojo.java.marathon.javacore.Fmodificadorestaticos.test;

import br.com.devdojo.java.marathon.javacore.Fmodificadorestaticos.domain.Carro;

public class CarroTest001 {
    public static void main(String[] args) {
        // Todas as instâncias de Carro terão esse valor.
        // Altera todos os objetos existentes dessa classe.
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("PORSHE", 260);
        Carro c3 = new Carro("MARCH", 220);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
