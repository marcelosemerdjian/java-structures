import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char anw;
		
		do {
			System.out.print("Enter the temperature in Celsius:");
			
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Farenheit equivalent: %.1f%n", F);
			System.out.print("Do you want to enter a new temp? (y/n)");
			
			anw = sc.next().charAt(0);		
		} while (anw != 'n');

		sc.close();
	}
}
