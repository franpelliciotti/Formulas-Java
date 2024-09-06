
/**
 * Write a description of class Implicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Implicacion
{
    public boolean imp(Formula f){
        return !Formula.getP() || Formula.getQ();
    }
}
