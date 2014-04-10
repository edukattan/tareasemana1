import java.util.Scanner;
public class Semana1 

{

	private static Scanner s;

	public static void main(String[] args) 
	
	{
		int entrada;
		
		System.out.println("Ingrese un numero entero");
		s = new Scanner (System.in);
		entrada = s.nextInt();
		
			for (int i = 0;i<10; i++)
			{
				System.out.println(entrada*i);
			}
		
	}

}
