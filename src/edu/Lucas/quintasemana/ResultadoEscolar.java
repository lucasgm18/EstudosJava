package edu.Lucas.quintasemana;

public class ResultadoEscolar {
    public static void main(String[] args) {

        //CONDIÇÃO SIMPLES
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);


        //CONDIÇÃO ENCADEADA
        int nota = 4;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
        //Vale ressaltar aqui, que no Java, em uma condição**if/else** às vezes necessitamos adicionar um bloco de { },se a lógica conter mais de uma linha.
        //Condição simples, composta, encadeada
    }
}
