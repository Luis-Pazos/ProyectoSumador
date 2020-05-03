package sumador;
import java.util.Scanner;
public class Funciona {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner myObj=new Scanner(System.in);
		System.out.println("Introduce los números a sumar: ");
		String numeros=myObj.nextLine();
		ASumar suma=new ASumar();
		System.out.println("El resultado es: " + suma.mostrar(numeros));
		
	}

}
