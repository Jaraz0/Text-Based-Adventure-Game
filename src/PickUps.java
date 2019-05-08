public class PickUps extends Entity {

    public int SmallPotion(){
        if(health+25 <=75)
            health += 25;

        else if (health>=76)
            health = 100;

        return getHealth();

    }

    public int MediumPotion(){
        if(health+50 <=50) {
            health += 50;
        }
        else if (health>=51) {
            health = 100;
        }
        return getHealth();
    }

    public int LargePotion(){
        health = 100;
        return getHealth();
    }




}
