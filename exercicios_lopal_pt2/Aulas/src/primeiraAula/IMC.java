package primeiraAula;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner (System.in);
		
		float peso, altura, IMC;
		
		System.out.println("Bom dia!");
		
		System.out.println("Informe seu peso e sua altura ");
        System.out.print("Peso: ");
        peso = sc.nextFloat();
        
        System.out.print("Altura: ");
		altura = sc.nextFloat();
		
        IMC = peso / (altura * altura);
		System.out.println("Seu IMC é de " + IMC + " kg/m2. ");
		
		IMC = sc.nextFloat();
		sc.close ();

	}

}
