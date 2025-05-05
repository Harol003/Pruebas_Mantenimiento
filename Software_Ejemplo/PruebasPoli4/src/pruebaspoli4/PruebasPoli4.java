/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli4;

import javax.swing.*;
/**
 *
 * @author Harol
 */
public class PruebasPoli4 extends JFrame {

    private JTextField campoEdad;
    private JButton botonValidar;
    private JLabel etiquetaResultado;

    public PruebasPoli4() {
        setTitle("Validador de Edad - PruebasPoli4");
        setSize(400, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centra la ventana al ejecutar

        JLabel etiqueta = new JLabel("Ingrese su edad:");
        etiqueta.setBounds(30, 30, 150, 25);
        add(etiqueta);

        campoEdad = new JTextField();
        campoEdad.setBounds(150, 30, 200, 25);
        add(campoEdad);

        botonValidar = new JButton("Validar edad");
        botonValidar.setBounds(120, 70, 150, 30);
        add(botonValidar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(30, 120, 340, 25);
        add(etiquetaResultado);

        botonValidar.addActionListener(e -> validarEdad());
    }

    // Metodo que valida si la edad esta dentro de un rango permitido
    private void validarEdad() {
        try {
            int edad = Integer.parseInt(campoEdad.getText());

            if (edad >= 18 && edad <= 60) {
                etiquetaResultado.setText("Edad valida: dentro del rango permitido.");
            } else {
                etiquetaResultado.setText("Edad fuera de rango (debe ser entre 18 y 60).");
            }

        } catch (NumberFormatException ex) {
            etiquetaResultado.setText("Error: ingrese un numero entero valido.");
        }
    }

    // Metodo principal
    public static void main(String[] args) {
        PruebasPoli4 ventana = new PruebasPoli4();
        ventana.setVisible(true);
    }
}