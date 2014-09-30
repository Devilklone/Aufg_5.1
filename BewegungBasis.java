package aufg_5.pkg1;

import java.awt.Point;

/**
 *
 * @author Simon.Doba
 */
public class BewegungBasis {
    Point p = new Point();
   // private int pixX;
    private int pixY;
    
    public BewegungBasis(){
        
    }

   
    public int bewege(){
        System.out.println("Super.bewege");
        return 0;
    }
    
    public Point getPosition(){
        return p;
    }
}
