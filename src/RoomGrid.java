
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.accessibility.Accessible;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.KeyStroke;
import javax.swing.TransferHandler;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RoomGrid extends JPanel {

    DTrooms pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8, pic9, pic10,
            pic11, pic12;
    public int fps, newheight, newwidth;
    
    //The specific files to be displayed on the Grid
    static String bedroom1 = "blue";
    static String bedroom2 = "dream";
    static String bedroom3 = "luxurious";
    static String bedroom4 = "marvel";
    static String bathroom1 = "antique";
    static String bathroom2 = "exotic";
    static String bathString = "squeeze";
    static String bathString2 = "valentine";
    static String KitchenString = "modernistic";
    static String KitchenString2 = "old";
    static String livingString = "luxurious";
    static String livingString2 = "fantastic";
    roomsTransferHandler picHandler;
    JSlider width;

    
    //the actual construction of the Grid itself. 
    public RoomGrid() {
        super(new BorderLayout());
        picHandler = new roomsTransferHandler();

        JPanel mugshots = new JPanel(new GridLayout(4, 3));
        pic1 = new DTrooms(createImageIcon("/bedrooms/" + bedroom1 + ".jpg",
                bedroom1).getImage());
        pic1.setTransferHandler(picHandler);
        mugshots.add(pic1);
        pic2 = new DTrooms(createImageIcon("/bedrooms/" + bedroom2 + ".jpg",
                bedroom2).getImage());
        pic2.setTransferHandler(picHandler);
        mugshots.add(pic2);
        pic3 = new DTrooms(createImageIcon("/bedrooms/" + bedroom3 + ".jpg",
                bedroom3).getImage());
        pic3.setTransferHandler(picHandler);
        mugshots.add(pic3);
        pic4 = new DTrooms(createImageIcon("/bedrooms/" + bedroom4 + ".jpg",
                bedroom4).getImage());
        pic4.setTransferHandler(picHandler);
        mugshots.add(pic4);
        pic5 = new DTrooms(createImageIcon("/bathrooms/" + bathroom1 + ".jpg",
                bathroom1).getImage());
        pic5.setTransferHandler(picHandler);
        mugshots.add(pic5);
        pic6 = new DTrooms(createImageIcon("/bathrooms/" + bathroom2 + ".jpg",
                bathroom2).getImage());
        pic6.setTransferHandler(picHandler);
        mugshots.add(pic6);

        //These six components with no pictures provide handy
        //drop targets.
        pic7 = new DTrooms(createImageIcon("/bathrooms/" + bathString + ".jpg",
                bathroom2).getImage());
        pic7.setTransferHandler(picHandler);
        mugshots.add(pic7);
        pic8 = new DTrooms(createImageIcon("/bathrooms/" + bathString2 + ".jpg",
                bathroom2).getImage());
        pic8.setTransferHandler(picHandler);
        mugshots.add(pic8);
        pic9 = new DTrooms(createImageIcon("/livingrooms/" + livingString + ".jpg",
                livingString).getImage());
        pic9.setTransferHandler(picHandler);
        mugshots.add(pic9);
        pic10 = new DTrooms(createImageIcon("/livingrooms/" + livingString2 + ".jpg",
                livingString).getImage());
        pic10.setTransferHandler(picHandler);
        mugshots.add(pic10);
        pic11 = new DTrooms(createImageIcon("/kitchen/" + KitchenString + ".JPG",
                KitchenString).getImage());
        pic11.setTransferHandler(picHandler);
        mugshots.add(pic11);
        pic12 = new DTrooms(createImageIcon("/kitchen/" + KitchenString + ".JPG",
                KitchenString).getImage());
        pic12.setTransferHandler(picHandler);
        mugshots.add(pic12);
       // width = new JSlider();
        //width.addChangeListener(this);
        //mugshots.add(width);

        setPreferredSize(new Dimension(800, 800));
        add(mugshots, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path, String description) {
        java.net.URL imageURL = RoomGrid.class.getResource(path);

        if (imageURL == null) {
            System.err.println("Resource not found: " + path);
            return null;
        } else {
            return new ImageIcon(imageURL, description);
        }
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    public static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("Room Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the menu bar and content pane.
        RoomGrid demo = new RoomGrid();
        demo.setOpaque(true); //content panes must be opaque
        frame.setContentPane(demo);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    //This is the slider to change the height and/or width of the image
  /*
     @Override
     public void stateChanged(ChangeEvent ce) {
        
     JSlider source = (JSlider)ce.getSource();
     if (!source.getValueIsAdjusting()) {
     fps = (int)source.getValue();
     if (fps == 0){
     newheight = 0;
     newwidth = 0;
     }
     //newheight = 1000 / fps;
     //newwidth = 1000 / fps;
                
     //Picture.paintComponent(Graphics graphics);
     }
     }
     */
   
}

/*
 * roomsTransferHandler.java is used by  RoomGrid.java 
 */
class roomsTransferHandler extends TransferHandler {

    DataFlavor pictureFlavor = DataFlavor.imageFlavor;
    DTrooms sourcePic;
    boolean shouldRemove;

    public boolean importData(JComponent c, Transferable t) {
        Image image;
        if (canImport(c, t.getTransferDataFlavors())) {
            DTrooms pic = (DTrooms) c;
            //Don't drop on myself.
            if (sourcePic == pic) {
                shouldRemove = false;
                return true;
            }
            try {
                image = (Image) t.getTransferData(pictureFlavor);
                //Set the component to the new picture.
                pic.setImage(image);
                return true;
            } catch (UnsupportedFlavorException ufe) {
                System.out.println("importData: unsupported data flavor");
            } catch (IOException ioe) {
                System.out.println("importData: I/O exception");
            }
        }
        return false;
    }

    protected Transferable createTransferable(JComponent c) {
        sourcePic = (DTrooms) c;
        shouldRemove = true;
        return new roomsTransferable(sourcePic);
    }

    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }

    protected void exportDone(JComponent c, Transferable data, int action) {
        if (shouldRemove && (action == MOVE)) {
            sourcePic.setImage(null);
        }
        sourcePic = null;
    }

    public boolean canImport(JComponent c, DataFlavor[] flavors) {
        for (int i = 0; i < flavors.length; i++) {
            if (pictureFlavor.equals(flavors[i])) {
                return true;
            }
        }
        return false;
    }

    class roomsTransferable implements Transferable {

        private Image image;

        roomsTransferable(DTrooms pic) {
            image = pic.image;
        }

        public Object getTransferData(DataFlavor flavor)
                throws UnsupportedFlavorException {
            if (!isDataFlavorSupported(flavor)) {
                throw new UnsupportedFlavorException(flavor);
            }
            return image;
        }

        public DataFlavor[] getTransferDataFlavors() {
            return new DataFlavor[]{pictureFlavor};
        }

        public boolean isDataFlavorSupported(DataFlavor flavor) {
            return pictureFlavor.equals(flavor);
        }
    }
}

/*
 * DTrooms.java is used by RoomGrid.java 
 */
//A subclass of rooms that supports Data Transfer.
class DTrooms extends rooms implements MouseMotionListener {

    private MouseEvent firstMouseEvent = null;
    private static boolean installInputMapBindings = true;

    public DTrooms(Image image) {
        super(image);
        addMouseMotionListener(this);

        //Add the cut/copy/paste key bindings to the input map.
        //Note that this step is redundant if you are installing
        //menu accelerators that cause these actions to be invoked.
        //RoomGrid does not use menu accelerators and, since
        //the default value of installInputMapBindings is true,
        //the bindings are installed. 
        if (installInputMapBindings) {
            InputMap imap = this.getInputMap();
            imap.put(KeyStroke.getKeyStroke("ctrl X"), TransferHandler
                    .getCutAction().getValue(Action.NAME));
            imap.put(KeyStroke.getKeyStroke("ctrl C"), TransferHandler
                    .getCopyAction().getValue(Action.NAME));
            imap.put(KeyStroke.getKeyStroke("ctrl V"), TransferHandler
                    .getPasteAction().getValue(Action.NAME));
        }

        //Add the cut/copy/paste actions to the action map.
        //This step is necessary because the menu's action listener
        //looks for these actions to fire.
        ActionMap map = this.getActionMap();
        map.put(TransferHandler.getCutAction().getValue(Action.NAME),
                TransferHandler.getCutAction());
        map.put(TransferHandler.getCopyAction().getValue(Action.NAME),
                TransferHandler.getCopyAction());
        map.put(TransferHandler.getPasteAction().getValue(Action.NAME),
                TransferHandler.getPasteAction());
    }

    public void setImage(Image image) {
        this.image = image;
        this.repaint();
    }

    public void mousePressed(MouseEvent e) {
        //Don't bother to drag if there is no image.
        if (image == null) {
            return;
        }

        firstMouseEvent = e;
        e.consume();
    }

    public void mouseDragged(MouseEvent e) {
        //Don't bother to drag if the component displays no image.
        if (image == null) {
            return;
        }

        if (firstMouseEvent != null) {
            e.consume();

            //If they are holding down the control key, COPY rather than MOVE
            int ctrlMask = InputEvent.CTRL_DOWN_MASK;
            int action = ((e.getModifiersEx() & ctrlMask) == ctrlMask) ? TransferHandler.COPY
                    : TransferHandler.MOVE;

            int dx = Math.abs(e.getX() - firstMouseEvent.getX());
            int dy = Math.abs(e.getY() - firstMouseEvent.getY());
            //Arbitrarily define a 5-pixel shift as the
            //official beginning of a drag.
            if (dx > 5 || dy > 5) {
                //This is a drag, not a click.
                JComponent c = (JComponent) e.getSource();
                TransferHandler handler = c.getTransferHandler();
                //Tell the transfer handler to initiate the drag.
                handler.exportAsDrag(c, firstMouseEvent, action);
                firstMouseEvent = null;
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
        firstMouseEvent = null;
    }

    public void mouseMoved(MouseEvent e) {
    }

    //This method is necessary because RoomGrid and
    //RoomGrid2 both use this class and RoomGrid
    //needs to have the input map bindings installed for
    //cut/copy/paste.
    public static void setInstallInputMapBindings(boolean flag) {
        installInputMapBindings = flag;
    }

    public static boolean getInstallInputMapBindingds() { //for completeness
        return installInputMapBindings;
    }
}

/*
 * rooms.java is used by RoomGrid.java
 * 
 */
class rooms extends JComponent implements MouseListener, FocusListener,
        Accessible {

    Image image;

   
    public rooms(Image image) {

        this.image = image;
        setFocusable(true);
        addMouseListener(this);
        addFocusListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        //Since the user clicked on us, let's get focus!
        requestFocusInWindow();
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void focusGained(FocusEvent e) {
        //Draw the component with a red border
        //indicating that it has focus.
        this.repaint();
    }

    public void focusLost(FocusEvent e) {
        //Draw the component with a black border
        //indicating that it doesn't have focus.
        this.repaint();
    }

    //will configure the slider so that as the slider
    //is moved to the left or the right, the width
    //of the images will changed accordingly.
    //This is the slider to change the height of the image
    protected void paintComponent(Graphics graphics) {
        Graphics g = graphics.create();

        //Draw in our entire space, even if isOpaque is false.
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, image == null ? 150 : image.getWidth(this),
                image == null ? 150 : image.getHeight(this));

        if (image != null) {
            //Draw image at its natural size of 125x125.
            g.drawImage(image, -10, -10, this);
        }

        //Add a border, red if picture currently has focus
        if (isFocusOwner()) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLACK);
        }
        g.drawRect(0, 0, image == null ? 150 : image.getWidth(this),
                image == null ? 150 : image.getHeight(this));
        g.dispose();
    }
}
