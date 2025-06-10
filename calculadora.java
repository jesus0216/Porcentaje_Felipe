//desarrollar una calculadora en JAVA donde se debe solicitar el monto de la cuenta y el porcentaje de propina que se desea dejar,
//y se debe calcular el monto total a pagar incluyendo la propina.

import java.util.Scanner; 

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la cuenta: ");
        double montoCuenta = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = scanner.nextDouble();
        
    
        double propina = (porcentajePropina / 100) * montoCuenta;
        
        double totalAPagar = montoCuenta + propina;
        
        System.out.printf("El monto total a pagar, incluyendo la propina, es: %.2f\n", totalAPagar);
        
        
        scanner.close();
        
    }
}