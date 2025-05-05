/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificadorcontrasena;

import javax.swing.*;
/**
 *
 * @author Harol
 */
public class VerificadorContrasena extends JFrame {

    private JTextField campoContrasena;
    private JButton botonVerificar;
    private JLabel etiquetaResultado;

    public VerificadorContrasena() {
        setTitle("Verificador de Contrasenas - PruebasPoli");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Centramos la ventana al iniciar
        setLocationRelativeTo(null);

        JLabel etiquetaContrasena = new JLabel("Ingrese una contrasena:");
        etiquetaContrasena.setBounds(20, 20, 200, 25);
        add(etiquetaContrasena);

        campoContrasena = new JTextField();
        campoContrasena.setBounds(20, 50, 250, 25);
        add(campoContrasena);

        botonVerificar = new JButton("Verificar");
        botonVerificar.setBounds(280, 50, 90, 25);
        add(botonVerificar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(20, 90, 350, 25);
        add(etiquetaResultado);

        // Agregamos la accion al boton
        botonVerificar.addActionListener(e -> verificarContrasena());
    }

    // Metodo que realiza la verificacion de la contrasena
    private void verificarContrasena() {
        String contrasena = campoContrasena.getText();

        // Reglas basicas
        if (contrasena.length() < 8) {
            etiquetaResultado.setText("Error: debe tener al menos 8 caracteres");
            return;
        }

        if (!contrasena.matches(".*\\d.*")) {
            etiquetaResultado.setText("Error: debe tener al menos un numero");
            return;
        }

        if (!contrasena.matches(".*[A-Z].*")) {
            etiquetaResultado.setText("Error: debe tener una letra mayuscula");
            return;
        }

        etiquetaResultado.setText("Contrasena valida. Prueba exitosa.");
    }

    // Metodo principal
    public static void main(String[] args) {
        VerificadorContrasena ventana = new VerificadorContrasena();
        ventana.setVisible(true);
    }
}