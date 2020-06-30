package ca.sfu.cmpt213.assignment1;

import ca.sfu.cmpt213.assignment1.Menus.MainMenu;
import java.util.Scanner;

/** The host class for the program.
 */
public class Main {
    public static Scanner input = new Scanner(System.in);

    /**
     * Creates a new operator and triggers the initiation of the main menu.
     * Ends with saving of the current data stream to database.
     * @param args This parameter is not used.
     */
    public static void main(String[] args) {
        Operator op = new Operator();
        try {
            MainMenu mainMenu = new MainMenu(op);
            mainMenu.initiateMenu();
        }
        finally {
            op.saveData();
        }
    }
}
