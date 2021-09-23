package Class;

public class Overloading {
	
	public void area(int x)
	{
		System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
	}
	public void area(int x,int y)
	{
		System.out.println("the area of the rectangle is "+x*y+" sq units");
	}
	public void area(double x)
	{
	double z = 3.14 * x * x;
    System.out.println("the area of the circle is "+z+" sq units");
	}
}
