import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
