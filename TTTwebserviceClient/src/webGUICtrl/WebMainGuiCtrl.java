

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webGUICtrl;

import webGUI.WebVeranstaltungSuchen;
import webGUI.WebKartenInfo;
import webGUI.WebVeranstaltungKategorie;
import tttwebserviceClient.WebserviceClient;

/**
 *
 * @author Stefan Dietrich
 */
public class WebMainGuiCtrl {

    private static WebVeranstaltungSuchen _veranstaltungSuchen;
    private static WebVeranstaltungKategorie _veranstaltungKategorie;
    private static WebKartenInfo _kartenInfo;
    private static WebKartenInfoCtrl _kartenInfoCtrl;
    private static WebVeranstaltungKategorieCtrl _veranstaltungKategorieCtrl;
    private static WebVeranstaltungsSuchenCtrl _veranstaltungSuchenCtrl;
    private static WebserviceClient _client;

    public static void VeranstaltungAusgewaehlt(int veranstaltungID) {
        _veranstaltungSuchen.setVisible(false);
        _veranstaltungKategorie = new WebVeranstaltungKategorie(getVeranstaltungKategorieCtrl(veranstaltungID));
        _veranstaltungSuchen.Quit();
        _veranstaltungSuchen = null;
    }

    public static void KategorieAusgewählt(int veranstaltungID, int kategorieID) {
        _veranstaltungKategorie.setVisible(false);
        _kartenInfo = new WebKartenInfo(getKartenInfoCtrl(veranstaltungID, kategorieID));
        _veranstaltungKategorie.Quit();
        _veranstaltungKategorie = null;
    }

    public static void KategorieCancel() {
        _veranstaltungKategorie.setVisible(false);
        _veranstaltungSuchen = new WebVeranstaltungSuchen(getVeranstaltungSuchenCtrl());
        _veranstaltungKategorie.Quit();
        _veranstaltungKategorie = null;
    }

    public static void KarteCancel(int veranstaltungID) {
        _kartenInfo.setVisible(false);
        _veranstaltungKategorie = new WebVeranstaltungKategorie(getVeranstaltungKategorieCtrl(veranstaltungID));
        _kartenInfo.Quit();
        _kartenInfo = null;
    }

    public static void VeranstaltungCancel() {
        _veranstaltungSuchen.setVisible(false);
        _veranstaltungSuchen.Quit();
        _veranstaltungSuchen = null;
        System.exit(0);

    }

    public static void main(String[] args) {
        _client = new WebserviceClient(); 
        _veranstaltungSuchen = new WebVeranstaltungSuchen(getVeranstaltungSuchenCtrl());
    }

    public static WebVeranstaltungsSuchenCtrl getVeranstaltungSuchenCtrl() {
        if (_veranstaltungSuchenCtrl == null) {
            _veranstaltungSuchenCtrl = new WebVeranstaltungsSuchenCtrl(_client);
        }
        return _veranstaltungSuchenCtrl;
    }

    public static WebVeranstaltungKategorieCtrl getVeranstaltungKategorieCtrl(int id) {
        if (_veranstaltungKategorieCtrl == null) {
            _veranstaltungKategorieCtrl = new WebVeranstaltungKategorieCtrl(id, _client);
        } else {
            _veranstaltungKategorieCtrl.setVeranstaltungsID(id);
        }
        return _veranstaltungKategorieCtrl;
    }

    public static WebKartenInfoCtrl getKartenInfoCtrl(int veranstaltungID, int kategorieID) {
        if (_kartenInfoCtrl == null) {
            _kartenInfoCtrl = new WebKartenInfoCtrl(veranstaltungID, kategorieID, _client);
        } else {
            _kartenInfoCtrl.setVeranstaltung(veranstaltungID);
            _kartenInfoCtrl.setKategorieID(kategorieID);
        }
        return _kartenInfoCtrl;
    }
}
