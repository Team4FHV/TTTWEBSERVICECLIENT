/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tttwebserviceClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import webservice.TTTwebservice;
import webserviceDTO.*;

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
        //  TTTwebserviceService factory = new TTTwebserviceService();
        //stub = factory.getTTTwebservicePort();
    }

    public ArrayList<WebVeranstaltung> sucheVeranstaltungNachKriterien(String datum, String ort, String kuenstler) {
        ArrayList<WebVeranstaltung> result = new ArrayList<>();
        WebVeranstaltung[] list = stub.sucheVeranstaltungNachKriterien(datum, ort, kuenstler);
        result.addAll(Arrays.asList(list));
        return result;
    }

    public ArrayList<WebKategorieInformation> getKategorieInfoVonVeranstaltung(WebVeranstaltungAnzeigen veranstaltung) {
        ArrayList<WebKategorieInformation> result = new ArrayList<>();
        WebKategorieInformation[] list = stub.getKategorieInfoVonVeranstaltung(veranstaltung);
        result.addAll(Arrays.asList(list));
        return result;
    }

    public WebKategorieKarte getAlleFreieKartenNachKategorie(int id) {
        return stub.getAlleFreieKartenNachKategorie(new WebKategorieAuswaehlen(id));
    }

    public void verkaufSpeichern(List<WebKarteBestellen> list) {
        WebKarteBestellen[] karten = new WebKarteBestellen[list.size()];
        for (int i = 0; i < list.size(); i++) {
            karten[i] = list.get(i);
        }
        stub.verkaufSpeichern(karten);
    }

    public WebKategorieInformation getKategorieInfo(int id) {
        return stub.getKategorieInfo(id);
    }

    public WebVeranstaltung getVeranstaltungById(int veranstaltungID) {
        return new WebVeranstaltung(veranstaltungID, "", "", "", "", true);
    }

}
