/**
* @author Alan Turing <alan.turing@acm.org>
*
* Esta aplicación calcula el logaritmo Neperiano de su primer parámetro.
*/
public class Mediav2 {
/**
* Punto de entrada a la aplicación.
*
* Este método imprime el logaritmo Neperiano del número que se le pasa como entrada
*
* @param args Los argumentos de la línea de comando. Se espera un número como primer parámetro
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