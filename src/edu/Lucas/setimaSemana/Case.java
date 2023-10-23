package edu.Lucas.setimaSemana;
import java.util.concurrent.ThreadLocalRandom;

public class Case {
    public static void main(String[] args) {
        case2();
        case3();
    }
    static void case2() {
        double salarioBase = 2000.0;
        String [] candidatos = {"\n FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalSelecionados = 0;
        int proximoCandidato = 0;
        while(totalSelecionados <5 && proximoCandidato < candidatos.length) {
            String candidato = candidatos[proximoCandidato++];
            double valorPretendido = valorPretendido();
            System.out.println("\n O candidato " + candidato + " está pedindo " + valorPretendido);
            if(valorPretendido > salarioBase) {
                System.out.println("\n QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");

            }else {
                System.out.println("\nLEGAL!! O candidato " + candidato + " foi selecionado ");
                totalSelecionados++;
            }

        }
        System.out.println("\n Total de selecionados: " + totalSelecionados);
        System.out.println("\n Total de consultados: " + proximoCandidato);
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void case3() {
        String [] candidatosSelecionados = {"FELIPE, MÁRCIA, JULIA, PAULO, LUCAS"};


        System.out.println("Imprimindo todos sem a necessidade de exibir o índice");

        for(String candidato: candidatosSelecionados) {
            System.out.println(candidato);
        }
    }

}
