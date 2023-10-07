package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class MatkulAmbilScreen {

    public MatkulAmbilScreen() {
        showMatkulAmbil();
    }
    
    private void showMatkulAmbil(){
        Controller control = new Controller();
        String NIM = JOptionPane.showInputDialog(null, "Masukkan nim : ");
        JOptionPane.showMessageDialog(null, control.printMA(NIM, Main.listUser));
    }
}