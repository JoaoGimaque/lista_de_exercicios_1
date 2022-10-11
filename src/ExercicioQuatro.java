import java.util.Scanner;

public class ExercicioQuatro {
	
	
	public static void desconto(double desconto, double total) {
		
		double valorFinal = total - desconto/100 * total;
		
		System.out.println("valor final: "+ valorFinal);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor total da compra");
		double total = scanner.nextInt();
		
		System.out.println("E o desconto");
		double desconto = scanner.nextDouble();
		
		desconto(desconto, total);
		
		scanner.close();
	}

}
