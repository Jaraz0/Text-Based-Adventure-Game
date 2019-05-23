import java.util.Scanner;
/**
 * Battle contains the script and the player choices during fights with enemies.
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */

public class Battle {

    static Scanner scan = new Scanner(System.in);

    static int playerChoice = 0;
    static int inflicted = 0;
    static int potionsRemaning = 3;


    public static int enHealth =0;

    public static int getPlayerChoice() {

        System.out.println("What will you decide?\n" +
                "[1] Attack\n[2] Potion\n[3] Guard");

        playerChoice = scan.nextInt();

        return playerChoice;

    }

    public static void fight(Player player1, Enemy JAMinator) {
        int damage = 0;
        System.out.println(player1.getName() + " approaches the menacing " + JAMinator.getName() + ".\n\n" +
                player1.getName() + " has " + player1.getHealth()  + " health and can deal " + player1.getAttack() + " hitpoints of damage.\n\nBut " + JAMinator.getName() +" has "+  JAMinator.getHealth() +
                " health and can deal " + JAMinator.getAttack() + " hitpoints of damage.\n--------------------------------------------------------------");

        while (player1.getHealth() > 0 && JAMinator.getHealth() - damage> 0) {
            Battle.getPlayerChoice();
            if (playerChoice == 1) {

                inflicted = (player1.getAttack());
                damage += inflicted;
                System.out.println("\n" + player1.getName() + " inflicts " + inflicted + " points of damage on " + JAMinator.getName() + ".\n--------------------------------------------------------------");
                System.out.println(JAMinator.getName() + " has " + JAMinator.getHealth() + " health remaining");

                inflicted = ((int)(JAMinator.getAttack() - JAMinator.getAttack() * (player1.getArmor() / 100)));
                player1.setHealth(player1.getHealth() - inflicted);
                System.out.println("\n" + JAMinator.getName() + " inflicts " + inflicted + " points of damage on you.\n--------------------------------------------------------------");
                System.out.println("You have " + player1.getHealth() + " health remaining\n--------------------------------------------------------------");


            } else if (
                    playerChoice == 2) {
                if (potionsRemaning > 0) {
                    player1.setHealth(player1.getHealth() + 20);
                    potionsRemaning--;
                    System.out.println(player1.getName() + " recovered 20 points of health, " + potionsRemaning + " potions remaining\n--------------------------------------------------------------");
                }
                else System.out.println("No Potions remaining");

            } else if (playerChoice == 3) {
                {

                    System.out.println("Player positions to block as much damage as possible.");
                    player1.setHealth(player1.getHealth() - (int)((JAMinator.getAttack() / 3) * (player1.getArmor() / 100)));
                    System.out.println("With "+ player1.getHealth() + " remaining, you manage \n--------------------------------------------------------------");

                }

            }


            if (player1.getHealth() <= 0) {

                //
                System.out.println("You Are Dead\n[1] Continue\n[0] End Game");
                getPlayerChoice();
                if (playerChoice == 1) {
                    System.out.println(player1.getName() + "gained a life.");
                    //Add method to restart game.

                } else if (playerChoice == 0) {

                    System.out.println("Fin");
                    System.exit(0);

                }


            }

            else if(JAMinator.getHealth() <= 0)
            {
                System.out.println("\nAfter an intense battle, "+ player1.getName() + " defeated " + JAMinator.getName() + ".\n");
                //Add code to progress and move on.
                player1.addExperience(JAMinator.getExperience());
                player1.setLevel();
                System.out.println(player1.getName() + " gained " + JAMinator.getExperience() + " and is now level " + player1.getLevel() + ".");


            }


        }

    }

}