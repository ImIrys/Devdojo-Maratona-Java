package br.com.devdojo.java.marathon.javacore.Kenum.test;

import br.com.devdojo.java.marathon.javacore.Kenum.domain.Cliente;
import br.com.devdojo.java.marathon.javacore.Kenum.domain.TipoCliente;
import br.com.devdojo.java.marathon.javacore.Kenum.domain.TipoPagamento;

import static br.com.devdojo.java.marathon.javacore.Kenum.domain.TipoPagamento.CREDITO;
import static br.com.devdojo.java.marathon.javacore.Kenum.domain.TipoPagamento.DEBITO;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Irys", TipoCliente.PESSOA_JURIDICA, DEBITO);
        Cliente cliente2 = new Cliente("Ellora", TipoCliente.PESSOA_FISICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(DEBITO.calcularDesconto(100));
        System.out.println(CREDITO.calcularDesconto(100));

    }
}
