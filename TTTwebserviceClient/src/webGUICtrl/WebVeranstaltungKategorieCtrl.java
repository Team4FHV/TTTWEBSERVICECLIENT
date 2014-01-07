/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webGUICtrl;


import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import tttwebserviceClient.*;
import tttwebserviceClient.WebserviceClient;

/**
 *
 * @author Stefan Dietrich
 */
public class WebVeranstaltungKategorieCtrl {

    private WebVeranstaltung _veranstaltung;
    private WebserviceClient _client;
    private List<WebKategorieInformation> _kategorien;

    public WebVeranstaltungKategorieCtrl(int veranstaltungID, WebserviceClient client) {
        _client = client;
        _veranstaltung = _client.getVeranstaltungById(veranstaltungID);
        WebVeranstaltungAnzeigen temp = new WebVeranstaltungAnzeigen();
        temp.setVanzId(_veranstaltung.getVid());
        _kategorien = _client.getKategorieInfoVonVeranstaltung(temp);
    }

    public WebVeranstaltung getVeranstaltung() {
        return _veranstaltung;
    }

    public TableModel getKategorieInfoModel() {
        Object[][] ob = new Object[_kategorien.size()][4];
        for (int i = 0; i < _kategorien.size(); i++) {
            ob[i][0] = _kategorien.get(i).getKatinfKatId();
            ob[i][1] = _kategorien.get(i).getKatinfName();
            ob[i][2] = _kategorien.get(i).getKatinfPreis() + "€";
            ob[i][3] = _kategorien.get(i).getKatinfFreiePlaetze();
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
            WebMainGuiCtrl.KategorieAusgewählt(_veranstaltung.getVid(), selectedKategorie.getKatinfKatId());
        }
    }

    public void cancelButton() {
        WebMainGuiCtrl.KategorieCancel();
    }

    void setVeranstaltungsID(int id) {
        _veranstaltung = _client.getVeranstaltungById(id);
        WebVeranstaltungAnzeigen temp = new WebVeranstaltungAnzeigen();
        temp.setVanzId(_veranstaltung.getVid());
        _kategorien = _client.getKategorieInfoVonVeranstaltung(temp);
    }
}
