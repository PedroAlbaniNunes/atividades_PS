package br.ifes.projetosis.calculadora.view;
import br.ifes.projetosis.calculadora.model.Model;
import java.lang.reflect.*;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Menu {
    Scanner s = new Scanner(System.in);

    public int[] print_menu() {
        System.out.println("""
            \nBem vindo a Calculadora Reflection em Java
            Escolha a sua opção:""");

        Class<?> classe = Model.class;
        int i = 1;
        Method[] metodos = classe.getDeclaredMethods();

        Arrays.sort(metodos, Comparator.comparing(Method::getName));

        for (Method m : metodos) {
            System.out.println(i + " - " + m.getName());
            i++;
        }
        System.out.println("0 - Sair");

        System.out.println("Opção: ");
        int opcao = s.nextInt();

        if (opcao == 0) {
            return new int[]{0, 0, 0};
        }

        if (opcao >= 1 && opcao <= metodos.length) {
            System.out.println("Digite o primeiro número: ");
            int a = s.nextInt();
            System.out.println("Digite o segundo número: ");
            int b = s.nextInt();
            return new int[]{opcao, a, b};
        } else {
            System.out.println("Operação não encontrada");
            return null;
        }
    }
}
