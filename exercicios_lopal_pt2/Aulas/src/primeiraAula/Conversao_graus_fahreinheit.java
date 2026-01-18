package primeiraAula;

import java.util.Scanner;

public class Conversao_graus_fahreinheit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Informe o valor em graus celsius: ");
		double celsius = sc.nextDouble();
		
		double fahreinheit = (celsius * 9 / 5) + 32;
		
		System.out.println("A temperatura em graus celsius = " + celsius + ", convertida para fahreinheit é de = " + fahreinheit);
		sc.close();

	}

}
