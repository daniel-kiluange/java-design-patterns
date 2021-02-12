package component;

public class ConcreteVisitor implements Visitor {

  @Override
  public void visit(Component component) {
    doCalc((ConcreteComponent) component);
    showNameAndCalcResult((ConcreteComponent) component);
  }

  private void doCalc(ConcreteComponent component) {
    component.setValue(component.getValue() * 0.27);

  }

  private void showNameAndCalcResult(ConcreteComponent component) {
    System.out.printf("Component name: %s, tax: %.3f", component.getName(), component.getValue());
  }

}
