
import java.awt.Image;
import javax.swing.ImageIcon;

public class kitchen2 extends Room2 {

    public Image kitchenware;
    public Image stove;

    public kitchen2(Image roomtype, ImageIcon sitting, ImageIcon decoration,
            ImageIcon barrier, ImageIcon tex, Image kitchenware, Image stove) {


        super(roomtype, sitting, decoration, barrier, tex);
        this.kitchenware = kitchenware;
        this.stove = stove;
    }

    public Image getkitchenware(Image kitchenstuff) {
        return kitchenware;

    }

    public Image getstove(Image stove) {

        return stove;
    }

    public Image delete_kitchenware(Image kitchenstuff) {

        kitchenware = null;
        return kitchenware;
    }
}