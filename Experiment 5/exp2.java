interface Printable{  
void print();  

void show();  
}  
class Myclass implements Printable{  
public void print(){
System.out.println("Hello");

}  

public void show(){
System.out.println("Welcome");
}  
  
public static void main(String args[]){  
Myclass obj = new Myclass();  
obj.print();  
obj.show();  
 }  
}  