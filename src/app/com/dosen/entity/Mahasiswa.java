/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.com.dosen.entity;

/**
 *
 * @author denis
 */
public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Jurusan;
    private String Alamat;
    private String Email;
    private String Telepon;

    public Mahasiswa() {
    }

    public Mahasiswa(String NIM, String Nama, String Jurusan, String Alamat, String Email, String Telepon) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Jurusan = Jurusan;
        this.Alamat = Alamat;
        this.Email = Email;
        this.Telepon = Telepon;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelepon() {
        return Telepon;
    }

    public void setTelepon(String Telepon) {
        this.Telepon = Telepon;
    }

    public Object getValue(int index) {
        switch (index) {
            case 0:
                return NIM;
            case 1:
                return Nama;
            case 2:
                return Jurusan;
            case 3:
                return Alamat;
            case 4:
                return Email;
            case 5:
                return Telepon;
            default:
                return null;
        }  
    }
}
