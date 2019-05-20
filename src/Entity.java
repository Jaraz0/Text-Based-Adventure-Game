/**
 * Write a description of class here.
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */
public abstract class Entity {

   private int health = 100;
   private int damage, attack, experience;
   private double armor = 0.0;
   private String name;
   Object[] inventory;

    /**
     * Constructor for Entity objects.
     *
     * @param eHealth -amount of hitpoints on the entitiy.
     * @param eAttack
     * @param eArmor
     * @param eName
     * @param exp
     * @param numItems -- number of inventory items for the entity object.
     *
     */
    public Entity (int eHealth, int eAttack, double eArmor, String eName, int exp, int numItems)
    {
        health = eHealth;
        attack = eAttack;
        armor = eArmor;
        name = eName;
        experience = exp;
        inventory = new Object[numItems];
    }

    /**
     * Sets Entity's health to specified amount.
     *
     * @param  h -- the amount the health is being set to.
     *
     */
    public void setHealth(int h)
    {
        health = h;
    }

    /**
     * Sets Entity's attack to specified amount.
     *
     * @param  a -- the amount the attack is being set to.
     *
     */
    public void setAttack(int a)
    {
        attack = a;
    }

    /**
     * Sets Entity's experience to specified amount.
     *
     * @param  exp -- the amount the experience is being set to.
     *
     */
    public void setExperience(int exp)
    {
        experience = exp;
    }

    /**
     * Returns the value stored in the Entity's experience variable.
     *
     * @return the experience of the Entity.
     */
    public int getExperience()
    {
        return experience;
    }


    /**
     * Sets Entity's armor to specified amount.
     *
     * @param  a -- the amount the armor is being set to.
     *
     */
    public void setArmor(double a)
    {
        armor = a;

    }

    /**
     * Returns the string stored in the entity's name variable.
     *
     * @return the name of the entity.
     */
    public String getName()
    {
        return name;
    }
    /**
     * Returns the Name of the player.
     *
     * @return  name -- the String that is the name of the player.
     *
     */

    public int getHealth() {
        return health;
    }

    /**
     * Returns the Entity's Health
     *
     * @return  health -- the amount of hitpoints the Entity has.
     *
     */

    public int getAttack()

    {
        return attack;
    }

    /**
     * Returns the amount of damage given.
     *
     * @return  attack -- the amount the hitpoints taken away from the Entity.
     *
     */

    public double getArmor()
    {
        return armor;
    }

    /**
     * Returns the value of the Armor.
     *
     * @armor -- the value that reduces the amount of hitpoints received.
     *
     */

    public int Attacking( int inflicted) {
        health -= (inflicted - (int) armor * 10) ;
        return health;
    }

    /**
     * Calculates the amount of hitpoints after the Entity is attacked
     *
     * @health  athe amount of hitpoints that remains on the Entity.
     *
     */


}
