package project;


import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		while (true) {
		
			System.out.printf("%n%n====MENU PRINCIPAL====%n");
		
			System.out.println("Escolha oque quer fazer: ");
			System.out.printf(" 1- Calculadora Simples %n 2- Conversor de Temperatura %n 3- Calculador de IMC %n 4- Calcular area do Triangulo %n 5- Conversor de Moeda (Somente Dolar) %n 6- Calculadora Bit a Bit %n 7- Sair %n");
		
			escolha = sc.nextInt();
		
	
			switch (escolha){
				case 1:
					Programa.Calculadora(args);
					break;
				case 2:
					Programa.Temperatura(args);
					break;
				case 3:
					Programa.IMC(args);
					break;
				
				case 4:
					Programa.TrianguloArea(args);
					break;
				
				case 5:
					Programa.ConversorDinheiro(args);
					break;
				
				case 6:
					Programa.BitaBit(args);
					break;
					
				case 7:
					System.out.println("Obrigado por utilizar este programa ");
					sc.close();
					return;
				
				default:
					System.out.println("Valor digitado não encontrado, tente novamente ");
				
				
			}
			
		}
		

	}

}
