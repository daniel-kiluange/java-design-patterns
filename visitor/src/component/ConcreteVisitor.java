package component;

public class ConcreteVisitor implements Visitor {

  ConcreteComponent myComponent;

  @Override
  public void visit(Component component) {
    this.myComponent = (ConcreteComponent) component;
    doCalc();
    showNameAndCalcResult();
  }

  private void doCalc() {
    this.myComponent.setValue(this.myComponent.getValue() * 0.27);
  }

  private void showNameAndCalcResult() {
    System.out.printf("Component name: %s, tax: %.3f", this.myComponent.getName(),
        this.myComponent.getValue());
  }

}
