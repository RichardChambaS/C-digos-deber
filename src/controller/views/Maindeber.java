package controller.views;

import java.util.Scanner;
import controller.ejercicios.Agua;
import controller.ejercicios.Empleados;
import controller.ejercicios.Llamadas;
import controller.ejercicios.Succesion2;

public class Maindeber {
    public static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        do{
            System.out.println("------Practica 2 Richard Chamba-------");
            System.out.println("     MENU DE SELECCIÓN   ");
            System.out.println("1. Empleados concesionaria.");
            System.out.println("2. LLamadas Internacionales.");
            System.out.println("3. Cobranza de Agua");
            System.out.println("4. Succesión 2.");
            System.out.println("--------------------------------------");
            int menu = sn.nextInt();
            switch (menu) {
                case 1:
                    // empleados
                    Empleados inf = new Empleados();
                    inf.Calculos();
                    System.out.println("");//espacio
                    break;
                case 2:
                    // llamadas
                    Llamadas.casos();
                    break;
                case 3:
                    Agua.PresentarAgua();
                    System.out.println(""); //espacio
                    break;
                case 4:
                    // suceciones
                    int i = 0;
                    System.out.println("Ingrese la cantidad que necesite de la succesión");
                    int limite= sn.nextInt();
                    for (; i <= limite; i++) {
                        System.out.print(Succesion2.entregarfinal(i));
                    }
                    System.out.print("\n" + Succesion2.entregarsuma(i));
                    System.out.println("");
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una selección correcta.");
                    break;
                }
            }while(salir != true);
    }
}