package Actividades;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio6 {
  public static final Logger LOGGER =
      Logger.getLogger(Ejercicio6.class.getName());

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    String[] vectorCaracter = new String[5];

    for (int i = 0; i < vectorCaracter.length; ++i){

      LOGGER.info("Ingrese su cadena de caracteres.");
      vectorCaracter[i]= sc.nextLine();

    }
    String[]Invertir = new String[5];

    for (int i=0;i< vectorCaracter.length;++i) {
      Invertir[i] = vectorCaracter[Invertir.length - 1 - i];

    }
    for (int i=0;i<Invertir.length;i++) {
      System.out.println("Cadena " + i + " " + Invertir[i]);
    }
  }
}
