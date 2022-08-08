/*4) Faça um algoritmo para calcular a área de um triângulo. Obs.: Área = ( Base * Altura ) / 2.
Será necessário criar variáveis para armazernar o valor da base e da altura. 
Em seguida, colocar na fórmula e apresentar a sua área.*/

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base:");
		double base = sc.nextDouble();

		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();

		double area = base * altura / 2;

		System.out.println("A área do triângulo é: " + area);

	}
}