/**
 * Class that defines the player controlled player object.
 *
 * @author (Carter Casper, Alec Henry, Michael Gery, Jordan Mraz)
 * @version (5/8/2019)
 */
public class Player extends Entity {

     private int level;


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
        super(health, attack, armor, name, 0, 5); //constructor of Entity superclass
        level = 1;
    }

    /**
     * Sets Entity's level based on the value of experience.
     *
     */
    public void setLevel()
    {
        int exp = super.getExperience(); // sets exp to Player's experience
        if(exp >= 3) level = 2;
        if(exp >= 6) level = 3;
        if(exp >= 9) level = 4;
        if(exp >= 12) level = 5;
        if(exp >= 15) level = 6;
        if(exp >= 18) level = 7;
        if(exp >= 21) level = 8;
        if(exp >= 24) level = 9;
        if(exp >= 27) level = 10;
        else level = 1;

    }

    /**
     * Gets the value of Entity's level.
     *
     * @return level -- the level of the Entity.
     *
     */
    public void getLevel()
    {
       return level;
    }

    /**
     * Adds a specified amount to experience.
     *
     * @param  exp the amount to be added to experience
     *
     */
    public void addExperience(int exp) //use to collect experience from foes ie player.addExperience(foe.getExperience());
    {
        super.setExperience(super.getExperience()+exp);
        System.out.println("you gained "+ exp + "experience! \n Total Experience: " + super.getExperience());
    }
}




// public player(int health, int armor, int )

