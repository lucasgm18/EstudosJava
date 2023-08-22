package edu.Lucas.terceirasemana;
import java.time.LocalDate;



public class OperadoresJava {
    public static void main(String[] args) {
        //classe Operadores.java
        String nome = "LUCAS";
        int idade = 23;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        LocalDate dataNascimento = LocalDate.now();


        //classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM " + "JAVA ";

       //qual o resultado das expressoes abaixo?
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);

        System.out.println(nomeCompleto + concatenacao);

        //Unários
        //Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.
        //(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
        //(-) Operador unário de valor negativo – nega um número ou expressão aritmética;
        //(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
        //(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
        //(!) Operador unário lógico de negação – nega o valor de uma expressão booleana.
                //Exemplos abaixo
        // classe Operadores.java
        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(- numero);

       //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

      //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

       //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);



       // O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
       //<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
        //Exemplos abaixo:
       // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

       /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         if(a==b)
        resultado = "verdadeiro";
          else
          resultado = "falso";
        */

       //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String result = (a==b) ? "verdadeiro" : "false";

        System.out.println(result);


               // == Quando desejamos verificar se uma variável é IGUAL A outra.
               // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
               // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
               // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
               // < Quando desejamos verificar se uma variável é MENOR QUE outra.
               //<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
     //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2 ");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2 ");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2 ");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2 ");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2 ");

        boolean condicao1=true;

        boolean condicao2=false;

    /* Aqui estamos utilizando o operador lógico E para fazer a união de duas
    expressões.
  É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

     //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
