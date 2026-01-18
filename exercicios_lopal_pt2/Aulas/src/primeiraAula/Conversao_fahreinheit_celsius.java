package primeiraAula;

import java.util.Scanner;

public class Conversao_fahreinheit_celsius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em graus fahreinheit: ");
		float fahreinheit = sc.nextFloat();
		float celsius = (fahreinheit - 32) * 5/ 9;
		
		System.out.print("A temperatura em graus fahreinheit = " + fahreinheit + ", convertida para graus celsius é de = " + celsius);
		
		sc.close();
	}

}