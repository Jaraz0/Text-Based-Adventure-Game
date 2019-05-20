/**
 * Write a description of class here.
 *
 * @author (Jordan "JAM" Mraz  , Alec "Buddy" Henry, Michael "Mikey G" Gery, Jonathan "Carter" Casper)
 * @version (5/8/2019)
 */
import java.util.Scanner;
public class Dungen_Gen {

    static Scanner scan = new Scanner(System.in);
    private static int row, col;
    public static int[][] dungeon;


    public void CreateMap(int rowA, int column){

        row = rowA;
        col = column;
        //Creates 2D Array for Map
        dungeon = new int[row][col];

        GenMap(dungeon);
        printMap(dungeon);
    }



    //Preset Map
    private void GenMap(int[][] map){

        //test


        map[3][1] = 5;
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

    //0 - wall; 1 - empty; 2 - enemy; 3 - loot; 4 - travelled/empty; 5 - current position
    public static void printMap(int[][] map) {
        for (int[] r : map) {
            for (int c : r)
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public static void move(){
        System.out.println("Pick a direction to move: up, down, left, or right");
        String choice = scan.next();
        //Up
        if(choice.equalsIgnoreCase("up") && (dungeon[Player.y - 1][Player.x] != 0)) {
            Player.y -= 1;
            if (dungeon[Player.y][Player.x] == 2) ; //fight()
            if (dungeon[Player.y][Player.x] == 3) ; //loot()
        }

        //Down
        else if(choice.equalsIgnoreCase("down") && (dungeon[Player.y + 1][Player.x] != 0)) {
            Player.y += 1;
            if (dungeon[Player.y][Player.x] == 2) ; //fight()
            if (dungeon[Player.y][Player.x] == 3) ; //loot()
        }

        //Left
        else if(choice.equalsIgnoreCase("left") && (dungeon[Player.y][Player.x - 1] != 0)) {
            Player.x -= 1;
            if (dungeon[Player.y][Player.x] == 2) ; //fight()
            if (dungeon[Player.y][Player.x] == 3) ; //loot()
        }

        //Right
        else if(choice.equalsIgnoreCase("right") && (dungeon[Player.y][Player.x + 1] != 0)) {
            Player.x += 1;
            if (dungeon[Player.y][Player.x] == 2) ; //fight()
            if (dungeon[Player.y][Player.x] == 3) ; //loot()
        }


        else System.out.println("You can't go there");

        dungeon[Player.y][Player.x] = 5;

        printMap(dungeon);
    }

}


