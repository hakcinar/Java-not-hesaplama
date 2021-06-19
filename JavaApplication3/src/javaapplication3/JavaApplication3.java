/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner scan=new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz");
        mat=scan.nextInt();
        System.out.println("Fizik Notunuzu Giriniz");
        fizik=scan.nextInt();
        System.out.println("Kimya Notunuzu Giriniz");
        kimya=scan.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz");
        turkce=scan.nextInt();
        System.out.println("Tarih Notunuzu Giriniz");
        tarih=scan.nextInt();
        System.out.println("Muzik Notunuzu Giriniz");
        muzik=scan.nextInt();
        double sonuc=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        if(sonuc>60){
            System.out.println("Sınıfı Geçti");
        }
        else{
            System.out.println("Sınıfta Kaldı");
        }
        
    }
    
}
