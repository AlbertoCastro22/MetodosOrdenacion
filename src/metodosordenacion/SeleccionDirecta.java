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
/**
 * El método de ordenación por selección directa. Implementa el método directo.
 * @author leon
 *
 */
public class SeleccionDirecta {
	
	/**
	 * El método que ordena
	 * @param arreglo El arreglo desordenado
	 * @return El arreglo ordenado
	 */
	public static Integer[] seleccionDirecta(Integer[] arreglo){
		int i, menor, k, j;
		for(i = 0; i <arreglo.length-1; i++){
	      menor = arreglo[i];
	      k=i;
	      for(j=i+1;j<arreglo.length;j++){
	    	 if(arreglo[j] < menor){
	    		 menor = arreglo[j];
	    		 k = j;
	    	 }
	      }
	      arreglo[k]=arreglo[i];
	      arreglo[i] = menor;
		}
		
		return arreglo;
	}

}
