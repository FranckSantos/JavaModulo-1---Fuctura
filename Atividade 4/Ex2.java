/* 3) Imprima a soma de todos os n�meros de 1 at� 100. */

public class Soma1a100 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;
        while (i <= 100){
            soma = soma + i;
            i++;
        }
        System.out.println("Soma dos n�meros de 1 at� 100: " + soma);
    }
}