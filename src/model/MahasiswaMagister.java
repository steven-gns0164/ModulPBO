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
public class MahasiswaMagister extends Mahasiswa {

    private ArrayList<MatkulAmbil> listMkAmbil = new ArrayList<MatkulAmbil>();
    private String judulTesis;

    public ArrayList<MatkulAmbil> getListMkAmbil() {
        return listMkAmbil;
    }

    public void setListMkAmbil(ArrayList<MatkulAmbil> listMkAmbil) {
        this.listMkAmbil = listMkAmbil;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    public MahasiswaMagister(String judulTesis, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> listMkAmbil) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulTesis = judulTesis;
        this.listMkAmbil = listMkAmbil;
    }

    @Override
    public String toString() {
        return super.toString() + "MahasiswaMagister{" + "listMkAmbil=" + listMkAmbil + ", judulTesis=" + judulTesis + '}' + "\n";
    }
}
