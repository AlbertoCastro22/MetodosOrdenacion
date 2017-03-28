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
public class Mergesort {

    /**
     * metodo para recorrer el arreglo e irlo imprimiendo
     */
    public void recorrer(String cadenas[]) {
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }
    }

    /**
     * este metodo sirve para recorrer el arreglo desde la izquierda hasta la derecha
     */
    public static void mergesort(String A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    private static void merge(String A[], int izq, int m, int der) {
        int i, j, k;
        String[] B = new String[A.length]; //array auxiliar
        for (i = izq; i <= der; i++) //copia ambas mitades en el array auxiliar
        {
            B[i] = A[i];
        }

        i = izq;
        j = m + 1;
        k = izq;
        while (i <= m && j <= der) //copia el siguiente elemento más grande
        {
            if (B[i].compareTo(B[j]) <= 0) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i <= m) //copia los elementos que quedan de la
        {
            A[k++] = B[i++]; //primera mitad (si los hay)
        }
    }
}
