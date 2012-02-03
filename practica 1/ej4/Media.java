/**
* @author Alan Turing <alan.turing@acm.org>
*
* Esta aplicación calcula el logaritmo Neperiano de su primer parámetro.
*/
public class Media {
/**
* Punto de entrada a la aplicación.
*
* Este método imprime el logaritmo Neperiano del número que se le pasa como entrada
*
* @param args Los argumentos de la línea de comando. Se espera un número como primer parámetro
*/
	public static void main(String[] args) {
		
		if (args.length!=2) {
			System.out.println("Se espera dos numeros como parametro.");
			return;
		}	
		
		String arg1 = args[0]; // una variable String que obtiene el primer parametro
		String arg2 = args[1];
		
		double x = Double.parseDouble(arg1); // una variable double, que convierte arg a numerico
		double y = Double.parseDouble(arg2);
		
		double z = (x + y)/2;
		
		System.out.println("La media de " + arg1 + " y " + arg2 + " es: " + z);
	}
}