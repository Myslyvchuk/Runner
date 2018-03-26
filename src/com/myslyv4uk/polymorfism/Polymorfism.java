package com.myslyv4uk.polymorfism;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Polymorfism extends ParentClass implements Parent {

  
  public  void a() throws IOException, AWTException {
    ab();
    Polymorfism po = new Polymorfism();
    System.out.println("polym");
  }

}
