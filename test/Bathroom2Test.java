/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.ImageIcon;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashia
 */
public class Bathroom2Test {

    public Bathroom2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of gettoilet method, of class Bathroom2.
     */
    @Test
    public void testGettoilet() {
        System.out.println("gettoilet");
        String bed5 = "toiletstuff";
        String bed6 = "watertoilet";
        String bed7 = "wikitoilet";
        ImageIcon toil = new ImageIcon("toilets/" + bed5 + ".jpg");
        ImageIcon toil2 = new ImageIcon("toilets/" + bed6 + ".jpg");
        ImageIcon toil3 = new ImageIcon("toilets/" + bed7 + ".jpg");
        Bathroom2 instance = new Bathroom2();
        ImageIcon expResult = new ImageIcon("toilets/toiletstuff.jpg");
        ImageIcon expResult2 = new ImageIcon("toilets/watertoilet.jpg");
        ImageIcon expResult3 = new ImageIcon("toilets/wikitoilet.jpg");
        ImageIcon result = instance.gettoilet(toil);
        ImageIcon result2 = instance.gettoilet(toil2);
        ImageIcon result3 = instance.gettoilet(toil3);
        assertEquals("acquiring the toilet:", expResult, result);
        assertEquals("acquiring the toilet:", expResult2, result2);
        assertEquals("acquiring the toilet:", expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of delete_toilet method, of class Bathroom2.
     */
    @Test
    public void testDelete_toilet() {
        System.out.println("delete_toilet");
        String obj = "toiletstuff";
        String obj2 = "watertoilet";
        String obj3 = "wikitoilet";
        ImageIcon toil = new ImageIcon("toilets/" + obj + ".jpg");
        ImageIcon toil2 = new ImageIcon("toilets/" + obj2 + ".jpg");
        ImageIcon toil3 = new ImageIcon("toilets/" + obj3 + ".jpg");
        Bathroom2 instance = new Bathroom2();
        ImageIcon expResult = null;
        ImageIcon expResult2 = null;
        ImageIcon expResult3 = null;
        ImageIcon result = instance.delete_toilet(toil);
        ImageIcon result2 = instance.delete_toilet(toil2);
        ImageIcon result3 = instance.delete_toilet(toil3);
        assertEquals("toilet being deleted: ", expResult, result);
        assertEquals("toilet being deleted: ", expResult2, result2);
        assertEquals("toilet being deleted: ", expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getshower method, of class Bathroom2.
     */
    @Test
    public void testGetshower() {
        System.out.println("getshower");
        String show = "durhamshower";
        String show1 = "royalshower";
        String show2 = "clevelandshower";
        ImageIcon toil = new ImageIcon("shower/" + show + ".jpg");
        ImageIcon toil2 = new ImageIcon("shower/" + show1 + ".jpg");
        ImageIcon toil3 = new ImageIcon("shower/" + show2 + ".jpg");

        Bathroom2 instance = new Bathroom2();
        ImageIcon expResult = new ImageIcon("shower/durhamshower.jpg");
        ImageIcon expResult2 = new ImageIcon("shower/royalshower.jpg");
        ImageIcon expResult3 = new ImageIcon("shower/clevelandshower.jpg");
        ImageIcon result = instance.getshower(toil);
        ImageIcon result2 = instance.getshower(toil2);
        ImageIcon result3 = instance.getshower(toil3);
        assertEquals("shower being acquired: ", expResult, result);
        assertEquals("shower being acquired: ", expResult2, result2);
        assertEquals("shower being acquired: ", expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of delete_shower method, of class Bathroom2.
     */
    @Test
    public void testdelete_shower() {
        System.out.println("deleteshower");
        String show = "durhamshower";
        String show1 = "royalshower";
        String show2 = "clevelandshower";
        ImageIcon toil = new ImageIcon("shower/" + show + ".jpg");
        ImageIcon toil2 = new ImageIcon("shower/" + show1 + ".jpg");
        ImageIcon toil3 = new ImageIcon("shower/" + show2 + ".jpg");

        Bathroom2 instance = new Bathroom2();
        ImageIcon expResult = null;
        ImageIcon expResult2 = null;
        ImageIcon expResult3 = null;
        ImageIcon result = instance.delete_shower(toil);
        ImageIcon result2 = instance.delete_shower(toil2);
        ImageIcon result3 = instance.delete_shower(toil3);
        assertEquals("shower being acquired: ", expResult, result);
        assertEquals("shower being acquired: ", expResult2, result2);
        assertEquals("shower being acquired: ", expResult3, result3);
    }
}