package br.ifes.projetosis.calculadora.model;

public class Fatorial implements Operacao{

    @Override
    public int execute(int a, int b) {
        if (a < 0){
            throw new IllegalArgumentException("Fatorial não aceita números negativos");
        }
        if (a == 0 || a == 1){
            return 1;
        }

        int resultado = 1;
        for (int i = 2; i <= a; i++){
            resultado *= i;
        }
        return resultado;
    }

    @Override
    public int getQntOperandos(){
        return 1;
    }
}
