package sentaEaprende;

import java.util.Scanner;

public class CalcResultFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int faltas = 0, horaExtra = 0;
		boolean vt = true, PlanoDeSaude = true, odont = true;
		
		System.out.println("Olá! Seja bem-vindo à folha de holerite mensal!");
		System.out.println("Qual é o seu nome?");
		String nome = sc.next();
		
		System.out.println("Quanto você ganha?");
		double salarioBruto = sc.nextDouble();
		
		System.out.print("Horas extras: ");
		horaExtra = sc.nextInt();
		
		System.out.print("Quantidade de faltas: ");
		faltas = sc.nextInt();
		
		System.out.println("Você utiliza Vale-Transporte? (true/false)");
		vt = sc.nextBoolean();
		
		System.out.println("Você utiliza o Plano de Saúde? (true/false)");
		PlanoDeSaude = sc.nextBoolean();
		
		System.out.println("Você utiliza o Plano odontológico? (true/false)");
		odont = sc.nextBoolean();
		
		double horafunc = salarioBruto / (22 * 8);
		double diafunc = (horafunc * 8);
		double descVT = (salarioBruto * 0.06), descPlanoDeSaude = 14, descPlanoOdontologico = 14, calcHoraExtra =  (horafunc * 1.5) * horaExtra;
		double SomaFaltas = faltas * diafunc;
		double totalDescontos = descVT + descPlanoDeSaude + descPlanoOdontologico;
		double salarioLiquido = (salarioBruto + calcHoraExtra) - totalDescontos;
		
		System.out.println("Holerite de " + nome + " atualizado:");
		System.out.println("|");
		System.out.println("Nome do funcionário: " + nome);
		System.out.printf("Salário Bruto do funcionário: R$ %.2f", salarioBruto);
		System.out.println();
		System.out.println("Horas extras: " +  horaExtra);
		System.out.println("Faltas: " + faltas);
		if (vt) {
			System.out.println("Vale-Transporte: " + vt);
		} else {
			System.out.println("Vale-Transporte: " + vt);
		}	
		if (PlanoDeSaude) {
			System.out.println("Plano de Saúde: " + PlanoDeSaude);
		} else {
			System.out.println("Plano de Saúde: " + PlanoDeSaude);
		}
		if (odont) {
			System.out.println("Plano Odontológico: " + odont);
		} else {
			System.out.println("Plano Odontológico: " + odont);
		}	

		System.out.printf("Hora normal: R$ %.2f", horafunc);
		System.out.println();
		System.out.printf("Hora extra (%dh): R$ %.2f", horaExtra, calcHoraExtra);
		System.out.println();
		System.out.printf("Desconto por faltas: (%d dias): R$ %.2f", faltas, SomaFaltas);
		System.out.println();
		System.out.printf("Vale-Transporte: R$ %.2f", descVT);
		System.out.println();
		System.out.printf("Plano de Saúde: R$ %.2f", descPlanoDeSaude);
		System.out.println();
		System.out.printf("Plano Odontológico: R$ %.2f", descPlanoOdontologico);
		System.out.println();
		System.out.printf("Total de descontos: R$ %.2f", totalDescontos);
		System.out.println();
		System.out.printf("Total de benefícios: R$ %.2f", calcHoraExtra);
		System.out.println();
		System.out.printf("Salário Líquido: R$ %.2f", salarioLiquido);
		sc.close();

	}

}
