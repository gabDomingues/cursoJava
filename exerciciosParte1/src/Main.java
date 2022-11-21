import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		//Exercício 1 
		/*
		int x, y;
		System.out.println("Digite um número inteiro:");
		x = sc.nextInt();
		System.out.println("Digite outro número: ");
		y = sc.nextInt();
		
		int resultado = x + y;
		System.out.printf("%d + %d = %d",x, y, resultado);
		
		*/
		//Exercício 2
		/*
		double raio;
		raio = sc.nextDouble();
		double area = Math.PI * (Math.pow(raio,2) );
		
		System.out.printf("A = %.4f", area);
		*/
		
		//Exercício 3
		/*
		int a,b,c,d, resultado;
		System.out.println("Digite A:");
		a = sc.nextInt();
		System.out.println("Digite B:");
		b = sc.nextInt();
		System.out.println("Digite C:");
		c = sc.nextInt();
		System.out.println("Digite D:");
		d = sc.nextInt();
		resultado = (a * b) - (c * d);
		System.out.println("Diferença: "+ resultado);
		*/
		
		//Exercício 4
		/*
		int numero, horas;
		float salario;
		
		System.out.println("Digite o numero: ");
		numero = sc.nextInt();
		System.out.println("Digite a quantidade de horas:");
		horas = sc.nextInt();
		System.out.println("Digite o valor por horas:");
		salario = sc.nextFloat();
		float resultado =(float) horas * salario;
		System.out.println("NUMBER: " + numero);
		System.out.printf("Salary: %.2f", resultado);
		*/
		
		//Exercicio 5
		/*
		int codigo1, quantidade1, codigo2, quantidade2;
		float valor1, valor2, total;
		System.out.println("Digite: Código, Quantidade e o Valor da peça 1: ");
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valor1 = sc.nextFloat();
		System.out.println("Digite: Código, Quantidade e o Valor da peça 2: ");
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valor2 = sc.nextFloat();
		total = (quantidade1 * valor1) + (quantidade2 * valor2);
		System.out.printf("Valor a pagar: %.2f ", total);
		*/
		sc.close();
		
		
		
	}

}
