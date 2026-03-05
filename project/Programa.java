package project;

import java.util.Locale;
import java.util.Scanner;
import entities.CalculoGeral;


public class Programa {
	
	public static Scanner sc = new Scanner(System.in);

	public static void Calculadora(String[] args) {
		
		CalculoGeral calc = new CalculoGeral();
		
		System.out.printf("%n%n====CALCULADORA SIMPLES====%n");

			while (CalculoGeral.repetir.equalsIgnoreCase ("s")){
				//Entrada de dados
				System.out.printf("%nDigite o primeiro numero: ");
				CalculoGeral.numero1 = sc.nextInt();
				
				System.out.print("Digite um segundo numero: ");
				CalculoGeral.numero2 = sc.nextInt();
				
				System.out.println("Escolha a operação que você quer realizar:");
				System.out.println("1 - Soma");
				System.out.println("2 - Subtração");
				System.out.println("3 - Multiplicação");
				System.out.println("4 - Divisão");
				
				
				CalculoGeral.escolha = sc.nextInt();
				
				
				
				//Aqui eu começo o Switch case para realizar o calculo de acordo com a alternativa escolhida da operação
				switch(CalculoGeral.escolha) {
				case 1: 
					calc.somar();
					break;
					
				case 2: 
					calc.subtrair();
					break;
					
				case 3: 
					calc.multiplicar();
					break;
					
				case 4: 
					calc.dividir();
					break;

					
				default:
					System.out.print("Operação invalida");	
		}
		
				System.out.printf("%nDeseja fazer outro calculo? (s/n) %n");
				CalculoGeral.repetir = sc.next();
			}

			CalculoGeral.VoltarAoMenu(args);
				sc.close();

	}


	

	public static void Temperatura(String[] args) {
		
		Locale.setDefault(Locale.US);

		
		System.out.printf("%n%n====CONVERSOR DE TEMPERATURA====%n");
		
		while (CalculoGeral.repetir.equalsIgnoreCase ("s") ) {
			
			System.out.printf("%nDigite a temperatura em Celsius: ");
			 CalculoGeral.temperatura = sc.nextDouble();
			
			CalculoGeral.CalculoTemperatura();
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%nEquivalente em Kelvin: %.1f%n", CalculoGeral.F, CalculoGeral.K);
			
			
			
			System.out.printf("%n%nDeseja converter outra temperatura? (s/n): ");
			CalculoGeral.repetir = sc.next();
		}
		
		CalculoGeral.VoltarAoMenu(args);
		sc.close();

		
	}




	public static void IMC(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("%n%n====CALCULADOR DE IMC====%n");

		while (CalculoGeral.repetir.equalsIgnoreCase ("s") ) {
			
		
		System.out.print("Altura (em metros): ");
		CalculoGeral.Altura = sc.nextDouble();
		
		System.out.print("Peso (em kg): ");
		CalculoGeral.Peso = sc.nextDouble();
		
		
		CalculoGeral.CalculoIMC();
		
		System.out.println("\nInformações: ");
		System.out.println("Altura: " + CalculoGeral.Altura);
		System.out.println("Peso: " + CalculoGeral.Peso);
		System.out.printf("IMC: %.1f %n%n", CalculoGeral.IMC);
		
		System.out.printf("Deseja fazer outro calculo de IMC? (s/n) %n");
		CalculoGeral.repetir = sc.next();
		
		}
		
		CalculoGeral.VoltarAoMenu(args);
		sc.close();
		
		
	}




	public static void TrianguloArea(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%n%n====CALCULAR AREA DOS TRIANGULOS====%n");
		
		while (CalculoGeral.repetir.equalsIgnoreCase ("s") ) {
			CalculoGeral x, y;
			x = new CalculoGeral();
			y = new CalculoGeral();
		
			System.out.println("Digite os valores do triangulo X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			
		
			System.out.println("Digite os valores do triangulo Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
		
		//
		
			double areaX = x.AreaTriangulo();
			double areaY = y.AreaTriangulo();
		//
			System.out.printf("Area do Triangulo X: %.4f%n", areaX);
			System.out.printf("Area do Triangulo Y: %.4f%n", areaY);
		
			if(areaX > areaY) {
			
			System.out.print("Maior area: X");
			
			}else {
				System.out.print("Maior area: Y");
			
			}
			
			System.out.printf("%n%nDeseja calcular outra Area do Triangulo? (s/n) %n");
			CalculoGeral.repetir = sc.next();
		}
		
		CalculoGeral.VoltarAoMenu(args);
		sc.close();
	}


	
	
	public static void ConversorDinheiro(String[] args) {
		
		
		while (CalculoGeral.repetir.equalsIgnoreCase ("s") ) {
			System.out.printf("%n%n====Conversor de Dolar====%n");
			System.out.print("Valor em Real (R$): ");
			CalculoGeral.reais = sc.nextDouble();

			System.out.print("Cotação do dolar atual (com ponto): ");
			CalculoGeral.cotacao = sc.nextDouble();

			CalculoGeral.Conversor();
		

			System.out.println("Valor informado: R$" + CalculoGeral.reais);
			Locale.setDefault(Locale.US);
			System.out.println("Cotação do dolar atual: $" + CalculoGeral.cotacao);
			System.out.println("Valor convertido em dolar: $"+ CalculoGeral.valor);
			
			System.out.printf("%n Deseja converter outro valor para dolar?");
			CalculoGeral.repetir = sc.next();
		}
		
		CalculoGeral.VoltarAoMenu(args);
		sc.close();
		
		
	}
	
	
	
	
	public static void BitaBit(String[] args) {
			
		System.out.printf("%n%n====CALCULO BIT A BIT====%n");
		
		while (CalculoGeral.repetir.equalsIgnoreCase ("s") ) {
			
			System.out.print("Digite o primeiro número: ");
			CalculoGeral.bit1 = sc.nextInt();
		
			System.out.print("Digite o segundo número: ");
			CalculoGeral.bit2 = sc.nextInt();

		
			System.out.printf("AND: %d%n", CalculoGeral.bit1 & CalculoGeral.bit2);
			System.out.printf("OR: %d%n", CalculoGeral.bit1 | CalculoGeral.bit2);
			System.out.printf("XOR: %d%n", CalculoGeral.bit1 ^ CalculoGeral.bit2);
		
			System.out.print("Deseja utlizar o bit a bit novamente? (s/n) ");
			CalculoGeral.repetir = sc.next();
		
		}
		
		CalculoGeral.VoltarAoMenu(args);
		sc.close();
		
	}
}

