import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Image;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author officemax
 */
public class Furniture{
    
    private Color color;
    private Image style;
    private String height;
    private String width;
    private String[] furntype ={"futon", "beds", "mattresses", "recliners", "couches",
        "sofas"};

    /**
     *
     */
    public JButton furniture;
    
    /**
     *
     * @param c
     */
    
    public Furniture(){
        
    }
    public Furniture(Color c){
        color = c;
    }
    
    public Furniture(Image style)
    {
        this.style = style;
    }
    /**
     *
     * @param s
     * @param c
     */
    public Furniture(Image s, Color c){
        color = c;
        style = s;
    }
    
    public Furniture(String h, String w, Image s, Color c){
        height = h;
        width = w;
        style = s;
        color = c;
    }
    
    public Furniture(Image s, String h, Color c){
        style = s;
        height = h;
        color = c;
    }
    
    public Color getColor(){
        return color;
    }
    
    
    public String getHeight(){
        return height;
    }
    
    public String getWidth(){
        return width;
    }
    
    public ImageIcon getcouch(ImageIcon couch){
        
        return couch;
    }
    
    public ImageIcon getBed(ImageIcon bed){
       
        return bed;
    }
    
    public ImageIcon getmattress(ImageIcon mattress){
     
        return mattress;
    }
    
    public ImageIcon getfuton(ImageIcon futon){
       
        return futon;
    }
    
    public ImageIcon getsofa(ImageIcon sofa){
       
        return sofa;
    }
    
    public ImageIcon getrecliner(ImageIcon recliner){
       
        return recliner;
    }
    
    public Image getStyle(){
        return style;
    }
   
    public Color changeColor(Color color1, Color color2){
        return color2;
    }
    
       public Image changeStyle(Image style1, Image style2){
        return style;
    }
    
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Furniture.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}

