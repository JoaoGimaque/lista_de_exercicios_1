import java.util.Scanner;

public class ExercicioDois {
	
	public static void potencia(int num) {
		double potencia = Math.pow(num, 5);
		
		System.out.printf("potencia: %.2f%n",potencia);
	}
	
	public static void Div(int num1, int num2) {
		
		double numero1 = num1;
		
		double numero2 = num2;
		
		
		double div  = numero1 / numero2;
		double resto = numero1 % numero2;
		
		System.out.printf("Divisao: %.2f%n", div);
		
		System.out.printf("Resto da divisao: %.2f %n", resto);
		
	}
	
	public static void raiz(int num) {
		
		double raiz = Math.sqrt(num);
		System.out.printf("raiz quadrada: %.2f%n", raiz);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("primeiro numero");
		int num1 = scanner.nextInt();
		
		System.out.println("segundo numero");
		int num2 = scanner.nextInt();
		
		potencia(num1);
		potencia(num2);
		
		Div(num1,num2);
		
		raiz(num1);
		raiz(num2);
		
		scanner.close();
	}

}
