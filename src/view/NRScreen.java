package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class NRScreen {

    public NRScreen() {
        showRataRataNilaiAkhir();
    }
    
    private void showRataRataNilaiAkhir(){
        Controller control = new Controller();
        String kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ");
        JOptionPane.showMessageDialog(null, control.printRNA(kodeMk, Main.listUser));
    }
}