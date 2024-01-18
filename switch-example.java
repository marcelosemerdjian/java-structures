import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int x = sc.nextInt();
	    String dia;
	    
        switch (x) {
            case 1:
                dia = "Sunday";
                break;
            case 2:
                dia = "Monday";
                break;
            case 3:
                dia = "Tuesday";
                break;
            case 4:
                dia = "Wednesday";
                break;
            case 5:
                dia = "Thursday";
                break;
            case 6:
                dia = "Friday";
                break;
            case 7:
                dia = "Saturday";
                break;
            default:
                dia = "Invalid value";
                break;
        }
        
        System.out.printf("Weekday: " + dia);
        
		sc.close();
	}
}
