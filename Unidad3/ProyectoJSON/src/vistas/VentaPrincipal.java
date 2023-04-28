package vistas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Alumno;
import proyectoJSON.Util;


public class VentaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Jframe
     */
    private CardLayout vista;
    private PanelAlumnoDetalle panelAlumnosDetalle;
    private PanelAlumnos panelAlumnos;
    private Alumno selectedAlumno;
    private boolean isEditingAlumno = false;

    public boolean isEditingAlumno() {
        return isEditingAlumno;
    }

    public void setIsEditingAlumno(boolean isEditingAlumno) {
        this.isEditingAlumno = isEditingAlumno;
    }

    public Alumno getSelectedAlumno() {
        return selectedAlumno;
    }

    public void setSelectedAlumno(Alumno selectedAlumno) {
        this.selectedAlumno = selectedAlumno;
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/registro.png"));

        return retValue;
    }

    public VentaPrincipal() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        initComponents();

        panelAlumnos = new PanelAlumnos(this);
        panelAlumnosDetalle = new PanelAlumnoDetalle(this, panelAlumnos);

        vista = (CardLayout) jPanelContenedor.getLayout();
        jPanelContenedor.add(panelAlumnosDetalle, "panelDetalle");
        jPanelContenedor.add(panelAlumnos, "panelAlumnos");

        this.mostrarPanelAlumnos();

    }

    public void mostrarPanelAlumnos() {
        vista.show(jPanelContenedor, "panelAlumnos");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();

    }

    public void mostrarPanelAlumnoDetalle() {
        this.panelAlumnosDetalle = null;
        this.panelAlumnosDetalle = new PanelAlumnoDetalle(this, panelAlumnos);

        jPanelContenedor.add(panelAlumnosDetalle, "panelDetalle");
        vista.show(jPanelContenedor, "panelDetalle");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generalError = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Alumnos 100%");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(800, 544));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generalError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generalError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(generalError, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 830, 30));

        jPanelContenedor.setPreferredSize(new java.awt.Dimension(800, 544));
        jPanelContenedor.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 840, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaPrincipal().setVisible(true);
            }
        });
    }

    public void setGeneralError(String texto, int millisecods) {
        generalError.setForeground(Color.RED);
        generalError.setText(texto);
        Util.setTimeout(() -> {
            generalError.setText("");
        }, millisecods);

    }

    public void setGeneralError(String texto) {
        generalError.setForeground(Color.RED);
        generalError.setText(texto);
        Util.setTimeout(() -> {
            generalError.setText("");
        }, 3000);
    }

    public void setSuccesMessage(String texto, int millisecods) {
        generalError.setForeground(new Color(1, 176, 104));
        generalError.setText(texto);
        Util.setTimeout(() -> {
            generalError.setText("");
        }, millisecods);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel generalError;
    private javax.swing.JPanel jPanelContenedor;
    // End of variables declaration//GEN-END:variables
}