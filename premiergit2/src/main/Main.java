package main;

import ressources.FabriqueDeMessage;
import ressources.TexteSingleton1;
import ressources.TexteSingleton2;

public class Main {

	public static void main(String[] args) {
		
		new FabriqueDeMessage().fabriquer(new TexteSingleton1());
		new FabriqueDeMessage().fabriquer(new TexteSingleton2());

	}

}
