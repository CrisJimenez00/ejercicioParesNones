/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class EjercicioCristinaJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Random numeroRandom = new Random();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido al juego de pares y nones"
                    + "\n1.Jugar con otro jugador en físico"
                    + "\n2.Jugar contra la máquina"
                    + "\n3.Salir"
                    + "\nElija una opción correcta");
            opcion = teclado.nextInt();
        } while (opcion != 3);
        switch(opcion){
            case 1:
                System.out.println("Ha elegido jugar contra persona en físico");
                break;
            case 2:
                System.out.println("Ha elegido jugar contra la máquina");
                break;
            case 3:
                System.out.println("Hasta la próxima");
                break;
            default:
                System.out.println("Elija una opción correcta");

        }
    }
    
}
