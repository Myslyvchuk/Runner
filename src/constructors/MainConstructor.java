package constructors;

public class MainConstructor {
  
  
  public static void main(String[] args) {
    
    ObjectStore objectStore = new ObjectStore();

    objectStore.addToList(args[0], Integer.valueOf(args[1]));
    
    
   String s1 = "a";
   
   String s2 = "a";
   
   String s3 = new String("someString");
   
   String s4 = new String("someString");
   
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s3==s4);
    System.out.println(s1.equals(s2));
    System.out.println(s3.equals(s4));
    System.out.println(s1.equals(s4));
    
    
    for(int i=0; i<100;i++) {
      String r ="4";
      String s5 = new String("someString");
      System.out.println(r.hashCode());
      System.out.println(s5.hashCode());
    }
   

  }

}
