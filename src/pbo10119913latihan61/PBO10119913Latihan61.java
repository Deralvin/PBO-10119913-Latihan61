/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan61;

/**
 *  Nama : Muhammad Alvin Rizqi Ramadhan
 *  Kelas : IF10K
 *  NIM : 10119913
 *  Deskripsi : Perhitungan Bangun Ruang
 * @author Lenovo
 */
public class PBO10119913Latihan61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Bola b = new Bola();
        b.setJari(7);
        System.out.println("Jari-jari \t = " + b.getJari() + " cm");
        System.out.println("Volume \t\t = " + b.hitungVolume() + " cm^3");
        
        System.out.println();
        
        Tabung t = new Tabung();
        t.setJariJari(10);
        t.setTinggi(21);
        System.out.println("Jari-jari \t = " + t.getJariJari() + " cm");
        System.out.println("Tinggi \t\t = " + t.getTinggi() + " cm");
        System.out.println("Volume \t\t = " + t.hitungVolume() + " cm^3");
        
        System.out.println();
        
        Kerucut k = new Kerucut();
        k.setJariJari(14);
        k.setTinggi(9);
        System.out.println("Jari-jari \t = " + k.getJariJari() + " cm");
        System.out.println("Tinggi \t\t = " + k.getTinggi() + " cm");
        System.out.println("Volume \t\t = " + k.hitungVolume() + " cm^3");
    }
    
}
