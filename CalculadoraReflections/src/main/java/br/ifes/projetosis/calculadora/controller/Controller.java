package br.ifes.projetosis.calculadora.controller;
import br.ifes.projetosis.calculadora.model.Model;
import br.ifes.projetosis.calculadora.view.Menu;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Controller {

    private Model model;
    private Menu menu;


    public Controller() {
        this.model = new Model();
        this.menu = new Menu();
    }

    public void executar(int opcao, int a, int b) {
        try {
            Class<?> classe = Model.class;
            Object modelObjeto = classe.getDeclaredConstructor().newInstance();
            Method[] metodos = classe.getDeclaredMethods();

            Arrays.sort(metodos, Comparator.comparing(Method::getName));

            Method operacaoEscolhida = metodos[opcao - 1];
            if (b == 0 && operacaoEscolhida.getName().equals("dividir")) {
                System.out.println("Não dá pra dividir por 0.");
                return;
            }
            if (a < 0 && operacaoEscolhida.getName().equals("raiz")) {
                System.out.println("Não existe raiz de números negativos(No conjunto dos números reais).");
                return;
            }
            Object resultado = operacaoEscolhida.invoke(modelObjeto, a, b);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro");
        }


    }

    public void calculadora() {
        boolean continuar = true;

        while (continuar) {
            // O menu deve agora retornar um array onde o primeiro índice é a opção
            int[] valores = menu.print_menu();

            // Verificamos se valores não é null e se a opção (índice 0) é 0
            if (valores != null && valores[0] == 0) {
                System.out.println("Encerrando...");
                continuar = false; // Quebra o ciclo
            } else if (valores != null) {
                // Só executa se não for sair
                executar(valores[0], valores[1], valores[2]);
            }
        }
    }
}
