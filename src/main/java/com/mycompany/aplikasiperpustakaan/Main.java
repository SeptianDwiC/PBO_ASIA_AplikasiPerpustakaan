/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplikasiperpustakaan;

/**
 *
 * @author D-14
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Perpustakaan Umum :");
        Perpustakaan perpustakaan = new PerpustakaanUmum();
        perpustakaan.pinjamBuku("Buku A");
        perpustakaan.kembalikanBuku("Buku B");
        perpustakaan.lihatDaftarBuku();
        
        System.out.println("");
        
        System.out.println("Perpustakaan Digital :");
        Perpustakaan perpustakaan1 = new PerpustakaanDigital();
        perpustakaan1.pinjamBuku("Buku B");
        perpustakaan.kembalikanBuku("Buku A");
        perpustakaan1.lihatDaftarBuku();
    }
}
