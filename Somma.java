import java.io.InputStream;
import java.util.Scanner;

public class Somma {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner (System.in);
		
		//Far inserire da tastiera numeri e sommarli fintanto che la somma è inferiore a 
		//1000
		
		int somma = 0;
		while(somma<1000)
		{
			System.out.println("Aggiungiamo un numero (" + somma + "): ");
			somma += tastiera.nextInt();
		}
		
		System.out.println("Terminato con somma che vale: " + somma);
	}

}
