package br.com.cast.playgroundcast.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="parametros", schema="tcc")
public class Parametros {
	@Id
	@SequenceGenerator(name="gerador_id_parametros", sequenceName="tcc.parametros_id_seq",allocationSize=1)
    @GeneratedValue(generator="gerador_id_parametros", strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column(name="grupo")
	private String grupo;
	@Column(name="descricao")
	private String descricao;
	@Column(name="sigla")
	private String sigla;
	@Column(name="ativo")
	private Boolean ativo;
	@Column(name="valor")
	private String valor;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_concessao")
	private Concessao concessao;
	public String toString() {
		return grupo + " " + sigla + concessao.getId();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public Concessao getConcessao() {
		return concessao;
	}
	public void setConcessao(Concessao concessao) {
		this.concessao = concessao;
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
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
		
}
