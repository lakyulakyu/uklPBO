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
public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();//variable/atribut
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
//membuat object baru
    public Petugas() {//constructor
        setNama("mas bahagia");
        setAlamat("Sawojajar");
        setTelepon("081112223333");
        setJabatan(0);
       
        setNama("mas senang");
        setAlamat("Sawojajar");
        setTelepon("081112223333");
        setJabatan(0);
    
    }

    public void setJabatan(int jabatan ){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }//untuk mencari panjang arraylist

    @Override
    public void setNama(String namaPetugas ){
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat ){
        this.namaPetugas.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    }


    @Override  //memilik fungsi yang sama dengan parents class nya
    public void setKelamin(String Kelamin) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getKelamin(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

   
    }

    

