/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhiretance;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public  class JenisLaundry {//class

    private ArrayList<String> namaJenisLaundry = new ArrayList<String>();//variable//array list
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
//menambahobject baru
    public JenisLaundry() {//constructor
        setNamaJenisLaundry("Cuci Kering Reguler");
        setDurasi(3);//untuk menyeting waktu 
        setHarga(5000);//untuk menyeting harga

        setNamaJenisLaundry("Cuci Kering Kilat");
        setDurasi(2);
        setHarga(8500);

        setNamaJenisLaundry("Cuci Kering Express");
        setDurasi(1);
        setHarga(10000);
    }

    public int getJmlJenisLaundry(){
        return this.namaJenisLaundry.size();// mengecek banyakjumlah rray
    }
    public void setNamaJenisLaundry(String namaJenisLaundry ){//method void huruf
        this.namaJenisLaundry.add(namaJenisLaundry);//menambah jenis laundry
    }
    public String getNamaJenisLaundry(int idJenisLaundry){
        return this.namaJenisLaundry.get(idJenisLaundry);//mengambil data laundry
    }

    public void setDurasi(int durasi ){
        this.durasi.add(durasi);
    }
    public int getDurasi(int idJenisLaundry){//method int untuk angka
        return this.durasi.get(idJenisLaundry);
    }

    public void editDurasi(int idJenisLaundry, int durasi){
        this.durasi.set(idJenisLaundry, durasi);
    }
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idJenisLaundry){
        return this.harga.get(idJenisLaundry);
    }
}
    

