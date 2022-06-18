/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhiretance;

import java.util.ArrayList;//untukmenginputkan data yang di pilih dari array list yang di sediakan
import java.util.Scanner;//untuk menginputkan data yanng di pilih dari user
/**
 *
 * @author hp
 */
public class Transaksi { //class
    //tipe data
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();//variable
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenisLaundry) {
        Scanner myObj = new Scanner(System.in);//untuk me inputkan pilihan user
        System.out.println("Silahkan Laundry");
        System.out.print("Masukkan ID Client : ");
        int idClient = myObj.nextInt();//untuk me inputkan pilihan user
        System.out.println("Selamat Datang " + client.getNama(idClient)+("  -")+client.getKelamin(idClient));

        int i = 0; //ini adalah perulangan untuk mengulang berapakali memasukkan data 
        int temp = 0;
        do {
            System.out.print("Masukkan kode jenis laundry (masukkan kode 00 untuk berhenti):");
            temp = myObj.nextInt();
            if (temp != 00) {
                idJenisLaundry.add(temp);
                System.out.print(jenisLaundry.getNamaJenisLaundry(idJenisLaundry.get(i)) + " sebanyak(kg) : ");
                banyak.add(myObj.nextInt());
                
            }
        } while (temp != 00);
//untukmenampung nilai sementara 
        System.out.println();//jarak
        System.out.println("Transaksi belanja " + client.getNama(idClient) + " sebagai berikut");//print 
        System.out.println("Nama Barang \t \tBanyak(kg) \tHarga \tJumlah \t");//print

        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getNamaJenisLaundry(idJenisLaundry.get(j)) + "\t"
                    + banyak.get(j) + "\t" + "\t"
                    + jenisLaundry.getHarga(idJenisLaundry.get(j)) + "/kg" + "\t"
                    + jumlah);
            transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j),
                    banyak.get(j));
        }

        System.out.println("Total Laundry : " + total); //ini adalah batas dari perhitungan saldo
        if(total > client.getSaldo(idClient)){//membandingkan total dengan saldo
            System.out.println("Maaf Saldo anda tidak mencukupi");//print
            System.exit(0);//untukmenutup
        }
        client.editSaldo(idClient, client.getSaldo(idClient) - total);//untuk mengurangi jumlah saldo 
        System.out.println("Sisa Saldo " +  client.getNama(idClient) + " = "+  client.getSaldo(idClient));//print
    }



    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
        jenisLaundry.editDurasi(idJenisLaundry, jenisLaundry.getDurasi(idJenisLaundry));
    }
    //untuk menambah nilai baru

    //public Transaksi() {
    //}

    public int getIdJenisLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }


    public int getJmlTransaksi() {
        return this.idClient.size();//jumlah total untuk data client
    }
}