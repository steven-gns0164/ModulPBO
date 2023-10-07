/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import model.DosenHonorer;
import model.DosenTetap;
import model.InterfaceStatus;
import model.Karyawan;
import model.MahasiswaDoktor;
import model.MahasiswaMagister;
import model.MahasiswaSarjana;
import model.Matakuliah;
import model.MatakuliahPilihan;
import model.MatkulAjar;
import model.MatkulAmbil;
import model.Presensi;
import model.PresensiStaff;
import model.User;
import view.MainMenu;
/**
 *
 * @author Asus
 */
public class Main {

    public static ArrayList<User> listUser = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Presensi> listPresensi = new ArrayList<>();
        ArrayList<Presensi> listPresensi2 = new ArrayList<>();
        ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();
        ArrayList<PresensiStaff> listPresensiStaff2 = new ArrayList<>();
        ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();
        ArrayList<MatkulAmbil> listMatkulAmbil2 = new ArrayList<>();
        ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<>();
        ArrayList<MatkulAjar> listMatkulAjar2 = new ArrayList<>();

        Matakuliah mk1 = new Matakuliah("IF-502", 3, "Interaksi Manusia dan Komputer");
        Matakuliah mk2 = new Matakuliah("IF-305", 3, "Matvek for Informatics");
        Matakuliah mk3 = new Matakuliah("IF-303", 2, "Sistem Berkas");
        MatakuliahPilihan mk4 = new MatakuliahPilihan(10, "KU-202", 2, "Kalkulus 2");

        Presensi ps1 = new Presensi("19-6-2023", InterfaceStatus.HADIR);
        Presensi ps2 = new Presensi("20-6-2023", InterfaceStatus.ALPHA);
        Presensi ps3 = new Presensi("21-6-2023", InterfaceStatus.HADIR);
        Presensi ps11 = new Presensi("19-6-2023", InterfaceStatus.ALPHA);
        Presensi ps22 = new Presensi("20-6-2023", InterfaceStatus.ALPHA);
        Presensi ps33 = new Presensi("21-6-2023", InterfaceStatus.HADIR);
        PresensiStaff ps4 = new PresensiStaff(2, "19-6-2023", InterfaceStatus.HADIR);
        PresensiStaff ps5 = new PresensiStaff(3, "20-6-2023", InterfaceStatus.HADIR);
        PresensiStaff ps6 = new PresensiStaff(1, "21-6-2023", InterfaceStatus.ALPHA);
        PresensiStaff ps44 = new PresensiStaff(2, "19-6-2023", InterfaceStatus.HADIR);
        PresensiStaff ps55 = new PresensiStaff(2, "20-6-2023", InterfaceStatus.HADIR);
        PresensiStaff ps66 = new PresensiStaff(3, "21-6-2023", InterfaceStatus.HADIR);

        listPresensi.add(ps1);
        listPresensi.add(ps2);
        listPresensi.add(ps3);
        listPresensi2.add(ps11);
        listPresensi2.add(ps22);
        listPresensi2.add(ps33);
        listPresensiStaff.add(ps4);
        listPresensiStaff.add(ps5);
        listPresensiStaff.add(ps6);
        listPresensiStaff2.add(ps44);
        listPresensiStaff2.add(ps55);
        listPresensiStaff2.add(ps66);

        listMatkulAmbil.add(new MatkulAmbil(78.2, 86.0, 80.8, "IF-502", 3, "Interaksi Manusia dan Komputer", listPresensi));
        listMatkulAmbil.add(new MatkulAmbil(86.0, 95.0, 70.0, "IF-305", 3, "Matvek for Informatics", listPresensi));
        listMatkulAmbil.add(new MatkulAmbil(85.5, 94.5, 90.0, "IF-303", 2, "Sistem Berkas", listPresensi));
        listMatkulAmbil2.add(new MatkulAmbil(60.5, 56.3, 67.2, "IF-502", 3, "Interaksi Manusia dan Komputer", listPresensi2));
        listMatkulAmbil2.add(new MatkulAmbil(40.4, 54.0, 90.6, "IF-305", 3, "Matvek for Informatics", listPresensi2));
        listMatkulAmbil2.add(new MatkulAmbil(75.3, 65.5, 35.2, "IF-303", 2, "Sistem Berkas", listPresensi2));

        MahasiswaSarjana steven = new MahasiswaSarjana("1122042", "Informatika", "Steven", "Sekeloa", "Kudus, 1 Juni 2004", "081575271164", listMatkulAmbil);
        MahasiswaMagister brian = new MahasiswaMagister("Interaksi Manusia terhadap Teknologi AI Development", "1122044", "Informatika", "Brian", "Cibiru", "Bandung, 12 Juni 2004", "085321710616", listMatkulAmbil2);
        MahasiswaDoktor devid = new MahasiswaDoktor("Artificial Intellegent Science di Masa Depan", 95.2, 100, 93.8, "1122045", "Informatika", "Devid", "Cicalengka", "Bandung, 24 November 2004", "085740700347");

        listMatkulAjar.add(new MatkulAjar("IF-502", 3, "Interaksi Manusia dan Komputer", listPresensiStaff));
        listMatkulAjar.add(new MatkulAjar("IF-305", 3, "Matvek for Informatics", listPresensiStaff));
        listMatkulAjar.add(new MatkulAjar("IF-303", 2, "Sistem Berkas", listPresensiStaff));
        listMatkulAjar2.add(new MatkulAjar("IF-502", 3, "Interaksi Manusia dan Komputer", listPresensiStaff2));
        listMatkulAjar2.add(new MatkulAjar("IF-305", 3, "Matvek for Informatics", listPresensiStaff2));
        listMatkulAjar2.add(new MatkulAjar("IF-303", 2, "Sistem Berkas", listPresensiStaff2));

        DosenHonorer dion = new DosenHonorer(1550000, "Informatika", "1119001", "Dion", "Kopo", "Bandung, 11 April 1995", "085987567321", listMatkulAjar);
        DosenTetap ray = new DosenTetap(1500000, "Menejemen", "3219002", "Ray", "Ciparay", "Banten, 29 Februari 1996", "081532765810", listMatkulAjar2);
        Karyawan apep = new Karyawan(550000, "0020007", "Apep", "Lengkong", "Bandung, 10 Desember 1986", "089432547813", listPresensiStaff2);

        listUser.add(steven);
        listUser.add(brian);
        listUser.add(devid);
        listUser.add(dion);
        listUser.add(ray);
        listUser.add(apep);

        new MainMenu();
    }
}
