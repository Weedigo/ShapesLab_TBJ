public class Circles extends Shape{
    private int radius;
    public Circles(int side){
        super("Circles");
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
