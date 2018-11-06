package br.com.cast.playgroundcast.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.cast.playgroundcast.entidade.Parametros;

public class ResultParametrosDTO {
	@JsonProperty("concessao")
	private String concessao;
	@JsonProperty("grupo")
	private String grupo;
	@JsonProperty("parametros")
	private List<ParametrosDTO> parametros;
	public String getConcessao() {
		return concessao;
	}
	public void setConcessao(String concessao) {
		this.concessao = concessao;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public List<ParametrosDTO> getParametros() {
		return parametros;
	}
	public void setParametros(List<ParametrosDTO> parametros) {
		this.parametros = parametros;
	}
	
	
}
