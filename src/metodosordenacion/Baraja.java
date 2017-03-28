/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;

/**
 *
 * @author Usersone
 *
 * Esta clase implementa el método de inserción directa, también conocido como
 * el método de la baraja.
 *
 *
 */
public class Baraja {

    /**
     * El método que ordena.
     *
     * @param arreglo El arreglo desordenado.
     * @return El resultado ya ordenado.
     */
    public static Integer[] baraja(Integer[] arreglo) {

        int i, aux, k;
        for (i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            k = i - 1;
            while (aux < arreglo[k] && k > 0) {
                arreglo[k + 1] = arreglo[k];
                k = k - 1;
            }
            if (arreglo[k] <= aux) {
                arreglo[k + 1] = aux;
            } else {
                arreglo[k + 1] = arreglo[k];
                arreglo[k] = aux;
            }
        }

        return arreglo;
    }

    public static Integer[] barajaConBusquedaBinaria(Integer[] arreglo) {
        int i, aux, izq, der, m, j;
        for (i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            izq = 0;
            der = i - 1;
            while (izq <= der) {
                m = (izq + der) / 2;
                if (aux < arreglo[m]) {
                    der = m - 1;
                } else {
                    izq = m + 1;
                }
            }
            j = i - 1;
            while (j >= izq) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[izq] = aux;
        }
        return arreglo;
    }

}
