/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *Esta es la clase Persona que se utilizó en la practica 5
 * @author Miguel
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
    }
    /**
     * 
     * @param nombre recibe dato tipo string que sera el nombre
     * @param apellidos recibe dato tipo string que sera el(los) apellidos
     * @param edad recibe dato tipo entero que sera la edad
     */
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    /**
     * 
     * @return retorna el valor del nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre recibe dato tipo string que modifica el atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return retorna el valor de los apellidos
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * 
     * @param apellidos recibe dato tipo string que sera el(los) apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * 
     * @return retorna el valor de la edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad recibe dato tipo entero que modifica el atributo edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return retorna todos los atributos de esta clase para que sean impresos
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", Apellidos=" + apellidos + '}';
    }

}