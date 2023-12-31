/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ClienteDAO;
import Controlador.OcupacionCON;
import java.sql.SQLException;
import utils.Keygen;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Ciudad;
import model.Cliente;
import model.Cuenta;
import model.NivelEducacion;
import model.Ocupacion;



/**
 *
 * @author gauge
 */
public class Registrar2 extends javax.swing.JFrame {

    String name;
    String run;
    int sueldo;
    String genero;
    String email;
    String ecivil;
    String fNacimiento;
    private Registrar1 v1;
    /**
     * Creates new form Registrar2
     */
    public Registrar2(String name,String run, int sueldo,String genero,String email,String ecivil,String fNacimiento) {
        this.name = name;
        this.run = run;
        this.sueldo = sueldo;
        this.genero = genero;
        this.email = email;
        this.ecivil = ecivil;
        this.fNacimiento = fNacimiento;
       
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.
     * The content of this method is always
 regenerated by the Form Editor.

     */
    @SuppressWarnings("unchecked")
    public void setV1(Registrar1 v1){
        this.v1=v1;
        String run;
        run = v1.run;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cdireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ceducacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cciudad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cdeclaracion = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        ccorriente = new javax.swing.JRadioButton();
        cahorro = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cvista = new javax.swing.JRadioButton();
        cocupacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ocupación: ");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Formulario de aplicación");

        cdireccion.setBackground(new java.awt.Color(255, 255, 255));
        cdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdireccionActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        finalizar.setBackground(new java.awt.Color(0, 0, 0));
        finalizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        finalizar.setForeground(new java.awt.Color(255, 255, 255));
        finalizar.setText("FINALIZAR");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ciudad:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Datos adicionales");

        ceducacion.setBackground(new java.awt.Color(255, 255, 255));
        ceducacion.setEditable(true);
        ceducacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ceducacion.setForeground(new java.awt.Color(0, 0, 0));
        ceducacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Enseñanza básica", "Enseñanza media", "Técnico", "Universitaria incompleta", "Universitaria", "Posgrado" }));
        ceducacion.setFocusable(false);
        ceducacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceducacionActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Direccion:");

        cciudad.setBackground(new java.awt.Color(255, 255, 255));
        cciudad.setEditable(true);
        cciudad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cciudad.setForeground(new java.awt.Color(0, 0, 0));
        cciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Peña Blanca", "Quilpué", "Valparaíso", "Viña del Mar", "Villa Alemana" }));
        cciudad.setFocusable(false);
        cciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cciudadActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nivel educacional:");

        cdeclaracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cdeclaracion.setText("Declaro que la información entregada y requerida es la correcta de acuerdo a mis conocimientos");
        cdeclaracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdeclaracionActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(ccorriente);
        ccorriente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ccorriente.setForeground(new java.awt.Color(51, 51, 51));
        ccorriente.setText("Corriente");
        ccorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccorrienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(cahorro);
        cahorro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cahorro.setForeground(new java.awt.Color(51, 51, 51));
        cahorro.setText("Ahorro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ccorriente)
                .addGap(125, 125, 125)
                .addComponent(cahorro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccorriente)
                    .addComponent(cahorro))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Seleccione la cuenta que desea crear:");

        buttonGroup1.add(cvista);
        cvista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cvista.setForeground(new java.awt.Color(51, 51, 51));
        cvista.setText("Vista");
        cvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvistaActionPerformed(evt);
            }
        });

        cocupacion.setBackground(new java.awt.Color(255, 255, 255));
        cocupacion.setEditable(true);
        cocupacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cocupacion.setForeground(new java.awt.Color(0, 0, 0));
        cocupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Emprendedor", "Asalariado", "CEO", "Estudiante", "Cesante", "Jubilado" }));
        cocupacion.setFocusable(false);
        cocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocupacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                    .addComponent(cciudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(92, 92, 92)
                                .addComponent(cocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(92, 92, 92)
                                .addComponent(ceducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(9, 9, 9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(cvista)
                        .addGap(109, 109, 109)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addComponent(cdeclaracion)
                        .addGap(14, 14, 14)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ceducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cdeclaracion)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdireccionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        // TODO add your handling code here:
    String tipoCuenta = null;
    String direccion = cdireccion.getText();
    String ciudad = (String) cciudad.getSelectedItem();
    String nivelEducacional = (String) ceducacion.getSelectedItem();
    String ocupacion = (String) cocupacion.getSelectedItem();
    boolean declaracionCorrecta = false;
    if (cvista.isSelected()) {
        tipoCuenta = "Cuenta Vista";
    } else if (ccorriente.isSelected()) {
        tipoCuenta = "Cuenta Corriente";
    } else if (cahorro.isSelected()) {
        tipoCuenta = "Cuenta Ahorro";
    } else{
        tipoCuenta ="";
    }
            if (cdeclaracion.isSelected()) {
                declaracionCorrecta = true;
            } else{
                declaracionCorrecta = false;
            }
        if (direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese direccion", "Validación", JOptionPane.WARNING_MESSAGE);
            this.cdireccion.requestFocus();
            return;   
            
        }else if (ciudad.equalsIgnoreCase("Seleccionar")) {
            JOptionPane.showMessageDialog(this, "Selecione una ciudad", "Validación", JOptionPane.WARNING_MESSAGE);
            this.cciudad.requestFocus();
            return;
            
        }else if (nivelEducacional.equalsIgnoreCase("Seleccionar")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar nivel educacional", "Validación", JOptionPane.WARNING_MESSAGE);
            this.ceducacion.requestFocus();
            return;    
        }else if (ocupacion.equalsIgnoreCase("Seleccionar")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar ocupacion", "Validación", JOptionPane.WARNING_MESSAGE);
            this.cocupacion.requestFocus();
            return;    
        }else if (tipoCuenta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar que tipo de cuenta desea crear", "Validación", JOptionPane.WARNING_MESSAGE);
            return;  
            
         
        }else if (declaracionCorrecta==false) {
            JOptionPane.showMessageDialog(this, "Debe completar el campo de declaracion", "Validación", JOptionPane.WARNING_MESSAGE);
            return;

        }else if(tipoCuenta.equals("Cuenta Corriente")&&(sueldo<800000)){
            JOptionPane.showMessageDialog(this, "Para seleccionar una cuenta corriente debe acreditar un sueldo sobre $800.000 ", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else{
            Ocupacion ocup = new Ocupacion();
            OcupacionCON ocu = new OcupacionCON();
            ocup.setNombre(ocupacion);
            ocu.BuscarId(ocup.getNombre());
//             int id_ocu = 550;
            
            Keygen kg = new Keygen();
            String cvv = Integer.toString((int) kg.keyCVV());
            String numeroTarjeta = "" + kg.keyTarjeta();
            String numeroPin = "" + kg.keyPin();
           System.out.println(run + name);
           Cliente cliente = new Cliente(); // objeto cliente
           Cuenta cuenta = new Cuenta();  //objeto cuenta
           cliente.setSueldo(sueldo);
           cliente.setNombre(name); //1
           cliente.setRun(run);// 3   
           cliente.setGenero(genero);
           cliente.setEmail(email);// 7  
           cliente.seteCivil(ecivil);
           cliente.setfNacimiento(fNacimiento);
           cliente.setDireccion(direccion);
           cliente.setC_id_nEducacional(2); 
           cliente.setC_id_ciudad(2);
           cliente.setC_id_ocupacion(ocup.getIdOcupacion());
           cuenta.setCvv(cvv);
           cuenta.setNro_tarjeta(numeroTarjeta);
           cuenta.setPinNumber(numeroPin);
           cuenta.setRut_cliente(run);
           cuenta.setEstado(true);
           cuenta.setTipoCuenta("5");
           cuenta.setSaldo(0);
           
        // Use the LoginCON class for database interaction
           ClienteDAO reg = new ClienteDAO();
        try {
            if (reg.agregar(cliente)) {
                JOptionPane.showMessageDialog(this, "Se agregó libro", "Información", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(this, "No Se agregó libro", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registrar2.class.getName()).log(Level.SEVERE, null, ex);
        }

        
         JOptionPane.showMessageDialog(this, "Pin: "+numeroPin+" Número de cuenta: "+numeroTarjeta+" Cvv: "+cvv, "Validación", JOptionPane.WARNING_MESSAGE);
           
           //aqui inserto datos a cliente
           
           
          // aqui inserto datos a cuenta
        
        }
    
        
        
    
    }//GEN-LAST:event_finalizarActionPerformed

    private void cciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cciudadActionPerformed
    
    }//GEN-LAST:event_cciudadActionPerformed

    private void cdeclaracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdeclaracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdeclaracionActionPerformed

    private void cvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvistaActionPerformed

    private void ccorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccorrienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccorrienteActionPerformed

    private void ceducacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceducacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceducacionActionPerformed

    private void cocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cocupacionActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cahorro;
    private javax.swing.JComboBox<String> cciudad;
    private javax.swing.JRadioButton ccorriente;
    private javax.swing.JCheckBox cdeclaracion;
    private javax.swing.JTextField cdireccion;
    private javax.swing.JComboBox<String> ceducacion;
    private javax.swing.JComboBox<String> cocupacion;
    private javax.swing.JRadioButton cvista;
    private javax.swing.JButton finalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

  
}
