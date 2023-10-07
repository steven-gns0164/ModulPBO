package controller;

import java.util.ArrayList;
import model.Dosen;
import model.DosenHonorer;
import model.DosenTetap;
import model.Karyawan;
import model.Mahasiswa;
import model.MahasiswaDoktor;
import model.MahasiswaMagister;
import model.MahasiswaSarjana;
import model.MatkulAmbil;
import model.Staff;
import model.User;

public class Controller {

    public Controller() {

    }

    public String printUserData(String nama, ArrayList<User> listUser) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getNama().equalsIgnoreCase(nama)) {
                found = true;
                index = i;
                break;
            }
        }
        String statusUser;
        if (!found) {
            return "User not found 404";
        } else {

            if (listUser.get(index) instanceof MahasiswaDoktor) {
                statusUser = "Status = Mahasiswa Doktor";
            } else if (listUser.get(index) instanceof MahasiswaMagister) {
                statusUser = "Status = Mahasiswa Magister";
            } else if (listUser.get(index) instanceof MahasiswaSarjana) {
                statusUser = "Status = Mahasiswa Sarjana";
            } else if (listUser.get(index) instanceof DosenHonorer) {
                statusUser = "Status = Dosen Honorer";
            } else if (listUser.get(index) instanceof DosenTetap) {
                statusUser = "Status = Dosen Tetap";
            } else {
                statusUser = "Status = Karyawan";
            }
        }
        return listUser.get(index).toString() + statusUser;
    }

    public String printNilaiAkhir(String NIM, String kodeMk, ArrayList<User> listUser) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                Mahasiswa temp = (Mahasiswa) listUser.get(i);
                if (temp.getNIM().equalsIgnoreCase(NIM)) {
                    found = true;
                    index = i;
                    break;
                }
            }
        }

        if (!found) {
            return "User not found 404";
        } else {
            Mahasiswa temp = (Mahasiswa) listUser.get(index);

            if (temp instanceof MahasiswaDoktor) {
                MahasiswaDoktor temp2 = (MahasiswaDoktor) temp;
                double total = (temp2.getNilaiSidang1() + temp2.getNilaiSidang2() + temp2.getNilaiSidang3()) / 3.0;
                return "Nilai Akhir : " + total;
            } else if (temp instanceof MahasiswaMagister) {
                MahasiswaMagister temp2 = (MahasiswaMagister) temp;
                for (int i = 0; i < temp2.getListMkAmbil().size(); i++) {
                    if (temp2.getListMkAmbil().get(i).getKode().equalsIgnoreCase(kodeMk)) {
                        double total = (temp2.getListMkAmbil().get(i).getN1() + temp2.getListMkAmbil().get(i).getN2() + temp2.getListMkAmbil().get(i).getN3()) / 3.0;
                        return "Nilai Akhir : " + total;
                    }
                }
                return "Kode Matakuliah Not Found";
            } else {
                MahasiswaSarjana temp2 = (MahasiswaSarjana) temp;
                for (int i = 0; i < temp2.getListMkAmbil().size(); i++) {
                    if (temp2.getListMkAmbil().get(i).getKode().equalsIgnoreCase(kodeMk)) {
                        double total = (temp2.getListMkAmbil().get(i).getN1() + temp2.getListMkAmbil().get(i).getN2() + temp2.getListMkAmbil().get(i).getN3()) / 3.0;
                        return "Nilai Akhir : " + total;
                    }
                }
                return "Kode Matakuliah Not Found";
            }
        }
    }

    public String printRNA(String kodeMk, ArrayList<User> listUser) {
        double total = 0;
        int counter = 0;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                Mahasiswa temp = (Mahasiswa) listUser.get(i);
                if (temp instanceof MahasiswaMagister) {
                    MahasiswaMagister temp2 = (MahasiswaMagister) temp;
                    for (int j = 0; j < temp2.getListMkAmbil().size(); j++) {
                        if (temp2.getListMkAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            total += (temp2.getListMkAmbil().get(j).getN1() + temp2.getListMkAmbil().get(j).getN2() + temp2.getListMkAmbil().get(j).getN3()) / 3.0;
                            counter++;
                        }
                    }
                } else if (temp instanceof MahasiswaSarjana) {
                    MahasiswaSarjana temp2 = (MahasiswaSarjana) temp;
                    for (int j = 0; j < temp2.getListMkAmbil().size(); j++) {
                        if (temp2.getListMkAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            total += (temp2.getListMkAmbil().get(j).getN1() + temp2.getListMkAmbil().get(j).getN2() + temp2.getListMkAmbil().get(j).getN3()) / 3.0;
                            counter++;
                        }
                    }
                }
            }
        }
        return "Rata-Rata Nilai Akhir : " + (total / counter);
    }

    public String printMTL(String kodeMk, ArrayList<User> listUser) {
        int counter = 0;
        int counterMhs = 0;
        String namaMk = "";
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                counterMhs++;
                Mahasiswa temp = (Mahasiswa) listUser.get(i);
                if (temp instanceof MahasiswaMagister) {
                    MahasiswaMagister temp2 = (MahasiswaMagister) temp;
                    for (int j = 0; j < temp2.getListMkAmbil().size(); j++) {
                        if (temp2.getListMkAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            found = true;
                            namaMk = temp2.getListMkAmbil().get(j).getNama();
                            double total = (temp2.getListMkAmbil().get(j).getN1() + temp2.getListMkAmbil().get(j).getN2() + temp2.getListMkAmbil().get(j).getN3()) / 3.0;
                            if (total < 56) {
                                counter++;
                            }
                            break;
                        }

                    }
                } else if (temp instanceof MahasiswaSarjana) {
                    MahasiswaSarjana temp2 = (MahasiswaSarjana) temp;
                    for (int j = 0; j < temp2.getListMkAmbil().size(); j++) {
                        if (temp2.getListMkAmbil().get(j).getKode().equalsIgnoreCase(kodeMk)) {
                            found = true;
                            namaMk = temp2.getListMkAmbil().get(j).getNama();
                            double total = (temp2.getListMkAmbil().get(j).getN1() + temp2.getListMkAmbil().get(j).getN2() + temp2.getListMkAmbil().get(j).getN3()) / 3.0;
                            if (total < 56) {
                                counter++;
                            }
                            break;
                        }
                    }
                }
            }
        }
        if (found) {
            return "<" + counter + "> dari <" + counterMhs + "> mahasiswa tidak lulus matakuliah <" + namaMk + ">";
        } else {
            return "Matakuliah tidak ditemukan";
        }

    }

    public String printMA(String NIM, ArrayList<User> listUser) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                Mahasiswa temp = (Mahasiswa) listUser.get(i);
                if (temp.getNIM().equalsIgnoreCase(NIM)) {
                    found = true;
                    index = i;
                    break;
                }
            }
        }

        if (!found) {
            return "User Not Found 404";
        } else {
            Mahasiswa temp = (Mahasiswa) listUser.get(index);

            if (temp instanceof MahasiswaDoktor) {
                return "Mahasiswa Doktor tidak memiliki matakuliah yang diambil";
            } else if (temp instanceof MahasiswaMagister) {
                MahasiswaMagister temp2 = (MahasiswaMagister) temp;
                String output = "";
                for (int i = 0; i < temp2.getListMkAmbil().size(); i++) {
                    output += "==" + temp2.getListMkAmbil().get(i).getNama() + "==\n";
                    output += "List Presensi :\n";
                    for (int j = 0; j < temp2.getListMkAmbil().get(i).getListPresensi().size(); j++) {
                        output += temp2.getListMkAmbil().get(i).getListPresensi().get(j).getTanggal() + " " + temp2.getListMkAmbil().get(i).getListPresensi().get(j).getStatus() + "\n";
                    }
                }
                return output;
            } else {
                MahasiswaSarjana temp2 = (MahasiswaSarjana) temp;
                String output = "";
                for (int i = 0; i < temp2.getListMkAmbil().size(); i++) {
                    output += "======" + temp2.getListMkAmbil().get(i).getNama() + "======\n";
                    output += "List Presensi :\n";
                    for (int j = 0; j < temp2.getListMkAmbil().get(i).getListPresensi().size(); j++) {
                        output += temp2.getListMkAmbil().get(i).getListPresensi().get(j).getTanggal() + " " + temp2.getListMkAmbil().get(i).getListPresensi().get(j).getStatus() + "\n";
                    }
                }
                return output;

            }
        }
    }

    public String printTG(String NIK, ArrayList<User> listUser) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Dosen) {
                Dosen temp = (Dosen) listUser.get(i);
                if (temp.getNIK().equalsIgnoreCase(NIK)) {
                    found = true;
                    index = i;
                    break;
                }
            }
        }

        if (!found) {
            return "Dosen Tidak ditemukan";
        } else {
            Dosen temp = (Dosen) listUser.get(index);

            if (temp instanceof DosenHonorer) {
                DosenHonorer temp2 = (DosenHonorer) temp;
                double total = 0;
                for (int i = 0; i < temp2.getListMkAjar().size(); i++) {
                    for (int j = 0; j < temp2.getListMkAjar().get(i).getListPresensiStaff().size(); j++) {
                        if (temp2.getListMkAjar().get(i).getListPresensiStaff().get(j).getStatus().equalsIgnoreCase("Hadir")) {
                            total += temp2.getListMkAjar().get(i).getListPresensiStaff().get(j).getJam();
                        }
                    }
                }

                return temp2.getNama() + " sudah mengajar dengan total " + total + " jam";
            } else {
                DosenTetap temp2 = (DosenTetap) temp;
                double total = 0;
                for (int i = 0; i < temp2.getListMkAjar().size(); i++) {
                    for (int j = 0; j < temp2.getListMkAjar().get(i).getListPresensiStaff().size(); j++) {
                        if (temp2.getListMkAjar().get(i).getListPresensiStaff().get(j).getStatus().equalsIgnoreCase("Hadir")) {
                            total += temp2.getListMkAjar().get(i).getListPresensiStaff().get(j).getJam();
                        }
                    }
                }

                return temp2.getNama() + " sudah mengajar dengan total " + total + " jam";
            }
        }
    }

    public String printGS(String NIK, ArrayList<User> listUser) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Staff) {
                Staff temp = (Staff) listUser.get(i);
                if (temp.getNIK().equalsIgnoreCase(NIK)) {
                    found = true;
                    index = i;
                    break;
                }
            }
        }
        if (!found) {
            return "Staff tidak ditemukan";
        } else {
            Staff temp = (Staff) listUser.get(index);
            if (temp instanceof Karyawan) {
                Karyawan temp2 = (Karyawan) temp;
                int unit = 0;
                for (int i = 0; i < temp2.getListPresensiStaff().size(); i++) {
                    if (temp2.getListPresensiStaff().get(i).getStatus().equalsIgnoreCase("Hadir")) {
                        unit++;
                    }
                }
                double gaji = unit / 22.0 * temp2.getSalary();
                return "Gaji Karyawan = " + gaji;
            } else {
                Dosen temp2 = (Dosen) temp;
                if (temp2 instanceof DosenHonorer) {
                    DosenHonorer temp3 = (DosenHonorer) temp2;
                    int unit = 0;
                    for (int i = 0; i < temp3.getListMkAjar().size(); i++) {
                        for (int j = 0; j < temp3.getListMkAjar().get(i).getListPresensiStaff().size(); j++) {
                            if (temp3.getListMkAjar().get(i).getListPresensiStaff().get(j).getStatus().equalsIgnoreCase("Hadir")) {
                                unit++;
                            }
                        }
                    }
                    double gaji = temp3.getHonorPerSks() * unit;
                    return "Gaji Dosen Honorer = " + gaji;
                } else {
                    DosenTetap temp3 = (DosenTetap) temp2;
                    int unit = 0;
                    for (int i = 0; i < temp3.getListMkAjar().size(); i++) {
                        for (int j = 0; j < temp3.getListMkAjar().get(i).getListPresensiStaff().size(); j++) {
                            if (temp3.getListMkAjar().get(i).getListPresensiStaff().get(j).getStatus().equalsIgnoreCase("Hadir")) {
                                unit++;
                            }
                        }
                    }
                    double gaji = temp3.getSalary() + (unit * 25000);
                    return "Gaji Dosen Tetap = " + gaji;
                }
            }
        }
    }
}
