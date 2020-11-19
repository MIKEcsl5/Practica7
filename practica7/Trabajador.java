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
public class Trabajador extends Persona{
    private int rfc;

    public Trabajador() {
    }
    /**
     * 
     * @param rfc recibe dato tipo entero que sera el rfc
     * @param nombre recibe dato tipo string que sera el nombre
     * @param apellidos recibe dato tipo string que sera el(los) apellidos
     * @param edad recibe dato tipo entero que sera la edad
     */
    public Trabajador(int rfc, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.rfc = rfc;
    }
    /**
     * 
     * @return el valor del rfc
     */
    public int getRfc() {
        return rfc;
    }
    /**
     * 
     * @param rfc recibe dato tipo entero que modifica el atributo rfc
     */
    public void setRfc(int rfc) {
        this.rfc = rfc;
    }
    /**
     * 
     * @return retorna todos los atributos de esta clase para que sean impresos
     */
    @Override
    public String toString() {
        return super.toString()+"Trabajador{" + "rfc=" + rfc + '}';
    }
    

}
