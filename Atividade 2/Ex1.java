/*2) Faça um algoritmo que leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5,. 
OBS: A variável F representa a temperatura em graus Fahrenheit e a variável C representa a
 temperatura em graus Celsius.*/

 import java.util.Scanner;

public class Ex2{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double C, F; 

		System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n"); 
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		C = sc.nextDouble();
		
		F = ( 9 * C + 160 ) / 5;

		System.out.print("\n A medida convertida é " + F + "ºF\n");
		
	}

}