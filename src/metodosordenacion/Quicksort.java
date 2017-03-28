/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;

/**
 *
 * @author Usersone
 */
public class Quicksort {
	
	public  void quicksort(Integer[]arreglo,Integer inicial,Integer fin){
		int aux,izquierda,derecha,pos;
		boolean band;
		izquierda=inicial;
		derecha=fin;
		pos=inicial;
		band=true;
		while(band){
			band=false;
			while((arreglo[pos]<=arreglo[derecha])&&(pos!=derecha)){
				derecha=derecha-1;
			}//fin del segundo while
			if(pos!=derecha){
				aux=arreglo[pos];
				arreglo[pos]=arreglo[derecha];
				arreglo[derecha]=aux;
				pos=derecha;
				while((arreglo[pos]>=arreglo[izquierda])&&(pos!=izquierda)){
					izquierda=izquierda+1;					
				}
				if(pos!=izquierda){
					band=true;
					aux=arreglo[pos];
					arreglo[pos]=arreglo[izquierda];
					arreglo[izquierda]=aux;
					pos=izquierda;
				}//fin del segundo if
			}//fin del if
		}//fin del primer while
		if(pos-1>inicial){
			quicksort(arreglo,inicial,pos-1);
		}//fin del tercer if
			if(fin>(pos+1)){
				quicksort(arreglo,pos+1,fin);
			}//fin del cuarto if
	
		}//fin del metodo _quicksort
	
	public void quicksort(Integer []arreglo){
		quicksort(arreglo,0,arreglo.length-1);
		
	}

}
