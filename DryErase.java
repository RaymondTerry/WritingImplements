 


/**
 * Issue correction for #15 "Add a Dry Erase Marker", which instructs me to create a new 
 * Marker subclass called DryErase which will have a method called erase() similar to pen class. 
 * 
 * @author Cody Johnson aka CSSRPDev
 * @version Febuary 5, 2019
 */
public class DryErase extends Marker
{
    /**
     * Default constructor for DryErase Marker
     */
    public DryErase()
    {
        super();
    }
    
    /**
     * This erase method simulates the DryErase Marker erasing something
     * 
     * @param thing The thing the DryErase Marker erased
     */
    public void erase(String thing)
    {
        System.out.println("The " + super.getInkColor() + " " + super.getTipShape() + " DryErase Marker just erased: " + thing);
    }
}
