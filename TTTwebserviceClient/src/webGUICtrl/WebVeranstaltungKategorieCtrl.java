/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webGUICtrl;

import webserviceDTO.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import tttwebserviceClient.WebserviceClient;

/**
 *
 * @author Stefan Dietrich
 */
public class WebVeranstaltungKategorieCtrl {

    private WebVeranstaltung _veranstaltung;
    private WebserviceClient _client;
    private ArrayList<WebKategorieInformation> _kategorien;

    public WebVeranstaltungKategorieCtrl(int veranstaltungID, WebserviceClient client) {
        _client = client;
        _veranstaltung = _client.getVeranstaltungById(veranstaltungID);
        _kategorien = _client.getKategorieInfoVonVeranstaltung(new WebVeranstaltungAnzeigen(_veranstaltung.vid));
    }

    public WebVeranstaltung getVeranstaltung() {
        return _veranstaltung;
    }

    public TableModel getKategorieInfoModel() {
        Object[][] ob = new Object[_kategorien.size()][4];
        for (int i = 0; i < _kategorien.size(); i++) {
            ob[i][0] = _kategorien.get(i).kategId;
            ob[i][1] = _kategorien.get(i).katName;
            ob[i][2] = _kategorien.get(i).katPreis + "€";
            ob[i][3] = _kategorien.get(i).freiePlaetze;
        }
        return (new DefaultTableModel(
                ob,
                new String[]{
                    "KategorieID", "Kategoriename", "Kategoriepreis", "Freie Plätze"
                }) {
                    Class[] types = new Class[]{
                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
    }

    public void selectKategorie(int id) {
        WebKategorieInformation selectedKategorie = null;
        selectedKategorie = _client.getKategorieInfo(id);
        if (selectedKategorie != null) {
            WebMainGuiCtrl.KategorieAusgewählt(_veranstaltung.vid, selectedKategorie.kategId);
        }
    }

    public void cancelButton() {
        WebMainGuiCtrl.KategorieCancel();
    }

    void setVeranstaltungsID(int id) {
        _veranstaltung = _client.getVeranstaltungById(id);
        _kategorien = _client.getKategorieInfoVonVeranstaltung(new WebVeranstaltungAnzeigen(_veranstaltung.vid));
    }
}
