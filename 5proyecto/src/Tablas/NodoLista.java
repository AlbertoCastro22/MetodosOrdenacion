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
public class NodoLista<T extends Comparable>{
    
    private T dato;
    private NodoLista<T>siguiente;
    
    public NodoLista(T dato){
        this.dato=dato;
        siguiente=null;
    }
    public NodoLista(){
        dato=null;
        siguiente=null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoLista<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString(){
        return  dato+" Siguiente---> "+siguiente;
    }
    
}
