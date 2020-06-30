package ca.sfu.cmpt213.assignment1.Menus;

import ca.sfu.cmpt213.assignment1.Operator;
import ca.sfu.cmpt213.assignment1.Superhero;

/** Menu for the "update civilians saved by hero" option
 */
public class UpdateHeroMenu extends Menu {
    private static final String[] options = new String[] {""};

    /**
     * Manually defined construction of menu, consisting of title and empty options due to specialized entry.
     * @param op an existent Operator object that is needed for it to function.
     */
    UpdateHeroMenu(Operator op) {
        super("Superhero Tracker: Update Hero", options, op);
    }

    /**
     * Customized initiation due to specialized entry which requires user input at separate sequences.
     * Searches hero in database by user entry and loads it into scope.
     * Uses the "Operator.save" utility to save the hero of updated information into database.
     */
    @Override
    public void initiateMenu() {
        this.printMenu();
        op.list();

        try {
            System.out.println("Enter serial number of hero to update >>");
            int entryInt = Integer.parseInt(Menu.entryReader());
            if (entryInt == 0) {
                System.out.println("Returning to main menu...");
                return;
            }
            Superhero hero = op.load(entryInt);
            if (hero == null) return;

            System.out.println("Enter the updated number of saved civilians >>");
            entryInt = Integer.parseInt(Menu.entryReader());
            if (entryInt < 0) {
                System.out.println("Impossible Input! (Negative Saved Civilians)");
                return;
            }
            hero.setCiviliansSaved(entryInt);
            op.save(hero);
        }
        catch (NumberFormatException exc) {
            System.out.println("Unrecognized Input! Please try again.");
        }
    }
}
