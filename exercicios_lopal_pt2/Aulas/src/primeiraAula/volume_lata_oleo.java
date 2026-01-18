package primeiraAula;

import java.util.Scanner;

public class volume_lata_oleo {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    double pi, raio, altura, volume;
    
    pi = 3.14159;
    
    System.out.print("Informe o comprimento da lata de óleo: ");
    altura = sc.nextDouble();
    
    System.out.print("Informe o raio da lata de óleo: ");
    raio = sc.nextDouble();
    
    volume = pi * (raio * raio) * altura;
    
    System.out.print("O volume da lata de óleo é de " + volume);
    
    sc.close();

	}

}