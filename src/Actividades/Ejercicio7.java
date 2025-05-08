package Actividades;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio7 {
  public static final Logger LOGGER=
      Logger.getLogger(Ejercicio7.class.getName());

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

   String[]vecMeses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    int[] vecDias = {31,28,31,30,31,30,31,31,30,31,30,31};

    LOGGER.info("Ingrese un numero del mes (1-12)");
    int mesUsu= sc.nextInt();

    //comparo lo que ingreso el usuario con los vectores creados.
    if (mesUsu < 1|| mesUsu > 12) {
      LOGGER.warning("El mes ingresado es inválido");

    }else {
      int usuario = mesUsu - 1;
      System.out.println("El mes es " + vecMeses[usuario] + " y tiene " + vecDias[usuario] + " días.");
    }
  }
}
