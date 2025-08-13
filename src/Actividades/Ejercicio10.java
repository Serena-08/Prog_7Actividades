package Actividades;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio10 {
  public static final Logger log =
      Logger.getLogger(Ejercicio10.class.getName());

  public static void main(String[] args) {
    /* Rotar un array una posicion a la derecha
    Crea un programa que rote los elementos de un array de enteros una posición a la derecha.
    El último elemento pasa a la primera posición. Usar una función rotarDerecha(int[] array)
    Mostrar el array antes y después de rotar.
    El array puede tener valores cargados manualmente o aleatorios.
    */

    int elementosArray[] = new int[5];

    Scanner sc=new Scanner(System.in);
    log.info("Como va a darle el  valor a su Array? "+ "1. Manualmente" + " 2. Aleatoriamente");
    int usuario = sc.nextInt();

    if (usuario==1){
      for (int i=0;i< elementosArray.length;i++){
        log.info("Ingrese un entero para la posicion: "+ (i+1));
        elementosArray[i]= sc.nextInt();
      }
    } else if (usuario==2) {
      for (int i = 0; i < elementosArray.length;i++) {
        elementosArray[i]=(int)(Math.random() * 10 + 1);
      }
    }else System.out.println("Opcion no válida");

    //antes de rotar el ultimo elemento
    System.out.println("Array antes de rotar : "+ Arrays.toString(elementosArray));

    rotarArray(elementosArray);

    //array despues de rotar el ultimo elemento
    System.out.println("Array despues de rotar: "+Arrays.toString(elementosArray));

  }

  static void rotarArray (int[] elementosArray){
    int ultimoElemento = elementosArray[elementosArray.length-1];
    for (int i=elementosArray.length-1; i>0 ; i--){
      elementosArray[i]=elementosArray[i-1];
    }
    elementosArray[0]=ultimoElemento;
  }

}