public class Etriangle extends Shape
{
    private int side;

        public Etriangle(int side)
        {
            super("Etriangle");
            this.side = side;
        }
        public double getArea() {
            return (Math.sqrt(3) / 4) * (side * side);//the area is the square root of 3 divided by 4 times the side squared
        }
        public double getPerimeter()
        {
            return side*3;
        }// the perimeter is the side times 3
}

