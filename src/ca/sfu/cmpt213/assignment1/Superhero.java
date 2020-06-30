package ca.sfu.cmpt213.assignment1;

/** The central object of the entire program, represents a superhero.
 */
public class Superhero {
    private String name;
    private String superpower;
    private double height;
    private int civiliansSaved;

    /**
     * Constructs a new Superhero object based on input fields.
     * @param name input name field.
     * @param superpower input superpower field.
     * @param height input height field.
     * @param civiliansSaved input civiliansSaved field.
     */
    public Superhero(String name, String superpower, double height, int civiliansSaved) {
        this.name = name;
        this.superpower = superpower;
        this.height = height;
        this.civiliansSaved = civiliansSaved;
    }

    /**
     * Getter method for name field.
     * @return Name field as a string.
     */
    String getName() {
        return name;
    }

    /**
     * Setter method for name field
     * @param name Name field as a string.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for superpower field.
     * @return Superpower field as a string.
     */
    String getSuperpower() {
        return superpower;
    }

    /**
     * Setter method for superpower field.
     * @param superpower Superpower field as a string.
     */
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    /**
     * Getter method for height field.
     * @return Height field as a double value.
     */
    double getHeight() {
        return height;
    }

    /**
     * Setter method for height field.
     * @param height Height field as a double value.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Getter method for civiliansSaved field.
     * @return civiliansSaved field as an integer.
     */
    int getCiviliansSaved() {
        return civiliansSaved;
    }

    /**
     * Setter method for civiliansSaved field.
     * @param civiliansSaved civiliansSaved field as an integer.
     */
    public void setCiviliansSaved(int civiliansSaved) {
        this.civiliansSaved = civiliansSaved;
    }

    /**
     * Information dump of a hero's data fields.
     * @return The name, superpower, height, civiliansSaved fields composed into one line as a string.
     */
    @java.lang.Override
    public java.lang.String toString() {
        return  "Name: " + name +
                ", Superpower: " + superpower +
                ", Height: " + height +
                ", Civilians Saved: " + civiliansSaved;
    }
}
