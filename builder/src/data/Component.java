package data;

public class Component {

  private String valueOne;
  private String valueTwo;
  private String valueThree;

  public String getValueOne() {
    return valueOne;
  }

  public void setValueOne(String valueOne) {
    this.valueOne = valueOne;
  }

  public String getValueTwo() {
    return valueTwo;
  }

  public void setValueTwo(String valueTwo) {
    this.valueTwo = valueTwo;
  }

  public String getValueThree() {
    return valueThree;
  }

  public void setValueThree(String valueThree) {
    this.valueThree = valueThree;
  }

  public static ComponentBuilder builder() {
    return new ComponentBuilder();
  }

}
