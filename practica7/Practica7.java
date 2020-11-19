/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *Clase main
 * @author Miguel
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("/1***********************");
        Empleado empleado = new Empleado();
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        empleado.aumentaerSueldo(10);
        System.out.println(empleado);
        
        System.out.println("/2***************/");
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        System.out.println("Nombre: "+gerente1.getNombre());
        System.out.println("No. Empleado: "+gerente1.getNumEmpleado());
        System.out.println("Sueldo: "+gerente1.getSueldo());
        System.out.println("Presupuesto: "+gerente1.getPresupuesto());
        gerente1.setPresupuesto(500000);
        System.out.println("Presupuesto: "+gerente1.getPresupuesto());
        
        System.out.println("/*3******************/");
        Gerente gerente2 = new Gerente("Julio", 88, 200000, 500000);
        System.out.println("Nombre: "+gerente2.getNombre());
        System.out.println("No. Empleado: "+gerente2.getNumEmpleado());
        System.out.println("Sueldo: "+gerente2.getSueldo());
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        
        
        System.out.println("/*4******************/");
        System.out.println(gerente2);
        
        System.out.println("/*5***********/");
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5,5.5f);
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        
        System.out.println("/5.1*****************/");
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Miguel");
        System.out.println("Nombre: "+alumno1.getNombre());
        alumno1.setApellidos("Carreto");
        System.out.println("Apellidos: "+alumno1.getApellidos());
        alumno1.setEdad(19);
        alumno1.setNumCuenta(321983);
        System.out.println("Edad: "+alumno1.getEdad());
        System.out.println(alumno1);
        
        Alumno alumno2 = new Alumno(345345, "Carlos", "Velazquez", 26);
        System.out.println(alumno2);
        
        System.out.println("/5.2************************");
        Director director1 = new Director();
        director1.setNombre("Jorge");
        System.out.println("Nombre: "+director1.getNombre());
        director1.setApellidos("Lopez");
        System.out.println("Apellidos: "+director1.getApellidos());
        director1.setEdad(54);
        director1.setRfc(45645556);
        System.out.println("RFC: "+director1.getRfc());
        director1.setFacultad("Medicina");
        System.out.println("Facultad: "+director1.getFacultad());
        System.out.println(director1);
        
        Director director2 = new Director("Ingenieria", 12345, "Alberto", "Gonzalez", 49);
        System.out.println(director2);
        
        System.out.println("/5.3****************************");
        Profesor profesor1 = new Profesor();
        profesor1.setMateria("Estructura de datos");
        System.out.println("Materia: "+profesor1.getMateria());
        profesor1.setRfc(88877897);
        System.out.println("RFC: "+profesor1.getRfc());
        profesor1.setNombre("Julio");
        System.out.println("Nombre: "+profesor1.getNombre());
        profesor1.setApellidos("Roldan");
        System.out.println("Apellidos: "+profesor1.getApellidos());
        profesor1.setEdad(30);
        System.out.println(profesor1);
        
        Profesor profesor2 = new Profesor("Calculo", 4324133, "Roberto", "Perez", 43);
        System.out.println(profesor2);
    }
}
