/**
 * Write a description of class here.
 *
 * @author (Jordan "JAM" Mraz  , Alec "Buddy" Henry, Michael "Mikey G" Gery, Jonathan "Carter" Casper)
 * @version (5/8/2019)
 */
import java.util.Scanner;
public class Dungen_Gen {

    Scanner scan = new Scanner(System.in);
    private static int row, col;
    public static int[][] dungeon;


    public void CreateMap(int rowA, int column){

        row = rowA;
        col = column;
        //Creates 2D Array for Map
        dungeon = new int[row][col];

        GenMap(dungeon);
        PrintMap(dungeon);
    }



    //Preset Map
    private void GenMap(int[][] map){

        //test


        map[3][1] = 1;
        map[2][1] = 1;
        map[1][1] = 2;
        map[0][1] = 3;

        //map[(int)(Math.random() * Column)][(int)(Math.random() * Row)] = 2;

        }

            //Draws the map to console
    /*public void PrintMap(int[][] map){
            for (int[] r : map) {

                //Draws top lines
                System.out.print(" ");
                for (int i = 0; i < col; i++)
                    System.out.print("─── ");
                System.out.println();

                //Draws side lines and rooms
                for (int c : r) {
                    System.out.print("│");
                    if (c != 0) {
                        System.out.print(" x "); //Rooms are x's
                        //System.out.print(" " + row + " "); //Rooms are the room numbers
                    } else System.out.print("   ");

                }
                //Last side line
                System.out.print("│\n");
            }
            //Bottom line
        System.out.print(" ");
        for (int i = 0; i < col; i++)
            System.out.print("─── ");
        System.out.println();
    }*/

    //0 - wall; 1 - empty; 2 - enemy; 3 - loot; 4 - travelled/empty
    public void PrintMap(int[][] map) {
        for (int[] r : map) {
            for (int c : r)
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public void move(){
        System.out.println("Pick a direction to move: up, down, left, or right");
        String choice = scan.next();
        if(choice.equalsIgnoreCase("up") && (dungeon[Player.y][Player.x] == 0)){
            if(dungeon[Player.y][Player.x] == 1 ||dungeon[Player.y][Player.x] == 4) Player.y -= 1;
            else if (dungeon[Player.y][Player.x] == 2) Player.y -= 1; //fight()
            else if (dungeon[Player.y][Player.x] == 3) Player.y -= 1; //loot()
            else System.out.println("You can't go there");
        }
    }

}


