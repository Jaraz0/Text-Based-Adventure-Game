//test

import java.util.Map;

public class Dungen_Gen {

    static int Row = 4;
    static int Column = 4;
    static int MapSize = 10;

    public static void main (String[] args) {



        int[][] dungeon = new int[Column][Row];

        GenMap(dungeon);
        PrintMap(dungeon);
    }


    public static void GenMap(int[][] map){
        int roomNum = 0;
        map[3][1] = 1;
        map[2][1] = 2;
        map[1][1] = 3;
        map[1][0] = 4;
        map[1][2] = 5;
        map[0][2] = 6;
        map[0][3] = 7;

        //map[(int)(Math.random() * Column)][(int)(Math.random() * Row)] = 2;

        roomNum += 1;


        }






    public static void PrintMap(int[][] map){
            for (int[] column : map) {
                System.out.print(" ");
                for (int i = 0; i < Row; i++)
                    System.out.print("─── ");
                System.out.println();

                for (int row : column) {
                    System.out.print("│");
                    if (row != 0) {
                        System.out.print(" x ");
                        //System.out.print(" " + row + " ");
                    } else System.out.print("   ");

                }
                System.out.print("│\n");
            }
        System.out.print(" ");
        for (int i = 0; i < Row; i++)
            System.out.print("─── ");
        }
}


