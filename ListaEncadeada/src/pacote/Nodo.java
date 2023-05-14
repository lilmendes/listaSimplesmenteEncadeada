package pacote;

public class Nodo {
	private Contato valor;
	private Nodo proximo;

	public Contato getValor() {
		return valor;
	}
	public void setValor(Contato valor) {
		this.valor = valor;
	}
	public Nodo getProximo() {
		return proximo;
	}
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}

}