/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Prueba {

    String texto;
    int numerico;

    public void menu() {

        Simulador s = new Simulador();
        Tabla t = new Tabla();
        Campo c = new Campo();
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Crear Tabla\n2.-Añadir Datos \n3.-Eliminar Tabla\n4.-Mostrar tablas\n5.-Salir"));
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingresa el nombre de la tabla");
                    s.insertarFinalTabla(nombre);
                    int contador = 0;
                    int elementos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos campos deseas agregar"));
                    while (contador < elementos) {
                        String campo = JOptionPane.showInputDialog("Ingresa el nombre del campo " + (contador + 1));
                        t.insertarFinalCampo(campo);
                        contador++;
                    }
                    break;
                case 2:
                    String añadir = JOptionPane.showInputDialog("Ingresa el nombre de la tabla a añadir Campos");
                    if (s.buscarTabla(añadir) == true) {
                        String campo = JOptionPane.showInputDialog("Ingresa el nombre del campo a añadir Datos");
                        if (t.buscarCampo(campo) == true) {
                            int tipo2;
                            boolean tipo = false;
                            do {
                                tipo2 = Integer.parseInt(JOptionPane.showInputDialog("1.-Texto\n2.-Numerico"));
                                switch (tipo2) {
                                    case 1:
                                        tipo = true;
                                        texto = JOptionPane.showInputDialog("Ingresa el dato");
                                        c.insertarFinalDatos(texto);
                                        break;
                                    case 2:
                                        tipo = false;
                                        numerico = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato"));
                                        c.insertarFinalDatos(numerico);
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opcion No valida");
                                        break;
                                }
                            } while (tipo2 != 3);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe el campo");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe la tabla");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    s.recorrer();
                    break;
            }
        } while (opcion != 5);

    }

    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.menu();
    }

}
