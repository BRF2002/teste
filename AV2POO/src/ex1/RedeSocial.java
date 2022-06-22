package ex1;
import java.util.ArrayList;

public class RedeSocial {

	String dataCriacao, nomeUsuario, dataNascimento, senha;
	


	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha,
			ArrayList<Publicacao> publicacoes) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		this.publicacoes = publicacoes;
	}

	public RedeSocial() {
		// TODO Auto-generated constructor stub
	}
	public RedeSocial(String dataCriacao2, String nomeUsuario2, String dataNascimento2, String senha2) {
		// TODO Auto-generated constructor stub
	}
	ArrayList<Publicacao> publicacoes = new ArrayList<> ();
	
	public void inserePublicacao(Publicacao publi) {
	Publicacao objeto = new Publicacao ();
	Publicacao.getContadorPublicacao();
	publicacoes.add(objeto);
	}
	public void imprimePublicacoes() {
	RedeSocial totalpubli = new RedeSocial(); {
	System.out.println("Numero de publicações: "+Publicacao.getContadorPublicacao());

	for(int i = 0;i<publicacoes.size();i++){  
	     System.out.println("Texto da sua publicação: "+publicacoes.get(i).getTextoPublicacao() +"   "+ "Data de sua postagem: "+ publicacoes.get(i).getDataPublicacao() +"   "+ "Link da sua publicação: "+publicacoes.get(i).getLinkMidia());  
	}
	
}
}


	
	}
	