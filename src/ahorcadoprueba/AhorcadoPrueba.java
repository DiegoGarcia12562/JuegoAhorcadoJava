/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcadoprueba;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class AhorcadoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES Y ARRAYS
        Scanner esc = new Scanner(System.in);
        String palabra;
        boolean terminado = false;
        char letra;
        int fallos = 0;
        Muñeco juan = new Muñeco(fallos); //CREA EL OBJ MUÑECO
        StringBuilder letrasUsadas = new StringBuilder("");
        //CODIGO
        System.out.println("BIENVENIDO");
        palabra = funcionElegirPalabra();
        palabra = palabra.toUpperCase();
        StringBuilder palabraSB = new StringBuilder("" + palabra);
        StringBuilder palabraComodin = new StringBuilder("");
        for (int i = 0; i < palabra.length(); i++) {
            palabraComodin.append("X");
        }
        do {
            boolean muerto = juan.MetodoMostrarMuñeco(fallos);
            funcionDibujarPalabra(palabraSB, palabraComodin);
            System.out.println("LETRAS FALLADAS:");
            System.out.printf("%s\n", letrasUsadas);
            if (muerto == true) {
                System.out.println("HAS PERDIDO");
                return;
            }
            System.out.print("Dime la letra: ");
            letra = esc.next().charAt(0);
            System.out.println("");
            char letraMayuscula = Character.toUpperCase(letra); //<-- HACE MAYUSC LETRAS
            fallos = funcionMotor(palabraSB, palabraComodin, letraMayuscula, fallos, letrasUsadas);
            terminado = funcionComprobarCorrecto(palabraComodin);
        } while (terminado == false);
        System.out.println("ADIVINADO");
    }

    public static boolean funcionComprobarCorrecto(StringBuilder palabraComodin) {
        boolean correcto = true;
        for (int i = 0; i < palabraComodin.length(); i++) {
            if (palabraComodin.charAt(i) == 'X') {
                correcto = false;
            }
        }
        if (correcto == true) {
            return true;
        }
        return false;
    }

    public static String funcionElegirPalabra() {
        Scanner esc = new Scanner(System.in);
        System.out.println("Dime la palabra a adivinar");
        String palabra = esc.nextLine();
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
        return palabra;
    }

    public static void funcionDibujarPalabra(StringBuilder palabra, StringBuilder palabraComodin) {
        //MUESTRA LA PALABRA
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabraComodin.charAt(i));
            System.out.print(" ");
        }
        System.out.println("");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print("- ");
        }
        System.out.println("");
    }

    public static int funcionMotor(StringBuilder palabra, StringBuilder palabraComodin, char letra, int fallos, StringBuilder letrasUsadas) {
        //CREAR PALBRA COMODIN, EJEMPLO SI LA PALBRA ES "HOLA" COMODIN SERÁ "XOLX"
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {
                palabraComodin.setCharAt(i, letra);
            }
        }
        //QUITA VIDA SI FALLAS LA LETRA
        boolean encontrado = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {
                encontrado = true; // SI SI ENCUENTRA UNA ESTO CAMBIA
            }
        }
        if (encontrado == false) {
            fallos++;
            letrasUsadas.append(letra + " ");
        }
        return fallos;
    }
}
