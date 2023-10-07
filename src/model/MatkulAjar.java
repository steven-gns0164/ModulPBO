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
public class MatkulAjar extends Matakuliah {

    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public MatkulAjar(String kode, int sks, String nama, ArrayList<PresensiStaff> listPresensiStaff) {
        super(kode, sks, nama);
        this.listPresensiStaff = listPresensiStaff;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "MatkulAjar{" + "listPresensiStaff=" + listPresensiStaff + '}';
    }
}
