package controller;

import model.Pilha;

public class PilhaC {
	
	Pilha pilha = new Pilha();
	
	public void teste() throws Exception {
		
		//Object gato = pilha.pop();
		pilha.push("Quokka");
		pilha.push("Urso");
		pilha.push(1);

		System.out.println(pilha.toString());
		
		Object gatos = pilha.pop();
		System.out.println(gatos.toString());
		
	}
}
