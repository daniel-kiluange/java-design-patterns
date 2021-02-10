package data;

public class ComponentBuilder {

  private String valueOne;
  private String valueTwo;
  private String valueThree;

  public ComponentBuilder valueOne(String valueOne) {
    this.valueOne = valueOne;
    return this;
  }

  public ComponentBuilder valueTwo(String valueTwo) {
    this.valueTwo = valueTwo;
    return this;
  }

  public ComponentBuilder valueThree(String valueThree) {
    this.valueThree = valueThree;
    return this;
  }

  public Component build() {
    Component component = new Component();
    component.setValueOne(this.valueOne);
    component.setValueTwo(this.valueTwo);
    component.setValueThree(this.valueThree);
    return component;
  }
}
