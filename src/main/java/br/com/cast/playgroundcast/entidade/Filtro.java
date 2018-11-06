package br.com.cast.playgroundcast.entidade;

public class Filtro {
	
	private Concessao concessao;
	private String grupo;
	private Parametros parametros;
	public Concessao getConcessao() {
		return concessao;
	}
	public void setConcessao(Concessao concessao) {
		this.concessao = concessao;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public Parametros getParametros() {
		return parametros;
	}
	public void setParametros(Parametros parametros) {
		this.parametros = parametros;
	}
}
