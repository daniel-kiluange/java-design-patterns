package data;

public class Component {

  private String valueOne;
  private String valueTwo;
  private String valueThree;

  public String getValueOne() {
    return valueOne;
  }

  protected void setValueOne(String valueOne) {
    this.valueOne = valueOne;
  }

  public String getValueTwo() {
    return valueTwo;
  }

  protected void setValueTwo(String valueTwo) {
    this.valueTwo = valueTwo;
  }

  public String getValueThree() {
    return valueThree;
  }

  protected void setValueThree(String valueThree) {
    this.valueThree = valueThree;
  }

  public static ComponentBuilder builder() {
    return new ComponentBuilder();
  }

}
