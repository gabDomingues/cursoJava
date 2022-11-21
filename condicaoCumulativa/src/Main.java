import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int valor = 50;
		int minutos;
		float resultado = 0;
		System.out.println("Digite quantos minutos ");
		minutos = sc.nextInt();
		
		if(minutos<100) {
			resultado = valor;
		}
		else if(minutos>100) {
			minutos -= 100;
			resultado = minutos * 2;
			resultado += 50;
		}
		System.out.printf("Você vai pagar R$ %.2f", resultado);
		sc.close();
	}

}
