package main;

import data.Component;

public class Client {

  public static void main(String[] args) {
    Component p1 = Component.builder().valueOne("1").valueThree("3").build();
    Component p2 = Component.builder().valueOne("1").valueTwo("2").build();
    Component p3 = Component.builder().valueTwo("2").valueThree("3").build();
  }

}
