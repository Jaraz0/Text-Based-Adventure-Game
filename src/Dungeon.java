/**
 * Creates the map and allows the player to move across it. Depending on the space, it will call the Battle class
 * to initiate fights.
 *
 * @author (Jordan "JAM" Mraz  , Alec "Buddy" Henry, Michael "Mikey G" Gery, Jonathan "Carter" Casper)
 * @version (5/8/2019)
 */
import java.util.Scanner;
public class Dungeon {

    static Scanner scan = new Scanner(System.in);
    private static int row, col;
    public static int[][] dungeon;
    private static String SplayerName;

    /**
     * Creates the dungeon map
     *
     * @param rowA -- the row index for the map
     * @param column -- the column index of the map
     * @param playerName -- used to determine what letter to show at player's position
     *
     */
    public void CreateMap(int rowA, int column, String playerName){

        row = rowA;
        col = column;
        SplayerName = playerName;

        //Creates 2D Array for Map
        dungeon = new int[row][col];

        GenMap(dungeon);

    }



    /**
     * Fills the map layout
     *
     * @param map -- the dungeon map
     *
     */
    private void GenMap(int[][] map){
        int[]layout = {6,0,0,0,2,3,0,
                       2,1,3,1,2,0,0,
                       0,0,2,3,2,1,3,
                       3,2,1,0,0,1,2,
                       1,2,0,1,3,2,0,
                       0,2,2,1,0,2,3,
                       0,3,0,5,0,3,0,};
        int possition = 0;
        for (int y = 0; map.length > y; y++){
            for (int x = 0; map[0].length > x; x++){
                map[y][x] = layout[possition];
                possition++;
            }
        }

        //map[(int)(Math.random() * Column)][(int)(Math.random() * Row)] = 2;

        }

    //0 - wall; 1 - empty; 2 - enemy; 3 - loot; 4 - travelled; 5 - current position; 6 - Exit

    /**
     * 
     */
    public static void printMap() {
        for (int[] r : dungeon) {

            //Draws top lines
            System.out.print(" ");
            for (int i = 0; i < col; i++)
                System.out.print("─── ");
            System.out.println();

            //Draws side lines and rooms
            for (int c : r) {
                System.out.print("│");
                if (c == 5) {
                    System.out.print(" " + nameChar() + " "); //Current room is the first character of the players name
                    //System.out.print(" " + row + " "); //Rooms are the room numbers
                }
                else if (c == 4) System.out.print(" x ");
                    else System.out.print("   ");

            }
            //Last side line
            System.out.print("│\n");
        }
        //Bottom line
        System.out.print(" ");
        for (int i = 0; i < col; i++)
            System.out.print("─── ");
        System.out.println();
    }

    private static char nameChar(){
        return SplayerName.charAt(0);
    }

    public static void move(){
        System.out.println("Pick a direction to move \"" + possibeMoves() +"\" :\t ");
        String choice = scan.next();

        //Up

        if(choice.equalsIgnoreCase("up") && (dungeon[Player.y - 1][Player.x] != 0)) {
            dungeon[Player.y][Player.x] = 4;
            Player.y -= 1;
            if (dungeon[Player.y][Player.x] == 2) Battle.fight(GameRun.lDogOG,GameRun.Buddy);
            if (dungeon[Player.y][Player.x] == 3) ; //loot()
        }

        //Down
        else if(choice.equalsIgnoreCase("down") && (dungeon[Player.y + 1][Player.x] != 0)) {
            dungeon[Player.y][Player.x] = 4;
            Player.y += 1;
            if (dungeon[Player.y][Player.x] == 2) ; //fight()
            if (dungeon[Player.y][Player.x] == 3) ; //loot()
        }

        //Left
        else if(choice.equalsIgnoreCase("left") && (dungeon[Player.y][Player.x - 1] != 0)) {
            dungeon[Player.y][Player.x] = 4;
            Player.x -= 1;
            if (dungeon[Player.y][Player.x] == 2) Battle.fight(GameRun.lDogOG,GameRun.Buddy);
            if (dungeon[Player.y][Player.x] == 3) ; //loot()
        }

        //Right
        else if(choice.equalsIgnoreCase("right") && (dungeon[Player.y][Player.x + 1] != 0)) {
            dungeon[Player.y][Player.x] = 4;
            Player.x += 1;
            if (dungeon[Player.y][Player.x] == 2) ; //fight()
            if (dungeon[Player.y][Player.x] == 3) ; //loot()
        }

        else System.out.println("You can't go there");

        //System.out.println(dungeon[Player.y][Player.x]);

        dungeon[Player.y][Player.x] = 5;

        printMap();
    }


    public static String possibeMoves(){
            String possibleMoves = "";


        //Up
        try {
            if(dungeon[Player.y-1][Player.x] != 0 || Player.y == 0){
                possibleMoves += "Up, ";
            }
        }
        catch (Exception ArrayIndexOutOfBoundsException){
        }

        //Down
        try {
            if(Player.y == dungeon.length || dungeon[Player.y+1][Player.x] != 0) {
                possibleMoves += "Down, ";
            }
        }
        catch (Exception ArrayIndexOutOfBoundsException){

        }

        //Left
        try {
            if(Player.x == 0 || dungeon[Player.y][Player.x-1] != 0) {
                possibleMoves += "Left, ";
            }
        }
        catch (Exception ArrayIndexOutOfBoundsException){

        }


        //Right
        try {
            if(Player.x == dungeon[0].length || dungeon[Player.y][Player.x+1] != 0) {
                possibleMoves += "Right, ";
            }
        }
        catch (Exception ArrayIndexOutOfBoundsException){

        }

        //System.out.println(dungeon[Player.y][Player.x]);

        return possibleMoves.substring(0, possibleMoves.length()-2);

    }



}


