/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nomer1;

/**
 *
 * @author LENOVO
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();
        
        int a = 5, b = 2;
        
        System.out.println(a + " + " + b + " = " + mtk.pertambahan(a, b));
        System.out.println(a + " - " + b + " = " + mtk.pengurangan(a, b));
        System.out.println(a + " x " + b + " = " + mtk.perkalian(a, b));
        System.out.println(a + " mod " + b + " = " + mtk.modulus(a, b));
    }
    
}
