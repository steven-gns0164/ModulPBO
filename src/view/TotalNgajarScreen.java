package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class TotalNgajarScreen {

    public TotalNgajarScreen() {
        showJumlahTotalNgajar();
    }
    
    private void showJumlahTotalNgajar(){
        Controller control = new Controller();
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK : ");
        JOptionPane.showMessageDialog(null, control.printTG(nik, Main.listUser));
    }
}