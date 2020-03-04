package lab4;



class player
{
String name;
int age;
player(String n,int a)
{ name=n; age=a; }
void show()
{
	
System.out.println("\n");
System.out.println("Player name : "+name);
System.out.println("Age : "+age);
}
}
class criket_player extends player
{
String type;
criket_player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player type : "+type);
}
}
class football_player extends player
{
String type;23

football_player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player type : "+type);
}
}
class hockey_player extends player
{
String type;
hockey_player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player type : "+type);
}
}


public class exp2 {
	public static void main(String args[])
	{
	criket_player x = new criket_player("Ameer","criket",25);
	football_player y=new football_player("arun","foot ball",25);
	hockey_player z =new hockey_player("Ram","hockey",25);
	x.show();
	y.show();
	z.show();
	}

}	
