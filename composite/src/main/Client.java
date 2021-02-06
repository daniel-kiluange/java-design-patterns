package main;

import component.Component;
import component.Composite;
import component.Leaf;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component leaf0 = new Leaf();
		Component leaf1 = new Leaf();

		Composite composite0 = new Composite();
		Composite composite1 = new Composite();

		composite0.addChild(leaf0);

		composite1.addChild(leaf1);
		composite1.addChild(composite0);
		
		composite0.showChildName(0);

	}

}
