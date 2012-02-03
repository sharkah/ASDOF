/**
* @author Alan Turing <alan.turing@acm.org>
*
* Esta aplicaci�n calcula el logaritmo Neperiano de su primer par�metro.
*/
public class Ordenar {
/**
* Punto de entrada a la aplicaci�n.
*
* Este m�todo imprime el logaritmo Neperiano del n�mero que se le pasa como entrada
*
* @param args Los argumentos de la l�nea de comando. Se espera un n�mero como primer par�metro
*/
	public static void main(String[] args) {
		
		if (args.length>20) {
			System.out.println("Se espera 20 numeros como parametro maximo.");
			return;
		}	
		
		if (args.length<1) {
			System.out.println("Mete algun parametro.");
			return;
		}

		int i = args.length;
		int par_flag = 1;
		
		double[] numeros = new double [20]; 

		
		System.out.println("El numero de parametros es " + i + "\n");

		
		if (i%2 == 0){
			System.out.println("El numero de parametros es par\n");
		}
		
		else 
		{
			System.out.println("El numero de parametros es impar\n");
			par_flag = 0;
		}


		while(i!=0)
		{
			i--;
			numeros[i] = Double.parseDouble(args[i]);
			
		}
		
		
		int k=0;
		int j;
		int m;

		double temp;
		int x = 0, h;
		
		while (x<numeros.length)
		{
			m=x;
			k=x+1;
			
			h=x;

			while (h<(numeros.length-1))	
			{
				if (numeros[x] < numeros[k])
				{
					m=k;
				}

				h++;
			}		

			if (m!=numeros[x])
			{
				temp = numeros[m];
				numeros[m] = numeros[x];
				numeros[x] = temp;
			}
	
			x++;
		}
		
		int t;
		t = numeros.length;		
		int o, p, q;

		if (par_flag==0)
			System.out.println("La mediana es " + numeros[(t/2)+1] +"\n");

		else if (par_flag==1)
		{
			int pos = (int) t/2;
			o = numeros[pos];
			p = numeros[pos+1];
			q = (o + p)/2;
			System.out.println("La mediana es " + q +"\n");
		}
		
			
	}
}
