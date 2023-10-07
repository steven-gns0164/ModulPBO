package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class UserDataScreen {

    public UserDataScreen() {
        showUserData();
    }
    
    private void showUserData(){
        Controller control = new Controller();
        String nama = JOptionPane.showInputDialog(null, "Masukkan Nama : ");
        JOptionPane.showMessageDialog(null, control.printUserData(nama, Main.listUser));
    }
}