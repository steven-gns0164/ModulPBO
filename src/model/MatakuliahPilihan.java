/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class MatakuliahPilihan extends Matakuliah {

    private int jumlahMinimum;

    public MatakuliahPilihan(int jumlahMinimum, String kode, int sks, String nama) {
        super(kode, sks, nama);
        this.jumlahMinimum = jumlahMinimum;
    }

    public int getJumlahMinimum() {
        return jumlahMinimum;
    }

    public void setJumlahMinimum(int jumlahMinimum) {
        this.jumlahMinimum = jumlahMinimum;
    }

    @Override
    public String toString() {
        return super.toString() + "MatakuliahPilihan{" + "jumlahMinimum=" + jumlahMinimum + '}';
    }
}