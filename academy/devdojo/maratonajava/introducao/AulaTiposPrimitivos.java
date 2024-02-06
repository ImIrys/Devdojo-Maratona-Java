package academy.devdojo.maratonajava.introducao;

public class AulaTiposPrimitivos {
    public static void main(String[] args) {
        /* 8 tipos primitivos:
         int, double, float, char, byte, short, long, boolean
         Todos são númericos, com exceção do tipo boolean.
         A diferença entre eles é a quantidade de valor dentro da variável
         */
        // Nomenclatura de variáveis: int idadeDoPai, char nomeDaMae

        int anoNascimento = 1992;
        int anoAtual = 2024; // numérico = 4 bytes = -2,147,483,648 até 147,483,647
        int idadeIrys = anoAtual - anoNascimento;
        long numeroGrande = 15000; // numérico = 8 bytes = -9,223,372,036,854,775,808 até 9223372036854750000
        double salarioDouble = 3500; // números decimais = 8 bytes = 1.7e-308 até 1.7e+038
        float salarioFloat = 4500; // números decimais = 4 bytes = 3.4e-038 até 3.4e+038
        byte idadeByte = 10; // numérico = 1 byte = -128 até 127
        short idadeShort = 10; // numérico = 2 bytes = -32768 até 32767
        boolean verdadeiro = true; // 1 bit = true ou false
        boolean falso = false; // 1 bit = true ou false
        char caractereA = 73; // 2 bytes = traduz um valor decimal em caractere da tabela ASCII
        char caractereU = '\u0041'; // traduz um valor decimal em caractere da tabela UNICODE

        System.out.println("Minha idade atual é: " +idadeIrys+ " anos.");
        System.out.println(caractereA);
        System.out.println(caractereU);
    }
}
