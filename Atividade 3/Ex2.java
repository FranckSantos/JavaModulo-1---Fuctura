/*3) Crie um algoritmo que leia dois valores x e y, representando um intervalo. 
(sendo x o início do intervalo e y o fim do intervalo). 
Em seguida, leia um novo valor z e verifique se z pertence ao intervalo [x, y].*/

import java.util.Scanner;  
 public class XYZ { 
      public static void main(String [] args){ 
         Scanner input = new Scanner (System.in); 
         int x, y, z; 
         System.out.print("Digite o valor de x: "); 
         x = input.nextInt(); 
         System.out.print("Digite o valor de y: "); 
         y = input.nextInt(); 
          System.out.print("Digite o valor de z: "); 
          z = input.nextInt(); 
          if ((z >= x) && (z <= y)){ 
              System.out.println("O valor "+ z + " pertence ao intervalo."); 
          }else{ 
              System.out.println("O valor "+ z + " Não pertence ao intervalo."); 
          } 
       } 
  } 