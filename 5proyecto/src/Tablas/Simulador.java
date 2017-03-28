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
public class Simulador<T extends Comparable> {
    
    private NodoTabla<T>inicio;
    
    public NodoTabla<T> getInicio() {
        return inicio;
    }

    public void setInicio(NodoTabla<T> inicio) {
        this.inicio = inicio;
    }
    
    public void insertarInicioTabla(String dato) {
        NodoTabla<T> nuevo = new NodoTabla<>(dato);
        if (vacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertarFinalTabla(String dato) {
        NodoTabla<T> nuevo = new NodoTabla<T>(dato);
        NodoTabla<T> aux = inicio;
        if (vacia()) {
            insertarInicioTabla(dato);
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public void recorrer() {
        NodoTabla<T> aux = inicio;
        System.out.print(aux.toString());
        aux = aux.getSiguiente();
    }
    public String[] recorrer2() {
        NodoTabla<T> aux = inicio;
        String[] tablas= new String[contarTablas()];
        int i=0; 
        while(aux!=null)
         {
          tablas[i]=aux.getNombre();
          aux=aux.getSiguiente();
          i++;
         }
        return tablas;
    }
    public boolean vacia(){
        return inicio==null;
    }
     public boolean buscarTabla(String dato) {
        NodoTabla<T> aux = inicio;
        while (aux != null) {
            if (aux.getNombre().compareTo(dato)==0) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    public int contarTablas()   
    {
      int contador=0;
      NodoTabla<T> aux=inicio;
      while(aux!=null)
      {
          contador++;
          aux=aux.getSiguiente();
      }
      return contador;
    }
}
