/*3) Escrever um programa que leia o nome de um aluno e as notas das duas provas que ele obteve no 
semestre. Imprimir na tela o nome do aluno e a sua média (aritmética).  */

import java.util.Scanner;

public class Ex3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno:");
		String nome = sc.next();
		
		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("O aluno " + nome + " obteve média: " + media);
		
	}
}