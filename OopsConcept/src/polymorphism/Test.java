package polymorphism;

class BaseTest   
{  
  void print()  
  {  
    System.out.println("you are in the base class");  
  }  
}  
public class Test extends BaseTest   
{  
  void print()   
  {  
    System.out.println("you are in the sub class");  
  }  
  public static void main (String args[])  
  {  
    BaseTest b = new Test();  
    b.print();  
  }  
}  
