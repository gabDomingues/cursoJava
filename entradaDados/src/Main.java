import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * String x; System.out.println("Digite uma palavra: "); x = sc.next();
		 * System.out.println("Voce digitou: " + x);
		 * 
		 * char a; System.out.println("Digite uma letra: "); a = sc.next().charAt(0);
		 * System.out.println("Voce digitou também: " + a);
		 * 
		 * int y; System.out.println("Digite um número inteiro: "); y= sc.nextInt();
		 * System.out.println("Voce digitou também: " + y);
		 * 
		 * double z; System.out.println("Digite um número decimal: "); z=
		 * sc.nextDouble(); System.out.println("E também: "+ z);
		 */
		/*
		String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Você digitou: " + x + " e: " + y + " e: " + z);
		*/
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}
