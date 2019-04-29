import java.util.Map;

public class Dungen_Gen {

    static int Row = 7;
    static int Column = 7;
    static int MapSize = 10;

    public static void main (String[] args) {



        int[][] dungeon = new int[Column][Row];
        //
        GenMap(dungeon);
        PrintMap(dungeon);
    }


    public static void GenMap(int[][] map){
        int roomNum = 0;
        map[3][3] = 5;
        roomNum += 1;


        }
        //map[(int)(Math.random() * Column)][(int)(Math.random() * Row)] = 2;






    public static void PrintMap(int[][] map){
            for (int[] column : map) {
                System.out.println("\n -----------------------------");
                for (int row : column) {
                    System.out.print(" | ");
                    if (row != 0) {
                        System.out.print("x");
                        //System.out.print(row);
                    } else System.out.print(" ");

                }
                System.out.print(" |");
            }
            System.out.println("\n -----------------------------");
        }
}


