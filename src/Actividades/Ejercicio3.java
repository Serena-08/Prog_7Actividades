package Actividades;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Array predefinido con valores enteros
        int[] arrayOriginal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(arrayOriginal);

        // Invertir el array
        int[] arrayInvertido = invertirArray(arrayOriginal);

        // Mostrar el array invertido
        System.out.println("\nArray invertido:");
        mostrarArray(arrayInvertido);
    }

    // Método para invertir un array
    public static int[] invertirArray(int[] array) {
        int longitud = array.length;
        int[] invertido = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            invertido[i] = array[longitud - 1 - i];
        }

        return invertido;
    }

    // Método para mostrar un array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

