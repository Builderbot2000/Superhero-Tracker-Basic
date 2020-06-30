package ca.sfu.cmpt213.assignment1.Menus;

import ca.sfu.cmpt213.assignment1.Operator;
import ca.sfu.cmpt213.assignment1.Superhero;

/** Menu for the "add new hero" option
 */
public class AddHeroMenu extends Menu {
    private static final String[] options = new String[0];

    /**
     * Manually defined construction of menu, consisting of title and empty options due to specialized entry.
     * @param op an existent Operator object that is needed for it to function.
     */
    AddHeroMenu(Operator op) {
        super("Superhero Tracker: Add Hero", options, op);
    }

    /**
     * Customized initiation due to specialized entry which requires user input at separate sequences.
     * New hero is constructed by three sequenced entries, filling three fields of the Superhero object.
     * Uses the "Operator.save" utility to save the new hero into database.
     */
    @Override
    public void initiateMenu() {
        this.printMenu();

        String name, superpower;
        double height;

        try {
            System.out.println("Enter Hero's name: ");
            name = Menu.entryReader();

            System.out.println("Enter Hero's height in cm: ");
            height = Math.floor(Double.parseDouble(Menu.entryReader()) * 100) / 100;
            if (height < 0) {
                System.out.println("Impossible height, input rejected!");
                return;
            }

            System.out.println("Enter Hero's superpower: ");
            superpower = Menu.entryReader();
        }
        catch (NumberFormatException exc) {
            System.out.println("Unrecognized Input!");
            return;
        }

        System.out.println("Saving to database...");
        op.save(new Superhero(name, superpower, height, 0));
    }
}
