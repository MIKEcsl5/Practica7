/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *Esta clase es subclase de la clase Empleado
 * @author Miguel
 */
public class Gerente extends Empleado{
    private int presupuesto = 0;
    
    public Gerente() {
    }
    /**
     * 
     * @param nombre recibe dato nombre tipo string
     * @param numEmpleado recibe dato numero de empleado de tipo entero
     * @param sueldo recibe dato sueldo de tipo entero
     * @param presupuesto recibe dato presupuesto de tipo entero
     */
    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @return devuelve el valor del presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * 
     * @param presupuesto recibe un valor de tipo entero que se asignara al presupuesto
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @param anio recibe dato tipo entero que se asignara al anio
     * @param tasa recibe dato de tipo decimal que sera la tasa
     */
    public void setPresupuesto(int anio, float tasa){
        this.presupuesto += (int)(presupuesto/(anio*tasa));
    }
    /**
     * 
     * @return retorna todos los atributos de esta clase para que sean impresos
     */
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
