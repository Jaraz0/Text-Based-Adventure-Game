import java.util.Scanner;

/**
 * Write a description of class here.
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */

public class GameRun {
    public static void main (String[] args) {

        //Variables and shizz
        Scanner scan = new Scanner(System.in);
        Dungen_Gen Map = new Dungen_Gen();



        Enemy skeletonMinion = new Enemy(20, 5, 0.0, "Skeleton", 5, 3);

        Enemy gremlin = new Enemy(40, 10, 0.0, "Gremlin", 15, 3 );

        Enemy Buddy = new Enemy (20, 1, 0.0 , "MikeyG", 1000000, 3);

        Objects staterSword = new Objects("Basic Sword", 5,0);

        Objects medSword = new Objects("Iron Sword", 15, 0.0);

        Objects medhighSword = new Objects("Elucidator",25, 0.0);

        Objects godSword = new Objects("Excalibur", 50, 0.0);


        //Game
        System.out.println("Welcome to \"Please Give Us An A.\" What is your name?");


        Entity lDogOG = new Player(100, 10, 20, scan.next());

        Map.CreateMap(5,5, lDogOG.getName());

        while(lDogOG.getHealth() > 0) {
            Dungen_Gen.dungeon[Player.y][Player.x] = 4;

            Dungen_Gen.move();

        }
        System.out.println("Game Over.");
    }
}