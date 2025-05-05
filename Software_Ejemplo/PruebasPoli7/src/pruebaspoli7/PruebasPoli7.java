/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli7;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harol
 */
public class PruebasPoli7 extends JFrame {

    private JTable tablaInventario;
    private JButton botonActualizar;
    private JTextField campoCantidad;
    private DefaultTableModel modeloTabla;

    public PruebasPoli7() {
        setTitle("Gestión de Inventario - PruebasPoli7");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centra la ventana

        // Datos de ejemplo del inventario
        String[] columnas = {"ID", "Producto", "Cantidad"};
        String[][] datos = {
            {"1", "Teclado", "25"},
            {"2", "Mouse", "40"},
            {"3", "Monitor", "10"}
        };

        modeloTabla = new DefaultTableModel(datos, columnas);
        tablaInventario = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaInventario);
        scrollPane.setBounds(30, 30, 420, 150);
        add(scrollPane);

        JLabel etiquetaCantidad = new JLabel("Nueva Cantidad:");
        etiquetaCantidad.setBounds(30, 190, 150, 25);
        add(etiquetaCantidad);

        campoCantidad = new JTextField();
        campoCantidad.setBounds(150, 190, 100, 25);
        add(campoCantidad);

        botonActualizar = new JButton("Actualizar Cantidad");
        botonActualizar.setBounds(270, 190, 180, 30);
        add(botonActualizar);

        botonActualizar.addActionListener(e -> actualizarCantidad());
    }

    // Metodo para actualizar la cantidad del producto seleccionado
    private void actualizarCantidad() {
        int filaSeleccionada = tablaInventario.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1) {
            try {
                // Obtener la nueva cantidad desde el campo de texto
                int nuevaCantidad = Integer.parseInt(campoCantidad.getText());
                modeloTabla.setValueAt(nuevaCantidad, filaSeleccionada, 2); // Actualizar cantidad en la tabla
                campoCantidad.setText(""); // Limpiar el campo de texto
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido para la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Metodo principal
    public static void main(String[] args) {
        PruebasPoli7 ventana = new PruebasPoli7();
        ventana.setVisible(true);
    }
}