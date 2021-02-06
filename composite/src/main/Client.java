package main;

import component.Component;
import component.Composite;
import component.Leaf;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component leaf0 = new Leaf();
		Component leaf1 = new Leaf();

		Component composite0 = new Composite();
		Component composite1 = new Composite();

		((Composite) composite0).addChild(leaf0);

		((Composite) composite1).addChild(leaf1);
		((Composite) composite1).addChild(composite0);

		((Composite) composite0).showComponentName();
		((Composite) composite0).showAllChildrenNames();

		System.out.println("\n");

		((Composite) composite1).showComponentName();
		((Composite) composite1).showAllChildrenNames();

	}

}
