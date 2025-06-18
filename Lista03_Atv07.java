import java.util.Scanner;

public class Lista03_Atv07 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        // Variavel
        double valorConta;
        final double valorDose = 10.0;
        double taxaServico;
        int opcao;
        // =======================
        System.out.print("Informe o valor inicial da conta: R$ ");
        valorConta = Ler.nextDouble();
        
        taxaServico = valorConta * 0.10;
        valorConta += taxaServico;

        do {
            System.out.print("Deseja ouvir mais um modão? \n(1 = Sim | 2 = Não): ");
            opcao = Ler.nextInt();

            if (opcao == 1) {
                 valorConta += valorDose;
                 taxaServico = valorConta * 0.10;
                 valorConta += taxaServico;

                System.out.printf("Conta atualizada: R$ %.2f (Taxa de serviço: R$ %.2f)%n", valorConta, taxaServico);
            }

        } while (opcao == 1);

        System.out.println("=== CONTA FINAL ===");
        System.out.printf("Valor total da conta (com taxa): R$ %.2f%n", valorConta);
        System.out.printf("Última taxa de serviço calculada: R$ %.2f%n", taxaServico);

    }
}
