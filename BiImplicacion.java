
/**
 * Write a description of class BiImplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BiImplicacion 
{
    public boolean bImp(Formula f){
        return (!Formula.getP() || Formula.getQ()) && (!Formula.getQ() || Formula.getP());
    }
}
