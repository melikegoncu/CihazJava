/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cihazjava;

import java.util.Scanner;

/**
 *
 * @author Melike Göncü
 */
public class MIB implements IMIB {
    Scanner input =new Scanner(System.in);
       public static IMIB mib;
        IAgArayuzu arayuz=AgArayuzu.AgArayuzuolus();
        DatabaseConnection data=DatabaseConnection.DatabaseOl();   


    public static IMIB AgArayuzuolus()
    {
        if(mib==null)
            mib=new MIB();
        return mib;
    }
   
   
    public void Giris(){
        
        System.out.println("Kullanıcı Adı Giriniz:");
        String Ad=input.nextLine();
        System.out.println("Şifre Giriniz:");
        String Password=input.nextLine();
        if(!data.getdbCon(Ad,Password))
            Giris();
    }
    public void Menu(){
        System.out.println("1-Sıcaklık Ölç");
        System.out.println("2-Soğutucuyu Aç");
        System.out.println("3-Soğutucuyu Kapat");
        System.out.println("4-Çıkış");
        
        
        int secenek= input.nextInt();//ilk seçenek alınır
         
        while(secenek!=4){
            
        switch(secenek){
            
            case 1:
                arayuz.sicaklikGetir();
                break;
                
            case 2:
                arayuz.sogutucuAc();
                break;
                
            case 3:                 
                arayuz.sogutucuKapat();

                break;
            case 4:
                System.out.println("CIKIS YAPILDI");
                break;
                
            default:
                throw new IllegalArgumentException("Gecersiz rakam");
            }
        secenek= input.nextInt();//seçenek 1-2-3 ise alınmaya devam edilir
        }
    }



}
