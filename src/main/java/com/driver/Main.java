package com.driver;

public class Main {
    public static void main(String[] args) {
      RWOnly obj = new RWOnly();

      //obj.name = "govind";
      //java: name has private access in com.driver.RWOnly
      obj.setName("govind");
      System.out.println(obj.getName());


    }
}