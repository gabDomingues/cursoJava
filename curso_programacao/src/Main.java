import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Oi, Gabriel!");
		System.out.println("Olá, mundo!");	
		
		int x = 30;
		double y = 10.345;
		System.out.println(x);
		System.out.println(y);
		System.out.printf("Y= %.2f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("Y= %.2f%n", y);
		System.out.println("Resultado = " + x  + " metros");
		System.out.printf("Resultado = %f%n", y);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f", nome, idade, renda);
	}

}
