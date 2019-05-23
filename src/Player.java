/**
 * Class that defines the player controlled player object.
 *
 * @author (Carter Casper, Alec Henry, Michael Gery, Jordan Mraz)
 * @version (5/8/2019)
 */
public class Player extends Entity {

     private int level;
     public static int x, y;
    private int currentLevel;



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
        level = 0;
        x = 3;
        y = 6;
    }

    /**
     * Sets Entity's level based on the value of experience.
     *
     */
    public void setLevel()
    {
        int exp = super.getExperience(); // sets exp to Player's experience
//        if(exp >= 3) level = 2;
//        if(exp >= 6) level = 3;
//        if(exp >= 9) level = 4;
//        if(exp >= 12) level = 5;
//        if(exp >= 15) level = 6;
//        if(exp >= 18) level = 7;
//        if(exp >= 21) level = 8;
//        if(exp >= 24) level = 9;
//        if(exp >= 27) level = 10;
//        else level = 1;
        currentLevel = level;
        level = exp%10;
        if(this.level > this.currentLevel)
            this.updateStats();
    }

     /* Helper method to update player stats upon level up.
     *
     */
    private void updateStats()
    {
        super.setAttack(super.getAttack() + 2);
        super.setHealth(super.getHealth() + 4);
    }

    /**
     * Gets the value of Entity's level.
     *
     * @return level -- the level of the Entity.
     *
     */
    public int getLevel()
    {
        if(this.level > this.currentLevel)
            System.out.println(this.getName()+" leveled up and gained +2 attack and +4 health!");
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
        System.out.println("You gained "+ exp + " experience!\nTotal Experience: " + super.getExperience());
        System.out.println();
    }

    /**
     * Sets the armor value
     *
     * @param a -- the amount to be added to armor
     *
     */
    public void setArmor(double a)
    {
        super.setArmor(this.getArmor() + a);
    }

    /**
     * Adds a specified amount to attack
     *
     * @param  b the amount to be added to attack
     *
     */
    public void setAttack(int b)
    {
        super.setAttack(this.getAttack() + b);
    }


}