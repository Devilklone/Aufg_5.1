package aufg_5.pkg1;

/**
 *
 * @author Simon.Doba
 */
public class BewegungVertikal extends BewegungBasis {
    @Override
    public int bewege(){
        System.out.println("Vertikal");
        int y=0;
        return y++;
        //System.out.println("Vertikal Ende");
    }
}
