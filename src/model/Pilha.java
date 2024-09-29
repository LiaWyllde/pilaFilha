package model;

//import model.No;

public class Pilha<T> {
	
	private No<T> topo = null;
	private static int qt = 0;
	
	public void push(T  e) {
		
		No<T> no = new No<T>(e);
		
		if(qt == 0) {
			this.topo = no;
		} else {
			no.setAnterior(topo);
			this.topo = no;
		}
		++qt;
	}
	
	public T pop() throws Exception{
		if(qt == 0) {
			throw new Exception("A lista está vazia");
		}
		No<T> no = this.topo;
		if (qt > 1) {
			this.topo = topo.getAnterior();
		} else if (qt == 1) {
			this.topo = null;
		}
		--qt;
		return no.getElemento();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		No<T> guarda = topo;
		
		if (qt == 0) {
			return "[]";
		}
		builder.append(guarda.getElemento());
		int i = 1;
		
		while (i != qt) {
			builder.append(", ");
			guarda = guarda.getAnterior();
			builder.append(guarda.getElemento());
			++i;
		}
		builder.append("]");
		return builder.toString();
	}
	
}
