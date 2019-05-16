/**
 * Write a description of class here.
 *
 * @author (Jordan "JAM" Mraz  , Alec "Buddy" Henry, Michael "Mikey G" Gery, Jonathan "Carter" Casper)
 * @version (5/8/2019)
 */
public class Dungen_Gen {

    private static int Column, Row;


    public void CreateMap(int column, int row){

        Column = column;
        Row = row;
        //Creates 2D Array for Map
        int[][] dungeon = new int[Column][Row];

        GenMap(dungeon);
        PrintMap(dungeon);
    }



    //Preset Map
    private void GenMap(int[][] map){

        //test


        map[3][1] = 1;
        map[2][1] = 2;
        map[1][1] = 3;
        map[1][0] = 4;
        map[1][2] = 5;
        map[0][2] = 6;
        map[0][3] = 7;

        //map[(int)(Math.random() * Column)][(int)(Math.random() * Row)] = 2;

        }

            //Draws the map to console
    public void PrintMap(int[][] map){
            for (int[] column : map) {

                //Draws top lines
                System.out.print(" ");
                for (int i = 0; i < Row; i++)
                    System.out.print("─── ");
                System.out.println();

                //Draws side lines and rooms
                for (int row : column) {
                    System.out.print("│");
                    if (row != 0) {
                        System.out.print(" x "); //Rooms are x's
                        //System.out.print(" " + row + " "); //Rooms are the room numbers
                    } else System.out.print("   ");

                }
                //Last side line
                System.out.print("│\n");
            }
            //Bottom line
        System.out.print(" ");
        for (int i = 0; i < Row; i++)
            System.out.print("─── ");
        System.out.println();
    }
}


