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




        //Game
        System.out.println("Welcome to \"Please Give Us An A.\" What is your name?");
        Entity aaaa = new Player(100, 10, 20, scan.next());

        Map.CreateMap(4,4);




    }
}