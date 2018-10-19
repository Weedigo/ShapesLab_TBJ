public class Square extends Rectangle
{
    private int side;

    public Square(int side )
    {
        super(side);
        this.side=side;
    }

    public double getArea()
    {
        return side*side;
    } //side squared(duh).

    public double getPerimeter()
    {
        return side*4;
    } //side times four.

}
