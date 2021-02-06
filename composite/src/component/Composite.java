package component;

public class Composite extends Component {

	@Override
	public void showCcomponentName() {
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

}
