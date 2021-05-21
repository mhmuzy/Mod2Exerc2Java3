package Hitss.Treinamento.Infra;

import java.util.Scanner;

public class Controller {
	public static void Play() {
		
		int count = 0;
				
		int[] num = new int[4];		
		try {
			
		
		System.out.println("        Hitss Treinamento");
		System.out.println("");
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o " + i + "º Número:");
			System.out.println("");
			num[i] = teclado.nextInt();
			
			count += num[i];
			System.out.println("");
			
		}
		
		System.out.println("Os Números Processados Foram:");
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		System.out.println("O Resultado da Soma Deles Foram: " + count);
		System.out.println("");
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Erro de Processamento: Valor Nulo ou Incompatível");
		}
	}
}
