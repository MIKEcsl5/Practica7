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
public class Profesor extends Trabajador{
    private String materia;

    public Profesor() {
    }
    /**
     * 
     * @param materia recibe dato tipo string que sera el nombre de la materia
     * @param rfc recibe dato tipo entero que sera el rfc
     * @param nombre recibe dato tipo string que sera el nombre
     * @param apellidos recibe dato tipo string que sera el(los) apellidos
     * @param edad recibe dato tipo entero que sera la edad
     */
    public Profesor(String materia, int rfc, String nombre, String apellidos, int edad) {
        super(rfc, nombre, apellidos, edad);
        this.materia = materia;
    }
    /**
     * 
     * @return retorna el nombre de la materia
     */
    public String getMateria() {
        return materia;
    }
    /**
     * 
     * @param materia recibe dato tipo string que sera el nombre de la materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    /**
     * 
     * @return retorna todos los atributos de esta clase para que sean impresos
     */
    @Override
    public String toString() {
        return super.toString()+ "Profesor{" + "materia=" + materia + '}';
    }
    
    
}
