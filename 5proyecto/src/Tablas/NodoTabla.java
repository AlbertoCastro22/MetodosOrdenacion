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
public class NodoTabla<T extends Comparable> {
    private String nombre;
    private NodoTabla<T>siguiente;
    
    public NodoTabla(String nombre) {
        this.nombre=nombre;
        siguiente=null;
    }   
    
    public NodoTabla(){
        nombre=null;
        siguiente=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoTabla<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTabla<T> siguiente) {
        this.siguiente = siguiente;
    }
    @Override
     public String toString(){
        return  nombre+" Siguiente---> "+siguiente;
    }
    
}
