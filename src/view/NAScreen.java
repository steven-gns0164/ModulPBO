package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class NAScreen {

    public NAScreen() {
        showNilaiAkhir();
    }
    
    private void showNilaiAkhir(){
        Controller control = new Controller();
        String NIM = JOptionPane.showInputDialog(null, "Masukkan NIM : ");
        String kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ");
        JOptionPane.showMessageDialog(null, control.printNilaiAkhir(NIM, kodeMk, Main.listUser));
    }
}