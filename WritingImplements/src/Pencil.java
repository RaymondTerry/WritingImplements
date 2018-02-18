package WritingImplements.src;

/**
 * This class is a subclass of the writingImplement class. This class
 * describes a new type of writing implement (pencil) and the methods
 * associated with this new writing implement.
 */
class Pencil extends WritingImplement
{

    // The color of the pencil (not the color it writes). It can be any string that names a color.
    private String bodyColor;

    /**
     * The default constructor for the pencil. Creates a yellow wooden pencil with 0.5mm writing point
     */
    public Pencil()
    {
        this("wooden", "yellow", 0.5);
    }

    /**
     * A constructor for Pencil objects
     *
     * @param   bodyMaterial    The material the pencil is made of. Must be "plastic", "wooden", or "metal"
     * @param   bodyColor       The color of the pencil, not the color it writes
     * @param   leadSize        The size of the writing point in mm.
     */
    public Pencil(String bodyMaterial, String bodyColor, double leadSize)

    {
        super(bodyMaterial, leadSize);
        setBodyColor(bodyColor);
    }

    /**
     * Accessor method for bodyColor
     *
     * @return  bodyColor   The color of the pencil
     */
    public String getBodyColor()
    {
        return bodyColor;
    }

    /**
     * Mutator method for bodyColor
     *
     * @param   bodyColor   The color of the pencil. It can be any string.
     */
    private void setBodyColor(String bodyColor)
    {
        this.bodyColor = bodyColor;
    }

    /**
     * This method simulates the pencil erasing something
     *
     * @param   words   The words the pencil erased
     */
    public void erase(String words)
    {
        System.out.println("The " + bodyColor + " " + getBodyMaterial() + " pencil just erased the words: " + words);
    }

    /**
     * This method describes the pencil drawing something
     *
     * @param   shape   The shape or object drawn
     */
    public void draw(String shape)
    {
        System.out.println("The " + bodyColor + " " + getBodyMaterial() + " pencil just drew: " + shape);
    }

    /**
     * This method makes use of the draw method to describe
     * the pencil drawing something
     * 
     * @param   shape   The shape or object drawn
     */
    public void sketch(String shape)
    {
        draw(shape);

    }

}
