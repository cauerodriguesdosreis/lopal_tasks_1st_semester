package treino;

import java.util.Scanner;

public class volume_caixa_retangular {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double volume, comp, larg, alt;
		
		System.out.println("Olá!");
		System.out.print("Digite o comprimento da caixa retangular: ");
		comp = sc.nextDouble();
		
		System.out.print("Digite a largura da caixa retangular: ");
		larg = sc.nextDouble();
		
		System.out.print("Digite a altura da caixa retangular (cm): ");
		alt = sc.nextDouble();
		
		volume = comp * larg * alt;
		
		System.out.println("O volume da sua caixa retangular é de " + volume + " m3.");
		
		
		sc.close();
	}

}
