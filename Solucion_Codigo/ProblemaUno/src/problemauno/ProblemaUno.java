/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemauno;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProblemaUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double precio;
        int can;
        System.out.println("----Producto----");
        System.out.println("Ingrese el precio del producto:");
        precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de productos:");
        can = entrada.nextInt();
        Metodo pro = new Metodo(precio, can);
        System.out.println("El precio final es: " + pro.calcularPrecioFinal());

    }

}
