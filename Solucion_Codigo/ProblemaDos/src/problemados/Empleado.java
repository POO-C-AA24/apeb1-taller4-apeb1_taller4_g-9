/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemados;

/**
 *
 * @author User
 */
public class Empleado {
    public String nombre;
    public double salario;
    public int edad;
    
    

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }
    public int menu(){
        System.out.println("Agregar empleado (1)");
        
    }
    public double getSalario() {
        return this.salario;
    }

    public void aumentarSalario(double porcentajeAumento) {
        this.salario = salario * (porcentajeAumento / 100);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" 
                + salario + ", edad=" + edad + '}';
    }

    
    
}
