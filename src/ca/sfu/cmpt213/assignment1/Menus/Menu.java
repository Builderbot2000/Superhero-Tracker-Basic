package ca.sfu.cmpt213.assignment1.Menus;
import ca.sfu.cmpt213.assignment1.Main;
import ca.sfu.cmpt213.assignment1.Operator;

/**
 * The base template for all text menus.
 * This class exists to increase modularity for possible expansions.
 */
public class Menu {
    protected String title;
    protected String[] options;
    protected Operator op;

    /** Menu Constructor
     * @param title Title of the menu.
     * @param options String array of options to be displayed by the menu.
     * @param op an existent Operator object that is needed for it to function.
     */
    Menu(String title, String[] options, Operator op) {
        this.title = title;
        this.options = options;
        this.op = op;
    }

    /** Generates menu on console after it is initialized
     */
    public void initiateMenu() {
        boolean running = true;
        this.printMenu();
        while (running) {
            System.out.println("Enter >> ");
            String entry = entryReader();
            running = triggerMenu(entry);
        }
    }

    /** Print the title and options of the menu in format
     */
    void printMenu() {
        String border = "*".repeat(title.length());
        System.out.println(border + "\n" + title + "\n" + border);
        int i = 1;
        for (String option: options) {
            System.out.println(i + ": "+ option);
            i++;
        }
    }

    /** Reads a single line of input and returns said input as a string
     * @return A string that contains the user input
     */
    static String entryReader() {
        String entry = "";
        try {
            entry = Main.input.nextLine();
        }
        catch (Exception InputMismatchException) {
            System.out.println("Unrecognized Input! Please try again.");
        }
        return entry;
    }

    /**
     * Triggers appropriate action based on user entry.
     * @param entry String form of user input.
     * @return The "running" state that dictates whether the parent scope will be repeated or not.
     */
    public boolean triggerMenu(String entry) {
        System.out.println("Error: Menu template do not have active options!");
        return false;
    }
}
