package aufg_5.pkg1;

import java.awt.Point;

/**
 *
 * @author Simon.Doba
 */
public class BewegungClick extends BewegungBasis {

    private Point ziel;

    public BewegungClick() {

    }

    public Point getZiel() {
        return ziel;
    }

    public void setZiel(int x, int y) {
        this.ziel = new Point(x,y);
    }

    @Override
    public Point getPosition() {
        return super.getPosition(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int bewege() {
        return super.bewege(); //To change body of generated methods, choose Tools | Templates.
    }
}
