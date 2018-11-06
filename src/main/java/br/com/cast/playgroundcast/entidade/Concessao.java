package br.com.cast.playgroundcast.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="concessao",schema="tcc")
public class Concessao {
	@Id
	@SequenceGenerator(name="gerador_id_concessao", sequenceName="tcc.concessao_id_seq",allocationSize=1)
    @GeneratedValue(generator="gerador_id_concessao", strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column(name="nome")
	private String nome;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
