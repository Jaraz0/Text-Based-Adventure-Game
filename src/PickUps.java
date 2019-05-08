public class PickUps extends Object {

    public int smallPotion(){
        if(health+25 <=75)
            health += 25;

        else if (health>=76)
            health = 100;

        return getHealth();

    }

    public int mediumPotion(){
        if(health+50 <=50) {
            health += 50;
        }
        else if (health>=51) {
            health = 100;
        }
        return getHealth();
    }

    public int largePotion(){
        health = 100;
        return getHealth();
    }




}
