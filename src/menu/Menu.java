package menu;

import control.WordsAndCharactersController;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        WordsAndCharactersController control = new WordsAndCharactersController();
        control.enterString();
        control.displayMenu();
    }
}
