/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Usersone
 */
import Tablas.Simulador;
import javax.swing.*;
import javax.swing.event.*;
import Tablas.*;

public class InsertarDatos2 extends JFrame {

    JLabel campo1, campo2, campo3, campo4;
    JFrame insertarDatos2;
    JComboBox listadetablas;
    JButton boton1, boton2;
    JTextField ingresaCampo1, ingresaCampo2, ingresaCampo3, ingresaCampo4;
    Simulador simulador;
    framePrincipal principio;
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public InsertarDatos2(Simulador simulador) {
        this.simulador = simulador;
        campo1 = new JLabel("Campo 1");
        campo2 = new JLabel("Campo 2");
        campo3 = new JLabel("Campo 3");
        campo4 = new JLabel("Campo 4");
        insertarDatos2 = new JFrame("SIMULADOR");
        listadetablas = new JComboBox();
        boton1 = new JButton("aceptar");
        boton2 = new JButton(">>AgregarDatos");
        //
        ingresaCampo1 = new JTextField();
        ingresaCampo2 = new JTextField();
        ingresaCampo3 = new JTextField();
        ingresaCampo4 = new JTextField();
        insertarDatos2.setSize(600, 600);
        insertarDatos2.setLocationRelativeTo(null);
        insertarDatos2.setResizable(false);
        insertarDatos2.setLayout(null);
//
        campo1.setBounds(5, 50, 100, 30);
        campo2.setBounds(5, 100, 100, 30);
        campo3.setBounds(5, 150, 100, 30);
        campo4.setBounds(5, 200, 100, 30);
        listadetablas.setBounds(350, 50, 100, 30);
        boton1.setBounds(5, 250, 100, 30);
        boton2.setBounds(150, 300, 150, 30);
        //
        ingresaCampo1.setBounds(155, 50, 100, 30);
        ingresaCampo2.setBounds(155, 100, 100, 30);
        ingresaCampo3.setBounds(155, 150, 100, 30);
        ingresaCampo4.setBounds(155, 200, 100, 30);
        //
        // System.out.println(simulador.contarTablas());
        simulador.recorrer2();
        String[] nombressTablas = simulador.recorrer2();
        int i = simulador.contarTablas();
        listadetablas.setModel(new DefaultComboBoxModel(nombressTablas));
        // i++;
        for (int x = 0; x < i; x++) {
            nombressTablas = simulador.recorrer2();
            // nombressTablas[x]= nombressTablas.getClass().cast(simulador.getInicio().getNombre()).toString();
            System.out.println("Nombre de las tablitas " + nombressTablas[x]);
                   //  System.out.println(nombressTablas[x]);

            System.out.println("aaaaaa");
            i++;
        }

        System.out.println("nombres de las Tablas: " + nombressTablas);
        //
        //setModelo(listadetablas);
        insertarDatos2.add(campo1);
        insertarDatos2.add(campo2);
        insertarDatos2.add(campo3);
        insertarDatos2.add(campo4);
        insertarDatos2.add(boton1);
        insertarDatos2.add(boton2);
        insertarDatos2.add(listadetablas);
        insertarDatos2.add(ingresaCampo1);
        insertarDatos2.add(ingresaCampo2);
        insertarDatos2.add(ingresaCampo3);
        insertarDatos2.add(ingresaCampo4);
        insertarDatos2.setVisible(true);
        insertarDatos2.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
     private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        /* tabla.setNombre(NombreTabla.getText());
         simulador.añadirTabla(tabla);
         campo.setNombre(NombreColumna1.getText());
         campo.setNombre(NombreColumna2.getText());
         campo.setNombre(NombreColumna3.getText());
         campo.setNombre(NombreColumna4.getText());
         tabla.insertarCampo(campo);
         //campo.recorrer();
         //System.out.println(tabla.getNombre()+"-");*/
       // simula2.insertarFinalTabla(NombreTabla.getText());
        simulador.buscarTabla(listadetablas.getToolTipText());
        simulador.recorrer();
        principio.tabla.insertarFinalCampo( ingresaCampo1.getText());
        principio.tabla.insertarFinalCampo( ingresaCampo2.getText());
        principio.tabla.insertarFinalCampo( ingresaCampo3.getText());
        principio.tabla.insertarFinalCampo( ingresaCampo4.getText());
        System.out.println("Numero de tablas: "+simulador.contarTablas());
    }     

}
