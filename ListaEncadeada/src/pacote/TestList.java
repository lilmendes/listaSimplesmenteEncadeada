package pacote;
import java.util.Scanner;
public class TestList {
	public static void main(String[] args) {
		Scanner opcaoUsuario = new Scanner(System.in);
		Scanner matriculaInformada = new Scanner(System.in);
		Scanner nomeInformado= new Scanner(System.in);
		TestList testaLista = new TestList();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
			String nomeAluno;
		int qtd=0, posicaoAluno=0, matriculaAluno;
		do {
			System.out.print("Usuário escolha a opção"
					+ "\n(1) Adicionar aluno"
					+ "\n(2) Remover aluno"
					+ "\n(3) Listar"
					+ "\n(4) Apagar tudo"
					+ "\n(5) Verificar tamanho"
					+ "\n(6) Verificar se a lista está vazia"
					+ "\n(7) Pesquisar matricula do aluno"
					+ "\n(8) Sair");
			int operacao = opcaoUsuario.nextInt();
			switch(operacao) {
			case 1:
				if(posicaoAluno<15) {
					matriculaAluno = recebeMatriculaAluno(matriculaInformada);
					nomeAluno= recebeNomeAluno(nomeInformado);
					testaLista.adicionarNovoContato(listaEncadeada, testaLista,nomeAluno, matriculaAluno, posicaoAluno);     
					posicaoAluno++;	
				}else{
					System.out.println("Só é possivel adicionar 15 alunos");}
				break;

			case 2:
				if(listaEncadeada.getPrimeiro()==null) {
					System.out.println("Não é possivel remover, pois a lista está vazia.");}
				else{
					testaLista.removerContato(listaEncadeada);
					posicaoAluno--;
				}
				break;

			case 3:
				listaEncadeada.mostraLista(listaEncadeada);
				break;

			case 4:
				testaLista.apagaLista(listaEncadeada);
				posicaoAluno=0;
				break;
			case 5:
				testaLista.mostraTamanhoLista(listaEncadeada);
				break;
			case 6:
				testaLista.verificaListaVazia(listaEncadeada);
				break;
			case 7:
				matriculaAluno = recebeMatriculaAluno(matriculaInformada);
				testaLista.pesquisaAluno(listaEncadeada, matriculaAluno);
				break;

			case 8:
				System.out.println("Você saiu do Menu!");
				qtd=10;
				break;
			default:
				System.out.println("Operação inválida!!!!");
			}

		}while(qtd<5);
		opcaoUsuario.close();
	}


	public static String recebeNomeAluno(Scanner dadoInformado){
		System.out.println("Usuário qual o nome do aluno?");
		String nomeAlunoRecebido= dadoInformado.nextLine();
		return nomeAlunoRecebido;
	}
	public static int recebeMatriculaAluno(Scanner dadoInformado){
		System.out.println("Usuário qual a matricula do aluno?");
		int matriculaRecebida = dadoInformado.nextInt();
		return matriculaRecebida;
	}

	public void adicionarNovoContato(ListaEncadeada listaEncadeada, TestList testaLista, String nomeAluno, int matriculaAluno, int posicaoAluno) {
		Contato novoAluno = new Contato(posicaoAluno,matriculaAluno,nomeAluno);
		listaEncadeada.adicionar(novoAluno);
		System.out.println("Contato adicionado!");;
		listaEncadeada.mostraLista(listaEncadeada);
	}

	public void removerContato (ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
		System.out.println("Contato removido!");
		listaEncadeada.mostraLista(listaEncadeada);

	}
	public void apagaLista(ListaEncadeada listaEncadeada) {
		listaEncadeada.apagarTudo();
		System.out.println("Lista esvaziada!");
	}
	public void verificaListaVazia(ListaEncadeada listaEncadeada) {
		listaEncadeada.verificaListaVazia();

	}
	public void pesquisaAluno(ListaEncadeada listaEncadeada, int matricula) {
		listaEncadeada.pesquisaLista(listaEncadeada, matricula);

	}
	public void mostraTamanhoLista(ListaEncadeada listaEncadeada) {
		listaEncadeada.mostraTamanhoLista(listaEncadeada);

	}

}
//----------------------------------------------------------------------------------------------------------------------------












