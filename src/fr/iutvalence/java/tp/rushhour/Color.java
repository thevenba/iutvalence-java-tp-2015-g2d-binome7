package fr.iutvalence.java.tp.rushhour;

/**
 * Vehicle's colors.
 *
 * @author thevenba
 * @version 1.0.0
 */
public enum Color {
    /** Red color. */
    RED("R "),
    /** Light blue color. */
    LIGHT_BLUE("lb"),
    /** Dark blue color. */
    DARK_BLUE("db"),
    /** Yellow color. */
    YELLOW("y "),
    /** Orange color. */
    ORANGE("o "),
    /** Light green color. */
    LIGHT_GREEN("lg"),
    /** Dark green color. */
    DARK_GREEN("dg"),
    /** Purple color. */
    PURPLE("p ");
    /* TODO JAVADOC. */
    private final String display;

    /* TODO JAVADOC. */
    Color(final String disp) {
        display = disp;
    }

    @Override
    public String toString() {
        return display;
    }
}
