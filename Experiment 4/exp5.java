 class Employee {
	
	
	String name;
	String empid;
	double sal;      // data members
	
	public Employee()    // default constructors
	{}
	public Employee(String n, String e, double s)    // parameterized constructor
	{
		name=n;
		empid=e;
		sal=s;
	}
	
	
	String getName()    // functions to get name, empid and salary
	{
		return name;
	}
	
	String getEMP()
	{
		return empid;
	}
	
	
	double getSalary()
	{
		return sal;
	}
	
	
	void increaseSalary(double per)    // increase the salary based on a percentage
	{
		sal+= (double)(sal*per)/100.0;
	}
	
}


 class Manager extends Employee {

	
	String department;  // data member
	
	public Manager()   // default constructor
	{}
	
	public Manager(String n, String e, double s, String d)  // parameterized constructor
	{
		super(n,e,s);
		department=d;
	}
	
	
	void display()    // printing the details
	{
		
		System.out.println("Your salary is: " + getSalary());
		increaseSalary(12.5);    // increase the salary of manager by 12.5 percent
		
		System.out.println("Your name is: " + getName());
		System.out.println("Your employee ID is: " + getEMP());
		System.out.println("Your increase salary is: " + getSalary());
		System.out.println("Your department is: " + department);
	}
	
}
public class Main {

	public static void main(String[] args) {
		
		Manager obj = new Manager("kushagra","R171218116",12000.0,"HEAD");  // object creation
		
		obj.display();   // function call

	}

}

