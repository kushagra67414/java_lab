// Name of the package must be same as the directory
Package   myPackage;
public class  MyClass
{
public void  getNames(String s)
    {        
        System.out.println(s);        
    }
}


NOW:

Import   myPackage.MyClass;	//import 'MyClass' class from 'names' myPackage 
public class PrintName 
{
   public static void main(String args[]) 
   {       
      String name = "kushagraBansal";	// Initializing the String variable 
      MyClass  obj = new MyClass();		// Creating an instance of class MyClass 
      obj.getNames(name);
   }
}



Output:
kushagraBansal
