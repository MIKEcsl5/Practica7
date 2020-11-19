/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *Clase Empleado
 * @author Miguel
 */
public class Empleado {
   
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    public Empleado() {
    }
    /**
     * 
     * @param nombre recibe dato tipo string que sera el nombre
     * @param numEmpleado recibe dato tipo entero que sera el numero de empleado
     * @param sueldo recibe dato tipo entero que sera el sueldo
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return retorna el nombre del nombre
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
     * @return retorna el valor del numero de empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * 
     * @param numEmpleado recibe dato tipo entero que modifica el atributo numEmpleado (numero de empleado)
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @return retorna el valor del sueldo
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * 
     * @param sueldo recibe dato tipo entero que modifica el valor del sueldo
     */
    public void setSueldo(int sueldo) {
        if(sueldo >= 0){
            this.sueldo = sueldo;
        }
    }
    /**
     * 
     * @return retorna todos los atributos de esta clase para que sean impresos
     */
     @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    /**
     * 
     * @param porcentaje recibe un dato tipo entero que sera el porcentaje que aumentara el sueldo
     * @return retorna el valor del nuevo sueldo
     */
     public int aumentaerSueldo (int porcentaje){
        sueldo += (int)(sueldo * porcentaje /100);
        return sueldo;
    }
    
}
