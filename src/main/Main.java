package main;

import GUI.PrincipalGUI;
import menus.MainMenu;

public class Main {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        //mainMenu.mostrar();
        new PrincipalGUI();
    }
}
