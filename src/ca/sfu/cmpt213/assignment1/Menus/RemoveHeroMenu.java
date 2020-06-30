package ca.sfu.cmpt213.assignment1.Menus;

import ca.sfu.cmpt213.assignment1.Operator;

/** Menu for the "remove hero from list" option
 */
public class RemoveHeroMenu extends Menu {
    private static final String[] options = new String[0];

    /**
     * Manually defined construction of menu, consisting of title and empty options due to specialized entry.
     * @param op an existent Operator object that is needed for it to function.
     */
    RemoveHeroMenu(Operator op) {
        super("Superhero Tracker: Remove Hero", options, op);
    }

    /**
     * Customized initiation due to specialized entry which requires user input at separate sequences.
     * List of hero is displayed, and user is prompted to choose which one to remove.
     * Uses the "Operator.remove" utility to remove target hero from database.
     */
    @Override
    public void initiateMenu() {
        op.list();
        System.out.println("Enter serial number of hero to delete >>");
        String entry = Menu.entryReader();
        try {
            int entryInt = Integer.parseInt(entry);
            if (entryInt < 0) {
                System.out.println("Invalid Input! Serial numbers cannot be negative.");
                return;
            }
            else if (entryInt == 0) {
                System.out.println("Returning to main menu...");
                return;
            }
            op.remove(entryInt);
        }
        catch (NumberFormatException exc) {
            System.out.println("Unrecognized Input! Please try again.");
        }
    }
}
