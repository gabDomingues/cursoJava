import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* Exercicio 1
		int x;
		System.out.println("Digite um número:");
		x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("NÃO NEGATIVO!");
		}else {
			System.out.println("NEGATIVO!");
		}
		*/
		/* Exercicio 2
		int numero;
		numero = sc.nextInt();
		
		if( (numero % 2) == 0) {
			System.out.println("PAR!");
		}else {
			System.out.println("IMPAR!");
		}
		*/
		
		/*Exercicio 3
		int a, b;
		System.out.println("Digite dois numeros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if( (a % b)==0 || (b % a) == 0 ) {
			System.out.println("São Multiplos!");
		}else {
			System.out.println("Não são Multiplos!");
		}
		*/
		/* Exercicio 4
		int horaInicio, horaFinal;
		horaInicio = sc.nextInt();
		horaFinal = sc.nextInt();
		
		int resultado;
		
		if(horaInicio > horaFinal ) {
			resultado = 24 - (horaInicio - horaFinal ) ;
		}
		else if( (horaInicio == horaFinal) && (horaInicio == 0) ) {
			resultado = 24;
		}else {
			resultado = horaFinal - horaInicio;
		}
		
		System.out.println("O JOGO DUROU: " + resultado + " HORA(S)");
		*/
		/*Exercicio 5
		int codigo, quantidade;
		double resultado;
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		
		if(codigo == 1) {
			resultado = quantidade * 4.00;
		}else if(codigo == 2) {
			resultado = quantidade * 4.50;
		}else if( codigo == 3) {
			resultado = quantidade * 5.00;
		}else if( codigo == 4) {
			resultado = quantidade * 2.00;
		}else{
			resultado = quantidade * 1.50;
		}
		System.out.println("TOTAL: R$ " + resultado);
		*/
		
		double numero ; 
		numero = sc.nextDouble();
		
		if(numero <= 25 && numero >= 0) {
			System.out.println("INTERVALO [0,25]");
		}else if(numero > 25 && numero <= 50) {
			System.out.println("INTERVALO (25,50]");
		}else if(numero > 50 && numero <=75) {
			System.out.println("INTERVALO (50,75]");
		}else if(numero > 75  && numero <= 100) {
			System.out.println("INTERVALO (75,100]");
		}else {
			System.out.println("FORA DE INTERVALO");
		}
		
		sc.close();
	}

}
