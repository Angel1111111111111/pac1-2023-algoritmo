/* 
* Autor: Andrés Felipe Martínez Muñoz
* Ing. de Sistemas - 3er Semestre - Universidad Autónoma del Caribe, Barranquilla, Colombia    
 */
package GUI;

import Sudoku.matriz.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class SudokuOriginal extends javax.swing.JFrame {

    Matriz sudo = new Matriz();
    int m2[][] = new int[9][9];

    public SudokuOriginal() {
        initComponents();

        labelStart.setVisible(false);
        labelInd.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt1_2 = new javax.swing.JTextField();
        txt1_1 = new javax.swing.JTextField();
        txt1_3 = new javax.swing.JTextField();
        txt2_1 = new javax.swing.JTextField();
        txt2_2 = new javax.swing.JTextField();
        txt2_3 = new javax.swing.JTextField();
        txt3_1 = new javax.swing.JTextField();
        txt3_2 = new javax.swing.JTextField();
        txt3_3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt4_5 = new javax.swing.JTextField();
        txt4_4 = new javax.swing.JTextField();
        txt4_6 = new javax.swing.JTextField();
        txt5_4 = new javax.swing.JTextField();
        txt5_5 = new javax.swing.JTextField();
        txt5_6 = new javax.swing.JTextField();
        txt6_4 = new javax.swing.JTextField();
        txt6_5 = new javax.swing.JTextField();
        txt6_6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt7_2 = new javax.swing.JTextField();
        txt7_1 = new javax.swing.JTextField();
        txt7_3 = new javax.swing.JTextField();
        txt8_1 = new javax.swing.JTextField();
        txt8_2 = new javax.swing.JTextField();
        txt8_3 = new javax.swing.JTextField();
        txt9_1 = new javax.swing.JTextField();
        txt9_2 = new javax.swing.JTextField();
        txt9_3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txt1_5 = new javax.swing.JTextField();
        txt1_4 = new javax.swing.JTextField();
        txt1_6 = new javax.swing.JTextField();
        txt2_4 = new javax.swing.JTextField();
        txt2_5 = new javax.swing.JTextField();
        txt2_6 = new javax.swing.JTextField();
        txt3_4 = new javax.swing.JTextField();
        txt3_5 = new javax.swing.JTextField();
        txt3_6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txt4_8 = new javax.swing.JTextField();
        txt4_7 = new javax.swing.JTextField();
        txt4_9 = new javax.swing.JTextField();
        txt5_7 = new javax.swing.JTextField();
        txt5_8 = new javax.swing.JTextField();
        txt5_9 = new javax.swing.JTextField();
        txt6_7 = new javax.swing.JTextField();
        txt6_8 = new javax.swing.JTextField();
        txt6_9 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txt1_8 = new javax.swing.JTextField();
        txt1_7 = new javax.swing.JTextField();
        txt1_9 = new javax.swing.JTextField();
        txt2_7 = new javax.swing.JTextField();
        txt2_8 = new javax.swing.JTextField();
        txt2_9 = new javax.swing.JTextField();
        txt3_7 = new javax.swing.JTextField();
        txt3_8 = new javax.swing.JTextField();
        txt3_9 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txt7_8 = new javax.swing.JTextField();
        txt7_7 = new javax.swing.JTextField();
        txt7_9 = new javax.swing.JTextField();
        txt8_7 = new javax.swing.JTextField();
        txt8_8 = new javax.swing.JTextField();
        txt8_9 = new javax.swing.JTextField();
        txt9_7 = new javax.swing.JTextField();
        txt9_8 = new javax.swing.JTextField();
        txt9_9 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        txt4_2 = new javax.swing.JTextField();
        txt4_1 = new javax.swing.JTextField();
        txt4_3 = new javax.swing.JTextField();
        txt5_1 = new javax.swing.JTextField();
        txt5_2 = new javax.swing.JTextField();
        txt5_3 = new javax.swing.JTextField();
        txt6_1 = new javax.swing.JTextField();
        txt6_2 = new javax.swing.JTextField();
        txt6_3 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        txt7_5 = new javax.swing.JTextField();
        txt7_4 = new javax.swing.JTextField();
        txt7_6 = new javax.swing.JTextField();
        txt8_4 = new javax.swing.JTextField();
        txt8_5 = new javax.swing.JTextField();
        txt8_6 = new javax.swing.JTextField();
        txt9_4 = new javax.swing.JTextField();
        txt9_5 = new javax.swing.JTextField();
        txt9_6 = new javax.swing.JTextField();
        btnCargarMatriz = new javax.swing.JButton();
        labelInicio = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnIntentar = new javax.swing.JButton();
        labelStart = new javax.swing.JLabel();
        labelInd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt1_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_2.setBorder(null);
        txt1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_2KeyTyped(evt);
            }
        });

        txt1_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_1.setBorder(null);
        txt1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_1KeyTyped(evt);
            }
        });

        txt1_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_3.setBorder(null);
        txt1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_3KeyTyped(evt);
            }
        });

        txt2_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_1.setBorder(null);
        txt2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_1KeyTyped(evt);
            }
        });

        txt2_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_2.setBorder(null);
        txt2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_2KeyTyped(evt);
            }
        });

        txt2_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_3.setBorder(null);
        txt2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_3KeyTyped(evt);
            }
        });

        txt3_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_1.setBorder(null);
        txt3_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_1KeyTyped(evt);
            }
        });

        txt3_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_2.setBorder(null);
        txt3_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_2KeyTyped(evt);
            }
        });

        txt3_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_3.setBorder(null);
        txt3_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt4_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_5.setBorder(null);
        txt4_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_5KeyTyped(evt);
            }
        });

        txt4_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_4.setBorder(null);
        txt4_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_4KeyTyped(evt);
            }
        });

        txt4_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_6.setBorder(null);
        txt4_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_6KeyTyped(evt);
            }
        });

        txt5_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_4.setBorder(null);
        txt5_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_4KeyTyped(evt);
            }
        });

        txt5_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_5.setBorder(null);
        txt5_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_5KeyTyped(evt);
            }
        });

        txt5_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_6.setBorder(null);
        txt5_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_6KeyTyped(evt);
            }
        });

        txt6_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_4.setBorder(null);
        txt6_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_4KeyTyped(evt);
            }
        });

        txt6_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_5.setBorder(null);
        txt6_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_5KeyTyped(evt);
            }
        });

        txt6_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_6.setBorder(null);
        txt6_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt7_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_2.setBorder(null);
        txt7_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_2KeyTyped(evt);
            }
        });

        txt7_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_1.setBorder(null);
        txt7_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_1KeyTyped(evt);
            }
        });

        txt7_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_3.setBorder(null);
        txt7_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_3KeyTyped(evt);
            }
        });

        txt8_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_1.setBorder(null);
        txt8_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_1KeyTyped(evt);
            }
        });

        txt8_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_2.setBorder(null);
        txt8_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_2KeyTyped(evt);
            }
        });

        txt8_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_3.setBorder(null);
        txt8_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_3KeyTyped(evt);
            }
        });

        txt9_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_1.setBorder(null);
        txt9_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_1KeyTyped(evt);
            }
        });

        txt9_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_2.setBorder(null);
        txt9_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_2KeyTyped(evt);
            }
        });

        txt9_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_3.setBorder(null);
        txt9_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txt7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txt8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txt9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt1_5.setBackground(new java.awt.Color(120, 255, 121));
        txt1_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_5.setBorder(null);
        txt1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_5KeyTyped(evt);
            }
        });

        txt1_4.setBackground(new java.awt.Color(120, 255, 121));
        txt1_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_4.setBorder(null);
        txt1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_4KeyTyped(evt);
            }
        });

        txt1_6.setBackground(new java.awt.Color(120, 255, 121));
        txt1_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_6.setBorder(null);
        txt1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_6KeyTyped(evt);
            }
        });

        txt2_4.setBackground(new java.awt.Color(120, 255, 121));
        txt2_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_4.setBorder(null);
        txt2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_4KeyTyped(evt);
            }
        });

        txt2_5.setBackground(new java.awt.Color(120, 255, 121));
        txt2_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_5.setBorder(null);
        txt2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_5KeyTyped(evt);
            }
        });

        txt2_6.setBackground(new java.awt.Color(120, 255, 121));
        txt2_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_6.setBorder(null);
        txt2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_6KeyTyped(evt);
            }
        });

        txt3_4.setBackground(new java.awt.Color(120, 255, 121));
        txt3_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_4.setBorder(null);
        txt3_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_4KeyTyped(evt);
            }
        });

        txt3_5.setBackground(new java.awt.Color(120, 255, 121));
        txt3_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_5.setBorder(null);
        txt3_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_5KeyTyped(evt);
            }
        });

        txt3_6.setBackground(new java.awt.Color(120, 255, 121));
        txt3_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_6.setBorder(null);
        txt3_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txt1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txt2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txt3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt4_8.setBackground(new java.awt.Color(120, 255, 121));
        txt4_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_8.setBorder(null);
        txt4_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_8KeyTyped(evt);
            }
        });

        txt4_7.setBackground(new java.awt.Color(120, 255, 121));
        txt4_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_7.setBorder(null);
        txt4_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_7KeyTyped(evt);
            }
        });

        txt4_9.setBackground(new java.awt.Color(120, 255, 121));
        txt4_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_9.setBorder(null);
        txt4_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_9KeyTyped(evt);
            }
        });

        txt5_7.setBackground(new java.awt.Color(120, 255, 121));
        txt5_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_7.setBorder(null);
        txt5_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_7KeyTyped(evt);
            }
        });

        txt5_8.setBackground(new java.awt.Color(120, 255, 121));
        txt5_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_8.setBorder(null);
        txt5_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_8KeyTyped(evt);
            }
        });

        txt5_9.setBackground(new java.awt.Color(120, 255, 121));
        txt5_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_9.setBorder(null);
        txt5_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_9KeyTyped(evt);
            }
        });

        txt6_7.setBackground(new java.awt.Color(120, 255, 121));
        txt6_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_7.setBorder(null);
        txt6_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_7KeyTyped(evt);
            }
        });

        txt6_8.setBackground(new java.awt.Color(120, 255, 121));
        txt6_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_8.setBorder(null);
        txt6_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_8KeyTyped(evt);
            }
        });

        txt6_9.setBackground(new java.awt.Color(120, 255, 121));
        txt6_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_9.setBorder(null);
        txt6_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txt4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txt5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txt6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt1_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_8.setBorder(null);
        txt1_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_8KeyTyped(evt);
            }
        });

        txt1_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_7.setBorder(null);
        txt1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_7KeyTyped(evt);
            }
        });

        txt1_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_9.setBorder(null);
        txt1_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_9KeyTyped(evt);
            }
        });

        txt2_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_7.setBorder(null);
        txt2_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_7KeyTyped(evt);
            }
        });

        txt2_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_8.setBorder(null);
        txt2_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_8KeyTyped(evt);
            }
        });

        txt2_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_9.setBorder(null);
        txt2_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_9KeyTyped(evt);
            }
        });

        txt3_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_7.setBorder(null);
        txt3_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_7KeyTyped(evt);
            }
        });

        txt3_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_8.setBorder(null);
        txt3_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_8KeyTyped(evt);
            }
        });

        txt3_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_9.setBorder(null);
        txt3_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txt1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txt2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txt3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt7_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_8.setBorder(null);
        txt7_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_8KeyTyped(evt);
            }
        });

        txt7_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_7.setBorder(null);
        txt7_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_7KeyTyped(evt);
            }
        });

        txt7_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_9.setBorder(null);
        txt7_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_9KeyTyped(evt);
            }
        });

        txt8_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_7.setBorder(null);
        txt8_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_7KeyTyped(evt);
            }
        });

        txt8_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_8.setBorder(null);
        txt8_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_8KeyTyped(evt);
            }
        });

        txt8_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_9.setBorder(null);
        txt8_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_9KeyTyped(evt);
            }
        });

        txt9_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_7.setBorder(null);
        txt9_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_7KeyTyped(evt);
            }
        });

        txt9_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_8.setBorder(null);
        txt9_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_8KeyTyped(evt);
            }
        });

        txt9_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_9.setBorder(null);
        txt9_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(txt7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(txt8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(txt9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt4_2.setBackground(new java.awt.Color(120, 255, 121));
        txt4_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_2.setBorder(null);
        txt4_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_2KeyTyped(evt);
            }
        });

        txt4_1.setBackground(new java.awt.Color(120, 255, 121));
        txt4_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_1.setBorder(null);
        txt4_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_1KeyTyped(evt);
            }
        });

        txt4_3.setBackground(new java.awt.Color(120, 255, 121));
        txt4_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_3.setBorder(null);
        txt4_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_3KeyTyped(evt);
            }
        });

        txt5_1.setBackground(new java.awt.Color(120, 255, 121));
        txt5_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_1.setBorder(null);
        txt5_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_1KeyTyped(evt);
            }
        });

        txt5_2.setBackground(new java.awt.Color(120, 255, 121));
        txt5_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_2.setBorder(null);
        txt5_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_2KeyTyped(evt);
            }
        });

        txt5_3.setBackground(new java.awt.Color(120, 255, 121));
        txt5_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_3.setBorder(null);
        txt5_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_3KeyTyped(evt);
            }
        });

        txt6_1.setBackground(new java.awt.Color(120, 255, 121));
        txt6_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_1.setBorder(null);
        txt6_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_1KeyTyped(evt);
            }
        });

        txt6_2.setBackground(new java.awt.Color(120, 255, 121));
        txt6_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_2.setBorder(null);
        txt6_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_2KeyTyped(evt);
            }
        });

        txt6_3.setBackground(new java.awt.Color(120, 255, 121));
        txt6_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_3.setBorder(null);
        txt6_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txt4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txt5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txt6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt7_5.setBackground(new java.awt.Color(120, 255, 121));
        txt7_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_5.setBorder(null);
        txt7_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_5KeyTyped(evt);
            }
        });

        txt7_4.setBackground(new java.awt.Color(120, 255, 121));
        txt7_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_4.setBorder(null);
        txt7_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_4KeyTyped(evt);
            }
        });

        txt7_6.setBackground(new java.awt.Color(120, 255, 121));
        txt7_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_6.setBorder(null);
        txt7_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_6KeyTyped(evt);
            }
        });

        txt8_4.setBackground(new java.awt.Color(120, 255, 121));
        txt8_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_4.setBorder(null);
        txt8_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_4KeyTyped(evt);
            }
        });

        txt8_5.setBackground(new java.awt.Color(120, 255, 121));
        txt8_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_5.setBorder(null);
        txt8_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_5KeyTyped(evt);
            }
        });

        txt8_6.setBackground(new java.awt.Color(120, 255, 121));
        txt8_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_6.setBorder(null);
        txt8_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_6KeyTyped(evt);
            }
        });

        txt9_4.setBackground(new java.awt.Color(120, 255, 121));
        txt9_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_4.setBorder(null);
        txt9_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_4KeyTyped(evt);
            }
        });

        txt9_5.setBackground(new java.awt.Color(120, 255, 121));
        txt9_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_5.setBorder(null);
        txt9_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_5KeyTyped(evt);
            }
        });

        txt9_6.setBackground(new java.awt.Color(120, 255, 121));
        txt9_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_6.setBorder(null);
        txt9_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(txt7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(txt8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(txt9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCargarMatriz.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnCargarMatriz.setText("Cargar Matriz");
        btnCargarMatriz.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnCargarMatriz.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnCargarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarMatrizActionPerformed(evt);
            }
        });

        labelInicio.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelInicio.setText("Escriba la matriz del sudoku y haga clic en Cargar Matriz");

        btnReiniciar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnStart.setText("Iniciar Juego");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnIntentar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnIntentar.setText("Intentar");
        btnIntentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntentarActionPerformed(evt);
            }
        });

        labelStart.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelStart.setText("Empieza el juego! Llene los campos vacíos y complete el sudoku");

        labelInd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        labelInd.setText("Haga clic en Intentar para verificar el resultado de su sudoku");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInd)
                    .addComponent(labelStart)
                    .addComponent(labelInicio)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCargarMatriz)
                            .addComponent(btnReiniciar)
                            .addComponent(btnStart)
                            .addComponent(btnIntentar))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStart)
                .addGap(11, 11, 11)
                .addComponent(labelInd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCargarMatriz)
                                .addGap(18, 18, 18)
                                .addComponent(btnReiniciar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStart))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnIntentar))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_2KeyTyped

    private void txt1_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_1KeyTyped

    private void txt1_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_3KeyTyped

    private void txt2_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_1KeyTyped

    private void txt2_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_2KeyTyped

    private void txt2_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_3KeyTyped

    private void txt3_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_1KeyTyped

    private void txt3_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_2KeyTyped

    private void txt3_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_3KeyTyped

    private void txt4_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_5KeyTyped

    private void txt4_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_4KeyTyped

    private void txt4_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_6KeyTyped

    private void txt5_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_4KeyTyped

    private void txt5_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_5KeyTyped

    private void txt5_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_6KeyTyped

    private void txt6_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_4KeyTyped

    private void txt6_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_5KeyTyped

    private void txt6_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_6KeyTyped

    private void txt7_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_2KeyTyped

    private void txt7_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_1KeyTyped

    private void txt7_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_3KeyTyped

    private void txt8_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_1KeyTyped

    private void txt8_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_2KeyTyped

    private void txt8_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_3KeyTyped

    private void txt9_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_1KeyTyped

    private void txt9_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_2KeyTyped

    private void txt9_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_3KeyTyped

    private void txt1_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_5KeyTyped

    private void txt1_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_4KeyTyped

    private void txt1_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_6KeyTyped

    private void txt2_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_4KeyTyped

    private void txt2_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_5KeyTyped

    private void txt2_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_6KeyTyped

    private void txt3_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_4KeyTyped

    private void txt3_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_5KeyTyped

    private void txt3_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_6KeyTyped

    private void txt4_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_8KeyTyped

    private void txt4_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_7KeyTyped

    private void txt4_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_9KeyTyped

    private void txt5_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_7KeyTyped

    private void txt5_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_8KeyTyped

    private void txt5_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_9KeyTyped

    private void txt6_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_7KeyTyped

    private void txt6_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_8KeyTyped

    private void txt6_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_9KeyTyped

    private void txt1_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_8KeyTyped

    private void txt1_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_7KeyTyped

    private void txt1_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt1_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1_9KeyTyped

    private void txt2_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_7KeyTyped

    private void txt2_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_8KeyTyped

    private void txt2_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt2_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2_9KeyTyped

    private void txt3_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_7KeyTyped

    private void txt3_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_8KeyTyped

    private void txt3_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_9KeyTyped

        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt3_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3_9KeyTyped

    private void txt7_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_8KeyTyped

    private void txt7_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_7KeyTyped

    private void txt7_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_9KeyTyped

    private void txt8_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_7KeyTyped

    private void txt8_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_8KeyTyped

    private void txt8_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_9KeyTyped

    private void txt9_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_7KeyTyped

    private void txt9_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_8KeyTyped

    private void txt9_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_9KeyTyped

    private void txt4_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_2KeyTyped

    private void txt4_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_1KeyTyped

    private void txt4_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt4_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt4_3KeyTyped

    private void txt5_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_1KeyTyped

    private void txt5_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_2KeyTyped

    private void txt5_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt5_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt5_3KeyTyped

    private void txt6_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_1KeyTyped

    private void txt6_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_2KeyTyped

    private void txt6_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt6_3.getText().length() == 1) {
            evt.consume();
        }
        if (Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt6_3KeyTyped

    private void txt7_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_5KeyTyped

    private void txt7_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_4KeyTyped

    private void txt7_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt7_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt7_6KeyTyped

    private void txt8_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_4KeyTyped

    private void txt8_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_5KeyTyped

    private void txt8_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt8_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt8_6KeyTyped

    private void txt9_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_4KeyTyped

    private void txt9_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_5KeyTyped

    private void txt9_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (txt9_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txt9_6KeyTyped

    private void btnCargarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarMatrizActionPerformed

        try {
            cargarMatrizOriginal();
            if (checarFilas()) {
                JOptionPane.showMessageDialog(null, "No puede haber números repetidos en una misma fila, columna o región.",
                         "Error", JOptionPane.ERROR_MESSAGE);
            } else if (checarColumnas()) {
                JOptionPane.showMessageDialog(null, "No puede haber números repetidos en una misma fila, columna o región.",
                         "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar la matriz. Por favor, inténtelo de nuevo.",
                     "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCargarMatrizActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        labelInicio.setVisible(false);
        labelStart.setVisible(true);
        labelInd.setVisible(true);
        limpiarCampo();
        Random r = new Random();
        int cont = 1;
        while (cont <= 26) {
            int i = r.nextInt(9);
            int j = r.nextInt(9);
            colocarPista(i, j);
            cont++;
        }
        verificarCampoVacio();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        matrizCero();
        limpiarCampo();
        verificarCampoVacio();
        labelInicio.setVisible(true);
        labelStart.setVisible(false);
        labelInd.setVisible(false);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnIntentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntentarActionPerformed
        cargarMatrizPrueba();
        if (verificarResultado() == 81) {
            JOptionPane.showMessageDialog(null, "Resultado: Sudoku Completado", "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Resultado: Sudoku Incompleto", "Resultado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIntentarActionPerformed

    public void cargarMatrizOriginal() {
        sudo.m1[0][0] = Integer.parseInt(txt1_1.getText());
        sudo.m1[0][1] = Integer.parseInt(txt1_2.getText());
        sudo.m1[0][2] = Integer.parseInt(txt1_3.getText());
        sudo.m1[0][3] = Integer.parseInt(txt1_4.getText());
        sudo.m1[0][4] = Integer.parseInt(txt1_5.getText());
        sudo.m1[0][5] = Integer.parseInt(txt1_6.getText());
        sudo.m1[0][6] = Integer.parseInt(txt1_7.getText());
        sudo.m1[0][7] = Integer.parseInt(txt1_8.getText());
        sudo.m1[0][8] = Integer.parseInt(txt1_9.getText());
        sudo.m1[1][0] = Integer.parseInt(txt2_1.getText());
        sudo.m1[1][1] = Integer.parseInt(txt2_2.getText());
        sudo.m1[1][2] = Integer.parseInt(txt2_3.getText());
        sudo.m1[1][3] = Integer.parseInt(txt2_4.getText());
        sudo.m1[1][4] = Integer.parseInt(txt2_5.getText());
        sudo.m1[1][5] = Integer.parseInt(txt2_6.getText());
        sudo.m1[1][6] = Integer.parseInt(txt2_7.getText());
        sudo.m1[1][7] = Integer.parseInt(txt2_8.getText());
        sudo.m1[1][8] = Integer.parseInt(txt2_9.getText());
        sudo.m1[2][0] = Integer.parseInt(txt3_1.getText());
        sudo.m1[2][1] = Integer.parseInt(txt3_2.getText());
        sudo.m1[2][2] = Integer.parseInt(txt3_3.getText());
        sudo.m1[2][3] = Integer.parseInt(txt3_4.getText());
        sudo.m1[2][4] = Integer.parseInt(txt3_5.getText());
        sudo.m1[2][5] = Integer.parseInt(txt3_6.getText());
        sudo.m1[2][6] = Integer.parseInt(txt3_7.getText());
        sudo.m1[2][7] = Integer.parseInt(txt3_8.getText());
        sudo.m1[2][8] = Integer.parseInt(txt3_9.getText());
        sudo.m1[3][0] = Integer.parseInt(txt4_1.getText());
        sudo.m1[3][1] = Integer.parseInt(txt4_2.getText());
        sudo.m1[3][2] = Integer.parseInt(txt4_3.getText());
        sudo.m1[3][3] = Integer.parseInt(txt4_4.getText());
        sudo.m1[3][4] = Integer.parseInt(txt4_5.getText());
        sudo.m1[3][5] = Integer.parseInt(txt4_6.getText());
        sudo.m1[3][6] = Integer.parseInt(txt4_7.getText());
        sudo.m1[3][7] = Integer.parseInt(txt4_8.getText());
        sudo.m1[3][8] = Integer.parseInt(txt4_9.getText());
        sudo.m1[4][0] = Integer.parseInt(txt5_1.getText());
        sudo.m1[4][1] = Integer.parseInt(txt5_2.getText());
        sudo.m1[4][2] = Integer.parseInt(txt5_3.getText());
        sudo.m1[4][3] = Integer.parseInt(txt5_4.getText());
        sudo.m1[4][4] = Integer.parseInt(txt5_5.getText());
        sudo.m1[4][5] = Integer.parseInt(txt5_6.getText());
        sudo.m1[4][6] = Integer.parseInt(txt5_7.getText());
        sudo.m1[4][7] = Integer.parseInt(txt5_8.getText());
        sudo.m1[4][8] = Integer.parseInt(txt5_9.getText());
        sudo.m1[5][0] = Integer.parseInt(txt6_1.getText());
        sudo.m1[5][1] = Integer.parseInt(txt6_2.getText());
        sudo.m1[5][2] = Integer.parseInt(txt6_3.getText());
        sudo.m1[5][3] = Integer.parseInt(txt6_4.getText());
        sudo.m1[5][4] = Integer.parseInt(txt6_5.getText());
        sudo.m1[5][5] = Integer.parseInt(txt6_6.getText());
        sudo.m1[5][6] = Integer.parseInt(txt6_7.getText());
        sudo.m1[5][7] = Integer.parseInt(txt6_8.getText());
        sudo.m1[5][8] = Integer.parseInt(txt6_9.getText());
        sudo.m1[6][0] = Integer.parseInt(txt7_1.getText());
        sudo.m1[6][1] = Integer.parseInt(txt7_2.getText());
        sudo.m1[6][2] = Integer.parseInt(txt7_3.getText());
        sudo.m1[6][3] = Integer.parseInt(txt7_4.getText());
        sudo.m1[6][4] = Integer.parseInt(txt7_5.getText());
        sudo.m1[6][5] = Integer.parseInt(txt7_6.getText());
        sudo.m1[6][6] = Integer.parseInt(txt7_7.getText());
        sudo.m1[6][7] = Integer.parseInt(txt7_8.getText());
        sudo.m1[6][8] = Integer.parseInt(txt7_9.getText());
        sudo.m1[7][0] = Integer.parseInt(txt8_1.getText());
        sudo.m1[7][1] = Integer.parseInt(txt8_2.getText());
        sudo.m1[7][2] = Integer.parseInt(txt8_3.getText());
        sudo.m1[7][3] = Integer.parseInt(txt8_4.getText());
        sudo.m1[7][4] = Integer.parseInt(txt8_5.getText());
        sudo.m1[7][5] = Integer.parseInt(txt8_6.getText());
        sudo.m1[7][6] = Integer.parseInt(txt8_7.getText());
        sudo.m1[7][7] = Integer.parseInt(txt8_8.getText());
        sudo.m1[7][8] = Integer.parseInt(txt8_9.getText());
        sudo.m1[8][0] = Integer.parseInt(txt9_1.getText());
        sudo.m1[8][1] = Integer.parseInt(txt9_2.getText());
        sudo.m1[8][2] = Integer.parseInt(txt9_3.getText());
        sudo.m1[8][3] = Integer.parseInt(txt9_4.getText());
        sudo.m1[8][4] = Integer.parseInt(txt9_5.getText());
        sudo.m1[8][5] = Integer.parseInt(txt9_6.getText());
        sudo.m1[8][6] = Integer.parseInt(txt9_7.getText());
        sudo.m1[8][7] = Integer.parseInt(txt9_8.getText());
        sudo.m1[8][8] = Integer.parseInt(txt9_9.getText());
    }

    public void cargarMatrizPrueba() {
        m2[0][0] = Integer.parseInt(txt1_1.getText());
        m2[0][1] = Integer.parseInt(txt1_2.getText());
        m2[0][2] = Integer.parseInt(txt1_3.getText());
        m2[0][3] = Integer.parseInt(txt1_4.getText());
        m2[0][4] = Integer.parseInt(txt1_5.getText());
        m2[0][5] = Integer.parseInt(txt1_6.getText());
        m2[0][6] = Integer.parseInt(txt1_7.getText());
        m2[0][7] = Integer.parseInt(txt1_8.getText());
        m2[0][8] = Integer.parseInt(txt1_9.getText());
        m2[1][0] = Integer.parseInt(txt2_1.getText());
        m2[1][1] = Integer.parseInt(txt2_2.getText());
        m2[1][2] = Integer.parseInt(txt2_3.getText());
        m2[1][3] = Integer.parseInt(txt2_4.getText());
        m2[1][4] = Integer.parseInt(txt2_5.getText());
        m2[1][5] = Integer.parseInt(txt2_6.getText());
        m2[1][6] = Integer.parseInt(txt2_7.getText());
        m2[1][7] = Integer.parseInt(txt2_8.getText());
        m2[1][8] = Integer.parseInt(txt2_9.getText());
        m2[2][0] = Integer.parseInt(txt3_1.getText());
        m2[2][1] = Integer.parseInt(txt3_2.getText());
        m2[2][2] = Integer.parseInt(txt3_3.getText());
        m2[2][3] = Integer.parseInt(txt3_4.getText());
        m2[2][4] = Integer.parseInt(txt3_5.getText());
        m2[2][5] = Integer.parseInt(txt3_6.getText());
        m2[2][6] = Integer.parseInt(txt3_7.getText());
        m2[2][7] = Integer.parseInt(txt3_8.getText());
        m2[2][8] = Integer.parseInt(txt3_9.getText());
        m2[3][0] = Integer.parseInt(txt4_1.getText());
        m2[3][1] = Integer.parseInt(txt4_2.getText());
        m2[3][2] = Integer.parseInt(txt4_3.getText());
        m2[3][3] = Integer.parseInt(txt4_4.getText());
        m2[3][4] = Integer.parseInt(txt4_5.getText());
        m2[3][5] = Integer.parseInt(txt4_6.getText());
        m2[3][6] = Integer.parseInt(txt4_7.getText());
        m2[3][7] = Integer.parseInt(txt4_8.getText());
        m2[3][8] = Integer.parseInt(txt4_9.getText());
        m2[4][0] = Integer.parseInt(txt5_1.getText());
        m2[4][1] = Integer.parseInt(txt5_2.getText());
        m2[4][2] = Integer.parseInt(txt5_3.getText());
        m2[4][3] = Integer.parseInt(txt5_4.getText());
        m2[4][4] = Integer.parseInt(txt5_5.getText());
        m2[4][5] = Integer.parseInt(txt5_6.getText());
        m2[4][6] = Integer.parseInt(txt5_7.getText());
        m2[4][7] = Integer.parseInt(txt5_8.getText());
        m2[4][8] = Integer.parseInt(txt5_9.getText());
        m2[5][0] = Integer.parseInt(txt6_1.getText());
        m2[5][1] = Integer.parseInt(txt6_2.getText());
        m2[5][2] = Integer.parseInt(txt6_3.getText());
        m2[5][3] = Integer.parseInt(txt6_4.getText());
        m2[5][4] = Integer.parseInt(txt6_5.getText());
        m2[5][5] = Integer.parseInt(txt6_6.getText());
        m2[5][6] = Integer.parseInt(txt6_7.getText());
        m2[5][7] = Integer.parseInt(txt6_8.getText());
        m2[5][8] = Integer.parseInt(txt6_9.getText());
        m2[6][0] = Integer.parseInt(txt7_1.getText());
        m2[6][1] = Integer.parseInt(txt7_2.getText());
        m2[6][2] = Integer.parseInt(txt7_3.getText());
        m2[6][3] = Integer.parseInt(txt7_4.getText());
        m2[6][4] = Integer.parseInt(txt7_5.getText());
        m2[6][5] = Integer.parseInt(txt7_6.getText());
        m2[6][6] = Integer.parseInt(txt7_7.getText());
        m2[6][7] = Integer.parseInt(txt7_8.getText());
        m2[6][8] = Integer.parseInt(txt7_9.getText());
        m2[7][0] = Integer.parseInt(txt8_1.getText());
        m2[7][1] = Integer.parseInt(txt8_2.getText());
        m2[7][2] = Integer.parseInt(txt8_3.getText());
        m2[7][3] = Integer.parseInt(txt8_4.getText());
        m2[7][4] = Integer.parseInt(txt8_5.getText());
        m2[7][5] = Integer.parseInt(txt8_6.getText());
        m2[7][6] = Integer.parseInt(txt8_7.getText());
        m2[7][7] = Integer.parseInt(txt8_8.getText());
        m2[7][8] = Integer.parseInt(txt8_9.getText());
        m2[8][0] = Integer.parseInt(txt9_1.getText());
        m2[8][1] = Integer.parseInt(txt9_2.getText());
        m2[8][2] = Integer.parseInt(txt9_3.getText());
        m2[8][3] = Integer.parseInt(txt9_4.getText());
        m2[8][4] = Integer.parseInt(txt9_5.getText());
        m2[8][5] = Integer.parseInt(txt9_6.getText());
        m2[8][6] = Integer.parseInt(txt9_7.getText());
        m2[8][7] = Integer.parseInt(txt9_8.getText());
        m2[8][8] = Integer.parseInt(txt9_9.getText());
    }

    public boolean checarFilas() {
        boolean check = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = j + 1; k < 9; k++) {
                    if (sudo.m1[i][j] == sudo.m1[i][k]) {
                        check = true;
                        break;
                    }
                }
            }
        }
        return check;
    }

    public boolean checarColumnas() {
        boolean check = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = j + 1; k < 9; k++) {
                    if (sudo.m1[j][i] == sudo.m1[k][i]) {
                        check = true;
                        break;
                    }
                }
            }
        }
        return check;
    }

    public void limpiarCampo() {
        txt1_1.setText(null);
        txt1_2.setText(null);
        txt1_3.setText(null);
        txt1_4.setText(null);
        txt1_5.setText(null);
        txt1_6.setText(null);
        txt1_7.setText(null);
        txt1_8.setText(null);
        txt1_9.setText(null);
        txt2_1.setText(null);
        txt2_2.setText(null);
        txt2_3.setText(null);
        txt2_4.setText(null);
        txt2_5.setText(null);
        txt2_6.setText(null);
        txt2_7.setText(null);
        txt2_8.setText(null);
        txt2_9.setText(null);
        txt3_1.setText(null);
        txt3_2.setText(null);
        txt3_2.setText(null);
        txt3_3.setText(null);
        txt3_4.setText(null);
        txt3_5.setText(null);
        txt3_6.setText(null);
        txt3_7.setText(null);
        txt3_8.setText(null);
        txt3_9.setText(null);
        txt4_1.setText(null);
        txt4_2.setText(null);
        txt4_3.setText(null);
        txt4_4.setText(null);
        txt4_5.setText(null);
        txt4_6.setText(null);
        txt4_7.setText(null);
        txt4_8.setText(null);
        txt4_9.setText(null);
        txt5_1.setText(null);
        txt5_2.setText(null);
        txt5_3.setText(null);
        txt5_4.setText(null);
        txt5_6.setText(null);
        txt5_5.setText(null);
        txt5_7.setText(null);
        txt5_8.setText(null);
        txt5_9.setText(null);
        txt6_1.setText(null);
        txt6_2.setText(null);
        txt6_3.setText(null);
        txt6_4.setText(null);
        txt6_5.setText(null);
        txt6_6.setText(null);
        txt6_7.setText(null);
        txt6_8.setText(null);
        txt6_9.setText(null);
        txt7_1.setText(null);
        txt7_2.setText(null);
        txt7_3.setText(null);
        txt7_4.setText(null);
        txt7_5.setText(null);
        txt7_6.setText(null);
        txt7_7.setText(null);
        txt7_8.setText(null);
        txt7_9.setText(null);
        txt8_1.setText(null);
        txt8_2.setText(null);
        txt8_3.setText(null);
        txt8_4.setText(null);
        txt8_5.setText(null);
        txt8_6.setText(null);
        txt8_7.setText(null);
        txt8_8.setText(null);
        txt8_9.setText(null);
        txt9_1.setText(null);
        txt9_2.setText(null);
        txt9_3.setText(null);
        txt9_4.setText(null);
        txt9_5.setText(null);
        txt9_6.setText(null);
        txt9_7.setText(null);
        txt9_8.setText(null);
        txt9_9.setText(null);
    }

    public void colocarPista(int i, int j) {
        if (i + 1 == 1 && j + 1 == 1) {
            txt1_1.setText((Integer.toString(sudo.m1[i][j])));
            txt1_1.setEditable(false);
        }
        if (i + 1 == 1 && j + 1 == 2) {
            txt1_2.setText(Integer.toString(sudo.m1[i][j]));
            txt1_2.setEditable(false);
        }
        if (i + 1 == 1 && j + 1 == 3) {
            txt1_3.setText(Integer.toString(sudo.m1[i][j]));
            txt1_3.setEditable(false);
        }
        if (i + 1 == 1 && j + 1 == 4) {
            txt1_4.setText(Integer.toString(sudo.m1[i][j]));
            txt1_4.setEditable(false);
        }
        if (i + 1 == 1 && j + 1 == 5) {
            txt1_5.setText(Integer.toString(sudo.m1[i][j]));
            txt1_5.setEditable(false);
        }
        if (i + 1 == 1 && j + 1 == 6) {
            txt1_6.setText(Integer.toString(sudo.m1[i][j]));
            txt1_6.setEditable(false);
        }
        if (i + 1 == 1 && j + 1 == 7) {
            txt1_7.setText(Integer.toString(sudo.m1[i][j]));
            txt1_7.setEditable(false);
        }
        if (i + 1 == 1 && j + 1 == 8) {
            txt1_8.setText(Integer.toString(sudo.m1[i][j]));
            txt1_8.setEditable(false);
        }
        if (i + 1 == 1 && j + 1 == 9) {
            txt1_9.setText(Integer.toString(sudo.m1[i][j]));
            txt1_9.setEditable(false);
        }

        if (i + 1 == 2 && j + 1 == 1) {
            txt2_1.setText(Integer.toString(sudo.m1[i][j]));
            txt2_1.setEditable(false);
        }
        if (i + 1 == 2 && j + 1 == 2) {
            txt2_2.setText(Integer.toString(sudo.m1[i][j]));
            txt2_2.setEditable(false);
        }
        if (i + 1 == 2 && j + 1 == 3) {
            txt2_3.setText(Integer.toString(sudo.m1[i][j]));
            txt2_3.setEditable(false);
        }
        if (i + 1 == 2 && j + 1 == 4) {
            txt2_4.setText(Integer.toString(sudo.m1[i][j]));
            txt2_4.setEditable(false);
        }
        if (i + 1 == 2 && j + 1 == 5) {
            txt2_5.setText(Integer.toString(sudo.m1[i][j]));
            txt2_5.setEditable(false);
        }
        if (i + 1 == 2 && j + 1 == 6) {
            txt2_6.setText(Integer.toString(sudo.m1[i][j]));
            txt2_6.setEditable(false);
        }
        if (i + 1 == 2 && j + 1 == 7) {
            txt2_7.setText(Integer.toString(sudo.m1[i][j]));
            txt2_7.setEditable(false);
        }
        if (i + 1 == 2 && j + 1 == 8) {
            txt2_8.setText(Integer.toString(sudo.m1[i][j]));
            txt2_8.setEditable(false);
        }
        if (i + 1 == 2 && j + 1 == 9) {
            txt2_9.setText(Integer.toString(sudo.m1[i][j]));
            txt2_9.setEditable(false);
        }

        if (i + 1 == 3 && j + 1 == 1) {
            txt3_1.setText(Integer.toString(sudo.m1[i][j]));
            txt3_1.setEditable(false);
        }
        if (i + 1 == 3 && j + 1 == 2) {
            txt3_2.setText(Integer.toString(sudo.m1[i][j]));
            txt3_2.setEditable(false);
        }
        if (i + 1 == 3 && j + 1 == 3) {
            txt3_3.setText(Integer.toString(sudo.m1[i][j]));
            txt3_3.setEditable(false);
        }
        if (i + 1 == 3 && j + 1 == 4) {
            txt3_4.setText(Integer.toString(sudo.m1[i][j]));
            txt3_4.setEditable(false);
        }
        if (i + 1 == 3 && j + 1 == 5) {
            txt3_5.setText(Integer.toString(sudo.m1[i][j]));
            txt3_5.setEditable(false);
        }
        if (i + 1 == 3 && j + 1 == 6) {
            txt3_6.setText(Integer.toString(sudo.m1[i][j]));
            txt3_6.setEditable(false);
        }
        if (i + 1 == 3 && j + 1 == 7) {
            txt3_7.setText(Integer.toString(sudo.m1[i][j]));
            txt3_7.setEditable(false);
        }
        if (i + 1 == 3 && j + 1 == 8) {
            txt3_8.setText(Integer.toString(sudo.m1[i][j]));
            txt3_8.setEditable(false);
        }
        if (i + 1 == 3 && j + 1 == 9) {
            txt3_9.setText(Integer.toString(sudo.m1[i][j]));
            txt3_9.setEditable(false);
        }

        if (i + 1 == 4 && j + 1 == 1) {
            txt4_1.setText(Integer.toString(sudo.m1[i][j]));
            txt4_1.setEditable(false);
        }
        if (i + 1 == 4 && j + 1 == 2) {
            txt4_2.setText(Integer.toString(sudo.m1[i][j]));
            txt4_2.setEditable(false);
        }
        if (i + 1 == 4 && j + 1 == 3) {
            txt4_3.setText(Integer.toString(sudo.m1[i][j]));
            txt4_3.setEditable(false);
        }
        if (i + 1 == 4 && j + 1 == 4) {
            txt4_4.setText(Integer.toString(sudo.m1[i][j]));
            txt4_4.setEditable(false);
        }
        if (i + 1 == 4 && j + 1 == 5) {
            txt4_5.setText(Integer.toString(sudo.m1[i][j]));
            txt4_5.setEditable(false);
        }
        if (i + 1 == 4 && j + 1 == 6) {
            txt4_6.setText(Integer.toString(sudo.m1[i][j]));
            txt4_6.setEditable(false);
        }
        if (i + 1 == 4 && j + 1 == 7) {
            txt4_7.setText(Integer.toString(sudo.m1[i][j]));
            txt4_7.setEditable(false);
        }
        if (i + 1 == 4 && j + 1 == 8) {
            txt4_8.setText(Integer.toString(sudo.m1[i][j]));
            txt4_8.setEditable(false);
        }
        if (i + 1 == 4 && j + 1 == 9) {
            txt4_9.setText(Integer.toString(sudo.m1[i][j]));
            txt4_9.setEditable(false);
        }

        if (i + 1 == 5 && j + 1 == 1) {
            txt5_1.setText(Integer.toString(sudo.m1[i][j]));
            txt5_1.setEditable(false);
        }
        if (i + 1 == 5 && j + 1 == 2) {
            txt5_2.setText(Integer.toString(sudo.m1[i][j]));
            txt5_2.setEditable(false);
        }
        if (i + 1 == 5 && j + 1 == 3) {
            txt5_3.setText(Integer.toString(sudo.m1[i][j]));
            txt5_3.setEditable(false);
        }
        if (i + 1 == 5 && j + 1 == 4) {
            txt5_4.setText(Integer.toString(sudo.m1[i][j]));
            txt5_4.setEditable(false);
        }
        if (i + 1 == 5 && j + 1 == 5) {
            txt5_5.setText(Integer.toString(sudo.m1[i][j]));
            txt5_5.setEditable(false);
        }
        if (i + 1 == 5 && j + 1 == 6) {
            txt5_6.setText(Integer.toString(sudo.m1[i][j]));
            txt5_6.setEditable(false);
        }
        if (i + 1 == 5 && j + 1 == 7) {
            txt5_7.setText(Integer.toString(sudo.m1[i][j]));
            txt5_7.setEditable(false);
        }
        if (i + 1 == 5 && j + 1 == 8) {
            txt5_8.setText(Integer.toString(sudo.m1[i][j]));
            txt5_8.setEditable(false);
        }
        if (i + 1 == 5 && j + 1 == 9) {
            txt5_9.setText(Integer.toString(sudo.m1[i][j]));
            txt5_9.setEditable(false);
        }

        if (i + 1 == 6 && j + 1 == 1) {
            txt6_1.setText(Integer.toString(sudo.m1[i][j]));
            txt6_1.setEditable(false);
        }
        if (i + 1 == 6 && j + 1 == 2) {
            txt6_2.setText(Integer.toString(sudo.m1[i][j]));
            txt6_2.setEditable(false);
        }
        if (i + 1 == 6 && j + 1 == 3) {
            txt6_3.setText(Integer.toString(sudo.m1[i][j]));
            txt6_3.setEditable(false);
        }
        if (i + 1 == 6 && j + 1 == 4) {
            txt6_4.setText(Integer.toString(sudo.m1[i][j]));
            txt6_4.setEditable(false);
        }
        if (i + 1 == 6 && j + 1 == 5) {
            txt6_5.setText(Integer.toString(sudo.m1[i][j]));
            txt6_5.setEditable(false);
        }
        if (i + 1 == 6 && j + 1 == 6) {
            txt6_6.setText(Integer.toString(sudo.m1[i][j]));
            txt6_6.setEditable(false);
        }
        if (i + 1 == 6 && j + 1 == 7) {
            txt6_7.setText(Integer.toString(sudo.m1[i][j]));
            txt6_7.setEditable(false);
        }
        if (i + 1 == 6 && j + 1 == 8) {
            txt6_8.setText(Integer.toString(sudo.m1[i][j]));
            txt6_8.setEditable(false);
        }
        if (i + 1 == 6 && j + 1 == 9) {
            txt6_9.setText(Integer.toString(sudo.m1[i][j]));
            txt6_9.setEditable(false);
        }

        if (i + 1 == 7 && j + 1 == 1) {
            txt7_1.setText(Integer.toString(sudo.m1[i][j]));
            txt7_1.setEditable(false);
        }
        if (i + 1 == 7 && j + 1 == 2) {
            txt7_2.setText(Integer.toString(sudo.m1[i][j]));
            txt7_2.setEditable(false);
        }
        if (i + 1 == 7 && j + 1 == 3) {
            txt7_3.setText(Integer.toString(sudo.m1[i][j]));
            txt7_3.setEditable(false);
        }
        if (i + 1 == 7 && j + 1 == 4) {
            txt7_4.setText(Integer.toString(sudo.m1[i][j]));
            txt7_4.setEditable(false);
        }
        if (i + 1 == 7 && j + 1 == 5) {
            txt7_5.setText(Integer.toString(sudo.m1[i][j]));
            txt7_5.setEditable(false);
        }
        if (i + 1 == 7 && j + 1 == 6) {
            txt7_6.setText(Integer.toString(sudo.m1[i][j]));
            txt7_6.setEditable(false);
        }
        if (i + 1 == 7 && j + 1 == 7) {
            txt7_7.setText(Integer.toString(sudo.m1[i][j]));
            txt7_7.setEditable(false);
        }
        if (i + 1 == 7 && j + 1 == 8) {
            txt7_8.setText(Integer.toString(sudo.m1[i][j]));
            txt7_8.setEditable(false);
        }
        if (i + 1 == 7 && j + 1 == 9) {
            txt7_9.setText(Integer.toString(sudo.m1[i][j]));
            txt7_9.setEditable(false);
        }

        if (i + 1 == 8 && j + 1 == 1) {
            txt8_1.setText(Integer.toString(sudo.m1[i][j]));
            txt8_1.setEditable(false);
        }
        if (i + 1 == 8 && j + 1 == 2) {
            txt8_2.setText(Integer.toString(sudo.m1[i][j]));
            txt8_2.setEditable(false);
        }
        if (i + 1 == 8 && j + 1 == 3) {
            txt8_3.setText(Integer.toString(sudo.m1[i][j]));
            txt8_3.setEditable(false);
        }
        if (i + 1 == 8 && j + 1 == 4) {
            txt8_4.setText(Integer.toString(sudo.m1[i][j]));
            txt8_4.setEditable(false);
        }
        if (i + 1 == 8 && j + 1 == 5) {
            txt8_5.setText(Integer.toString(sudo.m1[i][j]));
            txt8_5.setEditable(false);
        }
        if (i + 1 == 8 && j + 1 == 6) {
            txt8_6.setText(Integer.toString(sudo.m1[i][j]));
            txt8_6.setEditable(false);
        }
        if (i + 1 == 8 && j + 1 == 7) {
            txt8_7.setText(Integer.toString(sudo.m1[i][j]));
            txt8_7.setEditable(false);
        }
        if (i + 1 == 8 && j + 1 == 8) {
            txt8_8.setText(Integer.toString(sudo.m1[i][j]));
            txt8_8.setEditable(false);
        }
        if (i + 1 == 8 && j + 1 == 9) {
            txt8_9.setText(Integer.toString(sudo.m1[i][j]));
            txt8_9.setEditable(false);
        }

        if (i + 1 == 9 && j + 1 == 1) {
            txt9_1.setText(Integer.toString(sudo.m1[i][j]));
            txt9_1.setEditable(false);
        }
        if (i + 1 == 9 && j + 1 == 2) {
            txt9_2.setText(Integer.toString(sudo.m1[i][j]));
            txt9_2.setEditable(false);
        }
        if (i + 1 == 9 && j + 1 == 3) {
            txt9_3.setText(Integer.toString(sudo.m1[i][j]));
            txt9_3.setEditable(false);
        }
        if (i + 1 == 9 && j + 1 == 4) {
            txt9_4.setText(Integer.toString(sudo.m1[i][j]));
            txt9_4.setEditable(false);
        }
        if (i + 4 == 9 && j + 1 == 5) {
            txt9_5.setText(Integer.toString(sudo.m1[i][j]));
            txt9_5.setEditable(false);
        }
        if (i + 1 == 9 && j + 1 == 6) {
            txt9_6.setText(Integer.toString(sudo.m1[i][j]));
            txt9_6.setEditable(false);
        }
        if (i + 1 == 9 && j + 1 == 7) {
            txt9_7.setText(Integer.toString(sudo.m1[i][j]));
            txt9_7.setEditable(false);
        }
        if (i + 1 == 9 && j + 1 == 8) {
            txt9_8.setText(Integer.toString(sudo.m1[i][j]));
            txt9_8.setEditable(false);
        }
        if (i + 1 == 9 && j + 1 == 9) {
            txt9_9.setText(Integer.toString(sudo.m1[i][j]));
            txt9_9.setEditable(false);
        }
    }

    public void verificarCampoVacio() {
        if (txt1_1.getText().equalsIgnoreCase("")) {
            txt1_1.setEditable(true);
        }
        if (txt1_2.getText().equalsIgnoreCase("")) {
            txt1_2.setEditable(true);
        }
        if (txt1_3.getText().equalsIgnoreCase("")) {
            txt1_3.setEditable(true);
        }
        if (txt1_4.getText().equalsIgnoreCase("")) {
            txt1_4.setEditable(true);
        }
        if (txt1_5.getText().equalsIgnoreCase("")) {
            txt1_5.setEditable(true);
        }
        if (txt1_6.getText().equalsIgnoreCase("")) {
            txt1_6.setEditable(true);
        }
        if (txt1_7.getText().equalsIgnoreCase("")) {
            txt1_7.setEditable(true);
        }
        if (txt1_8.getText().equalsIgnoreCase("")) {
            txt1_8.setEditable(true);
        }
        if (txt1_9.getText().equalsIgnoreCase("")) {
            txt1_9.setEditable(true);
        }

        if (txt2_1.getText().equalsIgnoreCase("")) {
            txt2_1.setEditable(true);
        }
        if (txt2_2.getText().equalsIgnoreCase("")) {
            txt2_2.setEditable(true);
        }
        if (txt2_3.getText().equalsIgnoreCase("")) {

            txt2_3.setEditable(true);
        }
        if (txt2_4.getText().equalsIgnoreCase("")) {

            txt2_4.setEditable(true);
        }
        if (txt2_5.getText().equalsIgnoreCase("")) {

            txt2_5.setEditable(true);
        }
        if (txt2_6.getText().equalsIgnoreCase("")) {

            txt2_6.setEditable(true);
        }
        if (txt2_7.getText().equalsIgnoreCase("")) {

            txt2_7.setEditable(true);
        }
        if (txt2_8.getText().equalsIgnoreCase("")) {

            txt2_8.setEditable(true);
        }
        if (txt2_9.getText().equalsIgnoreCase("")) {

            txt2_9.setEditable(true);
        }

        if (txt3_1.getText().equalsIgnoreCase("")) {

            txt3_1.setEditable(true);
        }
        if (txt3_2.getText().equalsIgnoreCase("")) {

            txt3_2.setEditable(true);
        }
        if (txt3_3.getText().equalsIgnoreCase("")) {

            txt3_3.setEditable(true);
        }
        if (txt3_4.getText().equalsIgnoreCase("")) {

            txt3_4.setEditable(true);
        }
        if (txt3_5.getText().equalsIgnoreCase("")) {

            txt3_5.setEditable(true);
        }
        if (txt3_6.getText().equalsIgnoreCase("")) {

            txt3_6.setEditable(true);
        }
        if (txt3_7.getText().equalsIgnoreCase("")) {

            txt3_7.setEditable(true);
        }
        if (txt3_8.getText().equalsIgnoreCase("")) {

            txt3_8.setEditable(true);
        }
        if (txt3_9.getText().equalsIgnoreCase("")) {

            txt3_9.setEditable(true);
        }

        if (txt4_1.getText().equalsIgnoreCase("")) {

            txt4_1.setEditable(true);
        }
        if (txt4_2.getText().equalsIgnoreCase("")) {

            txt4_2.setEditable(true);
        }
        if (txt4_3.getText().equalsIgnoreCase("")) {

            txt4_3.setEditable(true);
        }
        if (txt4_4.getText().equalsIgnoreCase("")) {

            txt4_4.setEditable(true);
        }
        if (txt4_5.getText().equalsIgnoreCase("")) {

            txt4_5.setEditable(true);
        }
        if (txt4_6.getText().equalsIgnoreCase("")) {

            txt4_6.setEditable(true);
        }
        if (txt4_7.getText().equalsIgnoreCase("")) {

            txt4_7.setEditable(true);
        }
        if (txt4_8.getText().equalsIgnoreCase("")) {

            txt4_8.setEditable(true);
        }
        if (txt4_9.getText().equalsIgnoreCase("")) {

            txt4_9.setEditable(true);
        }

        if (txt5_1.getText().equalsIgnoreCase("")) {

            txt5_1.setEditable(true);
        }
        if (txt5_2.getText().equalsIgnoreCase("")) {

            txt5_2.setEditable(true);
        }
        if (txt5_3.getText().equalsIgnoreCase("")) {

            txt5_3.setEditable(true);
        }
        if (txt5_4.getText().equalsIgnoreCase("")) {

            txt5_4.setEditable(true);
        }
        if (txt5_5.getText().equalsIgnoreCase("")) {

            txt5_5.setEditable(true);
        }
        if (txt5_6.getText().equalsIgnoreCase("")) {

            txt5_6.setEditable(true);
        }
        if (txt5_7.getText().equalsIgnoreCase("")) {

            txt5_7.setEditable(true);
        }
        if (txt5_8.getText().equalsIgnoreCase("")) {

            txt5_8.setEditable(true);
        }
        if (txt5_9.getText().equalsIgnoreCase("")) {

            txt5_9.setEditable(true);
        }

        if (txt6_1.getText().equalsIgnoreCase("")) {

            txt6_1.setEditable(true);
        }
        if (txt6_2.getText().equalsIgnoreCase("")) {

            txt6_2.setEditable(true);
        }
        if (txt6_3.getText().equalsIgnoreCase("")) {

            txt6_3.setEditable(true);
        }
        if (txt6_4.getText().equalsIgnoreCase("")) {

            txt6_4.setEditable(true);
        }
        if (txt6_5.getText().equalsIgnoreCase("")) {

            txt6_5.setEditable(true);
        }
        if (txt6_6.getText().equalsIgnoreCase("")) {

            txt6_6.setEditable(true);
        }
        if (txt6_7.getText().equalsIgnoreCase("")) {
            ;
            txt6_7.setEditable(true);
        }
        if (txt6_8.getText().equalsIgnoreCase("")) {

            txt6_8.setEditable(true);
        }
        if (txt6_9.getText().equalsIgnoreCase("")) {

            txt6_9.setEditable(true);
        }

        if (txt7_1.getText().equalsIgnoreCase("")) {
            txt7_1.setEditable(true);
        }
        if (txt7_2.getText().equalsIgnoreCase("")) {

            txt7_2.setEditable(true);
        }
        if (txt7_3.getText().equalsIgnoreCase("")) {

            txt7_3.setEditable(true);
        }
        if (txt7_4.getText().equalsIgnoreCase("")) {

            txt7_4.setEditable(true);
        }
        if (txt7_5.getText().equalsIgnoreCase("")) {

            txt7_5.setEditable(true);
        }
        if (txt7_6.getText().equalsIgnoreCase("")) {

            txt7_6.setEditable(true);
        }
        if (txt7_7.getText().equalsIgnoreCase("")) {

            txt7_7.setEditable(true);
        }
        if (txt7_8.getText().equalsIgnoreCase("")) {

            txt7_8.setEditable(true);
        }
        if (txt7_9.getText().equalsIgnoreCase("")) {

            txt7_9.setEditable(true);
        }

        if (txt8_1.getText().equalsIgnoreCase("")) {

            txt8_1.setEditable(true);
        }
        if (txt8_2.getText().equalsIgnoreCase("")) {

            txt8_2.setEditable(true);
        }
        if (txt8_3.getText().equalsIgnoreCase("")) {

            txt8_3.setEditable(true);
        }
        if (txt8_4.getText().equalsIgnoreCase("")) {

            txt8_4.setEditable(true);
        }
        if (txt8_5.getText().equalsIgnoreCase("")) {

            txt8_5.setEditable(true);
        }
        if (txt8_6.getText().equalsIgnoreCase("")) {

            txt8_6.setEditable(true);
        }
        if (txt8_7.getText().equalsIgnoreCase("")) {

            txt8_7.setEditable(true);
        }
        if (txt8_8.getText().equalsIgnoreCase("")) {

            txt8_8.setEditable(true);
        }
        if (txt8_9.getText().equalsIgnoreCase("")) {

            txt8_9.setEditable(true);
        }

        if (txt9_1.getText().equalsIgnoreCase("")) {

            txt9_1.setEditable(true);
        }
        if (txt9_2.getText().equalsIgnoreCase("")) {

            txt9_2.setEditable(true);
        }
        if (txt9_3.getText().equalsIgnoreCase("")) {

            txt9_3.setEditable(true);
        }
        if (txt9_4.getText().equalsIgnoreCase("")) {

            txt9_4.setEditable(true);
        }
        if (txt9_5.getText().equalsIgnoreCase("")) {

            txt9_5.setEditable(true);
        }
        if (txt9_6.getText().equalsIgnoreCase("")) {

            txt9_6.setEditable(true);
        }
        if (txt9_7.getText().equalsIgnoreCase("")) {

            txt9_7.setEditable(true);
        }
        if (txt9_8.getText().equalsIgnoreCase("")) {

            txt9_8.setEditable(true);
        }
        if (txt9_9.getText().equalsIgnoreCase("")) {

            txt9_9.setEditable(true);
        }
    }

    public void matrizCero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudo.m1[i][j] = 0;
                m2[i][j] = 0;
            }
        }
    }

    public int verificarResultado() {
        int check = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudo.m1[i][j] == m2[i][j]) {
                    check++;
                }
            }
        }
        return check;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuOriginal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarMatriz;
    private javax.swing.JButton btnIntentar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelInd;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelStart;
    private javax.swing.JTextField txt1_1;
    private javax.swing.JTextField txt1_2;
    private javax.swing.JTextField txt1_3;
    private javax.swing.JTextField txt1_4;
    private javax.swing.JTextField txt1_5;
    private javax.swing.JTextField txt1_6;
    private javax.swing.JTextField txt1_7;
    private javax.swing.JTextField txt1_8;
    private javax.swing.JTextField txt1_9;
    private javax.swing.JTextField txt2_1;
    private javax.swing.JTextField txt2_2;
    private javax.swing.JTextField txt2_3;
    private javax.swing.JTextField txt2_4;
    private javax.swing.JTextField txt2_5;
    private javax.swing.JTextField txt2_6;
    private javax.swing.JTextField txt2_7;
    private javax.swing.JTextField txt2_8;
    private javax.swing.JTextField txt2_9;
    private javax.swing.JTextField txt3_1;
    private javax.swing.JTextField txt3_2;
    private javax.swing.JTextField txt3_3;
    private javax.swing.JTextField txt3_4;
    private javax.swing.JTextField txt3_5;
    private javax.swing.JTextField txt3_6;
    private javax.swing.JTextField txt3_7;
    private javax.swing.JTextField txt3_8;
    private javax.swing.JTextField txt3_9;
    private javax.swing.JTextField txt4_1;
    private javax.swing.JTextField txt4_2;
    private javax.swing.JTextField txt4_3;
    private javax.swing.JTextField txt4_4;
    private javax.swing.JTextField txt4_5;
    private javax.swing.JTextField txt4_6;
    private javax.swing.JTextField txt4_7;
    private javax.swing.JTextField txt4_8;
    private javax.swing.JTextField txt4_9;
    private javax.swing.JTextField txt5_1;
    private javax.swing.JTextField txt5_2;
    private javax.swing.JTextField txt5_3;
    private javax.swing.JTextField txt5_4;
    private javax.swing.JTextField txt5_5;
    private javax.swing.JTextField txt5_6;
    private javax.swing.JTextField txt5_7;
    private javax.swing.JTextField txt5_8;
    private javax.swing.JTextField txt5_9;
    private javax.swing.JTextField txt6_1;
    private javax.swing.JTextField txt6_2;
    private javax.swing.JTextField txt6_3;
    private javax.swing.JTextField txt6_4;
    private javax.swing.JTextField txt6_5;
    private javax.swing.JTextField txt6_6;
    private javax.swing.JTextField txt6_7;
    private javax.swing.JTextField txt6_8;
    private javax.swing.JTextField txt6_9;
    private javax.swing.JTextField txt7_1;
    private javax.swing.JTextField txt7_2;
    private javax.swing.JTextField txt7_3;
    private javax.swing.JTextField txt7_4;
    private javax.swing.JTextField txt7_5;
    private javax.swing.JTextField txt7_6;
    private javax.swing.JTextField txt7_7;
    private javax.swing.JTextField txt7_8;
    private javax.swing.JTextField txt7_9;
    private javax.swing.JTextField txt8_1;
    private javax.swing.JTextField txt8_2;
    private javax.swing.JTextField txt8_3;
    private javax.swing.JTextField txt8_4;
    private javax.swing.JTextField txt8_5;
    private javax.swing.JTextField txt8_6;
    private javax.swing.JTextField txt8_7;
    private javax.swing.JTextField txt8_8;
    private javax.swing.JTextField txt8_9;
    private javax.swing.JTextField txt9_1;
    private javax.swing.JTextField txt9_2;
    private javax.swing.JTextField txt9_3;
    private javax.swing.JTextField txt9_4;
    private javax.swing.JTextField txt9_5;
    private javax.swing.JTextField txt9_6;
    private javax.swing.JTextField txt9_7;
    private javax.swing.JTextField txt9_8;
    private javax.swing.JTextField txt9_9;
    // End of variables declaration//GEN-END:variables
}
