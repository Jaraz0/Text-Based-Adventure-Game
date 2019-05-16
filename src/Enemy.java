/**
 * Write a description of class here.
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */
public class Enemy extends Entity
{



    public Enemy (int eHealth, int eAttack, double eArmor, String name1, int exp, int numItems)
    {
        super(eHealth, eAttack, eArmor, name1, exp, numItems);

    }

    Enemy skeletonMinion = new Enemy(20, 5, 0.0, "Skeleton", 5, 3);

    Enemy gremlin = new Enemy(40, 10, 0.0, "Gremlin", 15, 3 );

    Enemy Buddy = new Enemy (20, 1, 0.0 , "MikeyG", 1000000, 3);
}

