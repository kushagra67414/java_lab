interface test
{
int square();    //method
}

class arithmetic implements test      //test clas s interface
{
int b;  //data member

arithmetic(int x)		//constructor
{
b = x;		//assigning value
}

public int square()
{
return (b*b);
}

}
class ToTestInt
{
public int ans(int x)
{
arithmetic a=new arithmetic(x); 	//call constructor
return a.square();	//calling method of class arithmetic
}
}
public class exp1
{
public static void main(String []args)
{
ToTestInt  x =  new  ToTestInt();




System.out.println("\nThe square of 64 is " + x.ans(64));
}
}
