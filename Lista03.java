package lista03;
import java.util.Scanner;
public class Lista03 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int [] multiplos = new int[3];
        
        for(int i = 0; i<= 1000; i++){
            if(i % 2 == 0){
                multiplos[0] += 1;}
            if(i % 3 == 0){ 
                multiplos[1] += 1;}
            if(i % 5 == 0){ 
                multiplos[2] += 1;}
        }
       System.out.println(" --> Multiplos de 2: " + multiplos[0]
       + "\n --> Multiplos de 3: " + multiplos[1] 
       + "\n --> Multiplos de 5: " + multiplos[2]);
        
        
        
        
    }

}
