package lab4;




class A
{
private int l,b;
A(int x,int y)
{ l=x; b=y;}
int area()
{return(l*b);}
}
class B extends A
{
int h;
B(int x,int y,int z)
{
super(x,y);
h=z;
}
int volume()
{
return(area()*h);
}
}

public class exp1 {

	public static void main(String args[])
	{
	B a = new B(10,20,15);
	int x = a.area();
	int y = a.volume();
	System.out.println("Area of Room : " + x);
	System.out.println("Volume of Room : " + y);
	}
	
}