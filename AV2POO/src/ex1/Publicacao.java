package ex1;

public class Publicacao{

	public static double contadorPublicacao;
	
	
	String textoPublicacao, linkMidia, dataPublicacao;


	public Publicacao(String textoPublicacao, String linkMidia, String dataPublicacao) {
		super();
		this.textoPublicacao = textoPublicacao;
		this.linkMidia = linkMidia;
		this.dataPublicacao = dataPublicacao;
	}


	public Publicacao() {
		// TODO Auto-generated constructor stub
	}


	public static double getContadorPublicacao() {
		return contadorPublicacao;
	}


	public static void setContadorPublicacao(double contadorPublicacao) {
		Publicacao.contadorPublicacao = contadorPublicacao;
	}


	public String getTextoPublicacao() {
		return textoPublicacao;
	}


	public void setTextoPublicacao(String textoPublicacao) {
		this.textoPublicacao = textoPublicacao;
	}


	public String getLinkMidia() {
		return linkMidia;
	}


	public void setLinkMidia(String linkMidia) {
		this.linkMidia = linkMidia;
	}


	public String getDataPublicacao() {
		return dataPublicacao;
	}


	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	
	
	
	
}