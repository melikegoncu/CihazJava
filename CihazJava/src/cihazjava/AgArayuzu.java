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
public class AgArayuzu implements IAgArayuzu{
    public static IAgArayuzu arayuz;
    
    public static IAgArayuzu AgArayuzuolus()
    {
        if(arayuz==null)
            arayuz=new AgArayuzu();
        return arayuz;
    }
    IAlgilayici hava=Algilayici.AlgilayiciOlustur();   
    IObserver observe=Observer.ObserverOlustur();
    IEyleyici sogutucu=Eyleyici.Eyleyiciolus();
    
            public void sogutucuAc(){
                sogutucu.SogutucuAc();
            }
        public void sogutucuKapat(){
            sogutucu.SogutucuKapa();
        }
        public void sicaklikGetir(){
            System.out.println("Sicaklik: "+hava.SicaklikOku());
            if(hava.SicaklikOku()<50)
                observe.MesajOlustur();
        }

}
