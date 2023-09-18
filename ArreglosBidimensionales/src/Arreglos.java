import java.util.Scanner;
public class Arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double suma = 0.0;
    System.out.print("Cantidad de notas y estudiantes: ");
    int cantidad = scanner.nextInt();

        int[] notas = new int[cantidad];
        String[] nombreEstudiantes = new String[cantidad];
    //arrays
    System.out.println("Ingrese los nombres y las notas de los estudiantes");

    for (int i = 0; i < cantidad; i++) {
   
            System.out.print("Estudiante[ " + (i+1) + " ] = ");
            nombreEstudiantes[i] = scanner.next();

            System.out.print("Nota[ " + (i+1) + " ] = ");
            notas[i] = scanner.nextInt();
            suma += notas[i];
        
    }
        double promedio = suma/cantidad;
        System.out.println("El promedio de notas es: " + promedio);
    }
    
}
