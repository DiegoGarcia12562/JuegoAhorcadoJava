/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcadoprueba;

/**
 *
 * @author Administrador
 */
public class Muñeco {

    private int vida;

    public Muñeco(int vida) {
        this.vida = vida;
    }

    //GETERS AND SETERS
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    public boolean MetodoMostrarMuñeco(int fallo) {
        if (fallo == 0) {
            System.out.println("");
            System.out.println("   +---+");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("=========");
        }
        if (fallo == 1) {
            System.out.println("");
            System.out.println("   +---+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("=========");
        }
        if (fallo == 2) {
            System.out.println("");
            System.out.println("   +---+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("=========");
        }
        if (fallo == 3) {
            System.out.println("");
            System.out.println("   +---+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("=========");
        }
        if (fallo == 4) {
            System.out.println("");
            System.out.println("   +---+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("=========");
        }
        if (fallo == 5) {
            System.out.println("");
            System.out.println("   +---+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  /    |");
            System.out.println("       |");
            System.out.println("=========");
        }
        if (fallo == 5) {
            System.out.println("");
            System.out.println("   +---+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  / \\  |");
            System.out.println("       |");
            System.out.println("=========");
            return true;
        }
        return false;
    }
}
