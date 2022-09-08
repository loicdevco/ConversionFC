import java.util.Scanner;
import javax.swing.JFrame;

public class ConversionFC {
	public static void main(String[] args) {

		
			
		System.out.println("Convertisseur degres celsius");
		System.out.println("--------------------------------------------------------------------------------------");
		
		char r=' ';
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez votre mode de conversion : ");
		System.out.println("1- Convertisseur Celsius - Fahrenheit ");
		System.out.println("2- Convertisseur Fahrenheit - Celsius ");
		int i = sc.nextInt();
		
		
			
		switch (i)
		{
		case 1: 
			System.out.println("Entrez la températeur en degres: ");
			Scanner deg = new Scanner(System.in);
			int d = deg.nextInt();			
				if (d > 0 && d < 100)
					System.out.println(d + "°C correspond à " + ((9/5)*d+32) + "°F.");
		break;
			
		
		case 2:
			System.out.println("Entrez la température en Fahrenheit: ");
			Scanner fah = new Scanner(System.in);
			int f = fah.nextInt();
				if (f < 10000000)
					System.out.println(f + "°F correspond à " + ((f-32)*5/9) + "°C.");
		break;
			
		default: 
		System.out.println("ERROR!!!");

		}
			
		System.out.println("souhaitez-vous essayer avec une autre température ? O/N ");
		Scanner rep = new Scanner(System.in);
		r = rep.nextLine().charAt(0);
		
		}while (r == 'O' || r == 'o');
		
			System.out.println("Au revoir!");
			
		
		
		
	}

}
