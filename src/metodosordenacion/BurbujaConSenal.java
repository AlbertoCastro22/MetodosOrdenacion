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
public class BurbujaConSenal {
	
	/**
	 * El método para ordenar
	 * @param arreglo El arreglo desordenado
	 * @return El arreglo ordenado.
	 */
	public static Integer[] burbujaConSenal(Integer[] arreglo){
		int intercambios = 0, comparaciones = 0;

		int aux = 0, i = 0;
		boolean band = false;
				
		while(i < arreglo.length-1 && band == false){
			band = true;
			for(int j = 0; j<arreglo.length-i-1; j++){
				comparaciones++;
				if (arreglo[j]>arreglo[j+1]){
					intercambios++;
					aux = arreglo[j];
					arreglo[j]= arreglo[j+1];
					arreglo[j+1] = aux;
					band = false;
				}
			}
			i = i+1;
			
		}
		System.out.println("Numero de intercambios:"+intercambios);
		System.out.println("Numero de comparaciones:"+comparaciones);
		
		return arreglo;
	}
}
