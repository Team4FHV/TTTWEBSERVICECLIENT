/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tttwebserviceClient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Monika
 */
public class WebserviceClient {

    TTTwebservice stub;

    /**
     * @param args the command line arguments
     */
    public WebserviceClient() {
        initConnection();
    }

    private void initConnection() {
        WebserviceTTTService factory = new WebserviceTTTService();
        stub = factory.getTTTwebservicePort();
    }

    public List<WebVeranstaltung> sucheVeranstaltungNachKriterien(String datum, String ort, String kuenstler) {
       List<WebVeranstaltung> rv = new ArrayList<WebVeranstaltung>();
        rv = stub.sucheVeranstaltungNachKriterien(datum, ort, kuenstler);
        return rv;
    }

    public List<WebKategorieInformation> getKategorieInfoVonVeranstaltung(WebVeranstaltungAnzeigen veranstaltung) {
        List<WebKategorieInformation> result = new ArrayList<>();
        result = stub.getKategorieInfoVonVeranstaltung(veranstaltung);
        return result;
    }

    public WebKategorieKarte getAlleFreieKartenNachKategorie(int id) {
        return stub.getAlleFreieKartenNachKategorie(id);
    }

    public void verkaufSpeichern(List<WebKarteBestellen> list) {
        
        stub.verkaufSpeichern(list);
    }

    public WebKategorieInformation getKategorieInfo(int id) {
        return stub.getKategorieInfo(id);
    }

    public WebVeranstaltung getVeranstaltungById(int veranstaltungID) {
        return stub.getVeranstaltungById(veranstaltungID);
    }

}
