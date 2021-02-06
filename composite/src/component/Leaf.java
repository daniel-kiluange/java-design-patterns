package component;

public class Leaf extends Component {

	@Override
	public void showCcomponentName() {
		System.out.println("Leaf name: " + this.name);
	}

}
