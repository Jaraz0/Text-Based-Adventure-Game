/**
 * Write a description of class here.
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */
public class GameRun {
    public static void main (String[] args) {

        Dungen_Gen Map = new Dungen_Gen();
        Map.CreateMap(4,4);
        //test
        Entity aaaa = new Player(100, 10, 20, "a");
    }
}