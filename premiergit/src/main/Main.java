package main;

import ressources.TexteSingleton;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(TexteSingleton.getInstance().getMessage());

	}

}
