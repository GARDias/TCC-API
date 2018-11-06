package br.com.cast.playgroundcast.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParametrosDTO {
	private Integer id;
	@JsonProperty("descricao")
	private String descricao;
	@JsonProperty("sigla")
	private String sigla;
	@JsonProperty("valor")
	private String valor;
	@JsonProperty("ativo")
	private boolean ativo;
	@JsonProperty("editando")
	private boolean editando;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public boolean isEditando() {
		return editando;
	}
	public void setEditando(boolean editando) {
		this.editando = editando;
	}
}
