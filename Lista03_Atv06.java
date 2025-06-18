import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    String sexo;
    String olhos;
    String cabelos;
    int idade;

    public Pessoa(String sexo, String olhos, String cabelos, int idade) {
        this.sexo = sexo;
        this.olhos = olhos;
        this.cabelos = cabelos;
        this.idade = idade;
    }
    public boolean atendeCriterio() {
        return sexo.equalsIgnoreCase("F")
                && olhos.equalsIgnoreCase("verdes")
                && cabelos.equalsIgnoreCase("louros")
                && idade >= 18
                && idade <= 35;
    }
}

public class Lista03_Atv06{
    public static void main(String[] args) {
        // OBS =====================
        Scanner Ler = new Scanner(System.in);
        ArrayList<Pessoa> habitantes = new ArrayList<>();
        // Variaveis 
        int idade;
        String sexo, olhos, cabelo;
        int maiorIdade, menorIdade;
        int contMulheresCriterio;
        //==========================
        while (true) {
            System.out.print("Informe a idade (ou -1 para encerrar): ");
            idade = Ler.nextInt();
            Ler.nextLine(); 

            if (idade == -1) {break;  }

            System.out.print("Informe o sexo (M/F): ");
            sexo = Ler.nextLine();

            System.out.print("Cor dos olhos (azuis, verdes, castanhos): ");
            olhos = Ler.nextLine();

            System.out.print("Cor dos cabelos (louros, castanhos, pretos): ");
            cabelo = Ler.nextLine();

            Pessoa pessoa = new Pessoa(sexo, olhos, cabelo, idade);
            habitantes.add(pessoa);
        }

        if (habitantes.isEmpty()) {
            System.out.println("\nNenhum habitante foi cadastrado.");
            Ler.close();
            return; }

        maiorIdade = Integer.MIN_VALUE;
        menorIdade = Integer.MAX_VALUE;
        contMulheresCriterio = 0;

        for (Pessoa p : habitantes) {
            if (p.idade > maiorIdade) { maiorIdade = p.idade; }
            if (p.idade < menorIdade) { menorIdade = p.idade;  }
            if (p.atendeCriterio())   { contMulheresCriterio++; }
        }

        System.out.println("=== RESULTADOS DA PESQUISA ===");
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de mulheres com olhos verdes e cabelos louros (idade entre 18 e 35): " + contMulheresCriterio);
    }
}
