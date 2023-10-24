/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nomer2;

/**
 *
 * @author LENOVO
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KonversiSuhu2 suhu = new KonversiSuhu2();
        
        double celcius = 30;
        double fahrenheit = 50;
        
        System.out.println(celcius + " celcius = " + suhu.CelciusToFahrenheit(celcius) + " Fahrenheit");
        System.out.println(celcius + " celcius = " + suhu.CelciusToReamur(celcius) + " Reamur");
        System.out.println(fahrenheit + " fahrenheit = " + suhu.FahrenheitToReamur(fahrenheit) + " Reamur");
    }
    
}
