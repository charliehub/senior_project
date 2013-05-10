
import java.util.ArrayList;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tub82740
 */
public class House {

    private ArrayList<Room2> rooms;
    private String roomtype;

    public House() {
        rooms = new ArrayList<Room2>();
    }
    
    
    
    
    public void addRoom(Room2 r)
    {
        rooms.add(r);
    }
    
    public void deleteRoom(Room2 r){
        rooms.remove(r);
    }
    
    
}
