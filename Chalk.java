 

class Chalk extends WritingImplement
{
    
    private String chalkColor;
    private String shape;
    /**
     * Constructor for objects of class Chalk
     * 
     * @param	bodyMaterial	The material that holds the chalk. Must be Plastic, wooden, metal.
	 * @param 	chalkColor  	The color of the chalk and the color it write.
	 * @param	Length   		The length of the chalk stick in cm.
     */
    public Chalk(String bodyMaterial,String chalkColor, double length)
    {
        super(bodyMaterial,length);
        this.chalkColor = chalkColor;
    }
    
    /**
     * Constructor for objects of class Chalk
     */
    public Chalk()
    {
        this("chalk","white",20);
    }
    
    /**
     * 
     */
    public void fill(String shape)
    {
        System.out.println("The chalk drew a "+ shape+ " and filled it in on its Side");
    }
    
    /**
     * Method to erase the shape of filling that was previously drawn
     *
     * @param shape 	The shape of the drawing that is going to be erased.
     */
    public void erase(String shape)
    {
    	System.out.println("The "+ shape+ " that was drew and filled in was erased");
    }
}
