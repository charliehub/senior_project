
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.FocusListener;
import javax.swing.JComponent;
import javax.accessibility.Accessible;

public class Room2 extends JComponent implements MouseListener,
        FocusListener, Accessible{

    public Image type;
    public ImageIcon furniture;
    public ImageIcon decor;
    public ImageIcon walls;
    public ImageIcon textures;

    public Room2(){
    
    }
    
    public Room2(Image roomtype){
       roomtype = type;
       setFocusable(true);
       addMouseListener(this);
       addFocusListener(this);
    }
    
    public Room2(Image roomtype, ImageIcon sitting, ImageIcon decoration,
               ImageIcon barrier, ImageIcon tex){
			   roomtype = type;
			   sitting = furniture;
			   decoration = decor;
			   barrier = walls;
			   tex = textures;
}

    public Image getRoom(Image curroom) {

        return type;

    }

    public Image deleteRoom(Image curroom) {

        type = null;
        return type;
    }

    public Image RoomChange(Image curroom, Image roomdes){
        curroom = roomdes;
        return roomdes;
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

  protected void paintComponent(Graphics graphics) {
    Graphics g = graphics.create();

    //Draw in our entire space, even if isOpaque is false.
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, type == null ? 200 : type.getWidth(this),
        type == null ? 200: type.getHeight(this));

    if (type != null) {
      //Draw image at its natural size of 125x125.
      g.drawImage(type, 0, 0, this);
      
    }

    //Add a border, red if picture currently has focus
    if (isFocusOwner()) {
      g.setColor(Color.RED);
    } else {
      g.setColor(Color.BLACK);
    }
    g.drawRect(0, 0, type == null ? 125 : type.getWidth(this),
        type == null ? 125 : type.getHeight(this));
    g.dispose();
  }
}