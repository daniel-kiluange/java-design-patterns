package component;

public class Composite extends Component {

	@Override
	public void showComponentName() {
		System.out.println("Composite name: " + this.name);
	}

	@Override
	public void addChild(Component component) {
		super.addChild(component);
	}

	@Override
	public void showChildName(int index) {
		super.showChildName(index);
	}

	public void showAllChildrenNames() {
		System.out.println("Children names: ");
		children.forEach(child -> {
			child.showComponentName();
			if (!child.children.isEmpty()) {
				((Composite) child).showAllChildrenNames();
			}
		});
	}

}
