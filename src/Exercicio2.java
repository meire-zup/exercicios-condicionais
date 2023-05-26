import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar o tipo de combustível (A - álcool ou G - gasolina):");
        char tipoDeCombustivel = scanner.next().charAt(0);
        double precoGasolina = 2.5;
        double precoAlcool = 1.9;
        double desconto;
        System.out.println("Informar a quantidade de litros de combustível:");
        int quantidadeDeCombustivel = scanner.nextInt();
        double valorTotal;
        double valorTotalComDesconto;
        if (tipoDeCombustivel == 'A' && quantidadeDeCombustivel <= 20) {
            valorTotal = quantidadeDeCombustivel * precoAlcool;
            desconto = 0.97;
            valorTotalComDesconto = valorTotal * desconto;
        } else if (tipoDeCombustivel == 'A') {
            valorTotal = quantidadeDeCombustivel * precoAlcool;
            desconto = 0.95;
            valorTotalComDesconto = valorTotal * desconto;
        } else if (tipoDeCombustivel == 'G' && quantidadeDeCombustivel <= 20) {
            valorTotal = quantidadeDeCombustivel * precoGasolina;
            desconto = 0.96;
            valorTotalComDesconto = valorTotal * desconto;
        } else {
            valorTotal = quantidadeDeCombustivel * precoGasolina;
            desconto = 0.94;
            valorTotalComDesconto = valorTotal * desconto;
        }
        System.out.printf("Valor total a ser pago com desconto: R$ %,.2f",valorTotalComDesconto);

    }
}
