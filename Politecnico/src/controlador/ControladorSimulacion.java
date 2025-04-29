/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.VentanaPrincipal;
import modelo.Simulador;
import modelo.Metrica;

import java.awt.event.*;

public class ControladorSimulacion {
    private VentanaPrincipal vista;
    private Simulador simulador;

    public ControladorSimulacion(VentanaPrincipal vista, Simulador simulador) {
        this.vista = vista;
        this.simulador = simulador;
        initEventos();
    }

    private void initEventos() {
        vista.btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                simular(10);
            }
        });

        vista.btn100.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                simular(100);
            }
        });

        vista.btn1000.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                simular(1000);
            }
        });
    }

    private void simular(int cantidad) {
        Metrica m = simulador.simularUsuarios(cantidad);
        vista.mostrarResultado(m, cantidad);
    }
}
