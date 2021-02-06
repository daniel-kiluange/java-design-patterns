package component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Component {

	protected String name;

	public Component() {
		this.name = UUID.randomUUID().toString();
	}

	protected List<Component> children = new ArrayList<Component>();

	public abstract void showComponentName();

	protected void addChild(Component component) {
		this.children.add(component);
	}

	protected void showChildName(int index) {
		System.out.println(this.children.get(index).name);
	}
}
