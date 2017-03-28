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
public class Tabla<T extends Comparable> {

    NodoCampo<T> inicio;

    public void insertarInicioCampo(String dato) {
        NodoCampo<T> nuevo = new NodoCampo<>(dato);
        if (vacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertarFinalCampo(String dato) {
        NodoCampo<T> nuevo = new NodoCampo<T>(dato);
        NodoCampo<T> aux = inicio;
        if (vacia()) {
            insertarInicioCampo(dato);
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void recorrer() {
        NodoCampo<T> aux = inicio;
        System.out.print(aux.toString());
        aux = aux.getSiguiente();
    }

    public boolean vacia() {
        return inicio == null;
    }
    public boolean buscarCampo(String dato) {
        NodoCampo<T> aux = inicio;
        while (aux != null) {
            if (aux.getNombre().compareTo(dato)==0) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
  
}
