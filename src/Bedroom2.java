
import javax.swing.ImageIcon;
import java.awt.Image;

public class Bedroom2 extends Room2 {

    public ImageIcon mirror;
    public ImageIcon curtains;
    public ImageIcon bed;
    public ImageIcon bedsidetable;

    public Bedroom2(){
    }
    
    public Bedroom2(Image roomtype){
        super(roomtype);
    }
    public Bedroom2(Image roomtype, ImageIcon sitting, ImageIcon decoration,
            ImageIcon barrier, ImageIcon tex, ImageIcon mirror, ImageIcon curtains,
            ImageIcon bed, ImageIcon bedsidetable) {
        super(roomtype, sitting, decoration, barrier, tex);
        this.mirror = mirror;
        this.curtains = curtains;
        this.bed = bed;
        this.bedsidetable = bedsidetable;
    }

    public ImageIcon getbed(ImageIcon bed) {

        return bed;
    }

    public ImageIcon getbedsidetable(ImageIcon bedsidetable) {

        return bedsidetable;
    }

    public ImageIcon getcurtains(ImageIcon curtains) {
        return curtains;
    }

    public ImageIcon getmirror(ImageIcon mirror) {
        return mirror;
    }

    public ImageIcon delete_bed(ImageIcon bed) {
        bed = null;
        return bed;
    }

    public ImageIcon delete_mirror(ImageIcon mirror) {
        mirror = null;
        return mirror;
    }

    public ImageIcon delete_curtains(ImageIcon curtains) {
        curtains = null;
        return curtains;
    }

    public ImageIcon delete_bedsidetable(ImageIcon bedsidetable) {
        bedsidetable = null;
        return bedsidetable;
    }
}
