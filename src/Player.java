/**
 * Class that defines the player controlled player object.
 *
 * @author (Carter Casper, Alec Henry, Michael Gery, Jordan Mraz)
 * @version (5/8/2019)
 */
public class Player extends Entity {

    int level;


    /**
     * Constructor for player objects.
     *
     * @param health -- the base health for the player object.
     * @param attack -- the base attack for the player object.
     * @param armor -- the percentage of damage reduction(in a decimal) the character receives.
     * @param  name -- the name the user wants to give their player object.
     *
     */
    public Player(int health, int attack, double armor, String name)
    {
        super(health, attack, armor, name, 0); //constructor of Entity superclass
        level = 1;
    }

    /**
     * Sets Entity's level based on the value of experience.
     *
     */
    public void levelUp()
    {
       /* if(experience >= 3) level = 2;
        if(experience >= 6) level = 3;
        if(experience >= 9) level = 4;
        if(experience >= 12) level = 5;
        if(experience >= 15) level = 6;
        if(experience >= 18) level = 7;
        if(experience >= 21) level = 8;
        if(experience >= 24) level = 9;
        if(experience >= 27) level = 10;
        else level = 1;
        */
    }

    /**
     * Adds a specified amount to experience.
     *
     * @param  exp the amount to be added to experience
     *
     */
    public void addExperience(int exp)
    {
        super.setExperience(super.getExperience()+exp);
    }
}




// public player(int health, int armor, int )

