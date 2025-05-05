/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli11;

import javax.swing.*;
/**
 *
 * @author Harol
 */
public class PruebasPoli11 extends JFrame {

    private JTextField campoUsuario;
    private JPasswordField campoContrasena;
    private JButton botonIngresar;

    public PruebasPoli11() {
        setTitle("Inicio de Sesion - PruebasPoli11");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centrar la ventana

        JLabel etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setBounds(30, 30, 100, 25);
        add(etiquetaUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(120, 30, 150, 25);
        add(campoUsuario);

        JLabel etiquetaContrasena = new JLabel("Contrasena:");
        etiquetaContrasena.setBounds(30, 70, 100, 25);
        add(etiquetaContrasena);

        campoContrasena = new JPasswordField();
        campoContrasena.setBounds(120, 70, 150, 25);
        add(campoContrasena);

        botonIngresar = new JButton("Ingresar");
        botonIngresar.setBounds(120, 110, 100, 30);
        add(botonIngresar);

        // Acción al hacer clic en Ingresar
        botonIngresar.addActionListener(e -> validarCredenciales());
    }

    // Método para validar el usuario y la contraseña
    private void validarCredenciales() {
        String usuario = campoUsuario.getText();
        String contrasena = new String(campoContrasena.getPassword());

        // Usuario y contraseña simulados (puedes simular base de datos después)
        if (usuario.equals("Harol") && contrasena.equals("Torres")) {
            JOptionPane.showMessageDialog(this, "Ingreso exitoso. Bienvenido/a " + usuario + "!");
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Limpiar campos después del intento
        campoUsuario.setText("");
        campoContrasena.setText("");
    }

    // Método principal
    public static void main(String[] args) {
        PruebasPoli11 ventana = new PruebasPoli11();
        ventana.setVisible(true);
    }
}
