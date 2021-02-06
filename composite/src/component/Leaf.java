package component;

import java.util.UUID;

public class Leaf implements Component {

	private String name = UUID.randomUUID().toString();

	@Override
	public void showCcomponentName() {
		System.out.println("Component name: " + this.name);
	}

}
