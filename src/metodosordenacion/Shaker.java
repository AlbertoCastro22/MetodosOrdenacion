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
public class Shaker {
	
	/**
	 * El método que ordena mediante la sacudida
	 * @param arreglo El arreglo a ordenar.
	 * @return El arreglo ya ordenado.
	 */
	public static Integer[] shaker(Integer[] arreglo){
		int intercambios = 0, comparaciones = 0;
		int i, izq, der, k, aux;
		izq = 1;
		der = arreglo.length-1;
		k= arreglo.length-1;
		while(izq <= der){
			for(i=der; i >=izq; i--){
				comparaciones++;
				if(arreglo[i-1] > arreglo[i]){
					intercambios++;
					aux = arreglo[i-1];
					arreglo[i-1] = arreglo[i];
					arreglo[i] = aux;
					k = i;
				}
			}
			izq = k+1;
			for(i = izq; i<=der; i++){
				comparaciones++;
				if(arreglo[i-1] > arreglo[i]){
					intercambios++;
					aux = arreglo[i-1];
					arreglo[i-1] = arreglo[i];
					arreglo[i] = aux;
					k = i;
				}
			}
			der = k-1;
			
		}
		System.out.println("Numero de intercambios:"+intercambios);
		System.out.println("Numero de comparaciones:"+comparaciones);

		return arreglo;
	}

}
