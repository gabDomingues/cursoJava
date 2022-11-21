import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Digite a senha: "); int senha = sc.nextInt();
		 * 
		 * while(senha != 2002) { System.out.println("SENHA INVALIDA!");
		 * System.out.println("Digite novamente:"); senha = sc.nextInt(); }
		 * System.out.println("ACESSO PERMITIDO!");
		 */
		/*
		 * int x, y; System.out.println("Digite as coordenadas X Y"); x = sc.nextInt();
		 * y = sc.nextInt();
		 * 
		 * while( (x != 0) && (y != 0) ) { if( (x > 0) && (y > 0) ) {
		 * System.out.println("Primeiro Quadrante!"); }else if( (x < 0) && (y > 0) ) {
		 * System.out.println("Segundo Quadrante!"); }else if( (x < 0) && (y < 0) ) {
		 * System.out.println("Terceiro Quadrante!"); }else {
		 * System.out.println("Quarto Quadrante!"); }
		 * System.out.println("Digite as coordenadas novamente: "); x = sc.nextInt(); y
		 * = sc.nextInt(); }
		 */

		int contAlcool = 0, contGasolina = 0, contDiesel = 0;
		int opcao;
		System.out.println("Digite o código:");
		System.out.println("1.Alcool");
		System.out.println("2.Gasolina");
		System.out.println("3.Diesel");
		System.out.println("4.Fim");
		opcao = sc.nextInt();
		while (opcao != 4) {
			switch (opcao) {
			case 1:
				contAlcool++;
				break;
			case 2:
				contGasolina++;
				break;
			case 3:
				contDiesel++;
				break;
			}
			System.out.println("Digite outra opção:");
			opcao = sc.nextInt();
		}
		System.out.printf("Muito Obrigado! %n");
		System.out.printf("Alcool = %d %n", contAlcool);
		System.out.printf("Gasolina= %d %n", contGasolina);
		System.out.printf("Diesel= %d %n", contDiesel);
		
		sc.close();
	}

}
