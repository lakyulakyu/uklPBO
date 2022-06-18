/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 polimerpism inteface
*/
package inhiretance;

/**
 *
 * @author hp
 */
public interface User {//sebagai penghubung antara kelas 
    public abstract void setNama (String nama); 
    public abstract void setAlamat (String alamat); 
    public abstract void setTelepon (String Telepon); 
    public abstract void setKelamin (String Kelamin);//untuk mengubah/menambah data dari setkelamin
    
    public String getNama (int id); 
    public String getAlamat (int id); 
    public String getTelepon (int id); 
    public String getKelamin (int id);//untuk mendapatkan data dari getkelamin

}