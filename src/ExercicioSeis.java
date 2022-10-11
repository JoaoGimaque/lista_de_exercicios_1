import java.util.Scanner;

public class ExercicioSeis {
	
	public static void converter(double C) {

		double F = (9 * C +160)/5;
		
		System.out.println("temperatura em Fahrenheit: " + F);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a tempertura em Celsius");
		double C = scanner.nextDouble();
		
		converter(C);
		
		scanner.close();
	}

}
