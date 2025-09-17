package br.ifes.projetosis.calculadora.model;

public class Calculadora {
    public int calc(Operacao operacao, int numero1, int numero2){
        if (operacao == null){
            throw new IllegalArgumentException("Operação inválida. ");
        }
        return operacao.execute(numero1, numero2);
    }
}
