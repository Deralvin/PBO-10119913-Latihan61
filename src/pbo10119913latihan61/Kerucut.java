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
public class Kerucut implements BangunRuang
{
    private int jari, tinggi;
    
    public Kerucut()
    {
        System.out.println("Kerucut");
    }

    public int getJariJari() 
    {
        return jari;
    }

    public void setJariJari(int jariJari) 
    {
        this.jari = jariJari;
    }

    public int getTinggi() 
    {
        return tinggi;
    }

    public void setTinggi(int tinggi) 
    {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() 
    {
        return (3.14 * jari * jari * tinggi) / 3;
    }
}