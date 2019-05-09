/**
 * Class that defines the player controlled player object.
 *
 * @author (Carter Casper, Alec Henry, Michael Gery, Jordan Mraz)
 * @version (5/8/2019)
 */
public class Player extends Entity {

    int level;
    int experience;
    String name;

    /**
     * Constructor for player objects.
     *
     * @param  n-- the name the user wants to give their player object.
     *
     */
    public Player(String n)
    {
        name = n;
        level = 1;
        experience = 0;
    }

}




// public player(int health, int armor, int )

