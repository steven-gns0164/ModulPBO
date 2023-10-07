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
public class DosenTetap extends Dosen {

    private int salary;
    ArrayList<MatkulAjar> listMkAjar = new ArrayList<MatkulAjar>();

    public DosenTetap(int salary, String departemen, String NIK, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAjar> listMkAjar) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "DosenTetap{" + "salary=" + salary + ", listMkAjar=" + listMkAjar + '}';
    }
}