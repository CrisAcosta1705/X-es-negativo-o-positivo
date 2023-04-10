package X_Negativo_o_No_Negativo;
import java.util.Scanner;
public class X_Negativo_o_No_Negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Scanner tc = new Scanner(System.in);
	        
	        // Pedimos al usuario que ingrese un número
	        System.out.println("Ingrese un número:");
	        double x = tc.nextDouble();
	        
	        // Verificamos si el número es negativo
	        if (x < 0) {
	            // Si es negativo, calculamos la cuarta potencia
	            double x4 = Math.pow(x, 4);
	            System.out.println("El resultado de " + x + "^4 es: " + x4);
	        } else {
	            // Si es positivo, calculamos la segunda potencia
	            double x2 = Math.pow(x, 2);
	            System.out.println("El resultado de " + x + "^2 es: " + x2);
	        }
	        
	        tc.close();
	}

}
