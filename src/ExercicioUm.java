import java.util.Scanner;

public class ExercicioUm {
	
	public static void Soma(int num1, int num2) {
		
		int soma  = num1 + num2;
		
		resultado("resultado", soma);
		
	}
	
	public static void Sub(int num1, int num2) {
		
		int sub  = num1 - num2;
		
		resultado("resultado", sub);
		
	}
	
	public static void Mult(int num1, int num2) {
			
		int mult  = num1 * num2;
			
		resultado("resultado", mult);
	}
	
	public static void Div(int num1, int num2) {
		
		double numero1 = num1;
		
		double numero2 = num2;
		
		
		double div  = numero1 / numero2;
		
		resultado("resultado", div);
		
	}
	
	public static void Resto(int num1, int num2) {
		
		double numero1 = num1;
		
		double numero2 = num2;
		
		double resto = numero1 % numero2;
		
		resultado("resultado", resto);
		
	}
	
	public static void resultado(String operacao, double resultado) {
		
		System.out.printf(operacao + ": " + resultado);
		
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int opcao;
		do {
			
			System.out.println("\n\n");
			System.out.println("+-------------------------------------------+");
			System.out.println("|             Menu de Opcoes                |");
			System.out.println("+-------------------------------------------+");
			System.out.println("| 1 - Soma                                  |");
			System.out.println("| 2 - Subtracao                             |");
			System.out.println("| 3 - Multiplicacao                         |");
			System.out.println("| 4 - Divisao                               |");
			System.out.println("| 5 - modulo da divisao                     |");
			System.out.println("| 0 - Sair                                  |");
			System.out.println("+-------------------------------------------+");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				Soma(num1,num2);
				break;
			
			case 2:
				Sub(num1,num2);
				break;
				
			case 3:
				Mult(num1,num2);
				break;
				
			case 4:
				Div(num1,num2);
				break;
				
			case 5:
				Resto(num1,num2);
				break;	
			}
		} while(opcao != 0);
		
		
		
		
		scanner.close();
	}

}
