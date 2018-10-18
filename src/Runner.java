public class Runner
{
    public static void main(String[] args)
    {
        Shape shape1=new Rectangle(5,10);
        Shape shape2= new Etriangle(10);
        Shape shape3= new Circles(10);
        Shape shape4= new Itriangle(10, 15);
        Shape shape5= new Ellipse(15,10);
        Shape shape6=new Square(10);


        Shape[] shapes={shape1, shape2, shape3, shape4,shape5,shape6};
        for(Shape cur :shapes)
        {
            System.out.println(cur);
            System.out.println("My area is:"+ cur.getArea());
            System.out.println("My perimeter is:"+cur.getPerimeter());
        }
    }
}
