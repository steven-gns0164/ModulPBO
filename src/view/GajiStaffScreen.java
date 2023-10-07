package view;

import javax.swing.JOptionPane;
import main.Main;
import controller.Controller;

public class GajiStaffScreen {

    public GajiStaffScreen() {
        showGajiStaff();
    }
    
    private void showGajiStaff(){
        Controller control = new Controller();
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK : ");
        JOptionPane.showMessageDialog(null, control.printGS(nik, Main.listUser));
    }
}
