package Actividades;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Crear objeto Scanner para leer la entrada del usuario mediante el teclado.
        Scanner scanner = new Scanner(System.in);


        // Arrays predefinidos con nombres y notas de estudiantes
        String[] nombresEstudiantes = {"Juan", "María", "Pedro", "Ana", "Luis"};
        double[] notasEstudiantes = {8.5, 9.0, 7.2, 8.8, 6.5};


        // Pedir al usuario que introduzca el nombre del estudiante
        System.out.print("Introduce el nombre del estudiante: ");
        String nombreBuscado = scanner.nextLine();

        // Variable para indicar si se encontró el estudiante
        boolean encontrado = false;

        // Buscar el estudiante en el array
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            if (nombresEstudiantes[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("La nota de " + nombresEstudiantes[i] + " es: " + notasEstudiantes[i]);
                encontrado = true;
                break; // Salir del bucle una vez encontrado
            }
        }

        // Si no se encontró el estudiante, mostrar mensaje.
        if (!encontrado) {
            System.out.println("No se encontró un estudiante con el nombre: " + nombreBuscado);
        }
    }
}