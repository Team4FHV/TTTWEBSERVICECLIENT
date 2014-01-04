/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tttwebserviceClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import webserviceDTO.*;

/**
 *
 * @author Monika
 */
public class WebserviceClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public ArrayList<WebVeranstaltung> sucheVeranstaltungNachKriterien(String datum, String ort, String kuenstler) {
        ArrayList<WebVeranstaltung> result = new ArrayList<>();
        WebVeranstaltung[] list = Stub.sucheVeranstaltungNachKriterien(datum, ort, kuenstler);
        result.addAll(Arrays.asList(list));
        return result;
    }

    public ArrayList<WebKategorieInformation> getKategorieInfoVonVeranstaltung(WebVeranstaltungAnzeigen veranstaltung) {
        ArrayList<WebKategorieInformation> result = new ArrayList<>();
        WebKategorieInformation[] list = Stub.getKategorieInfoVonVeranstaltung(veranstaltung);
        result.addAll(Arrays.asList(list));
        return result;
    }

    public WebKategorieKarte getAlleFreieKartenNachKategorie(int id) {
        return Stub.getAlleFreieKartenNachKategorie(new WebKategorieAuswaehlen(id));
    }

    public void verkaufSpeichern(List<WebKarteBestellen> list) {
        WebKarteBestellen[] karten = new WebKarteBestellen[list.size()];
        for (int i = 0; i < list.size(); i++) {
            karten[i] = list.get(i);
        }
        Stub.verkaufSpeichern(karten);
    }

    public WebKategorieInformation getKategorieInfo(int id) {
        return Stub.getKategorieInfo(id);
    }

    public WebVeranstaltung getVeranstaltungById(int veranstaltungID) {
        return new WebVeranstaltung(veranstaltungID, "", "", "", "", true);
    }

}
