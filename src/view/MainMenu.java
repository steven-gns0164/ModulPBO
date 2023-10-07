package view;

import javax.swing.JOptionPane;

public class MainMenu {
    public MainMenu() {
        showMainMenu();
    }
    
    private void showMainMenu() {
        Boolean menu = true;
        while(menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                    + "MASUKKAN MENU :\n"
                    + "1. Print User Data \n"
                    + "2. Print Nilai Akhir \n"
                    + "3. Print Rata-Rata NA Seluruh Mahasiswa\n"
                    + "4. Print Mahasiswa tidak lulus matkul\n"
                    + "5. Print Matkul Ambil untuk Mahasiswa\n"
                    + "6. Print Jam Dosen Mengajar\n"
                    + "7. Print Gaji Staff\n"
                    + "8. Exit"
            ));
            switch(choosen) {
                case 1: new UserDataScreen();
                    break;
                case 2: new NAScreen();
                    break;
                case 3: new NRScreen();
                    break;
                case 4: new TidakLulusScreen(); 
                    break;
                case 5: new MatkulAmbilScreen(); 
                    break;
                case 6: new TotalNgajarScreen(); 
                    break;
                case 7: new GajiStaffScreen(); 
                    break;
                case 8: menu = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Input Error","", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}