package edu.Lucas.terceirasemana;

public class ComparacaoAvancada2 {
    public static void main(String[] args) {
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true

        Integer numero3 = 130;
        Integer numero4 = 130;

        System.out.println(numero3 == numero4); //false

        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals

        System.out.println(numero3.equals(numero4));
    }
}
