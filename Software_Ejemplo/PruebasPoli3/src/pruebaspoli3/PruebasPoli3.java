/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli3;

import javax.swing.*;

/**
 *
 * @author Harol
 */
public class PruebasPoli3 extends JFrame {

    private JTextField campoUsuario;
    private JPasswordField campoContrasena;
    private JButton botonValidar;
    private JLabel etiquetaResultado;

    // Credenciales simuladas
    private final String usuarioCorrecto = "Harol";
    private final String contrasenaCorrecta = "Torres";

    public PruebasPoli3() {
        setTitle("Validador de Credenciales - PruebasPoli3");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Centrar ventana
        setLocationRelativeTo(null);

        JLabel etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setBounds(30, 30, 100, 25);
        add(etiquetaUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(130, 30, 200, 25);
        add(campoUsuario);

        JLabel etiquetaContrasena = new JLabel("Contrasena:");
        etiquetaContrasena.setBounds(30, 70, 100, 25);
        add(etiquetaContrasena);

        campoContrasena = new JPasswordField();
        campoContrasena.setBounds(130, 70, 200, 25);
        add(campoContrasena);

        botonValidar = new JButton("Validar acceso");
        botonValidar.setBounds(130, 110, 150, 30);
        add(botonValidar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(30, 160, 300, 25);
        add(etiquetaResultado);

        botonValidar.addActionListener(e -> validarCredenciales());
    }

    // Metodo para validar usuario y contraseña
    private void validarCredenciales() {
        String usuario = campoUsuario.getText();
        String contrasena = new String(campoContrasena.getPassword());

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            etiquetaResultado.setText("Acceso concedido: credenciales validas");
        } else {
            etiquetaResultado.setText("Acceso denegado: credenciales incorrectas");
        }
    }

    // Metodo principal
    public static void main(String[] args) {
        PruebasPoli3 ventana = new PruebasPoli3();
        ventana.setVisible(true);
    }
}
