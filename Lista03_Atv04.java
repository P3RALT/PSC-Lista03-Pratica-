package lista03.atv03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lista03_Atv04 { 
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Variaveis
        String [] data = new String [2];
        // [ 0 - DataAntiga - 1 DataRecente
        
        System.out.println("Digite a data mais antiga (formato dd/MM/yyyy):");
         data[0] = Ler.nextLine();
        System.out.println("Digite a data mais recente (formato dd/MM/yyyy):");
         data[1] = Ler.nextLine();
    
         try {
             LocalDate dataAntiga = LocalDate.parse(data[0], formatter); 
             LocalDate dataRecente = LocalDate.parse(data[1], formatter);
             
             long dias = ChronoUnit.DAYS.between(dataAntiga, dataRecente);
             if (dias < 0) { System.out.println(" A segunda data deve ser posterior " 
                      + "à primeira. "); 
            } else { System.out.println(" Passaram-se " + dias + " dias entre as datas. ");}
         } catch (Exception e) {
             System.out.println("Erro ao ler as datas. Use o fomato correto dd/mm/yyyy ");}
         
    }

}
