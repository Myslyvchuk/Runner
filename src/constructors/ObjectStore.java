package constructors;

import java.util.ArrayList;
import java.util.List;

public class ObjectStore {
  
  private List<Person> objects = new ArrayList<>();

  public void addToList(String string, int age) {
    Person p = new Person(string, age);
    objects.add(p);
    System.out.println(objects);

  }

}
