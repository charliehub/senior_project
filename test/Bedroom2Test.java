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
 * @author Charles
 */
public class Bedroom2Test {

    public Bedroom2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getbed method, of class Bedroom2.
     */
    @Test
    public void testGetbed() {
        System.out.println("getbed");
        String bed1 = "queenbed";
        String bed2 = "softbed";
        ImageIcon bed3 = new ImageIcon("/beds/" + bed1 + ".jpg");
        ImageIcon bed4 = new ImageIcon("/beds/" + bed2 + ".jpg");
        Bedroom2 instance = new Bedroom2();
        ImageIcon expResult = new ImageIcon("/beds/queenbed.jpg");
        ImageIcon expResult2 = new ImageIcon("/beds/softbed.jpg");
        ImageIcon result = instance.getbed(bed3);
        ImageIcon result2 = instance.getbed(bed4);
        assertEquals("acquiring bed: ", expResult, result);
        assertEquals("acquiring bed: ", expResult2, result2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getbedsidetable method, of class Bedroom2.
     */
    @Test
    public void testGetbedsidetable() {
        System.out.println("getbedsidetable");
        String bedtable2 = "barnwood";
        String bedtable = "bedside1";
        ImageIcon bedsidetable = new ImageIcon("/bedsidetables/" + bedtable + ".jpg");
        ImageIcon bedsidetable2 = new ImageIcon("/bedsidetables/" + bedtable2 + ".jpg");
        Bedroom2 instance = new Bedroom2();
        ImageIcon expResult = new ImageIcon("/bedsidetables/bedside1.jpg");
        ImageIcon expResult2 = new ImageIcon("/bedsidetables/barnwood.jpg");
        ImageIcon result = instance.getbedsidetable(bedsidetable);
        ImageIcon result2 = instance.getbedsidetable(bedsidetable2);
        assertEquals("acquiring bedsidetable: ", expResult, result);
        assertEquals("acquiring bedsidetable: ", expResult2, result2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getcurtains method, of class Bedroom2.
     */
    @Test
    public void testGetcurtains() {
        System.out.println("getcurtains");
        String curtain1 = "brightcurtain";
        String curtain2 = "rainbowcurtain";
        String curtain3 = "redcurtains";
        ImageIcon cover1 = new ImageIcon("/curtains/" + curtain1 + ".jpg");
        ImageIcon cover2 = new ImageIcon("/curtains/" + curtain2 + ".jpg");
        ImageIcon cover3 = new ImageIcon("/curtains/" + curtain3 + ".jpg");
        Bedroom2 instance = new Bedroom2();
        ImageIcon expResult = new ImageIcon("/curtains/brightcurtain.jpg");
        ImageIcon expResult2 = new ImageIcon("/curtains/rainbowcurtain.jpg");
        ImageIcon expResult3 = new ImageIcon("/curtains/barnwood.jpg");
        ImageIcon result = instance.getcurtains(cover1);
        ImageIcon result2 = instance.getcurtains(cover2);
        ImageIcon result3 = instance.getcurtains(cover3);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getmirror method, of class Bedroom2.
     */
    @Test
    public void testGetmirror() {
        System.out.println("getmirror");
        String mirror1 = "claritymirror";
        String mirror2 = "goldenmirror";
        String mirror3 = "reflection";
        ImageIcon reflect1 = new ImageIcon("/mirrors/" + mirror1 + ".jpg");
        ImageIcon reflect2 = new ImageIcon("/mirrors/" + mirror2 + ".jpg");
        ImageIcon reflect3 = new ImageIcon("/mirrors/" + mirror3 + ".jpg");
        Bedroom2 instance = new Bedroom2();
        ImageIcon expResult = new ImageIcon("/mirrors/claritymirror.jpg");
        ImageIcon expResult2 = new ImageIcon("/mirrors/goldenmirror.jpg");
        ImageIcon expResult3 = new ImageIcon("/mirrors/reflection.jpg");
        ImageIcon result = instance.getmirror(reflect1);
        ImageIcon result2 = instance.getmirror(reflect2);
        ImageIcon result3 = instance.getmirror(reflect3);
        assertEquals("acquiring mirror: ", expResult, result);
        assertEquals("acquiring mirror: ", expResult2, result2);
        assertEquals("acquiring mirror: ", expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delete_bed method, of class Bedroom2.
     */
    @Test
    public void testdelete_bed() {
        System.out.println("getbed");
        String bed1 = "queenbed";
        String bed2 = "softbed";
        ImageIcon bed3 = new ImageIcon("/beds/" + bed1 + ".jpg");
        ImageIcon bed4 = new ImageIcon("/beds/" + bed2 + ".jpg");
        Bedroom2 instance = new Bedroom2();
        ImageIcon expResult = null;
        ImageIcon expResult2 = null;
        ImageIcon result = instance.delete_bed(bed3);
        ImageIcon result2 = instance.delete_bed(bed4);
        assertEquals("acquiring bed: ", expResult, result);
        assertEquals("acquiring bed: ", expResult2, result2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of delete_mirror method, of class Bedroom2.
     */
     @Test
    public void testdelete_mirror(){
        System.out.println("getmirror");
        String mirror1 = "claritymirror";
        String mirror2 = "goldenmirror";
        String mirror3 = "reflection";
        ImageIcon reflect1 = new ImageIcon("/mirrors/" + mirror1 + ".jpg");
        ImageIcon reflect2 = new ImageIcon("/mirrors/" + mirror2 + ".jpg");
        ImageIcon reflect3 = new ImageIcon("/mirrors/" + mirror3 + ".jpg");
        Bedroom2 instance = new Bedroom2();
        ImageIcon expResult = null;
        ImageIcon expResult2 = null;
        ImageIcon expResult3 = null;
        ImageIcon result = instance.delete_mirror(reflect1);
        ImageIcon result2 = instance.delete_mirror(reflect2);
        ImageIcon result3 = instance.delete_mirror(reflect3);
        assertEquals("acquiring mirror: ", expResult, result);
         assertEquals("acquiring mirror: ", expResult2, result2);
          assertEquals("acquiring mirror: ", expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of delete_curtains method, of class Bedroom2.
     */
    @Test
    public void testdelete_curtains() {
        System.out.println("getcurtains");
        String curtain1 = "brightcurtain";
        String curtain2 = "rainbowcurtain";
        String curtain3 = "redcurtains";
        ImageIcon cover1 = new ImageIcon("/curtains/" + curtain1 + ".jpg");
        ImageIcon cover2 = new ImageIcon("/curtains/" + curtain2 + ".jpg");
        ImageIcon cover3 = new ImageIcon("/curtains/" + curtain3 + ".jpg");
        Bedroom2 instance = new Bedroom2();
        ImageIcon expResult = null;
        ImageIcon expResult2 = null;
        ImageIcon expResult3 = null;
        ImageIcon result = instance.delete_curtains(cover1);
        ImageIcon result2 = instance.delete_curtains(cover2);
        ImageIcon result3 = instance.delete_curtains(cover3);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete_bedsidetable method, of class Bedroom2.
     */
    @Test
    public void testdelete_bedsidetable() {
        System.out.println("getbedsidetable");
        String bedtable2 = "barnwood";
        String bedtable = "bedside1";
        ImageIcon bedsidetable = new ImageIcon("/bedsidetables/" + bedtable + ".jpg");
        ImageIcon bedsidetable2 = new ImageIcon("/bedsidetables/" + bedtable2 + ".jpg");
        Bedroom2 instance = new Bedroom2();
        ImageIcon expResult = null;
        ImageIcon expResult2 = null;
        ImageIcon result = instance.delete_bedsidetable(bedsidetable);
        ImageIcon result2 = instance.delete_bedsidetable(bedsidetable2);
        assertEquals("acquiring bedsidetable: ", expResult, result);
        assertEquals("acquiring bedsidetable: ", expResult2, result2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
}