package treino;

import java.util.Scanner;

public class A_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, troca;

		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();

		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();

		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		troca = A;
		A = B;
		B = troca;
		
		System.out.println("A troca fica da seguinte forma: ");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		sc.close();

	}

}
