import java.util.Scanner;

/**
 * This is the main driver class of DunJAM Explorer. It creates the player and enemies, and relies on Dungeon's move
 * method for gameplay.
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */

public class GameRun {
    public String command;
    public static int currentRoom;
    public static Enemy Buddy;
    public static Player lDogOG;
    public static Enemy gremlin;
    public static Enemy skeletonMinion;
    public static Object starterSword;
    public static Object medSword;
    public static Object medhighSword;
    public static Object godSword;
    public static Object Leather;
    public static Object AdamantiumArmor;
    public static Objects MikeyGarmor;


    public static void main (String[] args) {

        //Objects and more
        Scanner scan = new Scanner(System.in);
        Dungeon Map = new Dungeon();



        skeletonMinion = new Enemy(20, 5, 0.0, "Skeleton Archer", 5, 3);

        gremlin = new Enemy(40, 10, 0.0, "Gremlin", 15, 3 );

        Buddy = new Enemy (20, 7, 0.0 , "Cambion", 1000000, 3);

        starterSword = new Objects("Basic Sword", 5,0);

        medSword = new Objects("Iron Sword", 15, 0.0);

        medhighSword = new Objects("Elucidator",25, 0.0);

        godSword = new Objects("Excalibur", 50, 0.0);

        Leather = new Objects ("Leather Armor", 0, 5);

        MikeyGarmor = new Objects("Hero's Tunic", 0, 10  );

        AdamantiumArmor = new Objects ("Adamantium Armor", 0, 20);


        //Game
        System.out.print("Welcome to \"DunJAM Explorer\" What is your name?:\t");


        lDogOG = new Player(100, 10, 20, scan.next());

        Map.CreateMap(7,7, lDogOG.getName());


        //The main body of the game. Runs in a loop until player dies, letting them move around the map.
        while(lDogOG.getHealth() > 0) {
            Dungeon.dungeon[Player.y][Player.x] = 5;
            currentRoom = 5;
            while (currentRoom == 5) {
                System.out.print("Please enter an action (move, map, help): \t");
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