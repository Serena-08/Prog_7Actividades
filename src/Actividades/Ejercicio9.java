package Actividades;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio9 {
  public static final Logger log =
      Logger.getLogger(Ejercicio9.class.getName());

  public static void main(String[] args) {
    /* Conversión de temperaturas: Escribe un programa que permita al opcion convertir
        temperaturas entre Celsius y Fahrenheit.
        El programa debe incluir al menos dos funciones:
        celsiusAFahrenheit(double celsius). Formula: F=(C * 9/5) + 32
        fahrenheitACelsius(double fahrenheit) Formula: C=(F-32) * 5/9
        El opcion elige el tipo de conversión y luego introduce el valor a convertir. */
    Scanner sc = new Scanner(System.in);

    log.info("Ingrese la conversión que desea realizar " + "\n1 - Celcius a fahrenheit" + "\n2 - Fahrenheit a Celcius");
    int opcion = sc.nextInt();



    if (opcion==1){
      log.info("Ingrese el valor a convertir");
      double celsius = sc.nextDouble();
      double fahrenheit = celsiusAFahrenheit(celsius);
      log.info(celsius+"º "+ "equivalen a: "+ fahrenheit+"ºF");
    } else if (opcion==2) {
      log.info("Ingrese el valor a convertir");
      double fahrenheit = sc.nextDouble();
      double celsius= fahrenheitACelsius(fahrenheit);
      log.info(fahrenheit+"º "+ "equivalen a: "+ celsius+"ºC");
    }
  }

  //Funcion para convertir los grados celsius a farenheit.
  static double celsiusAFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  //Funcion para convertir los grados farenheit a celsius.
  static double fahrenheitACelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }
}
