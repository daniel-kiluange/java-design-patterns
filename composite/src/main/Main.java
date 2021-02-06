package main;

import component.Component;
import component.Composite;
import component.CompositeComponent;
import component.Leaf;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component leaf0 = new Leaf();
		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		Component leaf3 = new Leaf();

		CompositeComponent compositeComponent = new Composite();
		
		compositeComponent.addComponent(leaf0);
		compositeComponent.addComponent(leaf1);
		compositeComponent.addComponent(leaf2);
		compositeComponent.addComponent(leaf3);
		
		compositeComponent.showCcomponentName();
		
		compositeComponent.getChield(0).showCcomponentName();

	}

}
