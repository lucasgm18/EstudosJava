package edu.Lucas.primeirasemana;

import java.lang.invoke.StringConcatFactory;

public class AnatomiaClasses {
    public static void main (String [] args) {
     String primeiroNome = "Lucas ";
     String segundoNome = "Gomes";

     String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metódo " + primeiroNome.concat("").concat(segundoNome);
    }
}
