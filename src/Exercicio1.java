import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe valor da hora trabalhada:");
        double valorDaHoraTrabalhada = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        int quantidadeDeHorasTrabalhadas = scanner.nextInt();
        double salarioBruto = valorDaHoraTrabalhada * quantidadeDeHorasTrabalhadas;

        int percentualDescontoImpostoDeRenda;
        double descontoImpostoDeRenda;
        int percentualDescontoInss = 10;
        int percentualDescontoFgts = 11;
        double descontoInss = salarioBruto * percentualDescontoInss / 100;
        double descontoFgts = salarioBruto * percentualDescontoFgts / 100;
        double totalDeDescontos;

        if (salarioBruto <= 900) {
            percentualDescontoImpostoDeRenda = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualDescontoImpostoDeRenda = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualDescontoImpostoDeRenda = 10;
        } else {
            percentualDescontoImpostoDeRenda = 20;
        }
        descontoImpostoDeRenda = salarioBruto * percentualDescontoImpostoDeRenda / 100;
        totalDeDescontos = descontoInss + descontoImpostoDeRenda;
        double salarioLiquido = salarioBruto - totalDeDescontos;

        System.out.printf("Salário Bruto: (%,.2f * %d)       : R$ %,.2f\n", valorDaHoraTrabalhada, quantidadeDeHorasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%d%%)                     : R$ %,.2f\n", percentualDescontoImpostoDeRenda, descontoImpostoDeRenda);
        System.out.printf("(-) INSS (10%%)                   : R$ %,.2f\n", descontoInss);
        System.out.printf("(-) FGTS (11%%)                   : R$ %,.2f\n", descontoFgts);
        System.out.printf("Total de descontos                : R$ %,.2f\n", totalDeDescontos);
        System.out.printf("Salário Líquido                   : R$ %,.2f\n", salarioLiquido);

    }

}


