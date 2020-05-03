package sumador;

public class ASumar {

public ASumar() {
		
	}

   /**
    * mostrar es un método para mostrar el numero pasado como parametro.
    * Si solo se le pasa un numero este devuelve " numero = numero"
    * Si se le pasa un número negativo, devuelve una cadena vacia
    * 
    * @param String cadena de numeros	
    * @return String con el la suma de todos los numeros y el total
	*/
	public String mostrar(String cad) {
		String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        if(numero.startsWith("-")) {
        	return "";
        }
        if(numero.length() > 1) {
        	String val = String.join("+", cad.split(""));
      
        	return (val + " = " + total(cad));
        }
        
        return null;
	}
	
    public int total(String cad) {
        int suma = 0;
       
        char[] values = cad.toCharArray();
        for (char i : values)
            suma += Integer.parseInt(String.valueOf(i));
     
        return suma;

	
    }
}

