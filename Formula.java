
/**
 * Write a description of class Formula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formula
{
    private static boolean p;
    private static boolean q;
    
    /**
     * Constructor for objects of class Formula
     */
    public Formula(boolean p, boolean q)
    {
        this.p = p;
        this.q = q;
    }
    
    /**
     * Constructor for objects of class Formula
     */
    public Formula(boolean p)
    {
        this.p = p;
    }
    
    public static boolean getP(){
        return p;
    }
    
    public static boolean getQ(){
        return q;
    }
}
