/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;

/**
 * Esta clase implementa el método de la burbuja.
 * La clase se implementa con arreglos.
 * @author UserOne
 *
 */
public class Burbuja {
	
	/**
	 * Método para ordenar mediante "la burbuja"
	 * @param arreglo El arreglo a ordenar.
	 * @return El mismo arreglo ya ordenado.
	 */
	public static Integer[] burbuja(Integer[] arreglo){
		int intercambios = 0, comparaciones = 0;
		
		int aux = 0;
		for(int i = 1; i<arreglo.length; i++){
			for(int j= arreglo.length-1; j>=i; j-- ){
				comparaciones++;
				if (arreglo[j-1]>arreglo[j]){
					intercambios++;
					aux = arreglo[j-1];
					arreglo[j-1] = arreglo[j];
					arreglo[j] = aux;			
				}
			}
		}	
		System.out.println("Numero de intercambios:"+intercambios);
		System.out.println("Numero de comparaciones:"+comparaciones);
		return arreglo;
	}
}
