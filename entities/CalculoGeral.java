package entities;

import project.MenuPrincipal;

public class CalculoGeral {

	public static String repetir = "s";
	
	
		public static int resposta;
		public static int numero1; 
		public static int numero2; 
		public static int escolha;
		
		
		public static Double F;
		public static Double K;
		public static Double temperatura;
		
		
		public static Double Altura;
		public static Double Peso;
		public static Double IMC;
		
		
		public Double a;
		public Double b;
		public Double c;
		
		public static Double reais;
		public static Double cotacao;
		public static int valor;
		
		
		public static int bit1;
		public static int bit2;
		
			

public static void VoltarAoMenu(String[] args) {
	CalculoGeral.repetir = "s";
	MenuPrincipal.main(args);
}

public void somar(){
	resposta = numero1 + numero2;
	System.out.print(numero1 + " + " + numero2 + " = " + resposta);
}

public void subtrair(){
	resposta = numero1 - numero2;
	System.out.print(numero1 + " - " + numero2 + " = " + resposta);
}

public void dividir(){
	resposta = numero1 * numero2;
	System.out.print(numero1 + " x " + numero2 + " = " + resposta);
}

public void multiplicar(){
	if(numero2 != 0) {
		resposta = numero1 / numero2;
		System.out.print(numero1 + " ÷ " + numero2 + " = " + resposta);
		
		//caso o segundo numero digitado for zero, o programa emite uma mensagem de erro para o usuario
		}else {
			System.out.print("ERROR: Não é possivel dividir "+ numero1 + " por 0");
		}
}


public static void CalculoTemperatura() {
	F = 9.0 * temperatura / 5.0 + 32.0;
	K = temperatura + 273.15;
}


public static void CalculoIMC() {
	
	IMC = Peso / (Altura * Altura);
	
}

public double AreaTriangulo() {
	
	double p = (a + b + c) / 2.0;
	return  Math.sqrt(p * (p - a) * (p - b) * (p - c));

		
}


public static void Conversor() {
	valor = (int) (reais / cotacao);
}

}




