public abstract class Entity {

    int health = 100;
    int damage, attack ;
    double armor = 0.0;


    public Entity (int eHealth, int eAttack, double eArmor)
    {
        health = eHealth;
        attack = eAttack;
        armor = eArmor;
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
