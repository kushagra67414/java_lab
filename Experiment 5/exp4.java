interface B
{
void division(int a);   //methods
void modules(int b);    //methods
}

class A implements B   //inheriting interface class
{
String name;
int div , mod ; //data members
void name(String n)
{
    name=n; }
    
public void division(int a)
{ 
    div=a; }
     
public void modules(int b)
{ 
    mod=b; }
    
void disp()
{
System.out.println("Name :"+name);
System.out.println("Division :"+div);
System.out.println("Modules :"+mod);
}
}

public class exp4
{
public static void main(String args[])
{ 
    A s=new A();    //creating object
s.name("kushagra"); //calling method using object
s.division(5);
s.modules(15);
s.disp();
}
}
