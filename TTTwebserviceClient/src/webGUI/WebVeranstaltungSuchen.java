/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webGUI;

import webGUICtrl.WebVeranstaltungsSuchenCtrl;
import java.awt.Frame;
import java.util.List;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Monika
 */
public class WebVeranstaltungSuchen extends javax.swing.JFrame {

    private WebVeranstaltungsSuchenCtrl ctrl;
    private int veranstId;
    private List<Object[]> tempVeranstInfoList = new LinkedList<>();

    /**
     * Creates new form CorbaVeranstaltungSuchen
     */
    public WebVeranstaltungSuchen(WebVeranstaltungsSuchenCtrl controller) {
        initComponents();
        this.setVisible(true);
        ctrl = controller;
        loadComponents();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelScreen = new javax.swing.JPanel();
        jPanelScreenTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelEventSearch = new javax.swing.JPanel();
        jPanelSearchLabels = new javax.swing.JPanel();
        jLabelDate = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelArtist = new javax.swing.JLabel();
        jPanelSearchButton = new javax.swing.JPanel();
        jPanelSearchInput = new javax.swing.JPanel();
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldPlace = new javax.swing.JTextField();
        jTextFieldArtist = new javax.swing.JTextField();
        jPanelDeleteSearchButton = new javax.swing.JPanel();
        jButtonSearchStart = new javax.swing.JButton();
        jPanelSearchDelete = new javax.swing.JPanel();
        jButtonSearchDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelEventTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVeranstaltungen = new javax.swing.JTable();
        jPanelSelectBack = new javax.swing.JPanel();
        jPaneSelect = new javax.swing.JPanel();
        jPanelBackButton = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jButtonAnzeigen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jPanelScreen.setBackground(new java.awt.Color(204, 153, 0));
        jPanelScreen.setLayout(new java.awt.GridLayout(5, 1));

        jPanelScreenTitle.setBackground(new java.awt.Color(204, 153, 0));
        jPanelScreenTitle.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setText("Veranstaltung suchen");
        jPanelScreenTitle.add(jLabel1);

        jPanelScreen.add(jPanelScreenTitle);

        jPanelEventSearch.setBackground(new java.awt.Color(204, 153, 0));
        jPanelEventSearch.setLayout(new java.awt.GridLayout(2, 4));

        jPanelSearchLabels.setBackground(new java.awt.Color(204, 153, 0));
        jPanelSearchLabels.setLayout(new java.awt.GridLayout(1, 1));

        jLabelDate.setText("Datum");
        jPanelSearchLabels.add(jLabelDate);

        jLabelName.setText("Veranstaltungsort");
        jPanelSearchLabels.add(jLabelName);

        jLabelArtist.setText("Künstler");
        jPanelSearchLabels.add(jLabelArtist);

        jPanelSearchButton.setBackground(new java.awt.Color(204, 153, 0));
        jPanelSearchButton.setLayout(new java.awt.GridLayout(1, 1));
        jPanelSearchLabels.add(jPanelSearchButton);

        jPanelEventSearch.add(jPanelSearchLabels);

        jPanelSearchInput.setBackground(new java.awt.Color(204, 153, 0));
        jPanelSearchInput.setLayout(new java.awt.GridLayout(1, 5));
        jPanelSearchInput.add(jTextFieldDate);
        jPanelSearchInput.add(jTextFieldPlace);
        jPanelSearchInput.add(jTextFieldArtist);

        jPanelDeleteSearchButton.setBackground(new java.awt.Color(204, 153, 0));
        jPanelDeleteSearchButton.setLayout(new java.awt.GridLayout(1, 1));

        jButtonSearchStart.setText("Suchen");
        jButtonSearchStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchStartActionPerformed(evt);
            }
        });
        jPanelDeleteSearchButton.add(jButtonSearchStart);

        jPanelSearchInput.add(jPanelDeleteSearchButton);

        jPanelSearchDelete.setBackground(new java.awt.Color(204, 153, 0));
        jPanelSearchDelete.setLayout(new java.awt.GridLayout(1, 0));

        jButtonSearchDelete.setText("Eingabe löschen");
        jButtonSearchDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchDeleteActionPerformed(evt);
            }
        });
        jPanelSearchDelete.add(jButtonSearchDelete);

        jPanelSearchInput.add(jPanelSearchDelete);

        jPanelEventSearch.add(jPanelSearchInput);

        jPanelScreen.add(jPanelEventSearch);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        jPanelScreen.add(jPanel1);

        jPanelEventTable.setBackground(new java.awt.Color(204, 153, 0));
        jPanelEventTable.setLayout(new java.awt.GridLayout(1, 1));

        jTableVeranstaltungen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Datum", "Name", "Ort", "Künstler", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVeranstaltungen.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableVeranstaltungen.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableVeranstaltungen);

        jPanelEventTable.add(jScrollPane1);

        jPanelScreen.add(jPanelEventTable);

        jPanelSelectBack.setBackground(new java.awt.Color(204, 153, 0));
        jPanelSelectBack.setLayout(new java.awt.GridLayout(1, 2));

        jPaneSelect.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPaneSelectLayout = new javax.swing.GroupLayout(jPaneSelect);
        jPaneSelect.setLayout(jPaneSelectLayout);
        jPaneSelectLayout.setHorizontalGroup(
            jPaneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPaneSelectLayout.setVerticalGroup(
            jPaneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        jPanelSelectBack.add(jPaneSelect);

        jPanelBackButton.setBackground(new java.awt.Color(204, 153, 0));
        jPanelBackButton.setLayout(new java.awt.GridLayout(2, 0));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jPanelBackButton.add(jPanel3);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jButtonBack.setText("Cancel");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBack);

        jButtonAnzeigen.setText("Veranstaltung anzeigen");
        jButtonAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnzeigenActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAnzeigen);

        jPanelBackButton.add(jPanel2);

        jPanelSelectBack.add(jPanelBackButton);

        jPanelScreen.add(jPanelSelectBack);

        getContentPane().add(jPanelScreen);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchDeleteActionPerformed
        btnSearchDeleteClicked();
    }//GEN-LAST:event_jButtonSearchDeleteActionPerformed

    private void jButtonSearchStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchStartActionPerformed
        btnSearchStartClicked();
    }//GEN-LAST:event_jButtonSearchStartActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        btnBackClicked();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnzeigenActionPerformed
        veranstaltungAnzeigen();
    }//GEN-LAST:event_jButtonAnzeigenActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        btnBackClicked();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnzeigen;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSearchDelete;
    private javax.swing.JButton jButtonSearchStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelArtist;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPaneSelect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBackButton;
    private javax.swing.JPanel jPanelDeleteSearchButton;
    private javax.swing.JPanel jPanelEventSearch;
    private javax.swing.JPanel jPanelEventTable;
    private javax.swing.JPanel jPanelScreen;
    private javax.swing.JPanel jPanelScreenTitle;
    private javax.swing.JPanel jPanelSearchButton;
    private javax.swing.JPanel jPanelSearchDelete;
    private javax.swing.JPanel jPanelSearchInput;
    private javax.swing.JPanel jPanelSearchLabels;
    private javax.swing.JPanel jPanelSelectBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVeranstaltungen;
    private javax.swing.JTextField jTextFieldArtist;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldPlace;
    // End of variables declaration//GEN-END:variables

    private void loadComponents() {
        setTableModel();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void btnSearchStartClicked() {
        String date = jTextFieldDate.getText();
        String place = jTextFieldPlace.getText();
        String artist = jTextFieldArtist.getText();
        if (date.isEmpty()) {
            date = null;
        }
        if (place.isEmpty()) {
            place = null;
        }
        if (artist.isEmpty()) {
            artist = null;
        }
        ctrl.searchingForEvents(date, place, artist);
        System.out.println(date + "," + place + "," + artist);
        setTableModel();
    }

    private void btnSearchDeleteClicked() {
        jTextFieldDate.setText("");
        jTextFieldPlace.setText("");
        jTextFieldArtist.setText("");
    }

    private void btnBackClicked() {
        ctrl.CancelClicked();
    }

    private void setTableModel() {
        jTableVeranstaltungen.setModel(ctrl.getVeranstaltungInfoModel());
        jTableVeranstaltungen.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int row = e.getFirstRow();
                int column = e.getColumn();
                TableModel model = (TableModel) e.getSource();
                Object[] changedRow = new Object[model.getColumnCount()];
                for (int i = 0; i < changedRow.length; i++) {
                    changedRow[i] = model.getValueAt(row, i);
                }
            }
        });
    }

    private void veranstaltungAnzeigen() {
        int row = jTableVeranstaltungen.getSelectedRow();
        if (row != -1) {
            int vno = (int) jTableVeranstaltungen.getValueAt(row, 4);
            ctrl.VeranstaltungAnzeigen(vno);
        }
    }

    public void Quit() {
        this.dispose();
    }
}
