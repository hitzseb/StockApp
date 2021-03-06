/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProductosJpaController;
import controller.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Productos;

/**
 *
 * @author Sebastian
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        fieldProducto = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        fieldCantidad = new javax.swing.JTextField();
        fieldPrecio = new javax.swing.JTextField();
        botonBorrar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        botonAgregar.setText("Agregar");
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarMouseClicked(evt);
            }
        });

        botonEditar.setText("Editar");
        botonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarMouseClicked(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBorrarMouseClicked(evt);
            }
        });

        botonMostrar.setText("Mostrar");
        botonMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMostrarMouseClicked(evt);
            }
        });

        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label1.setText("Producto:");

        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label2.setText("Cantidad:");

        label3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        label3.setText("Precio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(fieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2)
                    .addComponent(fieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3)
                    .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(botonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(botonBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(botonMostrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMostrarMouseClicked
        ProductosJpaController productosJpa = new ProductosJpaController();
        List<Productos> lista = new ArrayList<>();
        lista = productosJpa.findProductosEntities();
        DefaultTableModel model=(DefaultTableModel)tabla.getModel();
        model.setRowCount(0);
        for (int i = 0; i < lista.size(); i++)
        {
            model.addRow(new Object[]{lista.get(i).getNombre(), lista.get(i).getCantidad(), lista.get(i).getPrecio()});
        }
    }//GEN-LAST:event_botonMostrarMouseClicked

    private void botonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseClicked
        Productos productos = new Productos();
        ProductosJpaController productosJpa = new ProductosJpaController();
        List<Productos> lista = new ArrayList<>();
        lista = productosJpa.findProductosEntities();
        for (int i = 0; i < lista.size(); i++) {
            if ( lista.get(i).getNombre().equalsIgnoreCase(this.fieldProducto.getText())) {
                try {
                    productosJpa.destroy(lista.get(i).getIdProducto());
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Borrado exitoso");
    }//GEN-LAST:event_botonBorrarMouseClicked

    private void botonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMouseClicked
        Productos productos = new Productos();
        ProductosJpaController productosJpa = new ProductosJpaController();
        List<Productos> lista = new ArrayList<>();
        lista = productosJpa.findProductosEntities();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(this.fieldProducto.getText())) {
                if (lista.get(i).getCantidad() != Integer.parseInt(this.fieldCantidad.getText())) {
                    try {
                        lista.get(i).setCantidad(Integer.parseInt(this.fieldCantidad.getText()));
                        productosJpa.edit(lista.get(i));
                    } catch (Exception ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (lista.get(i).getPrecio() != Double.parseDouble(this.fieldPrecio.getText())) {
                    try {
                        lista.get(i).setPrecio(Double.parseDouble(this.fieldPrecio.getText()));
                        productosJpa.edit(lista.get(i));
                    } catch (Exception ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Edici??n exitosa");
    }//GEN-LAST:event_botonEditarMouseClicked

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        Productos productos = new Productos();
        ProductosJpaController productosJpa = new ProductosJpaController();
        productos.setNombre(this.fieldProducto.getText());
        productos.setCantidad(Integer.parseInt(this.fieldCantidad.getText()));
        productos.setPrecio(Double.parseDouble(this.fieldPrecio.getText()));
        productosJpa.create(productos);
        this.fieldProducto.setText("");
        this.fieldCantidad.setText("");
        this.fieldPrecio.setText("");
        JOptionPane.showMessageDialog(null, "Creaci??n exitosa");
    }//GEN-LAST:event_botonAgregarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JTextField fieldCantidad;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JTextField fieldProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
