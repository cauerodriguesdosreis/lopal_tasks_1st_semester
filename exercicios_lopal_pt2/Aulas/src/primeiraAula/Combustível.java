package primeiraAula;

import java.util.Scanner;

public class Combustível {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double tempo, velocidade, distância, litros_usados;
		
		System.out.println("Olá!");
		System.out.print("Informe o tempo gasto na viagem em horas: ");
		tempo = sc.nextDouble();
		
		System.out.print("Informe a velocidade média durante a viagem: ");
		velocidade = sc.nextDouble();
		
		distância = tempo * velocidade;
		litros_usados = distância / 12;
		
		System.out.println("Velocidade média " + velocidade + " km/h");
		System.out.println("Tempo gasto na viagem " + tempo + " horas");
		System.out.println("Distância percorrida durante a viagem: " + distância + " quilômetros");
		System.out.println("Quantidade de litros usados durante a viagem: " + litros_usados + " L");
		sc.close();

	}

}
