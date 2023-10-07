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
public class DosenHonorer extends Dosen {

    private int honorPerSks;
    ArrayList<MatkulAjar> listMkAjar = new ArrayList<MatkulAjar>();

    public DosenHonorer(int honorPerSks, String departemen, String NIK, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAjar> listMkAjar) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.honorPerSks = honorPerSks;
        this.listMkAjar = listMkAjar;
    }

    @Override
    public ArrayList<MatkulAjar> getListMkAjar() {
        return listMkAjar;
    }

    @Override
    public void setListMkAjar(ArrayList<MatkulAjar> listMkAjar) {
        this.listMkAjar = listMkAjar;
    }

    public int getHonorPerSks() {
        return honorPerSks;
    }

    public void setHonorPerSks(int honorPerSks) {
        this.honorPerSks = honorPerSks;
    }

    @Override
    public String toString() {
        return "DosenHonorer{" + "honorPerSks=" + honorPerSks + ", listMkAjar=" + listMkAjar + '}';
    }
}