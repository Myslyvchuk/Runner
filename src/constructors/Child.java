package constructors;

public class Child extends ParentClass  {


  String name;
  int age;
  boolean gender;
  int weight;
  int height;

  public Child(String name) {
    this(name, 0, true, 0);
  }

  static {
    System.out.println("I'm static block");
  }

  {
    System.out.println("I'm block");
  }
  
  public Child(String name, int age, boolean gender, int weight) {
    super();
   this.name = name;
   this.age = age;
   this.gender = gender;
   this.weight = weight;

   }
  

  public Child(String name, int age, boolean gender, int weight, int height) {
   this.name = name;
   this.age = age;
   this.gender = gender;
   this.weight = weight;
   this.height = height;
  }

  public void someMethid() {
    int s;
    
  }
  
  @Override
  protected void finalize() {
    System.out.print("FInallize");
  }
 
}
