package ExerciciosEstruturaCondicional;


import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
	}
		else {
			System.out.println("N�O NEGATIVO");
		}
		
		sc.close();
	}
	
}
