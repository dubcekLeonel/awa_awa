import java.util.Scanner;

public class suma {



    // HECHO POR DAVID
    public static void main(String[] args) {
        suma calculadora = new suma();

        // Ejemplo de multiplicación
        System.out.println("Resultado de la multiplicación: " + calculadora.multiplicar());
    }

    // Método para multiplicar dos números
    public int multiplicar() {
        Scanner input = new Scanner(System.in); // Crear el Scanner para leer entradas

        System.out.println("=== Multiplicador de números ===");
        System.out.print("Ingrese el primer número: ");
        int a = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = input.nextInt();

        int resultado = a * b;
  

        input.close(); // Cerrar el Scanner para liberar recursos
        return resultado; // Devolver el resultado
    }
}
