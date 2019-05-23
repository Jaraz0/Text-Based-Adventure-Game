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

    /**
     * Gives player increased attack or health based on what item they looted.
     *
     * @param item -- the item that the player is looting.
     *
     */


    /**
     * Gives player increased attack or health based on what item they looted.
     *
     *
     *
     */
    public void loot()
    {
        System.out.println(GameRun.lDogOG.getName() + " looted "+ objectName +"!");
        GameRun.lDogOG.setAttack((int)this.getWeapon());
        System.out.println(GameRun.lDogOG.getName() + " gained "+ this.getWeapon() +" attack.");
        GameRun.lDogOG.setHealth((GameRun.lDogOG.getHealth() + (int)this.getArmor()));
        System.out.println(GameRun.lDogOG.getName() + " gained "+ (int)this.getArmor() +" health.");
    }

}
