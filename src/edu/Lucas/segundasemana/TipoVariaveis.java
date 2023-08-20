package edu.Lucas.segundasemana;

public class TipoVariaveis {
    public static void main(String[] args) {
        //declarando algumas variáveis
        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2500; //tipo "double", nome "salarioMinimo", valor 2.500.
        System.out.println("O ano de fabricação é "+ anoFabricacao);
        System.out.println("O valor do salário mínimo é "+ salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

    }
}
