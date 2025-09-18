class Operacoes():

    def somar(self, num1, num2):
        return num1 + num2
    
    def subtrair(self, num1, num2):
        return num1 - num2
    
    def multiplicar(self, num1, num2):
        return num1 * num2
    
    def dividir(self, num1, num2):
        if num2 == 0:
            return f"Erro: Divisão por 0."
        return num1 / num2
    