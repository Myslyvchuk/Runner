package constructors;

public class ChildClass extends ParentClass {

  int a =0;

  
  static {
    System.out.println("I'm static block");
  }

  {
    System.out.println("I'm block");
     int a;
  }

  public ChildClass(String s) {
    super(s);
    System.out.println("Childclass"  + a);
  }

  public void someMethid() {
    int s;
    
  }

 
}
