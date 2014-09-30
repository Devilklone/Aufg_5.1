package aufg_5.pkg1;

/**
 *
 * @author Simon.Doba
 */
public class BewegungHorizontal extends BewegungBasis {
    @Override
    public int bewege(){
        System.out.println("Horizontal");
        int x=0;
        return x++;
        //System.out.println("Horizontal Ende");
    }
}
