/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webGUI;

import webGUICtrl.WebKartenInfoCtrl;
import webExceptions.KarteNichtVerfuegbarException;
import webExceptions.SaveFailedException;
import webserviceDTO.WebKategorieInformation;
import webserviceDTO.WebVeranstaltung;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Stefan Dietrich
 */
public class WebKartenInfo extends javax.swing.JFrame {

    private WebKartenInfoCtrl _ctrl;
    private List<Object[]> _kartenauswahl;

    /**
     * Creates new form CorbaKartenInfo
     */
    public WebKartenInfo(WebKartenInfoCtrl controller) {
        _ctrl = controller;
        initComponents();
        this.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        _pnlVeranstaltungInformationen = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        _lblVeranstaltungsname = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        _lblVeranstaltungsdatum = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        _lblVeranstaltungsort = new javax.swing.JLabel();
        _pnlKategorieInformationen = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        _lblKategoriename = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        _lblKategoriepreis = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        _lblFreiePlaetze = new javax.swing.JLabel();
        _pnlPreisInformation = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        _lblGesamtpreis = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _tblKarten = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        _pnlKundenNummer = new javax.swing.JPanel();
        _pnlKundenInformation = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        _btnKaufen = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        _btnCancel = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        _pnlVeranstaltungInformationen.setBackground(new java.awt.Color(204, 153, 0));
        _pnlVeranstaltungInformationen.setLayout(new java.awt.GridLayout(2, 1));

        jPanel24.setBackground(new java.awt.Color(204, 153, 0));
        jPanel24.setLayout(new java.awt.GridLayout(1, 1));

        jLabel9.setText("Veranstaltungsinformationen:");
        jPanel24.add(jLabel9);

        _pnlVeranstaltungInformationen.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(204, 153, 0));
        jPanel25.setLayout(new java.awt.GridLayout(3, 1));

        jPanel26.setBackground(new java.awt.Color(204, 153, 0));
        jPanel26.setLayout(new java.awt.GridLayout(1, 2));

        jPanel29.setBackground(new java.awt.Color(204, 153, 0));
        jPanel29.setLayout(new java.awt.GridLayout(1, 0));

        jLabel10.setText("Veranstaltungsname:");
        jPanel29.add(jLabel10);

        jPanel26.add(jPanel29);

        jPanel30.setBackground(new java.awt.Color(204, 153, 0));
        jPanel30.setLayout(new java.awt.GridLayout(1, 0));

        _lblVeranstaltungsname.setText("jLabel11");
        jPanel30.add(_lblVeranstaltungsname);

        jPanel26.add(jPanel30);

