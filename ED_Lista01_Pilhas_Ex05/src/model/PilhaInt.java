package model;

public class PilhaInt {

	No topo;
	
	public PilhaInt() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public int pop() throws Exception{
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception{
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		
		int valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null) {
				cont ++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
	public int max() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
			int max = Integer.MIN_VALUE;
			No auxiliar = topo;
			while(auxiliar != null) {
				if (auxiliar.dado > max) {
					max = auxiliar.dado;
				}
				auxiliar = auxiliar.proximo;
			}
		return max;
	}
	
	public int min() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
			int min = Integer.MAX_VALUE;
			No auxiliar = topo;
			while(auxiliar != null) {
				if (auxiliar.dado < min) {
					min = auxiliar.dado;
				}
				auxiliar = auxiliar.proximo;
			}
		return min;
	}
}










