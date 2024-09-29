package model;

public class No<T> {
	
	private T elemento;
	private No<T> anterior;
	
	public No(T e) {
		this.elemento = e;
	}
	
	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return elemento.toString();
	}
}
