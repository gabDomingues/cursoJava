import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);
		showResult(higher);

		sc.close();

	}
	
	public static int max (int num1, int num2, int num3) {
		int resultado = 0;

		if( num1 > num2 && num1> num3) {
			resultado = num1;
		}
		else if( num2 > num3) {
			resultado = num2;
		}
		else {
			resultado = num3;
		}
		
		return resultado;
	}
	
	public static void showResult(int valor) {
		System.out.println("HIGHER: " + valor);
	}

}
