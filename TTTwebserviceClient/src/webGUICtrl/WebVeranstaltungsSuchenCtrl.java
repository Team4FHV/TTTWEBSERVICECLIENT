
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webGUICtrl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import tttwebserviceClient.WebserviceClient;
import webserviceDTO.*;

/**
 *
 * @author Monika
 */
public class WebVeranstaltungsSuchenCtrl {

    private ArrayList<WebVeranstaltung> _veranstaltungen = new ArrayList<>();
    private WebserviceClient _client;

    public WebVeranstaltungsSuchenCtrl(WebserviceClient client) {
        _client = client;
        _veranstaltungen = _client.sucheVeranstaltungNachKriterien("", "", "");
    }

    public void searchingForEvents(String date, String place, String artist) {
        _veranstaltungen = _client.sucheVeranstaltungNachKriterien(date, place, artist);
    }

    public void VeranstaltungAnzeigen(int vId) {
        WebMainGuiCtrl.VeranstaltungAusgewaehlt(vId);
    }

    public TableModel getVeranstaltungInfoModel() {
        Object[][] ob = new Object[_veranstaltungen.size()][5];
        for (int i = 0; i < _veranstaltungen.size(); i++) {
            WebVeranstaltung ev = _veranstaltungen.get(i);
            ob[i][0] = ev.vDatum;
            ob[i][1] = ev.vName;
            ob[i][2] = ev.vOrt;
            ob[i][3] = ev.kuenstler;
            ob[i][4] = ev.vid;
        }
        return (new DefaultTableModel(ob, new String[]{
            "Datum", "Name", "Ort", "Künstler", "Id"
        }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    public void CancelClicked() {
        WebMainGuiCtrl.VeranstaltungCancel();
    }
}
