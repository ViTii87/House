/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square suelo;
    private Person paisano;
    
    private Person persona1;
    private Person persona2;
    private Person persona3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        
        suelo = new Square();
        suelo.changeColor("green");
        suelo.changeSize(800);
        suelo.moveVertical(125);
        suelo.moveHorizontal(-310);
        suelo.makeVisible();
        
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        paisano = new Person();
        paisano.changeColor("blue");
        paisano.moveVertical(20);
        paisano.moveHorizontal(-300);
        paisano.makeVisible();
        
            
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Metodo para que el sol se mueva
     */
    public void moveSun()
    {
        sun.slowMoveVertical(100);
        setBlackAndWhite();
        suelo.changeColor("black");
    }
    
    /**
     * Metodo para hacer mover a la persona (sale de la izquierda)
     */
    public void movePaisanin()
    {
        paisano.slowMoveHorizontal(140);
    }
    
    /**
     * Metodo para crear tres figuras aleatorias
     */
    public void creaFiguras()
    {
        persona1 = new Person();
        persona1.moveHorizontal(40);
        persona1.moveVertical(30);
        persona1.makeVisible();
        
        persona2 = new Person();
        persona2.moveHorizontal(10);
        persona2.moveVertical(30);
        persona2.makeVisible();
        
        persona3 = new Person();
        persona3.moveHorizontal(25);
        persona3.changeColor("blue");
        persona3.makeVisible();
        
    }
    
    /**
     * Metodo para mover las figuras
     */
    public void mueveFiguras()
    {
        if (persona1 != null) {
        persona3.slowMoveHorizontal(40);
        persona3.slowMoveVertical(30);
        persona3.slowMoveHorizontal(80);
        
        persona1.slowMoveHorizontal(60);
        persona2.slowMoveHorizontal(-140);
    }
    }
}
