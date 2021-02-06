package component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Composite implements CompositeComponent {

	private String name = UUID.randomUUID().toString();

	private List<Component> components = new ArrayList<Component>();

	@Override
	public void showCcomponentName() {
		System.out.println("Component name: " + this.name);

	}

	@Override
	public void addComponent(Component component) {
		this.components.add(component);

	}

	@Override
	public Component getChield(Integer index) {
		return components.get(index);
	}

}
