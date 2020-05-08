/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cihazjava;

/**
 *
 * @author Melike Göncü
 */
public class Eyleyici implements IEyleyici {
    
    public static IEyleyici eyleyici;
    public static IEyleyici Eyleyiciolus()
    {
        if(eyleyici==null)
            eyleyici=new Eyleyici();
        return eyleyici;
    }

    
    public void SogutucuAc()
    {
        System.out.println("Soğutucu Açıldı");
    }
    public void SogutucuKapa()
    {
        System.out.println("Soğutucu Kapatıldı");
    }

}
