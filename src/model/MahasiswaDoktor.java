/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class MahasiswaDoktor extends Mahasiswa {

    private String judulDisertasi;
    private double nilaiSidang1, nilaiSidang2, nilaiSidang3;

    public MahasiswaDoktor(String judulDisertasi, double nilaiSidang1, double nilaiSidang2, double nilaiSidang3, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public double getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(double nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public double getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(double nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public double getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(double nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "MahasiswaDoktor{" + "judulDisertasi=" + judulDisertasi + ", nilaiSidang1=" + nilaiSidang1 + ", nilaiSidang2=" + nilaiSidang2 + ", nilaiSidang3=" + nilaiSidang3 + '}' + "\n";
    }
}
