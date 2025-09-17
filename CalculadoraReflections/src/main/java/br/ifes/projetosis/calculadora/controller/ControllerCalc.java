package br.ifes.projetosis.calculadora.controller;


import br.ifes.projetosis.calculadora.model.Calculadora;
import br.ifes.projetosis.calculadora.model.Operacao;

public class ControllerCalc {
    public int opCalcular(Operacao operacao, int numero1, int numero2){
        Calculadora calculadora = new Calculadora();
        return calculadora.calc(operacao, numero1, numero2);
    }
}
