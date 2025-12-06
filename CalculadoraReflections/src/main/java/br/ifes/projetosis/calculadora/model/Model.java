package br.ifes.projetosis.calculadora.model;

public class Model {

    public double somar(int a, int b){
        return a + b;
    }

    public double subtrair(int a, int b){
        return a - b;
    }

    public double multiplicar(int a, int b){
        return a * b;
    }

    public double dividir(int a, int b){
        return (double) a / b;
    }

    public double exponenciacao(int a, int b){
        int resultado = 1;
        for (int i = 0; i < b; i++){
            resultado *= a ;
        }
        return resultado;
    }

    public double raiz(int a, int b){
        if (a < 0){
            throw new IllegalArgumentException("Não existe raiz de números negativos(No conjunto dos números reais).");
        }
        if (a == 0){
            return 0;
        }
        return (double)Math.pow(a, 1.0/ b);
    }
}
