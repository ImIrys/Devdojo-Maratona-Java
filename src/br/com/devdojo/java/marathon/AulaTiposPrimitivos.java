package br.com.devdojo.java.marathon;

public class AulaTiposPrimitivos {
    public static void main(String[] args) {
        /* 8 tipos primitivos:
         int, double, float, char, byte, short, long, boolean
         Todos são númericos, com exceção do tipo boolean.
         A diferença entre eles é a quantidade de valor dentro da variável
         */
        // Nomenclatura de variáveis: int idadeDoPai, char nomeDaMae

        int idadeIrys = (int) 320000000000L; // numérico = 4 bytes = -2,147,483,648 até 147,483,647
        long numeroGrande = 15000L; // variável que guarda valor numérico = 8 bytes = -9,223,372,036,854,775,808 até 9223372036854750000 | Especificar que é un long: inserir L no final
        double salarioDouble = 3500.0D; // variáveis que guardam valores decimais = 8 bytes = 1.7e-308 até 1.7e+038 | Especificar que é un float: inserir F no final
        float salarioFloat = 4500.0F; // variáveis que guardam valores decimais = 4 bytes = 3.4e-038 até 3.4e+038  |  Especificar que é un double: inserir D no final
        byte idadeByte = 10; // numérico = 1 byte = -128 até 127
        short idadeShort = 10; // numérico = 2 bytes = -32768 até 32767
        boolean verdadeiro = true; // 1 bit = true ou false
        boolean falso = false; // 1 bit = true ou false
        char caractereA = 73; // 2 bytes = traduz um valor decimal em caractere da tabela ASCII
        char caractereU = '\u0041'; // traduz um valor decimal em caractere da tabela UNICODE

        /*
        Cast: Quando forçamos o JAVA a inserir o valor de uma variável dentro da outra.
        Exemplo: int idade = (int) 10000000000L;
        Não é uma boa prática.
         */

        /* String:
         - É uma classe, então começa com a primeira letra em maiúsculo.
         - Precisa de um identificador.
         - Texto em Aspas Duplas.
         - Não é um tipo primitivo.
         - Tipo de referência.
         - Pode ter uma grande texto. Não há limites.
         */

        String texto = "Ser feliz ao realizar a jornada pode ser muito melhor do que chegar ao destino com sucesso. - Jordan Peterson.";

        System.out.println("A idade é " +idadeIrys+ " anos");
        System.out.println(caractereA);
        System.out.println(caractereU);
        System.out.println(texto);
    }
}
