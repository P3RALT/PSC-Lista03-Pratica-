package lista03.atv03;
import java.util.Scanner; 
public class Lista03_Atv05 {
   public static void main(String[] args){
   // Objs
       Scanner Ler = new Scanner (System.in); 
   // Variaveis
   int numero = 0, soma = 0, valor = 0;
   String numeroCon;
   // ------------------------
       System.out.println("Informe o valor de n: ");
       numero = Ler.nextInt();
       for (int i = 1; i <= 10; i++) {
           numeroCon = String.valueOf(i) + String.valueOf(i); 
           valor = Integer.parseInt(numeroCon);
           soma += valor;
       }
       System.out.println("O Resultado de Sn é: " + soma);
   }
}
