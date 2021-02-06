package component;

public class Leaf extends Component {

	@Override
	public void showComponentName() {
		System.out.println("Leaf name: " + this.name);
	}

}
