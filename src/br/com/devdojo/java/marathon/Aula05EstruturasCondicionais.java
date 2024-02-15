package br.com.devdojo.java.marathon;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        /* IF
       - IF = SE
       - Só executa se a expressão/resultado da expressão dentro do parênteses for VERDADEIRO/TRUE
       - Sintaxe:
        if (true) { // O resultado ou o que colocar dentro desses parênteses precisa ser um BOOLEANO
            System.out.println("Dentro do if");
        }
        */

        // Saber se o usuário pode ou não comprar bebida alcoólica:
        int idade = 15;

        if (idade >= 18) {
            System.out.println("Usuário maior de idade. Permitido comprar bebida alcoólica.");
        }
        else {
            System.out.println("Usuário menor de idade. Não é permitido a venda de bebidas alcoólicas para menores de idade.");
        }

        /*
        Tbm é possível fazer a comparação da seguinte maneira:
        boolean isAutorizadoComprarBebida = idade >= 18; (O valor booleano será alocado em memória na isAutorizadoComprarBebida)

        if (isAutorizadoComprarBebida) {
            System.out.println("Usuário maior de idade. Permitido comprar bebida alcoólica.");
        } else {
            System.out.println("Usuário menor de idade. Não é permitido a venda de bebidas alcoólicas para menores de idade.");
        }
         */

        /*
        Operador de negação: Existe uma opção alternativa ao uso do ELSE:
         */
        boolean isAutorizadoComprarBebida = idade >= 18;
            //Se não isAutorizadoComprarBebida então imprima Não autorizado a comprar bebida alcoólica.
        if (!isAutorizadoComprarBebida){ // o mesmo que isAutorizadoComprarBebida == false
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }



    }
}