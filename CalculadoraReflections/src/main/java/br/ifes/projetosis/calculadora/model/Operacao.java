package br.ifes.projetosis.calculadora.model;

public interface Operacao {

    public int execute(int a, int b);

    default int getQntOperandos(){
        return 2;
    }

}
