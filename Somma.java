import java.io.InputStream;
import java.util.Scanner;

public class Somma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner (System.in);
		//Somma dei numeri compresi tra A e B letti da tastiera
		 
		int sommaA_B = 0;
		int a=0, b=0;
		
		System.out.println("Parto da: ");
		a = tastiera.nextInt();
		
		System.out.println("E arrivo fino a: ");
		b = tastiera.nextInt();
		
		//In caso i due valore si scambino, perchè "a" deve essere minore
		//di "b".
		
		if(b<a)
		{
			int temp=a;
			a=b;
			b=temp;	
		}
		
		//Adesso il ciclo
		
		int contaNumeri=a;
		while(contaNumeri<=b)
		{
			sommaA_B+=contaNumeri;
			contaNumeri++;
		}
		
        System.out.println(sommaA_B);
	}

}
