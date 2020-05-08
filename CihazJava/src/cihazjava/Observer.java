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
public class Observer implements IObserver{
        public static IObserver observe;
    public static IObserver ObserverOlustur()
    {
        if(observe==null)
            observe=new Observer();
        return observe;
    }
    public void MesajOlustur()
    {
        System.out.println("50 dereceden fazla");
    }
}
