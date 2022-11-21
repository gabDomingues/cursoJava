import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Testar 6 bit 
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int verificar = 32;		 //0x0100 0000		0x
	
		if( (x & verificar ) != 0) {
			System.out.println("6º Bit é 1");
		}else {
			System.out.println("6º Bit é 0");
		}
		
		sc.close();
	}

}
