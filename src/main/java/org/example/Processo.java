package org.example;
import java.util.concurrent.ThreadLocalRandom;

public class Processo {

    public static void main(String[] args) {
            SelecaoCandidatos();

    }


    static void SelecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Juliana", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge"};

        int candidatosSelecionados = 0;

         int candidatosAtual = 0;

             double salarioBase = 2000.0;
             while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario:" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " Foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


}
