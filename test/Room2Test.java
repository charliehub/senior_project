/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charles
 */
public class Room2Test {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRoom method, of class Room2.
     */
    @Test
    public void testGetRoom() {

        System.out.println("getRoom");
        String select1 = "bathroom";
        String select2 = "bedroom";
        String select3 = "guestroom";
        String select4 = "kitchen";
        String select5 = "livingroom";
         ImageIcon room1 = new ImageIcon("/rooms/" + select1 + ".jpg");
        ImageIcon room2 = new ImageIcon("/rooms/" + select2 + ".jpg");
        ImageIcon room3 = new ImageIcon("/rooms/" + select3 + ".jpg");
        ImageIcon room4 = new ImageIcon("/rooms/" + select4 + ".jpg");
        ImageIcon room5 = new ImageIcon("/rooms/" + select5 + ".jpg");
         Room2 tester = new Room2();
        ImageIcon expResult = new ImageIcon("/rooms/bathroom.jpg");
        ImageIcon expResult2 = new ImageIcon("/rooms/bedroom.jpg");
        ImageIcon expResult3 = new ImageIcon("/rooms/guestroom.jpg");
        ImageIcon expResult4 = new ImageIcon("/rooms/kitchen.jpg");
        ImageIcon expResult5 = new ImageIcon("/rooms/livingroom.jpg");
        ImageIcon result = tester.getRoom(room1);
        ImageIcon result2 = tester.getRoom(room2);
        ImageIcon result3 = tester.getRoom(room3);
        ImageIcon result4 = tester.getRoom(room4);
        ImageIcon result5 = tester.getRoom(room5);
        assertEquals("Room is acquired", expResult, result);
        assertEquals("Room is acquired", expResult2, result2);
        assertEquals("Room is acquired", expResult3, result3);
        assertEquals("Room is acquired", expResult4, result4);
        assertEquals("Room is acquired", expResult5, result5);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of deleteRoom method, of class Room2.
     */
    @Test
    public void testDeleteRoom() {
        System.out.println("deleteRoom");
        ImageIcon curroom = null;
        Room2 instance = new Room2();
        ImageIcon expResult = null;
        ImageIcon expResult2 = null;
        ImageIcon expResult3 = null;
        ImageIcon expResult4 = null;
        ImageIcon expResult5 = null;
        ImageIcon result = instance.deleteRoom(curroom);
        assertEquals("Room shall be deleted", expResult, result);
        assertEquals("Room shall be deleted", expResult2, result);
        assertEquals("Room shall be deleted", expResult3, result);
        assertEquals("Room shall be deleted", expResult4, result);
        assertEquals("Room shall be deleted", expResult5, result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of RoomChange method, of class Room2.
     */
    @Test
    public void testRoomChange() {
        System.out.println("RoomChange");
        String choice1 = "bedroom";
        String choice2 = "livingroom";
        String choice3 = "bathroom";
        String choice4 = "kitchen";
        String choice5 = "guestroom";
        ImageIcon curroom = new ImageIcon("/rooms/" + choice1 + ".jpg");
        ImageIcon curroom2 = new ImageIcon("/rooms/" + choice2 + ".jpg");
        ImageIcon curroom3 = new ImageIcon("/rooms/" + choice3 + ".jpg");
        ImageIcon curroom4 = new ImageIcon("/rooms/" + choice4 + ".jpg");
        ImageIcon curroom5 = new ImageIcon("/rooms/" + choice5 +".jpg");

        ImageIcon roomdes = new ImageIcon("/rooms/" + choice2 + ".jpg");
        ImageIcon roomdes2 = new ImageIcon("/rooms/" + choice3 + ".jpg");
        ImageIcon roomdes3 = new ImageIcon("/rooms/"+ choice4 + ".jpg");
        ImageIcon roomdes4 = new ImageIcon("/rooms/" + choice5 + ".jpg");
        ImageIcon roomdes5 = new ImageIcon("/rooms/" + choice1 + ".jpg");
        Room2 instance = new Room2();
        ImageIcon expResult = new ImageIcon("/rooms/livingroom.jpg");
        ImageIcon expResult2 = new ImageIcon("/rooms/bathroom.jpg");
        ImageIcon expResult3 = new ImageIcon("/rooms/kitchen.jpg");
        ImageIcon expResult4 = new ImageIcon("/rooms/guestroom.jpg");
        ImageIcon expResult5 = new ImageIcon("/rooms/bedroom.jpg");
        ImageIcon result = instance.RoomChange(curroom, roomdes);
        ImageIcon result2 = instance.RoomChange(curroom2, roomdes2);
        ImageIcon result3 = instance.RoomChange(curroom3, roomdes3);
        ImageIcon result4 = instance.RoomChange(curroom4, roomdes4);
        ImageIcon result5 = instance.RoomChange(curroom5, roomdes5);
        assertEquals("Changing to bedroom", expResult, result);
        assertEquals("Changing to bedroom", expResult2, result2);
        assertEquals("Changing to bedroom", expResult3, result3);
        assertEquals("Changing to bedroom", expResult4, result4);
        assertEquals("Changing to bedroom", expResult5, result5);
        
        // TODO review the generated test code and remove the default call to fail.

    }
    
    /** Returns an ImageIcon, or null if the path was invalid. */
protected ImageIcon createImageIcon(String path,
                                           String description) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL, description);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}

}