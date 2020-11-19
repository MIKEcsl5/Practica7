/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *Esta clase es subclase de la clase Persona
 * @author Miguel
 */
public class Alumno extends Persona{
    private int numCuenta;

    public Alumno() {
    }
    /**
     * 
     * @param numCuenta recibe dato tipo entero que sera el numero de cuenta
     * @param nombre recibe dato tipo string que sera el nombre
     * @param apellidos recibe dato tipo string que sera el(los) apellidos
     * @param edad recibe dato tipo entero que sera la edad
     */
    public Alumno(int numCuenta, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.numCuenta = numCuenta;
    }
    /**
     * 
     * @return retorna el valor del numero de cuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    /**
     * 
     * @param numCuenta recibe dato tipo entero que sera el numero de cuenta
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * 
     * @return retorna todos los atributos de esta clase para que sean impresos
     */
    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "numCuenta=" + numCuenta + '}';
    }
    
}
