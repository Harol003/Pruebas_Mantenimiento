/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli2;

import javax.swing.*;

/**
 *
 * @author Harol
 */
public class PruebasPoli2 extends JFrame {

    private JTextField campoNumero1;
    private JTextField campoNumero2;
    private JTextField campoResultado;
    private JButton botonProbar;
    private JLabel etiquetaResultado;

    public PruebasPoli2() {
        setTitle("Simulador de Prueba de Suma - PruebasPoli2");
        setSize(420, 280);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Centramos la ventana
        setLocationRelativeTo(null);

        JLabel etiqueta1 = new JLabel("Numero 1:");
        etiqueta1.setBounds(20, 20, 100, 25);
        add(etiqueta1);

        campoNumero1 = new JTextField();
        campoNumero1.setBounds(120, 20, 250, 25);
        add(campoNumero1);

        JLabel etiqueta2 = new JLabel("Numero 2:");
        etiqueta2.setBounds(20, 60, 100, 25);
        add(etiqueta2);

        campoNumero2 = new JTextField();
        campoNumero2.setBounds(120, 60, 250, 25);
        add(campoNumero2);

        JLabel etiqueta3 = new JLabel("Resultado esperado:");
        etiqueta3.setBounds(20, 100, 150, 25);
        add(etiqueta3);

        campoResultado = new JTextField();
        campoResultado.setBounds(170, 100, 200, 25);
        add(campoResultado);

        botonProbar = new JButton("Probar suma");
        botonProbar.setBounds(140, 140, 120, 30);
        add(botonProbar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(20, 180, 380, 25);
        add(etiquetaResultado);

        // Agregamos logica de prueba
        botonProbar.addActionListener(e -> probarSuma());
    }

    // Metodo para verificar si la suma es correcta
    private void probarSuma() {
        try {
            int numero1 = Integer.parseInt(campoNumero1.getText());
            int numero2 = Integer.parseInt(campoNumero2.getText());
            int resultadoEsperado = Integer.parseInt(campoResultado.getText());

            int resultadoReal = numero1 + numero2;

            if (resultadoReal == resultadoEsperado) {
                etiquetaResultado.setText("Prueba exitosa: suma correcta");
            } else {
                etiquetaResultado.setText("Error: resultado incorrecto, la suma real es " + resultadoReal);
            }
        } catch (NumberFormatException ex) {
            etiquetaResultado.setText("Error: todos los campos deben ser numeros validos");
        }
    }

    // Metodo principal
    public static void main(String[] args) {
        PruebasPoli2 ventana = new PruebasPoli2();
        ventana.setVisible(true);
    }
}