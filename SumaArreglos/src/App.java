import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception{
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
                scanner.nextLine();
                nombreEstudiantes[i] = scanner.nextLine();
    
                System.out.print("Nota[ " + (i+1) + " ] = ");
                notas[i] = scanner.nextInt();
                suma += notas[i];
            
        }
        System.out.println(":::::::::::::::::::::::::::::::::::");
        System.out.println("Nombre completo\t\t\tNotas");
        for (int i = 0; i < nombreEstudiantes.length; i++) {
            System.out.println(nombreEstudiantes[i] + "\t\t\t" + notas[i]);

        }
        System.out.println(":::::::::::::::::::::::::::::::::::");
            double promedio = suma/cantidad;
            System.out.println("El promedio de notas es: " + promedio);
    }
}
