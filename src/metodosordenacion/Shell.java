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
public class Shell {
	
public static Integer[] shell(Integer []arreglo){
	int i,aux,inta;
	boolean band;
	inta=arreglo.length;
	while(inta>0){
		inta=inta/2;
		band=true;
		while(band){
			band=false;
			i=0;
			while((i+inta)<=arreglo.length-1){
				if(arreglo[i]>arreglo[i+inta]){
					aux=arreglo[i];
					arreglo[i]=arreglo[i+inta];
					arreglo[i+inta]=aux;
					band=true;
				}//fin del if
				i=i+1;
			}//fin dl tercer while			
		}//fin del segundo while
	}//fin del primer while
	return arreglo;
}//fin del metodo shell
}//fin de la clase shell

