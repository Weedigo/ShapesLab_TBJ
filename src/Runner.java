public class Runner
{
    public static void main(String[] args)
    {
        Shape shape1=new Rectangle(5,10);
        Shape shape2= new Etriangle(10);
        Shape shape3= new Circles(10);
        System.out.println(shape1);
        System.out.println("My perimeter is:" + shape1.getPerimeter());
        System.out.println("My area is:" + shape1.getArea());

        Shape[] shapes={shape1, shape2, shape3};
        for(Shape cur :shapes)
        {
            System.out.println(cur);
            System.out.println("My area is:"+ cur.getArea());
            System.out.println("My perimeter is:"+cur.getPerimeter());
        }
    }
}
