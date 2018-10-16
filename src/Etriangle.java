public class Etriangle {
    public class ETriangle extends Shape
    {
        private int side;

        public ETriangle(int side)
        {
            super("RPentagon");
            this.side = side;
        }

        @java.lang.Override
        public double getArea()
        {
            return (Math.sqrt(3)/4)*Math.pow(side,2);
        }
        @Override
        public double getPerimeter()
        {
            return side*3;
        }
    }
}