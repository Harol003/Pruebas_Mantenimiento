/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harol
 */
public class PruebasPoli10 extends JFrame {

    private JTable tablaInventario;
    private JButton botonAgregar, botonActualizar, botonEliminar;
    private JTextField campoNombre, campoPrecio, campoCantidad;
    private DefaultTableModel modeloTabla;

    public PruebasPoli10() {
        setTitle("Gestión de Inventario - PruebasPoli10");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centra la ventana

        // Definir las columnas de la tabla
        String[] columnas = {"Nombre", "Precio", "Cantidad"};
        modeloTabla = new DefaultTableModel(null, columnas);
        tablaInventario = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaInventario);
        scrollPane.setBounds(30, 30, 520, 150);
        add(scrollPane);

        // Campos para ingresar datos del producto
        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setBounds(30, 200, 100, 25);
        add(etiquetaNombre);

        campoNombre = new JTextField();
        campoNombre.setBounds(130, 200, 150, 25);
        add(campoNombre);

        JLabel etiquetaPrecio = new JLabel("Precio:");
        etiquetaPrecio.setBounds(30, 230, 100, 25);
        add(etiquetaPrecio);

        campoPrecio = new JTextField();
        campoPrecio.setBounds(130, 230, 150, 25);
        add(campoPrecio);

        JLabel etiquetaCantidad = new JLabel("Cantidad:");
        etiquetaCantidad.setBounds(30, 260, 100, 25);
        add(etiquetaCantidad);

        campoCantidad = new JTextField();
        campoCantidad.setBounds(130, 260, 150, 25);
        add(campoCantidad);

        // Botón para agregar un nuevo producto
        botonAgregar = new JButton("Agregar Producto");
        botonAgregar.setBounds(290, 200, 150, 30);
        add(botonAgregar);

        // Botón para actualizar la cantidad de un producto
        botonActualizar = new JButton("Actualizar Cantidad");
        botonActualizar.setBounds(290, 230, 150, 30);
        add(botonActualizar);

        // Botón para eliminar un producto
        botonEliminar = new JButton("Eliminar Producto");
        botonEliminar.setBounds(290, 260, 150, 30);
        add(botonEliminar);

        // Acción para agregar un producto
        botonAgregar.addActionListener(e -> agregarProducto());

        // Acción para actualizar la cantidad de un producto
        botonActualizar.addActionListener(e -> actualizarCantidad());

        // Acción para eliminar un producto
        botonEliminar.addActionListener(e -> eliminarProducto());
    }

    // Método para agregar un producto a la tabla
    private void agregarProducto() {
        String nombre = campoNombre.getText();
        String precioStr = campoPrecio.getText();
        String cantidadStr = campoCantidad.getText();

        // Validar que los campos no estén vacíos
        if (nombre.isEmpty() || precioStr.isEmpty() || cantidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double precio = Double.parseDouble(precioStr);
            int cantidad = Integer.parseInt(cantidadStr);

            // Agregar producto a la tabla
            String[] producto = {nombre, String.valueOf(precio), String.valueOf(cantidad)};
            modeloTabla.addRow(producto);

            // Limpiar los campos después de agregar
            campoNombre.setText("");
            campoPrecio.setText("");
            campoCantidad.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio y la cantidad deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para actualizar la cantidad de un producto
    private void actualizarCantidad() {
        int filaSeleccionada = tablaInventario.getSelectedRow();

        if (filaSeleccionada != -1) {
            String cantidadStr = JOptionPane.showInputDialog(this, "Ingrese la nueva cantidad:");

            try {
                int nuevaCantidad = Integer.parseInt(cantidadStr);
                modeloTabla.setValueAt(String.valueOf(nuevaCantidad), filaSeleccionada, 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para eliminar un producto
    private void eliminarProducto() {
        int filaSeleccionada = tablaInventario.getSelectedRow();

        if (filaSeleccionada != -1) {
            modeloTabla.removeRow(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método principal
    public static void main(String[] args) {
        PruebasPoli10 ventana = new PruebasPoli10();
        ventana.setVisible(true);
    }
}
