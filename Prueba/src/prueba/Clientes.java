/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author ESFOT
 */
public class Clientes {
    private String nombre;
    private String cedula;

    public Clientes(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre" + nombre + "cédula" + cedula; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
