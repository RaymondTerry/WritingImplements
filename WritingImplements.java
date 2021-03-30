 

import java.util.ArrayList;



public class WritingImplements
{
    public static void main(String[] args)
    {
        //Section 1 - Simple Tests
        
        
        Pencil no2Pencil = new Pencil();
        Pencil mechPencil = new Pencil("plastic", "clear blue", 0.7);

        
        Pen oldFolks = new Pen();
        Pen myPurplePen = new Pen("purple", "plastic", 0.7);

        Marker dryErase = new Marker("blue", "chisel", 6.35);
        Marker sharpie = new Marker("green", "bullet", 2.0);

        myPurplePen.write("I'm hungry");
        myPurplePen.erase("I'm hungry");
        
        Highlighter yellowHighlighter = new Highlighter("chisel", "yellow");
        
        yellowHighlighter.highlight("I'm hungry");
        
        






        //Section 2 - Collection

        ArrayList<WritingImplement> myPencilBox = new ArrayList<WritingImplement>();
         myPencilBox.add(no2Pencil);
        myPencilBox.add(mechPencil);
        myPencilBox.add(oldFolks);
         myPencilBox.add(myPurplePen);
         myPencilBox.add(dryErase);
        myPencilBox.add(sharpie);
         myPencilBox.add(new Pen("blue", "plastic", 0.9));
         myPencilBox.add(yellowHighlighter);
         myPencilBox.add(new Highlighter());

         for (WritingImplement w : myPencilBox)
          {
            w.draw("a circle");
            w.write("I am really hungry");
            
        }

    }
}