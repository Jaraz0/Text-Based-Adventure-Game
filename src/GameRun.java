import java.util.Scanner;

/**
 * Write a description of class here.
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */

public class GameRun {
    public String command;
    public static int currentRoom;
    public static Enemy Buddy;
    public static Player lDogOG;
    public static Enemy[] enemies;
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        Dungeon Map = new Dungeon();
        enemies = new Enemy[7];

        enemies[0] = new Enemy(20, 5, 0.0, "Skeleton", 5, 3);
        enemies[1] = new Enemy(40, 10, 0.0, "Gremlin", 15, 3 );
        enemies[2] = new Enemy(30, 10, 0.0, "Buddy", 11, 2);
        enemies[3] = new Enemy(60, 3, 0.0, "Big Al", 4, 2 );
        enemies[4] = new Enemy(20, 5, 0.0, "Skeleton Archer", 5, 3);
        enemies[5] = new Enemy(40, 10, 0.0, "Gremlin", 15, 3 );
        enemies[6] = new Enemy (20, 7, 0.0 , "Cambion", 17, 3);

        Buddy = new Enemy (10, 1, 0.0 , "MikeyG", 5, 3);
        Objects staterSword = new Objects("Basic Sword", 5,0);

        Objects medSword = new Objects("Iron Sword", 15, 0.0);

        Objects medhighSword = new Objects("Elucidator",25, 0.0);

        Objects godSword = new Objects("Excalibur", 50, 0.0);


        //Game
        System.out.print("Welcome to \"Please Give Us An A.\" What is your name?:\t");


        lDogOG = new Player(100, 10, 1, scan.next());

        Map.CreateMap(7,7, lDogOG.getName());

        while(lDogOG.getHealth() > 0) {
            Dungeon.dungeon[Player.y][Player.x] = 5;
            currentRoom = 5;
            while (currentRoom == 5) {
                System.out.print("Please enter an action: \t");
                DoSomething(scan.next());
            }
        }
        System.out.println("Game Over.");
    }

    private static void DoSomething(String command){

        if (command.equalsIgnoreCase("move")) {
            Dungeon.move();
        }
        else if (command.equalsIgnoreCase("map")){
            Dungeon.printMap();
        }
        else if (command.equalsIgnoreCase("help")){
            System.out.println("Available actions are: Move, Help, Map");
        }
        else System.out.println("Invalid Command");
    }


}