import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		int soma = 0;
		while(valor != 0) {
			soma += valor;
			System.out.println("Digite outro valor: ");
			valor = sc.nextInt();
		}
		System.out.println("Resultado: " + soma);
		
		sc.close();
	}

}
