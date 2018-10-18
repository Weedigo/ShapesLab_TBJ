public class Etriangle extends Shape
{
    private int side;

        public Etriangle(int side)
        {
            super("Etriangle");
            this.side = side;
        }
        public double getArea() {
            return (Math.sqrt(3) / 4) * (side * side);
        }
        public double getPerimeter()
        {
            return side*3;
        }
}

