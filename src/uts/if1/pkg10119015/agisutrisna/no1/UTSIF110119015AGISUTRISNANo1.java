/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119015.agisutrisna.no1;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : AGI SUTRISNA
 * NIM      : 10119015
 * KELAS    : IF-1
 */
public class UTSIF110119015AGISUTRISNANo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Age umur = new Age(2020);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(input.nextInt());
        System.out.println();
        System.out.println();
        System.out.println("=====Hasil Perhitungan Umur=====");
        int yearBirth = umur.getYearBirth();
        System.out.println("Tahun Lahir Anda : " + yearBirth);
        int yearNow = umur.getYearNow();
        System.out.println("Hari ini Tahun : " + yearNow);
        int usia = umur.hitungUmur();
        System.out.println("Umur kamu sampai hari ini adalah " + usia + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(usia));
    }
    
}
