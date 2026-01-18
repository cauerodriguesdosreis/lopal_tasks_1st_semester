package treino;

import java.util.Scanner;

public class quatro_numeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int A, B, C, D, a, aa, aaa, b, bb, c, d, dd, ddd, e, ee, f;
		
		System.out.print("Digite o valor A: ");
		A = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		C = sc.nextInt();
		
		System.out.print("Digite o valor de D: ");
	    D = sc.nextInt();
	    
	    a = A + B;
	    aa = A + C;
	    aaa = A + D;
	    b = B + C;
	    bb = B + D;
	    c = C + D;
	    
	    d = A * B;
	    dd = A * C;
	    ddd = A * D;
	    e = B * C;
	    ee = B * D;
	    f = C * D;
	    
	    System.out.println("Aplicando as distributivas, o resultado de cada combinação será: ");
	    System.out.println("Soma: ");
	    System.out.println("A + B = " + a);
		System.out.println("A + C = " + aa);
		System.out.println("A + D = " + aaa);
		System.out.println("B + C = " + b);
		System.out.println("B + D = " + bb);
		System.out.println("C + D = " + c);
		System.out.println("Multiplicação: ");
		System.out.println("A x B = " + d);
		System.out.println("A x C = " + dd);
		System.out.println("A x D = " + ddd);
		System.out.println("B x C = " + e);
		System.out.println("B x D = " + ee);
		System.out.println("C x D = " + f);
		
		sc.close();
	}

}
