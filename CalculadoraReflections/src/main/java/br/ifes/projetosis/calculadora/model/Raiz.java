package br.ifes.projetosis.calculadora.model;

public class Raiz implements Operacao{

    @Override
    public int execute(int a, int b){
        if (a < 0){
            throw new IllegalArgumentException("Não existe raiz de número negativo(Nos números reais)");
        }
        if (a == 0){
            return 0;
        }
        return (int) Math.sqrt(a);
    }

    @Override
    public int getQntOperandos(){
        return 1;
    }
}
