package br.ifes.projetosis.calculadora.view;

import br.ifes.projetosis.calculadora.controller.ControllerCalc;
import br.ifes.projetosis.calculadora.model.Operacao;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Menu {

    public void menuPrint(){
        Scanner s = new Scanner(System.in);
        Reflections reflexao = new Reflections("br.ifes.projetosis.calculadora.model");
        int opcao;

        do {
            Set<Class <? extends Operacao>> classeOperacoes = reflexao.getSubTypesOf(Operacao.class);
            List<Class <? extends Operacao>> operacoesLista = new ArrayList<>(classeOperacoes);

            System.out.println("\n------------------------");
            System.out.println("Calculadora Mídia");
            System.out.println("Selecione a Operação: ");
            System.out.println("------------------------");

            for (int i = 0; i < operacoesLista.size(); i++){
                System.out.println((i + 1) + " - " + operacoesLista.get(i).getSimpleName());
            }

            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            opcao = s.nextInt();

            if (opcao <= 0 || opcao > operacoesLista.size()){
                if (opcao < 0 || opcao > operacoesLista.size()){
                    System.out.println("Opção inválida.");
                }
                continue;
            }
            try {
                Class<? extends Operacao> classeSelecionada = operacoesLista.get(opcao - 1);
                Operacao operacao = classeSelecionada.getDeclaredConstructor().newInstance();

                int numero2 = 0;

                System.out.print("Digite o primeiro número: ");
                int numero1 = s.nextInt();

                if (operacao.getQntOperandos() == 2) {
                    System.out.print("Digite o segundo número: ");
                    numero2 = s.nextInt();
                }

                ControllerCalc controller = new ControllerCalc();
                int resultado = controller.opCalcular(operacao, numero1, numero2);

                System.out.println("Resultado: " + resultado);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);
        System.out.println("Calculadora fechada.");
    }
}
