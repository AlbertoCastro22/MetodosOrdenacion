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
public class Campo<T extends Comparable> {
    NodoLista<T>inicio;
    
    public void insertarInicioDatos(T dato) {
        NodoLista<T> nuevo = new NodoLista<>(dato);
        if (vacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertarFinalDatos(T dato) {
        NodoLista<T> nuevo = new NodoLista<T>(dato);
        NodoLista<T> aux = inicio;
        if (vacia()) {
            insertarInicioDatos(dato);
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void recorrer() {
        NodoLista<T> aux = inicio;
        System.out.print(aux.toString());
        aux = aux.getSiguiente();
    }
    public boolean vacia(){
        return inicio==null;
    }

}
