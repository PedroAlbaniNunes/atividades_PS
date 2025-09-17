package br.ifes.projetosis.calculadora.model;

public class Multiplicacao implements Operacao{

    @Override
    public int execute(int a, int b){
        return a * b;
    }

}
