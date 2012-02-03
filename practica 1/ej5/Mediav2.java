/**
* @author Alan Turing <alan.turing@acm.org>
*
* Esta aplicaci�n calcula el logaritmo Neperiano de su primer par�metro.
*/
public class Mediav2 {
/**
* Punto de entrada a la aplicaci�n.
*
* Este m�todo imprime el logaritmo Neperiano del n�mero que se le pasa como entrada
*
* @param args Los argumentos de la l�nea de comando. Se espera un n�mero como primer par�metro
*/
	public static void main(String[] args) {
		
		int i=args.length;
		
		System.out.println("El numero de parametros es " + i + "\n");
		
		if (i%2 == 0){
			System.out.println("El numero de parametros es par\n");
		}
		
		else System.out.println("El numero de parametros es impar\n");
		
		String arg1;
		double x =0;
		double total = 0; 
			
		while (i!=0){
			i--;
			arg1 = args[i];
			x = Double.parseDouble(arg1);
			total = total + x; 
		}
		
		double g = total/args.length;
				
		System.out.println("La media es " + g);
			
	}
}