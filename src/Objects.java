/**
 * Parent class of Potions; Creates an object that can be utilized in Battle
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */
public class Objects {

    private String objectName;
    private double defenseStat = 0;
    private int attackStat = 0;



    public Objects(String objName,int atkstat, double defstat)
    {
         objectName = objName;
        attackStat = atkstat;
        defenseStat = defstat;

        /**
         * Constructor for Objects objects.
         *
         * @param objectName
         * @param defenseStat
         * @param attackStat
         */

    }




    public double getArmor()
    {
        return defenseStat;
    }

    /**
     * Returns the value of the armor object
     *
     * @return -- the amount that helps reduce an attack.
     *
     */

    public double getWeapon()
    {
        return attackStat;
    }

    /**
     * Sets Entity's health to specified amount.
     *
     * @return  attackStat -- the amount of hitpoints that is taken away off an entity.
     *
     */

    public String getName()
    {
        return objectName;
    }

    /**
     * Sets Entity's health to specified amount.
     *
     * @return  objectName -- the name of the object.
     *
     */

}