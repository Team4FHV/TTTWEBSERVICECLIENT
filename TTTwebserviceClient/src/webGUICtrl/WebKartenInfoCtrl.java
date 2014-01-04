/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webGUICtrl;

import webserviceDTO.*;
import tttwebserviceClient.WebserviceClient;
import webExceptions.KarteNichtVerfuegbarException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Stefan Dietrich
 */
public class WebKartenInfoCtrl {

    private WebVeranstaltung _veranstaltung;
    private WebKategorieInformation _kategorie;
    private WebKategorieKarte _Kategoriekarten;
    private WebserviceClient _client;

    public WebKartenInfoCtrl(int veranstaltungID, int kategorieID, WebserviceClient client) {
        _client = client;
        // try {
        _veranstaltung = client.getVeranstaltungById(veranstaltungID);
//        } catch (RemoteException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        try {
        _kategorie = client.getKategorieInfo(kategorieID);
//        } catch (RemoteException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        try {
        _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(_kategorie.getKategId());
//        } catch (RemoteException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }

    public TableModel getKartenInfo() {
        return null;
    }

    public WebVeranstaltung getVeranstaltung() {
        return _veranstaltung;
    }

    public WebKategorieInformation getKategorie() {
        return _kategorie;
    }

    public TableModel getKartenInfoModel() {
        Object[][] ob = new Object[_Kategoriekarten.kartenList.length][5];
        for (int i = 0; i < _Kategoriekarten.kartenList.length; i++) {
            WebKarte k = _Kategoriekarten.kartenList[i];
            ob[i][0] = false;
            ob[i][1] = k.kartenId;
            ob[i][2] = k.reihe;
            ob[i][3] = k.platz;
            ob[i][4] = false;
        }
        return (new DefaultTableModel(
                ob,
                new String[]{
                    "Auswählen", "KartenID", "Reihe", "Sitzplatz", "Ermäßigt"
                }) {
                    Class[] types = new Class[]{
                        java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
                    };
                    boolean[] canEdit = new boolean[]{
                        true, false, false, false, true
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
    }

    public void kartenBestellen(List<Object[]> bestellteKarten) {
        List<WebKarteBestellen> karten = new LinkedList<>();
        int kundenID = 0;
        for (Object[] o : bestellteKarten) {

            karten.add(new WebKarteBestellen((int) o[1], kundenID, (boolean) o[4]));
        }
        _client.verkaufSpeichern(karten);
        updateController();
    }

    private void updateController() {
        _kategorie = _client.getKategorieInfo(_kategorie.kategId);
        _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(_kategorie.kategId);
    }

    public void cancelClicked() {
        WebMainGuiCtrl.KarteCancel(_veranstaltung.vid);
    }

    void setVeranstaltung(int veranstaltungID) {
        _veranstaltung = _client.getVeranstaltungById(veranstaltungID);
    }

    void setKategorieID(int kategorieID) {
        _kategorie = _client.getKategorieInfo(kategorieID);
        _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(_kategorie.kategId);

    }

    public void loadKarten() {
        _Kategoriekarten = _client.getAlleFreieKartenNachKategorie(_kategorie.kategId);
    }
}
