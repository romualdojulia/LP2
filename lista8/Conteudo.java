package conteudos;

public class Conteudo{
	private String assunto;
	private String mensagem;
	
	public Conteudo() {
		this.assunto = "";
		this.mensagem = "";
	}
	
	public Conteudo(String assunto, String mensagem) {
		this.assunto = assunto;
		this.mensagem = mensagem;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Conteudo [assunto=" + assunto + ", mensagem=" + mensagem + "]";
	}
	
	
}