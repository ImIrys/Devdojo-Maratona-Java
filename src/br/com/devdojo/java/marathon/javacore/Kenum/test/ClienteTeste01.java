package br.com.devdojo.java.marathon.javacore.Kenum.test;

import br.com.devdojo.java.marathon.javacore.Kenum.domain.Cliente;
import br.com.devdojo.java.marathon.javacore.Kenum.domain.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Irys", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Ellora", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Tanjiro", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Naruto", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
