package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro:");

		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();
	}


}
