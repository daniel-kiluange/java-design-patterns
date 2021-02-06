package component;

public interface CompositeComponent extends Component {
	public void addComponent(Component component);

	public Component getChield(Integer index);

}
