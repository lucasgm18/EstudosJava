package edu.Lucas.terceirasemana;

public class ComparacaoAvancada {
    public static void main(String[] args) {

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true

        //equals na parada
        System.out.println(nome1.equals(nome2)); //TRUE
        System.out.println(nome2.equals(nome3)); //TRUE
        System.out.println(nome3.equals(nome4)); //TRUE
    }
}
