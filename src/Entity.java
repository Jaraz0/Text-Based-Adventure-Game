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


    public Entity (int eHealth, int eAttack, double eArmor, String eName, int exp)
    {
        health = eHealth;
        attack = eAttack;
        armor = eArmor;
        name = eName;
        experience = exp;
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

    public int getHealth() {
        return health;
    }

    public double getArmor() {
        return armor;
    }
    public int getAttack(){
        return attack;

    }

    public int Attacking( int inflicted) {
        health -= (inflicted - (int) armor * 10) ;
        return health;

    }



}
