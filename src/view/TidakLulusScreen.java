package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class TidakLulusScreen {

    public TidakLulusScreen() {
        showJumlahMhsTidakLulus();
    }
    
    private void showJumlahMhsTidakLulus(){
        Controller control = new Controller();
        String kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ");
        JOptionPane.showMessageDialog(null, control.printMTL(kodeMk, Main.listUser));
    }
}