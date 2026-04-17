import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        scanner.close();

        System.out.println();

        if (quantidadeVendida > quantidadeEstoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            int estoqueAtualizado = quantidadeEstoque - quantidadeVendida;

            System.out.println("Produto: " + nome);
            System.out.printf("Preço: R$ %.2f%n", preco);
            System.out.println("Estoque antes da venda: " + quantidadeEstoque + " unidades");
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
            System.out.println("Estoque atualizado: " + estoqueAtualizado + " unidades");
        }
    }
}