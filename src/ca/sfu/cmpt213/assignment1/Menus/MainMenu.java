package ca.sfu.cmpt213.assignment1.Menus;

import ca.sfu.cmpt213.assignment1.Operator;

/** The main menu.
 */
public class MainMenu extends Menu {

    /** Manual definition of menu options
     */
    private static final String[] options = new String[]{
            "List all superheroes",
            "Add a new superhero",
            "Remove a superhero from list",
            "Update number of civilians saved by a superhero",
            "List Top 3 superheroes in terms of civilians saved",
            "Generate debug dump of hero list (toString)",
            "Exit"
    };

    /**
     * Manually defined construction of menu, consisting of title and empty options due to specialized entry.
     * @param op an existent Operator object that is needed for it to function.
     */
    public MainMenu(Operator op) {
        super("SuperHero Tracker", options, op);
    }

    /**
     * Triggers appropriate action based on user entry.
     * @param entry String form of user input.
     * @return The "running" state that dictates whether the parent scope will be repeated or not.
     */
    @Override
    public boolean triggerMenu(String entry) {
        boolean running = true;
        switch (entry) {
            case "1":
                op.list();
                break;
            case "2":
                AddHeroMenu menuAdd = new AddHeroMenu(op);
                menuAdd.initiateMenu();
                break;
            case "3":
                RemoveHeroMenu menuRemove = new RemoveHeroMenu(op);
                menuRemove.initiateMenu();
                break;
            case "4":
                UpdateHeroMenu menuUpdate = new UpdateHeroMenu(op);
                menuUpdate.initiateMenu();
                break;
            case "5":
                op.top3();
                break;
            case "6":
                op.dump();
                break;
            case "7":
                System.out.println("Thank you for using the system.");
                running = false;
                break;
            default:
                System.out.println("Unrecognized Input!");
        }
        return running;
    }
}
