/**
<<<<<<< Updated upstream
 * Contains methods that interact with the rooms in the game.
=======
 * Simplifies the move method in Dungeon for checking rooms.
>>>>>>> Stashed changes
 *
 * @author (Jordan Mraz, Alec Henry, Michael Gery, Carter Casper)
 * @version (5/8/2019)
 */
public class Room {
    int roomNumber = 0;
    boolean explored = false;
    boolean locked = false;


    /**
     * Returns the room number
     *
     * @return  roomNumber -- number corresponding to the space the Player is on
     *
     */
    public int getRoomNumber(){
        return roomNumber;
    }

    /**
     * Returns whether or not the room has been explored
     *
     * @return  explored -- tells whether or not the player has visited this space
     *
     */
    public boolean isExplored(){
        return explored;
    }

    /**
     * Returns whether the room is locked
     *
     * @return  locked -- boolean value that states whether or not the room is locked
     *
     */
    public boolean isLocked(){
        return locked;
    }



}