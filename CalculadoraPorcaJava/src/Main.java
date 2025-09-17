import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        double numero1;
        double numero2;
        int operacao;

        Scanner s = new Scanner(System.in);


        System.out.println("Bem vindo a Calculadora!! ");
        System.out.println("Selecione a operação que será realizada. \n1) soma\n2) subtração\n3) multiplicação\n4) divisão\n0) sair ");

        operacao = s.nextInt();

        while (operacao != 0){
            if (operacao == 1){
                System.out.println("Escolha o primeiro número a ser somado. ");
                numero1 = s.nextDouble();
                System.out.println("Escolha o segundo numero a ser somado. ");
                numero2 = s.nextDouble();
                System.out.println("A soma dos dois é: " + (numero1 + numero2));
            }
            else if (operacao == 2){
                System.out.println("Escolha o primeiro número a ser subtraido. ");
                numero1 = s.nextDouble();
                System.out.println("Escolha o segundo numero a ser subtraido. ");
                numero2 = s.nextDouble();
                System.out.println("A soma dos dois é: " + (numero1 - numero2));
            }
            else if (operacao == 3){
                System.out.println("Escolha o primeiro número a ser multiplicado. ");
                numero1 = s.nextDouble();
                System.out.println("Escolha o segundo numero a ser multiplicado. ");
                numero2 = s.nextDouble();
                System.out.println("A soma dos dois é: " + (numero1 * numero2));
            } else if (operacao == 4) {
                System.out.println("Escolha o primeiro número a ser dividido. ");
                numero1 = s.nextDouble();
                System.out.println("Escolha o segundo numero a ser dividido. ");
                numero2 = s.nextDouble();
                System.out.println("A soma dos dois é: " + (numero1 / numero2));
            }
            System.out.println("Selecione a operação que será realizada. \n1) soma\n2) subtração\n3) multiplicação\n4) divisão\n0) sair ");
            operacao = s.nextInt();
        }
        System.out.println("Tchauzinho.....");
    }
}