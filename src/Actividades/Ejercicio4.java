package Actividades;


import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio4 {
  public static final Logger LOGGER =
      Logger.getLogger(Ejercicio4.class.getName());

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //variable que almacena el total.
    double total = 0;

    for (int i = 0; i < 3; ++i){
      LOGGER.info("Ingrese el nombre del producto.");
      String productos =sc.nextLine();

    }

    //Hacemos variables para cada unidad.
    System.out.println("Ingrese las unidades de cada producto: ");
    int unidadesProducto = sc.nextInt();

    //hacemos el precio de cada unidad.
    System.out.println("Ingrese el precio de cada unidad ");
    double unidad = sc.nextDouble();

    sc.nextLine();


    //se calcula el total del producto.
    double totalProducto = unidadesProducto * unidad;

    //juntamos los datos.
    System.out.println("Lleva: " +unidadesProducto+" unidades "+" precio unidad: "+unidad+" total: "+totalProducto);
    total = total + totalProducto;
    LOGGER.info("Su total a pagar es de: "+ total);



  }



}
