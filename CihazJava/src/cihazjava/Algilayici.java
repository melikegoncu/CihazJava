/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cihazjava;
import java.util.Random;


/**
 *
 * @author Melike Göncü
 */
public class Algilayici implements IAlgilayici{
    Random rand = new Random();
        private int sicaklik;

    public static IAlgilayici algilayici;
    public static IAlgilayici AlgilayiciOlustur()
    {
        if(algilayici==null)
            algilayici=new Algilayici();
        return algilayici;
    }
    
    private Algilayici()
    {      
        sicaklik=0;
    }
    public int SicaklikOku()
    {
        sicaklik=rand.nextInt(100);
        return sicaklik;
    }
    
}
