package br.com.devdojo.java.marathon;

/*
PRATICANDO

CRIE VARIÁVEIS PARA OS CAMPOS DESCRITOS ABAIXO ENTRE <>
E IMPRIMA A SEGUINTE MENSAGEM:
EU <NOME>, MORANDO NO ENDEREÇO <ENDEREÇO>,
CONFIRMO QUE RECEBI O SALÁRIO <SALARIO>, NA DATA <DATA>.
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Irys Albuquerque";
        String adress = "Rua Mem de Sá - Icaraí";
        double salary = 5500;
        String receivingDate = "13/05/2024";
        //Guardar os valores dentro de uma variável  String
        String report = "Eu " +name+ ", moradora do endereço " + adress+ ", \nconfirmo que recebi o salário de " +salary+ ", na data " +receivingDate;

        System.out.println(report);
        //System.out.println("Eu " +name+ ", moradora do endereço " + adress+ ", \nconfirmo que recebi o salário de " +salary+ ", na data " +receivingDate);
    }
}
