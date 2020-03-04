	interface area
{
static final float pi=3.142f; 		//fixed the pi value throughout the code
float compute(float x,float y);		//method
}


class rectangle implements area	//inheriting interface class
{
public float compute(float x,float y)		//defining method
{return(x*y);}
}


class circle implements area		//inheriting interface class
{
public float compute(float x,float y)		//defining method

{return(pi*x*x);}
}
public class exp3
{
public static void main(String args[])
{
    float a,b;		//data  members
rectangle rect=new rectangle();	//creating object of class rectangle
circle cr=new circle();			//creating object of class circle

a = rect.compute(10,20);	//method calling from class  rectangle and assigning  result into a
System.out.println("Area of the rectangle= "+ a );

b = cr.compute(10,0);		//method calling from class circle and assigning into b
System.out.println("Area of the circle = "+ b );	//displaying output

}
}
