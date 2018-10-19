public class Ellipse extends Shape{
    private int major;
    private int minor;
    public Ellipse(int major, int minor){
        super("Ellipse");
        this.major = major;
        this.minor = minor;
    }
    public double getArea(){return major*minor*Math.PI;} //semi major times semi minor axis, then multiply by pi(approx 3.14).
    public double getPerimeter(){return 2*Math.PI*Math.sqrt((Math.pow(major,2)+Math.pow(minor,2))/2);} // square root of semi major squared plus semi minor squared divided by two, then multiplied by two pi.
}

