/**
 * Creates potions from Object that heal the player
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)

**/

public class Potions extends Object {

    int ammountHealed = 0;

    /**
     * Returns small amount to heal the player
     *
     * @return  amountHealed -- amount to heal the player by
     *
     */
    public int smallPotion(){
        ammountHealed = 25;
        return ammountHealed;
    }

    /**
     * Returns medium amount to heal the player
     *
     * @return  amountHealed -- amount to heal the player by
     *
     */
    public int mediumPotion(){
        ammountHealed =50;
        return ammountHealed;
    }

    /**
     * Returns large amount to heal the player
     *
     * @return  amountHealed -- amount to heal the player by
     *
     */
    public int largePotion(){
        ammountHealed =100;
        return ammountHealed;
    }



}