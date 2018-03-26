package com.myslyv4uk.main;

import java.io.IOException;

public class Main {
  
  public static void setSomeValue(String i) {
    System.out.println("String");

  }


  public float setSomeValue(int a, int b) throws ArithmeticException  {
    if(b == 1) {
      throw new ArithmeticException();
    }
   return a/b;
  }


  public static void main(String[] args) throws IOException {
    Main obj = new Main();
    try {
      float result = obj.setSomeValue(1, 1);
    } catch (ArithmeticException e) {
      System.out.println("didi");

    } catch (RuntimeException e) {
    } finally {
      System.out.println("Vsegda");
    }

  }
	
}
