package lista03;
import java.util.Scanner;
public class Lista03_Atv02 {
  public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int Numero = ler.nextInt();
        long fatorial = 1; 

        for(int i = Numero; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + Numero + " é: " + fatorial);
  }  
}
