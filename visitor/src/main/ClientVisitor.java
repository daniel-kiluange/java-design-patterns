package main;

import component.ConcreteComponent;
import component.ConcreteVisitor;

public class ClientVisitor {

  public static void main(String[] args) {
    ConcreteComponent cc = new ConcreteComponent();

    cc.setName("test");
    cc.setValue(9.97);

    ConcreteVisitor cv = new ConcreteVisitor();
    cc.accept(cv);
  }

}
