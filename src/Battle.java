import java.util.Scanner;


public class Battle {

    static Scanner scan = new Scanner(System.in);

    static int playerChoice = 0;
    static int inflicted = 0;

    public static int getPlayerChoice() {

        System.out.println("\nWhat will you decide?\n" +
                "[1] Attack\n[2] Guard\n [3] Potion");

        playerChoice = scan.nextInt();

        return playerChoice;

    }

    public static void fight(Entity player1, Entity JAMinator) {

        System.out.println(player1.getName() + "approaches the menacing " + JAMinator + ".\n" +
                player1.getName() + "can deal" + player1.getAttack() + " hitpoints of damage.\nBut" + JAMinator.getName()
                + "can deal" + JAMinator.getAttack() + "hitpoints of damage.");

        while (player1.getHealth() > 0 && JAMinator.getHealth() > 0) {
            if (playerChoice == 1) {

                JAMinator.setHealth(player1.getAttack() - ((int) JAMinator.getArmor() * 10));
                inflicted = (player1.getAttack() - ((int) JAMinator.getArmor() * 10));

                System.out.println("\n" + player1.getName() + " inflicts" + inflicted + "points of damage on " + JAMinator.getName() + ".");

            } else if (
                    playerChoice == 2) {
                //add in potion code
                System.out.println(player1.getName() + "recovered" + player1.getHealth() + "points of hitpoints");

            } else if (playerChoice == 3) {
                {

                    System.out.println("Player positions to block as much damage as possible.");
                    player1.setHealth(JAMinator.getAttack() - (((int) JAMinator.getAttack() / 3) + (int) player1.getArmor() * 10));

                }

            }


            if (player1.getHealth() == 0) {

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
                System.out.println("After an intense battle, "+ player1.getName() + "defeated" + JAMinator.getName() + ".");
                //Add code to progress and move on.
            }


        }

    }

}