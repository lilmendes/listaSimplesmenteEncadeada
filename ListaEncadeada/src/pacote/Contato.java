package pacote;
public class Contato {
	private Integer posicao, matricula;
	private String nome;

	public Contato(Integer posicao,Integer matricula, String nome) {
		super();
		this.posicao = posicao;
		this.matricula = matricula;
		this.nome = nome;

	}

	public Integer getMatricula() {
		return matricula;
	}



	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPosicao() {
		return posicao;
	}


}