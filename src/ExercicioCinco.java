import java.util.Scanner;

public class ExercicioCinco {
	
	
	public static void converter(double dolar, double valorDolar) {
		
		double real = dolar * valorDolar;
		
		System.out.printf("o valor em real: %.2f%n", real);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o quanto voce quer convencer dolar para real?");
		double dolar = scanner.nextDouble();
		
		System.out.println("Quanto ta valendo o dolar em real ?");
		double valorDolar = scanner.nextDouble();
		
		converter(dolar, valorDolar);
		
		scanner.close();
	}

}
