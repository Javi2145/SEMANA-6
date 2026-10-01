import java.util.Scanner; 

public class Salario { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        double salario; 

        double suma = 0; // Acumulador 

        int contador = 0; // Contador 

        do { 

            System.out.println("Ingrese el salario (negativo para terminar):"); 

            salario = sc.nextDouble(); // Modificador / Centinela 

            if (salario >= 0) { 

                suma = suma + salario; 

                contador++; 

            } 

        } while (salario >= 0); // Condición de salida 

        if (contador > 0) { 

            double promedio = suma / contador; 

            System.out.println("Promedio de salarios: " + promedio); 

        } else { 

            System.out.println("No se ingresaron salarios válidos."); 

        } 

    } 

} 

 