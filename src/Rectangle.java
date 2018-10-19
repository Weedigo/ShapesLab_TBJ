public class Rectangle extends Shape
{
    private int length;
    private int width;

    public Rectangle(int length,int width)
    {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }

    public Rectangle(int side)
    {
        super("Square");
        this.length=side;
        this.width=side;
    }

    public double getArea()
    {
        return width*length;
    } //width times length.
    public double getPerimeter()
    {
        return ((2*width)+(2*length));
    } //width plus length, then multiplied by two.
}
