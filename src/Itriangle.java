public class Itriangle extends Shape {
    private int base;
    private int height;

    public Itriangle(int base, int height) {
        super("Itriangle");
        this.base = base;
        this.height = height;
    }

    public double getArea()
    {
        return (base * height) / 2;//the base times the height divided by 2 is the area
    }
    public double getPerimeter()
    {
        return ((Math.sqrt((base / 2) * (base / 2) + (height * height))) * 2 + base);// the base plus the two sides of the same length
    }
}
