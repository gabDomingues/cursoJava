import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		int x = sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			if( i % 2 != 0) {
				System.out.println(i);
			}
		}
		*/
		
		int N = sc.nextInt();
		int cont = 0;
		int x;
		for(int i=0; i < N; i++) {
			x = sc.nextInt();
			if( (x>=10) && (x<=20) ) {
				cont++;
			}
		}
		System.out.println(cont + " in");
		System.out.println((N - cont) + " out");
		sc.close();
	}

}
