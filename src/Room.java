/**
 * Contains methods that interact with the rooms in the game.
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */
public class Room {
    int roomNumber = 0;
    boolean explored = false;
    boolean locked = false;



    public int getRoomNumber() {return roomNumber;}

    public boolean isExplored() {return explored;}

    public boolean isLocked() {return locked;}



}