package Trabalho;

import br.univille.estd.stacks.EmptyStackException;
import br.univille.estd.stacks.Stack;
import br.univille.estd.stacks.node.Node;


public class Pilha<E> implements Stack<E>{
	
	private int size;
	private E S[];
	protected Node<E> top;
	protected int next;
	
	public Pilha() {
		size = -1;
		top = null;
	}
	
	@Override
	public int size() {
		if(this.isEmpty()) {
			return 0;
		}
		return this.size + 1;
	}
	@Override
	public boolean isEmpty() {
		if(this.size == -1) {
			return true;
		};
		return false;
	}
	@Override
	public E top() throws EmptyStackException {
		if(this.isEmpty()) {
			EmptyStackException error;
		}
		return this.S[next];
	}
	
	@Override
	public void push(E element) {
		if(this.top.equals(size-1)) {
			this.S[++this.size] = element;
		}
		
	}
	@Override
	public E pop() throws EmptyStackException {
		if(this.isEmpty()) {
			EmptyStackException error;
		}
		return this.S[this.size--];
	}
	
	
}
