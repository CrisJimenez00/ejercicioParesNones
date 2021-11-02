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

    public static void main(String[] args) {   
        
        //Objetos random y scanner
        Random numeroRandom = new Random();
        Scanner teclado = new Scanner(System.in);
        
        //Variables 
        int opcion, numeroJugador1, numeroJugador2, numeroJugador2Aleatorio ,eleccion;
        boolean esPares = false;
        
        //Para que el programa no acabe hasta que el usuario decide acabar
        do {
            System.out.println("Bienvenido al juego de pares y nones"
                    + "\n1.Jugar con otro jugador en físico"
                    + "\n2.Jugar contra la máquina"
                    + "\n3.Salir"
                    + "\nElija una opción");
            opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ha elegido jugar contra persona en físico");
                
                //Para que los jugadores decidan si quieren ser pares o nones
                do {
                    System.out.println("Jugador j1 le damos la oportunidad de elegir "
                            + "si quiere ser pares o nones"
                            + "\n1.Para pares"
                            + "\n2.Para nones");
                    eleccion = teclado.nextInt();
                } while (eleccion < 1 || eleccion > 2);
                
                //Para que el usuario vea cómo va
                switch (eleccion) {
                    case 1:
                        System.out.println("Ha elejido ser pares");
                        esPares = true;
                        break;
                    case 2:
                        System.out.println("Ha elegido ser nones");
                        esPares = false;
                        break;
                    default:
                        System.out.println("Elija una opción correcta");
                        break;
                }
                
                //para que los usuarios intruzcan sus números, no puede ser menor a 0 y mayor a 10
                do {
                    System.out.println("Jugador j1 elija su número");
                    numeroJugador1 = teclado.nextInt();

                } while (numeroJugador1 < 0 || numeroJugador1 > 10);
                
                
                do {
                    System.out.println("Jugador j2 elija su número");
                    numeroJugador2 = teclado.nextInt();

                } while (numeroJugador2 < 0 || numeroJugador2 > 10);
                
                
                //Sumamos los números introducidos por scanner para sacar el resultado
                int suma = numeroJugador1+numeroJugador2;
                System.out.println("El resultado de la suma de ambos números es " + suma);
                
                //Si es par gana pares, si no, gana nones(impares)
                if (suma % 2 == 0) {
                    System.out.println("Ha ganado pares");
                    if (esPares == true) {
                        //Si sale par gana j1
                        System.out.println("Ha ganado el jugador J1, FELICIDADES");
                    } else {
                        //Si no, j2
                        System.out.println("Ha ganado el jugador j2, FELICIDADES");
                    }
                } else {
                    System.out.println("Ha ganado nones");
                    if (esPares == false) {
                        //Si sale impar gana j2
                        System.out.println("Ha ganado el jugador J1, FELICIDADES");
                    } else {
                        //Si no, j1
                        System.out.println("Ha ganado el jugador j2, FELICIDADES");
                    }
                
                } 
                
                break;
            case 2:
                System.out.println("Ha elegido jugar contra la máquina");
                
                //Para que los jugadores decidan si quieren ser pares o nones
                do {
                    System.out.println("Jugador j1 le damos la oportunidad de elegir "
                            + "si quiere ser pares o nones"
                            + "\n1.Para pares"
                            + "\n2.Para nones");
                    eleccion = teclado.nextInt();
                } while (eleccion < 1 || eleccion > 2);
                
                //Para que el usuario elija si ser pares o nones
                switch (eleccion) {
                    case 1:
                        System.out.println("Ha elejido ser pares");
                        //El boleano es true significa que es ha elegido ser pares
                        esPares = true;
                        break;
                        
                    case 2:
                        
                        System.out.println("Ha elegido ser nones");
                        //Si es false elige ser nones
                        esPares = false;
                        break;
                        
                    default:
                        
                        System.out.println("Elija una opción correcta");
                        break;
                }
                //para que los usuarios intruzcan sus números, no puede ser menor a 0 y mayor a 10
                do {
                    
                    System.out.println("Jugador j1 elija su número");
                    numeroJugador1 = teclado.nextInt();

                } while (numeroJugador1 < 0 || numeroJugador1 > 10);
                
                numeroJugador2Aleatorio = numeroRandom.nextInt(11);
                System.out.println("Jugador j2 ha elegido " + numeroJugador2Aleatorio);
                
                //Sumamos los números introducidos por scanner para sacar el resultado
                int sumaMaquina = numeroJugador1+numeroJugador2Aleatorio;
                System.out.println("El resultado es " + sumaMaquina);
                
                //Si es par gana pares, si no, gana nones(impares)
                if (sumaMaquina % 2 == 0) {
                    
                    System.out.println("Ha ganado pares");
                    
                    //Si el usuario ha elegido pares ganará
                    if (esPares == true) {
                       
                        System.out.println("Ha ganado el jugador J1, FELICIDADES");
                        
                    //Si no, pierde
                    } else {
                        
                        System.out.println("Ha ganado el jugador j2, FELICIDADES");
                        
                    }
                    
                } else {
                    
                    //En caso de que sea impar gana nones
                    System.out.println("Ha ganado nones");
                    
                    //Si el usuario ha elegido ser nones ganará j1
                    if (esPares == false) {
                        
                        System.out.println("Ha ganado el jugador J1, FELICIDADES");
                        
                    //Si no, gana j2
                    } else {
                        
                        System.out.println("Ha ganado el jugador j2, FELICIDADES");
                        
                    }
                }
                break;
                
            case 3:
                System.out.println("Hasta la próxima");
                break;
                
            default:
                System.out.println("Elija una opción entre 1 y 3");

        }
        } while (opcion != 3);
    }
    
}
