public class Player extends Entity {

    String name;

    public Player (int eHealth, int eAttack, double eArmor, String name1)
    {
        super(eHealth, eAttack, eArmor);
        name = name1;
    }


    public void getInfo(){

        getHealth();
        getAttack();
        getArmor();
    }
}




// public player(int health, int armor, int )

