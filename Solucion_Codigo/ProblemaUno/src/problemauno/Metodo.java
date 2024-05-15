/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemauno;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Metodo {

    Scanner entrada;
    public double precio;
    public int can;

    public Metodo(double precio, int can) {
        this.entrada = new Scanner(System.in);
        this.precio = precio;
        this.can = can;

    }

    public double calcularDescuento() {
        if (this.precio >= 1000 && this.can >= 10) {
            return 0.1;

        } else {
            return 0.5;
        }
    }

    public double calcularPrecioFinal() {
        double descuento = calcularDescuento();
        double  precioConDescuento = this.precio - (precio * descuento);
        return precioConDescuento;
    }

    @Override
    public String toString() {
        return "Metodo{" + "entrada=" + entrada + ", precio=" + precio + ", can=" + can + '}';
    }
    

}
