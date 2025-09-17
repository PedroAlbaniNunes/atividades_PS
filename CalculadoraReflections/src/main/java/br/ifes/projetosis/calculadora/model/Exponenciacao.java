package br.ifes.projetosis.calculadora.model;

public class Exponenciacao implements Operacao{

    @Override
    public int execute(int a, int b){
        int resultado = 1;
        for (int i = 0; i < b; i++){
            resultado *= a;
        }
        return resultado;
    }
}
