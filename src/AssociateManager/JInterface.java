/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssociateManager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miguelq
 */
public class JInterface extends javax.swing.JFrame  implements Observer{

    private Gestor record;  //record of associates
    private Aluno curEdit;  //current associate being edited
    
    /**
     * Creates new form JAManager
     */
    public JInterface() {
        initComponents();
        this.record = new Gestor();
        this.record.addObserver(this);
        this.update(this.record, null);
        this.curEdit = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newAssociate = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        nroNew = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeNew = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cursoNew = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anoNew = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        moradaNew = new javax.swing.JTextField();
        closeNew = new javax.swing.JButton();
        saveNew = new javax.swing.JButton();
        novoFWarn = new javax.swing.JLabel();
        editAssociate = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        nroEdit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nomeEdit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cursoEdit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        anoEdit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        moradaEdit = new javax.swing.JTextField();
        closeEdit = new javax.swing.JButton();
        checkQuotas = new javax.swing.JButton();
        update = new javax.swing.JButton();
        editFWarn = new javax.swing.JLabel();
        quotasPagas = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        quotaTbl = new javax.swing.JTable();
        payQuota = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        allAssociates = new javax.swing.JTable();
        mainFWarn = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        novoSocio = new javax.swing.JMenuItem();
        editOption = new javax.swing.JMenu();

        newAssociate.setMinimumSize(new java.awt.Dimension(400, 307));

        jLabel1.setText("Número");

        jLabel2.setText("Nome");

        jLabel3.setText("Curso");

        jLabel4.setText("Ano");

        jLabel5.setText("Morada");

        closeNew.setText("Fechar");
        closeNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeNewActionPerformed(evt);
            }
        });

        saveNew.setText("Guardar");
        saveNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewActionPerformed(evt);
            }
        });

        novoFWarn.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout newAssociateLayout = new javax.swing.GroupLayout(newAssociate.getContentPane());
        newAssociate.getContentPane().setLayout(newAssociateLayout);
        newAssociateLayout.setHorizontalGroup(
            newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newAssociateLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(novoFWarn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveNew)
                .addGap(18, 18, 18)
                .addComponent(closeNew)
                .addGap(21, 21, 21))
            .addGroup(newAssociateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anoNew)
                    .addComponent(moradaNew)
                    .addComponent(nroNew, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(cursoNew)
                    .addComponent(nomeNew, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        newAssociateLayout.setVerticalGroup(
            newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newAssociateLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nroNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cursoNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(anoNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(moradaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(newAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeNew)
                    .addComponent(saveNew)
                    .addComponent(novoFWarn))
                .addContainerGap())
        );

        editAssociate.setMinimumSize(new java.awt.Dimension(428, 350));

        jLabel6.setText("Número");

        jLabel7.setText("Nome");

        jLabel8.setText("Curso");

        jLabel9.setText("Ano");

        jLabel10.setText("Morada");

        closeEdit.setText("Fechar");
        closeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeEditActionPerformed(evt);
            }
        });

        checkQuotas.setText("Quotas");
        checkQuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkQuotasActionPerformed(evt);
            }
        });

        update.setText("Atualizar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        editFWarn.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout editAssociateLayout = new javax.swing.GroupLayout(editAssociate.getContentPane());
        editAssociate.getContentPane().setLayout(editAssociateLayout);
        editAssociateLayout.setHorizontalGroup(
            editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editAssociateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anoEdit)
                    .addComponent(moradaEdit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(cursoEdit)
                    .addComponent(nroEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editAssociateLayout.createSequentialGroup()
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editAssociateLayout.createSequentialGroup()
                        .addContainerGap(318, Short.MAX_VALUE)
                        .addComponent(checkQuotas))
                    .addGroup(editAssociateLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(editFWarn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeEdit)))
                .addGap(21, 21, 21))
        );
        editAssociateLayout.setVerticalGroup(
            editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editAssociateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkQuotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(nroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cursoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(anoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(moradaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editAssociateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeEdit)
                    .addComponent(update)
                    .addComponent(editFWarn))
                .addContainerGap())
        );

        quotasPagas.setMinimumSize(new java.awt.Dimension(400, 297));

        quotaTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mes", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(quotaTbl);

        payQuota.setText("Pagar Quotas");
        payQuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payQuotaActionPerformed(evt);
            }
        });

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quotasPagasLayout = new javax.swing.GroupLayout(quotasPagas.getContentPane());
        quotasPagas.getContentPane().setLayout(quotasPagasLayout);
        quotasPagasLayout.setHorizontalGroup(
            quotasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(quotasPagasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(payQuota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ok)
                .addContainerGap())
        );
        quotasPagasLayout.setVerticalGroup(
            quotasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quotasPagasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(quotasPagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payQuota)
                    .addComponent(ok))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 350));

        allAssociates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(allAssociates);

        mainFWarn.setForeground(new java.awt.Color(255, 102, 51));

        fileMenu.setText("File");

        novoSocio.setText("Novo Sócio");
        novoSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoSocioActionPerformed(evt);
            }
        });
        fileMenu.add(novoSocio);

        jMenuBar1.add(fileMenu);

        editOption.setText("Edit");
        editOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editOptionMouseClicked(evt);
            }
        });
        jMenuBar1.add(editOption);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainFWarn)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainFWarn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int oldNro = curEdit.getNro();
        try{
            int tmp = Integer.parseInt(this.nroEdit.getText());
            curEdit.setNome(this.nomeEdit.getText());
            curEdit.setAddr(this.moradaEdit.getText());
            curEdit.setNro(tmp);
            tmp = Integer.parseInt(this.anoEdit.getText());
            curEdit.setYr(tmp);
            this.record.updateAluno(oldNro, curEdit.clone());
            this.editFWarn.setText("");
            this.clearField(this.nomeEdit);
            this.clearField(this.moradaEdit);
            this.clearField(this.nroEdit);
            this.clearField(this.anoEdit);
            this.editAssociate.dispose();
            curEdit = null;
        }catch(AlunoExistenteException e){
            this.editFWarn.setText("Número mecatrónico em uso!");
            curEdit.setNro(oldNro);
        }catch(Exception e){
            this.editFWarn.setText("Campo Inválido!");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void saveNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewActionPerformed
        Aluno aux = new Aluno();
        try{
            int tmp = Integer.parseInt(this.nroNew.getText());
            aux.setNro(tmp);
            aux.setNome(this.nomeNew.getText());
            aux.setDegree(this.cursoNew.getText());
            tmp = Integer.parseInt(this.anoNew.getText());
            aux.setYr(tmp);
            aux.setAddr(this.moradaNew.getText());
            this.record.addAluno(aux);
            this.clearField(this.nomeNew);
            this.clearField(this.moradaNew);
            this.clearField(this.nroNew);
            this.clearField(this.anoNew);
            this.newAssociate.dispose();
            this.novoFWarn.setText("");
        }catch(AlunoExistenteException e){
            this.novoFWarn.setText("Aluno repetido");
        }catch(Exception e){
            this.novoFWarn.setText("Campo Inválido");
        }
    }//GEN-LAST:event_saveNewActionPerformed

    private void novoSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoSocioActionPerformed
        this.newAssociate.setVisible(true);
    }//GEN-LAST:event_novoSocioActionPerformed

    private void closeNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeNewActionPerformed
        this.newAssociate.dispose();
        this.novoFWarn.setText("");
        clearField(this.nomeNew);
        clearField(this.nroNew);
        clearField(this.cursoNew);
        clearField(this.moradaNew);
        clearField(this.anoNew);
    }//GEN-LAST:event_closeNewActionPerformed

    private void editOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editOptionMouseClicked
        int line = this.allAssociates.getSelectedRow();
        if(line >= 0){
            String nro = this.allAssociates.getValueAt(line, 0).toString();
            String nome = this.allAssociates.getValueAt(line, 1).toString();
            this.mainFWarn.setText("");
            this.editStudent(nro);  
        }else this.mainFWarn.setText("Nenhum sócio selecionado");
    }//GEN-LAST:event_editOptionMouseClicked

    private void closeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeEditActionPerformed
        this.editAssociate.dispose();
        this.editFWarn.setText("");
        clearField(this.nomeEdit);
        clearField(this.nroEdit);
        clearField(this.cursoEdit);
        clearField(this.moradaEdit);
        clearField(this.anoEdit);
    }//GEN-LAST:event_closeEditActionPerformed

    private void checkQuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkQuotasActionPerformed
        List<Quota> reg = curEdit.getReg();
        DefaultTableModel model = (DefaultTableModel) this.quotaTbl.getModel();
        model.setRowCount(0);
        for(Quota qt: reg)
            model.addRow(new Object[]{qt.getDate().toString(),qt.getVal()});
        this.quotasPagas.setVisible(true);
    }//GEN-LAST:event_checkQuotasActionPerformed

    private void payQuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payQuotaActionPerformed
        curEdit.addQuota(5.0,LocalDate.now());
        this.update(null, curEdit);
    }//GEN-LAST:event_payQuotaActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        this.quotasPagas.dispose();
        DefaultTableModel model = (DefaultTableModel)quotaTbl.getModel(); 
        model.setRowCount(0);
    }//GEN-LAST:event_okActionPerformed

    private void editStudent(String nro){
        try{
            curEdit = this.record.getAluno(Integer.parseInt(nro));
            this.nroEdit.setText(nro);
            this.nomeEdit.setText(curEdit.getNome());
            this.cursoEdit.setText(curEdit.getDegree());
            this.anoEdit.setText(Integer.toString(curEdit.getYr()));
            this.moradaEdit.setText(curEdit.getAddr());
            this.editAssociate.setVisible(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void clearField(javax.swing.JTextField inp){
        inp.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(JInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        JInterface instance = new JInterface();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                instance.setVisible(true);
            }
        });
        instance.save();
    }

    public void save(){
        try{
            ObjectOutputStream db = new ObjectOutputStream(new FileOutputStream("savedState"));
            System.out.println(this.record.toString());
            db.writeObject(this.record);
            db.flush();
            db.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void update(Observable o, Object arg){
        if(arg == null){
            DefaultTableModel model = (DefaultTableModel) this.allAssociates.getModel();
            model.setRowCount(0);
            for(Aluno al: this.record.getAlunos())
                model.addRow(new Object[]{al.getNro(),al.getNome()}); //replace this by the name and number of the "new" student
        }else{
            DefaultTableModel model = (DefaultTableModel) this.quotaTbl.getModel();
            model.setRowCount(0);
            for(Quota qt: this.curEdit.getReg())
                model.addRow(new Object[]{qt.getDate(),qt.getVal()}); //replace this by the name and number of the "new" student
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allAssociates;
    private javax.swing.JTextField anoEdit;
    private javax.swing.JTextField anoNew;
    private javax.swing.JButton checkQuotas;
    private javax.swing.JButton closeEdit;
    private javax.swing.JButton closeNew;
    private javax.swing.JTextField cursoEdit;
    private javax.swing.JTextField cursoNew;
    private javax.swing.JFrame editAssociate;
    private javax.swing.JLabel editFWarn;
    private javax.swing.JMenu editOption;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mainFWarn;
    private javax.swing.JTextField moradaEdit;
    private javax.swing.JTextField moradaNew;
    private javax.swing.JFrame newAssociate;
    private javax.swing.JTextField nomeEdit;
    private javax.swing.JTextField nomeNew;
    private javax.swing.JLabel novoFWarn;
    private javax.swing.JMenuItem novoSocio;
    private javax.swing.JTextField nroEdit;
    private javax.swing.JTextField nroNew;
    private javax.swing.JButton ok;
    private javax.swing.JButton payQuota;
    private javax.swing.JTable quotaTbl;
    private javax.swing.JFrame quotasPagas;
    private javax.swing.JButton saveNew;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
