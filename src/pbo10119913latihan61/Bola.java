/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan61;

/**
 * *  Nama : Muhammad Alvin Rizqi Ramadhan
 *  Kelas : IF10K
 *  NIM : 10119913
 *  Deskripsi : Perhitungan Bangun Ruang
 * @author Lenovo
 */
public class Bola implements BangunRuang{
    private double jari;
    
    public void setJari(double jari){
        this.jari = jari;
    }
    
    public double getJari(){
        return this.jari;
    }

    @Override
    public double hitungVolume() {
 return (4 * 3.14 * jari * jari * jari) / 3;    
//To change body of generated methods, choose Tools | Templates.
    }
    
    
}

