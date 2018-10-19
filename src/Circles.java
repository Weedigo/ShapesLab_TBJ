public class Circles extends Shape{
    private int radius;
    public Circles(int radius){
        super("Circles");
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    } //radius squared multiply by pi(approx 3.14)
    public double getPerimeter(){
        return 2*radius*Math.PI;
    } //radius multiply by 2 then by pi(approx 3.14)
}
