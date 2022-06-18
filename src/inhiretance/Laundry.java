/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhiretance;

/**
 *
 * @author hp
 */
public class Laundry extends Laporan {//modifire  
        public static void main(String[] args) { //main method
     JenisLaundry daftarJenisLaundry = new JenisLaundry();
     Client daftarClient = new Client();//nama class 
     Petugas penjagaToko = new Petugas();//membuat object baru
     Transaksi transaksiLaundry = new Transaksi();
     Laporan laporanLaundry = new Laporan();
        laporanLaundry.laporan(daftarClient);//untuk mengeluarkan nama client
        laporanLaundry.laporan(daftarJenisLaundry);
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        laporanLaundry.laporan(penjagaToko);
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
    }
   }