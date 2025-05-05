/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli5;

import javax.swing.*;
/**
 *
 * @author Harol
 */
public class PruebasPoli5 extends JFrame {

    private JComboBox<String> comboTipoPrueba;
    private JButton botonMostrar;
    private JLabel etiquetaResultado;

    public PruebasPoli5() {
        setTitle("Selector de Tipo de Prueba - PruebasPoli5");
        setSize(450, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centra la ventana

        JLabel etiquetaSeleccion = new JLabel("Seleccione el tipo de prueba:");
        etiquetaSeleccion.setBounds(30, 30, 200, 25);
        add(etiquetaSeleccion);

        String[] tiposPrueba = {
            "Caja negra", 
            "Caja blanca", 
            "Regresion", 
            "Aceptacion del usuario"
        };

        comboTipoPrueba = new JComboBox<>(tiposPrueba);
        comboTipoPrueba.setBounds(230, 30, 180, 25);
        add(comboTipoPrueba);

        botonMostrar = new JButton("Mostrar descripcion");
        botonMostrar.setBounds(130, 70, 180, 30);
        add(botonMostrar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(30, 120, 380, 25);
        add(etiquetaResultado);

        botonMostrar.addActionListener(e -> mostrarDescripcion());
    }

    // Metodo que muestra una descripcion segun el tipo de prueba seleccionado
    private void mostrarDescripcion() {
        String seleccion = (String) comboTipoPrueba.getSelectedItem();

        switch (seleccion) {
            case "Caja negra":
                etiquetaResultado.setText("Prueba sin conocer el codigo fuente.");
                break;
            case "Caja blanca":
                etiquetaResultado.setText("Prueba basada en la logica interna del codigo.");
                break;
            case "Regresion":
                etiquetaResultado.setText("Verifica que los cambios no rompan funciones anteriores.");
                break;
            case "Aceptacion del usuario":
                etiquetaResultado.setText("Prueba si el sistema cumple con los requisitos del cliente.");
                break;
            default:
                etiquetaResultado.setText("Seleccione un tipo de prueba.");
        }
    }

    // Metodo principal
    public static void main(String[] args) {
        PruebasPoli5 ventana = new PruebasPoli5();
        ventana.setVisible(true);
    }
}
