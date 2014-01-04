/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webExceptions;

/**
 *
 * @author media
 */
public class KarteNichtVerfuegbarException extends Exception{
    private int kartenId;
   
    public KarteNichtVerfuegbarException(int id){
        kartenId  = id;

    }
    
    public int getKartenId(){
        return kartenId;
    }
    
    
}
