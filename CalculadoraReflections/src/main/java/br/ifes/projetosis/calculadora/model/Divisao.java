package br.ifes.projetosis.calculadora.model;

public class Divisao implements Operacao{

    @Override
    public int execute(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Divisão por 0");
        }
        return a / b;
    }
}
