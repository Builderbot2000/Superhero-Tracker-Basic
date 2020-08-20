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

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    int getCiviliansSaved() {
        return civiliansSaved;
    }

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
