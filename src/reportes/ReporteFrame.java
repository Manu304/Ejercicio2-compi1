/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reportes;

import java.util.ArrayList;
import javax.swing.table.*;
import token.*;

/**
 *
 * @author manu
 */
public class ReporteFrame extends javax.swing.JFrame {
    
    ArrayList<Vocal> vocales;
    ArrayList<Numero> numeros;

    /**
     * Creates new form ReporteFrame
     */
    public ReporteFrame(ArrayList<Vocal> vocales, ArrayList<Numero> numeros) {
        this.vocales = vocales;
        this.numeros = numeros;
        initComponents();
        actualizarTabla();
        resultadoVocales();
    }
    
    public void actualizarTabla() {
        int columnas = 4;
        int filas = numeros.size();
        Object[][] datos = new Object[filas][columnas];

        for (int i = 0; i < numeros.size(); i++) {
            datos[i] = new Object[]{numeros.get(i).getLexema(), numeros.get(i).getFila(), numeros.get(i).getColumna(), numeros.get(i).getTipo()};
        }
        
        tablaTokens.setModel(new DefaultTableModel(datos, new String[]{"Lexema", "Fila", "Columna", "Tipo Token"}) {
            boolean[] canEdit = new boolean[] { false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }
    
    public void resultadoVocales(){
        labelVocales.setText("Palabras con 1 vocal: " + Vocal.getCounterOneVocal()
                        + "\nPalabras con 2 vocales: " + Vocal.getCounterTwoVocal()
                        + "\nPalabras con 3 vocales: " + Vocal.getCounterThreeVocal()
                        + "\nPalabras con 4 vocales: " + Vocal.getCounterFourVocal()
                        + "\nPalabras con 5 vocales: " + Vocal.getCounterFiveVocal());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVocales = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelVocales = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTokens = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes");
        setPreferredSize(new java.awt.Dimension(600, 600));

        panelVocales.setLayout(new java.awt.BorderLayout());

        labelVocales.setEditable(false);
        labelVocales.setColumns(20);
        labelVocales.setRows(5);
        labelVocales.setFocusable(false);
        jScrollPane2.setViewportView(labelVocales);

        panelVocales.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelVocales, java.awt.BorderLayout.WEST);

        jPanel1.setLayout(new java.awt.BorderLayout());

        tablaTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaTokens.setMinimumSize(new java.awt.Dimension(700, 900));
        jScrollPane1.setViewportView(tablaTokens);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Tabla de Números Enteros");
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea labelVocales;
    private javax.swing.JPanel panelVocales;
    private javax.swing.JTable tablaTokens;
    // End of variables declaration//GEN-END:variables
}
