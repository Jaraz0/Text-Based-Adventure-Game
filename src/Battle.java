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

    public static int getPlayerChoice() {

        System.out.println("What will you decide?\n" +
                "[1] Attack\n[2] Potion\n[3] Guard");

        playerChoice = scan.nextInt();

        return playerChoice;

    }

    public static void fight(Player player1, Enemy JAMinator) {

        System.out.println(player1.getName() + " approaches the menacing " + JAMinator.getName() + ".\n\n" +
                player1.getName() + " has " + player1.getHealth()  + " health and can deal " + player1.getAttack() + " hitpoints of damage.\n\nBut " + JAMinator.getName() +" has "+  JAMinator.getHealth() +
                " health and can deal " + JAMinator.getAttack() + " hitpoints of damage.\n--------------------------------------------------------------");

        while (player1.getHealth() > 0 && JAMinator.getHealth() > 0) {
            Battle.getPlayerChoice();
            if (playerChoice == 1) {

                JAMinator.setHealth(JAMinator.getHealth() - (player1.getAttack() - ((int) JAMinator.getArmor() * 10)));
                inflicted = (player1.getAttack() - ((int) JAMinator.getArmor() * 10));

                System.out.println("\n" + player1.getName() + " inflicts " + inflicted + " points of damage on " + JAMinator.getName() + ".\n--------------------------------------------------------------");

            } else if (
                    playerChoice == 2) {
                //add in potion code
                System.out.println(player1.getName() + " recovered " + player1.getHealth() + " points of hitpoints\n--------------------------------------------------------------");

            } else if (playerChoice == 3) {
                {

                    System.out.println("Player positions to block as much damage as possible.");
                    player1.setHealth(JAMinator.getAttack() - (((int) JAMinator.getAttack() / 3) + (int) player1.getArmor() * 10));
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

            else if(JAMinator.getHealth() == 0)
            {
                System.out.println("After an intense battle, "+ player1.getName() + " defeated " + JAMinator.getName() + ".");
                //Add code to progress and move on.
            }


        }

    }

}