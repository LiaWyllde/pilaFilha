package main;

import controller.PilhaC;

public class Main {

	public static void main(String[] args) {
		PilhaC teste = new PilhaC();
		try {
			teste.teste();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
