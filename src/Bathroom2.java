
import javax.swing.ImageIcon;
import java.awt.Image;

public class Bathroom2 extends Room2 {

    public ImageIcon toilet;
    public ImageIcon shower;
    public ImageIcon faucet;

    public Bathroom2(){
        
    }
    public Bathroom2(Image roomtype, ImageIcon sitting, ImageIcon decoration,
            ImageIcon barrier, ImageIcon tex, ImageIcon toilet, ImageIcon shower, ImageIcon faucet) {

        super(roomtype, sitting, decoration, barrier, tex);
        this.toilet = toilet;
        this.shower = shower;
        this.faucet = faucet;
    }

    public ImageIcon gettoilet(ImageIcon toil) {

        return toilet;
    }

    public ImageIcon delete_toilet(ImageIcon toil) {

        toilet = null;
        return toilet;
    }

    public ImageIcon getshower(ImageIcon shower) {
        return shower;
    }

    public ImageIcon delete_shower(ImageIcon shower) {
        shower = null;
        return shower;
    }
}