//4) Escreva um programa que Imprima na tela o seu  nome, a soma, a subtração, a multiplicação e a divisão de dois valores inteiros.

public class Ex4 {

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 3;
        String nome = "Frank";
        int soma, subtracao, multiplicacao, divisao;
       
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
       
        System.out.println("Nome:" + nome);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
       
    }

}