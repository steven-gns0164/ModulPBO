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
public abstract class Dosen extends Staff {

    private ArrayList<MatkulAjar> listMkAjar = new ArrayList<MatkulAjar>();
    private String departemen;

    public Dosen(String departemen, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMkAjar() {
        return listMkAjar;
    }

    public void setListMkAjar(ArrayList<MatkulAjar> listMkAjar) {
        this.listMkAjar = listMkAjar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return super.toString() + "Dosen{" + "listMkAjar=" + listMkAjar + ", departemen=" + departemen + '}';
    }
}