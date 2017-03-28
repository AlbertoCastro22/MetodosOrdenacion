/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author angel
 */
public class NodoCampo<T extends Comparable> {
    private String nombre;
    private NodoCampo<T>siguiente;
    
    public NodoCampo(String nombre){
        this.nombre=nombre;
        siguiente=null;
    }
     public NodoCampo(){
        this.nombre=nombre;
        siguiente=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoCampo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCampo<T> siguiente) {
        this.siguiente = siguiente;
    }
    @Override
     public String toString(){
        return nombre +" Siguiente---> "+siguiente;
    }
    
}
