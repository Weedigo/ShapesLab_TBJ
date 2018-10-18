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
    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return ((2*width)+(2*length));
    }
}
