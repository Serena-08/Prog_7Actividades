package Actividades;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio8 {

public static final Logger log =
    Logger.getLogger(Ejercicio8.class.getName());


  public static void main(String[] args) {
    /* Promedio y nota más alta
        Crear un programa que contenga una función que calcule el promedio de un array de notas
        de estudiantes y otra función que devuelva la nota más alta.
        Cargar el array notas de forma manual con 5 valores. Mostrar en consola:
        el promedio y la nota más alta.*/

    Scanner sc = new Scanner(System.in);
    double[] notas = new double[5];

    //Le pido al user que ingrese las notas para darle el valor en el array
    log.info("Ingrese la nota de los 5 estudiantes por favor");

    for (int i = 0; i < notas.length; ++i) {
      log.info("Alumno " + (i + 1));
      notas[i] = sc.nextInt();
    }

    double suma = calcularPromedio(notas);
    double alta = buscarNotaAlta(notas);

    log.info("El promedio de las notas es de: " + suma);
    log.info("La nota mas alta es: " + alta);
  }

  //Creo las funciones para poder retornar los valores

  static double calcularPromedio(double[] notas){
    double suma = 0;
    for (int i = 0; i < notas.length; ++i){
      suma += notas[i];
    }
    return (suma / notas.length);
  }

  static double buscarNotaAlta (double[] notas){
    double alta = notas[0];
    for (int i = 0; i < notas.length; ++i){
      if (notas[i] > alta){
        alta = notas[i];
      }
    }
    return alta;
  }

}
