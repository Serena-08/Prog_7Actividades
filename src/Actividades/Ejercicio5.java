package Actividades;

public class Ejercicio5 {
  public static void main(String[] args) {

    int vectorNumeros[] = new int[10];


    for (int i = 0; i < vectorNumeros.length;++i) {
      vectorNumeros[i]=(int)(Math.random() * 10 + 1);
    }


    for (int i=0; i < vectorNumeros.length;++i){
      int numero = vectorNumeros[i];
      int cuadrado = numero * numero;
      int cubo = numero * numero * numero;
      System.out.println("El número es : "+ numero +" su cuadrado es: "+ cuadrado +" su cubo es: "+ cubo);
    }
  }
}
