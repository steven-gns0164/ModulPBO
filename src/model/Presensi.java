/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Presensi implements InterfaceStatus {

    private String tanggal;
    private int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        if (status == InterfaceStatus.HADIR) {
            return "Hadir";
        } else {
            return "Alpha";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String temp;
        if (status == 1) {
            temp = "Hadir";
        } else {
            temp = "Alpha";
        }
        return "Presensi{" + "tanggal=" + tanggal + ", status=" + temp + '}' + "\n";
    }
}