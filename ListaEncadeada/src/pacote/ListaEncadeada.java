package pacote;
public class ListaEncadeada {
	private Nodo primeiro;
	private Nodo ultimo;
	private Nodo posicaoAtual;

	public void apagarTudo() {
		primeiro = null;
		ultimo = null;
		posicaoAtual = null;
	}

	public Nodo getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Nodo posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	private  Nodo recuperarPenultimo(Nodo Nodo) {
		if (Nodo.getProximo().equals(ultimo)) {
			return Nodo;
		}
		return recuperarPenultimo(Nodo.getProximo());
	}

	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if(posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo() != null? true: false;
			//tem proximo for diferente de nulo vai dá verdadeiro
			//tem proximo for igual a nulo ele vai dá falso 
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}
	public boolean verificaListaVazia() {
		if (posicaoAtual == null&&primeiro == null) {
			System.out.println("Lista está vazia!");
			return true;
		}else{
			System.out.println("A lista não está vazia!");
			return false;	
		}

	}
	public void adicionar(Contato valor) {
		Nodo Nodo = new Nodo();
		Nodo.setValor(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = Nodo;
			ultimo = Nodo;
		} else {
			ultimo.setProximo(Nodo);
			ultimo = Nodo;
		}

	}

	public void remover() {
		if(primeiro.getProximo()!= null) {
			Nodo Nodo = this.recuperarPenultimo(primeiro);
			ultimo = Nodo;
			Nodo.setProximo(null);
		}else {
			primeiro = ultimo = null;
		}
	}

	public void mostraLista(ListaEncadeada listaEncadeada) {
		System.out.println("Sua lista está assim:");
		while (listaEncadeada.temProximo()) {
			System.out.println("Aluno: " +listaEncadeada.getPosicaoAtual().getValor().getNome()+" Matricula: " +listaEncadeada.getPosicaoAtual().getValor().getMatricula()+" Posição na lista: " +listaEncadeada.getPosicaoAtual().getValor().getPosicao());

		}
	}
	public void pesquisaLista(ListaEncadeada listaEncadeada, int matriculaAluno ) {
		boolean validador=false;
		while (listaEncadeada.temProximo()) {
			if(matriculaAluno==listaEncadeada.getPosicaoAtual().getValor().getMatricula()) {
				validador=true;
				System.out.println("Aluno " +listaEncadeada.getPosicaoAtual().getValor().getNome()+" matricula " +listaEncadeada.getPosicaoAtual().getValor().getMatricula()+" posição do Aluno na lista: " +listaEncadeada.getPosicaoAtual().getValor().getPosicao());	
				break;
			}
		}
		if(validador==false) {
			System.out.println("Matrícula do aluno não encontrada no sistema!");	
		}
	}
	public void mostraTamanhoLista(ListaEncadeada listaEncadeada) {
		int tamanhoLista=0;
		while (listaEncadeada.temProximo()) {
			tamanhoLista++;

		}
		System.out.println("Sua lista possui " + tamanhoLista+" elementos");
	}

	public Nodo getPrimeiro() {
		return primeiro;
	}

	

	
	
}
//--------------------------------------------