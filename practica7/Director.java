/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *Esta clase es subclase de la subclase Trabajador
 * @author Miguel
 */
public class Director extends Trabajador{
    private String facultad;

    public Director() {
    }
    /**
     * 
     * @param facultad recibe dato tipo string que sera el nombre de la facultad
     * @param rfc recibe dato tipo entero que sera el rfc
     * @param nombre recibe dato tipo string que sera el nombre
     * @param apellidos recibe dato tipo string que sera el(los) apellidos
     * @param edad recibe dato tipo entero que sera la edad
     */
    public Director(String facultad, int rfc, String nombre, String apellidos, int edad) {
        super(rfc, nombre, apellidos, edad);
        this.facultad = facultad;
    }
    /**
     * 
     * @return retorna el nombre de la facultad
     */
    public String getFacultad() {
        return facultad;
    }
    /**
     * 
     * @param facultad recibe dato tipo string que modifica el atributo facultad
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    /**
     * 
     * @return retorna todos los atributos de esta clase para que sean impresos
     */
    @Override
    public String toString() {
        return super.toString()+ "Director{" + "facultad=" + facultad + '}';
    }
    
    
}