        jPanel25.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(204, 153, 0));
        jPanel27.setLayout(new java.awt.GridLayout(1, 2));

        jPanel31.setBackground(new java.awt.Color(204, 153, 0));
        jPanel31.setLayout(new java.awt.GridLayout(1, 1));

        jLabel12.setText("Datum:");
        jPanel31.add(jLabel12);

        jPanel27.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(204, 153, 0));
        jPanel32.setLayout(new java.awt.GridLayout(1, 1));

        _lblVeranstaltungsdatum.setText("jLabel13");
        jPanel32.add(_lblVeranstaltungsdatum);

        jPanel27.add(jPanel32);

        jPanel25.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(204, 153, 0));
        jPanel28.setLayout(new java.awt.GridLayout(1, 2));

        jPanel33.setBackground(new java.awt.Color(204, 153, 0));
        jPanel33.setLayout(new java.awt.GridLayout(1, 1));

        jLabel14.setText("Veranstaltungsort:");
        jPanel33.add(jLabel14);

        jPanel28.add(jPanel33);

        jPanel34.setBackground(new java.awt.Color(204, 153, 0));
        jPanel34.setLayout(new java.awt.GridLayout(1, 1));

        _lblVeranstaltungsort.setText("jLabel15");
        jPanel34.add(_lblVeranstaltungsort);

        jPanel28.add(jPanel34);

        jPanel25.add(jPanel28);

        _pnlVeranstaltungInformationen.add(jPanel25);

        jPanel1.add(_pnlVeranstaltungInformationen);

        _pnlKategorieInformationen.setBackground(new java.awt.Color(204, 153, 0));
        _pnlKategorieInformationen.setLayout(new java.awt.GridLayout(2, 1));

        jPanel35.setBackground(new java.awt.Color(204, 153, 0));
        jPanel35.setLayout(new java.awt.GridLayout(1, 1));

        jLabel16.setText("Kategorieinformationen:");
        jPanel35.add(jLabel16);

        _pnlKategorieInformationen.add(jPanel35);

        jPanel36.setBackground(new java.awt.Color(204, 153, 0));
        jPanel36.setLayout(new java.awt.GridLayout(3, 1));

        jPanel37.setLayout(new java.awt.GridLayout(1, 2));

        jPanel40.setBackground(new java.awt.Color(204, 153, 0));
        jPanel40.setLayout(new java.awt.GridLayout(1, 1));

        jLabel17.setText("Kategoriename:");
        jPanel40.add(jLabel17);

        jPanel37.add(jPanel40);

        jPanel41.setBackground(new java.awt.Color(204, 153, 0));
        jPanel41.setLayout(new java.awt.GridLayout(1, 1));

        _lblKategoriename.setText("jLabel18");
        jPanel41.add(_lblKategoriename);

        jPanel37.add(jPanel41);

        jPanel36.add(jPanel37);

        jPanel38.setLayout(new java.awt.GridLayout(1, 2));

        jPanel42.setBackground(new java.awt.Color(204, 153, 0));
        jPanel42.setLayout(new java.awt.GridLayout(1, 1));

        jLabel19.setText("Preis:");
        jPanel42.add(jLabel19);

        jPanel38.add(jPanel42);

        jPanel43.setBackground(new java.awt.Color(204, 153, 0));
        jPanel43.setLayout(new java.awt.GridLayout(1, 1));

        _lblKategoriepreis.setText("jLabel20");
        jPanel43.add(_lblKategoriepreis);

        jPanel38.add(jPanel43);

        jPanel36.add(jPanel38);

        jPanel39.setLayout(new java.awt.GridLayout(1, 2));

        jPanel44.setBackground(new java.awt.Color(204, 153, 0));
        jPanel44.setLayout(new java.awt.GridLayout(1, 1));

        jLabel21.setText("Freie Plätze:");
        jPanel44.add(jLabel21);

        jPanel39.add(jPanel44);

        jPanel45.setBackground(new java.awt.Color(204, 153, 0));
        jPanel45.setLayout(new java.awt.GridLayout(1, 1));

        _lblFreiePlaetze.setText("jLabel22");
        jPanel45.add(_lblFreiePlaetze);

        jPanel39.add(jPanel45);

        jPanel36.add(jPanel39);

        _pnlKategorieInformationen.add(jPanel36);

        jPanel1.add(_pnlKategorieInformationen);

        _pnlPreisInformation.setBackground(new java.awt.Color(204, 153, 0));
        _pnlPreisInformation.setLayout(new java.awt.GridLayout(3, 1));

        jPanel19.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        _pnlPreisInformation.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        _pnlPreisInformation.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(204, 153, 0));
        jPanel21.setLayout(new java.awt.GridLayout(1, 2));

        jPanel22.setBackground(new java.awt.Color(204, 153, 0));
        jPanel22.setLayout(new java.awt.GridLayout(1, 1));

        jLabel8.setText("Gesamtpreis:");
        jPanel22.add(jLabel8);

        jPanel21.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(204, 153, 0));
        jPanel23.setLayout(new java.awt.GridLayout(1, 1));
        jPanel23.add(_lblGesamtpreis);

        jPanel21.add(jPanel23);

        _pnlPreisInformation.add(jPanel21);

        jPanel1.add(_pnlPreisInformation);

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        _tblKarten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Auswahl", "KartenID", "Reihe", "Platz", "Ermaessigung"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(_tblKarten);
        if (_tblKarten.getColumnModel().getColumnCount() > 0) {
            _tblKarten.getColumnModel().getColumn(0).setResizable(false);
            _tblKarten.getColumnModel().getColumn(1).setResizable(false);
            _tblKarten.getColumnModel().getColumn(2).setResizable(false);
            _tblKarten.getColumnModel().getColumn(3).setResizable(false);
            _tblKarten.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new java.awt.GridLayout(1, 3));

        jPanel4.setBackground(new java.awt.Color(204, 153, 0));
        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        _pnlKundenNummer.setBackground(new java.awt.Color(204, 153, 0));
        _pnlKundenNummer.setLayout(new java.awt.GridLayout(3, 1));
        jPanel4.add(_pnlKundenNummer);

        _pnlKundenInformation.setBackground(new java.awt.Color(204, 153, 0));
        _pnlKundenInformation.setLayout(new java.awt.GridLayout(3, 1));
        jPanel4.add(_pnlKundenInformation);

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 153, 0));
        jPanel6.setLayout(new java.awt.GridLayout(3, 1));

        jPanel13.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel13);

        jPanel14.setLayout(new java.awt.GridLayout(1, 3));

        jPanel16.setBackground(new java.awt.Color(204, 153, 0));
        jPanel16.setLayout(new java.awt.GridLayout(1, 1));
        jPanel14.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 153, 0));
        jPanel17.setLayout(new java.awt.GridLayout(1, 1));

        _btnKaufen.setText("Kaufen");
        _btnKaufen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnKaufenActionPerformed(evt);
            }
        });
        jPanel17.add(_btnKaufen);

        jPanel14.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(204, 153, 0));
        jPanel18.setLayout(new java.awt.GridLayout(1, 1));

        _btnCancel.setText("Cancel");
        _btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnCancelActionPerformed(evt);
            }
        });
        jPanel18.add(_btnCancel);

        jPanel14.add(jPanel18);

        jPanel6.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel15);

        jPanel3.add(jPanel6);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _btnKaufenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnKaufenActionPerformed
        btnKaufenClicked();
    }//GEN-LAST:event__btnKaufenActionPerformed

    private void _btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnCancelActionPerformed
        btnCancelClicked();
    }//GEN-LAST:event__btnCancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        btnCancelClicked();
    }//GEN-LAST:event_formWindowClosing
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btnCancel;
    private javax.swing.JButton _btnKaufen;
    private javax.swing.JLabel _lblFreiePlaetze;
    private javax.swing.JLabel _lblGesamtpreis;
    private javax.swing.JLabel _lblKategoriename;
    private javax.swing.JLabel _lblKategoriepreis;
    private javax.swing.JLabel _lblVeranstaltungsdatum;
    private javax.swing.JLabel _lblVeranstaltungsname;
    private javax.swing.JLabel _lblVeranstaltungsort;
    private javax.swing.JPanel _pnlKategorieInformationen;
    private javax.swing.JPanel _pnlKundenInformation;
    private javax.swing.JPanel _pnlKundenNummer;
    private javax.swing.JPanel _pnlPreisInformation;
    private javax.swing.JPanel _pnlVeranstaltungInformationen;
    private javax.swing.JTable _tblKarten;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void changePreis() {
        BigDecimal preis = new BigDecimal(0);
        BigDecimal kartenpreis = new BigDecimal(_ctrl.getKategorie().katPreis);
        int ermaessigung = 100 - _ctrl.getKategorie().ermaessigung;
        BigDecimal ermaessigt = new BigDecimal(ermaessigung);
        ermaessigt = ermaessigt.divide(new BigDecimal(100));
        BigDecimal karteErmaessigt = kartenpreis.multiply(ermaessigt);
        for (Object[] o : _kartenauswahl) {
            if (o[4].equals(false)) {
                preis = preis.add(kartenpreis);
            } else {
                preis = preis.add(karteErmaessigt);
            }
        }

        _lblGesamtpreis.setText(preis.setScale(2, BigDecimal.ROUND_HALF_UP) + " €");
        _lblGesamtpreis.repaint();
    }

    private void loadComponents() {
        _kartenauswahl = new LinkedList<>();
        fillVeranstaltungsInformation();
        fillKategorieInformation();
        setTableModel();
        changePreis();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void setTableModel() {
        _tblKarten.setModel(_ctrl.getKartenInfoModel());
        _tblKarten.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int row = e.getFirstRow();
                int column = e.getColumn();
                TableModel model = (TableModel) e.getSource();
                Object[] changedRow = new Object[model.getColumnCount()];
                for (int i = 0; i < changedRow.length; i++) {
                    changedRow[i] = model.getValueAt(row, i);
                }
                if (column == 0) {
                    if ((boolean) changedRow[0] == true) {
                        karteAuswaehlen(changedRow);
                    } else {
                        karteEntfernen(changedRow);
                    }
                } else {
                    karteAendern(changedRow);
                }
                changePreis();
            }
        });
    }

    private void karteEntfernen(Object[] object) {
        int i = 0;
        while (i < _kartenauswahl.size()) {
            if (_kartenauswahl.get(i)[1].equals(object[1])) {
                _kartenauswahl.remove(i);
                break;
            } else {
                i++;
            }
        }
    }

    private void karteAuswaehlen(Object[] o) {
        _kartenauswahl.add(o);
    }

    private void karteAendern(Object[] o) {
        int i = 0;
        while (i < _kartenauswahl.size()) {
            if (_kartenauswahl.get(i)[1].equals(o[1])) {
                _kartenauswahl.remove(i);
                _kartenauswahl.add(o);
                break;
            } else {
                i++;
            }
        }
    }

    private void fillVeranstaltungsInformation() {
        WebVeranstaltung veranstaltung = _ctrl.getVeranstaltung();
        _lblVeranstaltungsname.setText(veranstaltung.getName());
        _lblVeranstaltungsdatum.setText(veranstaltung.getDatum());
        _lblVeranstaltungsort.setText(veranstaltung.getOrt());
    }

    private void fillKategorieInformation() {
        WebKategorieInformation kategorie = _ctrl.getKategorie();
        _lblKategoriename.setText(kategorie.katName);
        _lblKategoriepreis.setText(kategorie.getkatPreis() + " €");
        _lblFreiePlaetze.setText("" + kategorie.getfreiePlaetze());
    }

    private void btnKaufenClicked() {
        if (!_kartenauswahl.isEmpty()) {

            _ctrl.kartenBestellen(_kartenauswahl);
            JOptionPane.showMessageDialog(null, "Karten erfolgreich gekauft", "Success", JOptionPane.INFORMATION_MESSAGE);
            refreshWindow();
        }
        refreshWindow();
    }

    private void btnCancelClicked() {
        _ctrl.cancelClicked();
    }

    public void Quit() {
        this.dispose();
    }

    private void refreshWindow() {
        _ctrl.loadKarten();
        loadComponents();
    }
}
