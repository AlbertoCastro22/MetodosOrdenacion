/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Usersone
 */
import metodosordenacion.*;
import LikendList.*;
import java.util.*;
import static metodosordenacion.Radix.Radix;

public class Test {

    public int aleatorio() {
        Random rnd = new Random();
        return rnd.nextInt(5000);
    }

    Integer tam = this.aleatorio();
    Integer[] miArregloOrdenado = new Integer[tam];
    Integer[] miArregloDesordenado = new Integer[tam];
    Integer[] miArregloAleatorio = new Integer[tam];

    public static void imprimir(Integer[] arreglo) {
        for (int x = 0; x < arreglo.length; x++) {
            System.out.print("[" + arreglo[x] + "]-->");
        }
        System.out.println();
    }

    public void llenararregloOrdenado() {
        /**
         * for para llenar el arreglo de forma ordenada
         */
        for (int x = 0; x < tam; x++) {
            miArregloOrdenado[x] = x;
        }
    }

    public void LlenarDesordenado() {
        /**
         * for para llenar el arreglo de forma desordenada
         */
        int y = tam;
        for (int x = 0; x < tam; x++) {
            miArregloDesordenado[x] = y--;
        }
    }

    public void llenarAleatorio() {
        /**
         * for para llenar arreglo con numeros aleatorios
         */
        Random rd = new Random();
        for (int x = 0; x < tam; x++) {

            miArregloAleatorio[x] = rd.nextInt(tam);
            //mc.AgregarInicio(miArregloAleatorio[x]);
        }
    }

    public void Bur() {
        llenararregloOrdenado();
        this.LlenarDesordenado();
        imprimir(Burbuja.burbuja(miArregloDesordenado));
    }

    public void se() {
        llenararregloOrdenado();
        imprimir(SeleccionDirecta.seleccionDirecta(miArregloOrdenado));
    }
    int ar[] = {10, 20, 30, 40, 50};

    public int Reco(int a[], int x) {
        a = ar;
        for (int i = 0; i < a.length; i++) {
            // x=a[i];
            if (a[i] > x) {
                System.out.println(a[i] * x);
            } else {
                this.Reco(a, a[i]);
            }
        }
        return 0;
    }

    public void Rad() {
        int i;
       
        System.out.print("original: ");
        for (int x = 0; x < tam; x++) {

            miArregloAleatorio[x] = this.aleatorio()*1024;
            System.out.print(miArregloAleatorio[x]+"->");
        }
             //Integer [] arr = ;
            Radix( miArregloAleatorio);
            
            System.out.print("\nordenados: ");
            for (i = 0; i <  miArregloAleatorio.length; i++) {
                System.out.print( miArregloAleatorio[i] + " ");
            }
            System.out.println("\nHecho.");
        }

    

    public static void main(String args[]) {
        Date inicio = Calendar.getInstance().getTime();
        Test t = new Test();
        //t.Bur();
        // t.se();
        // int ar[]={10,20,30,40,50};
        //t.Reco(ar, 50);
        t.Rad();
        /**
         * en esta parte se imprime cuanto se tarda en ejecutarse cada metodo de
         * ordenacion
         */
        Date fin = Calendar.getInstance().getTime();
        System.out.println("Tiempo de ejecucion: ");
        System.out.println(new Date(fin.getTime() - inicio.getTime()));
    }

}
