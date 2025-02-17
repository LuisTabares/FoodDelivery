package co.unicauca.restaurant.client.presentation;

import co.unicauca.restaurant.client.access.Factory;
import co.unicauca.restaurant.commons.domain.User;
import co.unicauca.restaurant.client.domain.services.UserService;
import static co.unicauca.restaurant.client.infra.Messages.successMessage;
import co.unicauca.restaurant.client.access.IUserAccess;

/**
 * Interfaz gráfica de Consultar clientes
 *
 * @author Libardo Pantoja
 *
 */
public class GUIPlate extends javax.swing.JInternalFrame {

    /**
     * Constructor
     */
    public GUIPlate() {
        initComponents();

        setSize(870, 500);
        fijarMensajeExplicacion();
        btnAgregar.setVisible(false);

    }

    /**
     * Mensaje inicial del panel superior
     */
    private void fijarMensajeExplicacion() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("<html>" + "Este ejercicio aplica el patrón cliente/servidor.<br>"
                + "La aplicación cliente se conecta al servidor mediante Sockets.<br>"
                + "El servidor devuelve el objeto Cliente consultado en formato JSON.<br>"
                + "En el backend las cedulas desde 98000001 hasta 98000010.<br>"
                + "</html>");
        // lblExplicacion.setText(sb.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentro = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLastName1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        pnlSur = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlNorte = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear Plato");

        pnlCentro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCentro.setMaximumSize(new java.awt.Dimension(32767, 50000));
        pnlCentro.setLayout(new java.awt.GridLayout(5, 2, 0, 2));

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("IdPlate");
        pnlCentro.add(lblNombre);

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        pnlCentro.add(txtFirstName);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NamePlate");
        pnlCentro.add(jLabel1);
        pnlCentro.add(txtLastName);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("PricePlate");
        pnlCentro.add(jLabel2);
        pnlCentro.add(txtLastName1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DescriptionPlate");
        pnlCentro.add(jLabel3);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        pnlCentro.add(jTextField1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TypePlate");
        pnlCentro.add(jLabel5);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Principio", "Proteina ", "Bebida" }));
        pnlCentro.add(jComboBox1);

        getContentPane().add(pnlCentro, java.awt.BorderLayout.CENTER);

        pnlSur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlSur.add(btnAgregar);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlSur.add(btnCerrar);

        getContentPane().add(pnlSur, java.awt.BorderLayout.SOUTH);

        pnlNorte.setBorder(new javax.swing.border.MatteBorder(null));
        pnlNorte.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CREAR PLATO");
        pnlNorte.add(jLabel4, new java.awt.GridBagConstraints());

        getContentPane().add(pnlNorte, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    // public String getTxtyId() {
    // return txtId.getText();
    //}

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        IUserAccess service = Factory.getInstance().getUserService();
        // Inyecta la dependencia
        UserService customerService = new UserService(service);

        User customer = new User();
        // customer.setAtrIdentification(txtId.getText());
        customer.setAtrNames(txtFirstName.getText());
        customer.setAtrLastNames(txtLastName.getText());
        //  customer.setAtrAddress(txtAddress.getText());
        // customer.setAtrPhone(txtEmail.getText());

        try {
            String response = customerService.createUser(customer);
            successMessage("Cliente " + response + " agregado con éxito.", "Atención");
            clearControls();
            // txtId.setText("");
            btnAgregar.setVisible(false);

        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atención");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    /**
     * Muestra los datos en el formulario
     *
     * @param customer cliente
     */
    private void showData(User customer) {
//        txtFirstName.setText(customer.getFirstName());
//        txtLastName.setText(customer.getLastName());
//        txtAddress.setText(customer.getAddress());
//        txtMobile.setText(customer.getMobile());
//        txtEmail.setText(customer.getEmail());
//        txtGender.setText(customer.getGender());
    }

    public void clearControls() {
        txtFirstName.setText("");
        txtLastName.setText("");
        //     txtAddress.setText("");
        //   txtMobile.setText("");
        // txtEmail.setText("");
        // txtGender.setText("");
    }

    public static void main(String[] args) {
        GUIRestaurant gui = new GUIRestaurant();
        gui.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastName1;
    // End of variables declaration//GEN-END:variables

}
