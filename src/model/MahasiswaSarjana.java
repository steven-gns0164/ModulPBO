/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class MahasiswaSarjana extends Mahasiswa {

    private ArrayList<MatkulAmbil> listMkAmbil = new ArrayList<MatkulAmbil>();

    public MahasiswaSarjana(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> listMkAmbil) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.listMkAmbil = listMkAmbil;
    }

    public ArrayList<MatkulAmbil> getListMkAmbil() {
        return listMkAmbil;
    }

    public void setListMk(ArrayList<MatkulAmbil> listMk) {
        this.listMkAmbil = listMkAmbil;
    }

    @Override
    public String toString() {
        return super.toString() + "MahasiswaSarjana{" + "listMk=" + listMkAmbil + '}' + "\n";
    }
}