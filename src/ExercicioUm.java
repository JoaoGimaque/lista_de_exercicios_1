import java.util.Scanner;

public class ExercicioUm {
	
	public static void Soma(int num1, int num2) {
		
		int soma  = num1 + num2;
		
		System.out.println("Soma: " + soma);
		
	}
	
	public static void Sub(int num1, int num2) {
		
		int sub  = num1 - num2;
		
		System.out.println("Subtracao: " + sub);
		
	}
	
	public static void Mult(int num1, int num2) {
			
		int mult  = num1 * num2;
			
		System.out.println("Multiplicacao: " + mult);
	}
	
	public static void Div(int num1, int num2) {
		
		double numero1 = num1;
		
		double numero2 = num2;
		
		
		double div  = numero1 / numero2;
		
		System.out.printf("Divisao: %.2f%n", div);
		
	}
	
	public static void Resto(int num1, int num2) {
		
		double numero1 = num1;
		
		double numero2 = num2;
		
		double resto = numero1 % numero2;
		
		System.out.printf("Resto da divisao: %.2f %n", resto);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Soma(num1,num2);
		
		Sub(num1,num2);
		
		Mult(num1,num2);
		
		Div(num1,num2);
		
		Resto(num1,num2);
		
		sc.close();
	}

}
