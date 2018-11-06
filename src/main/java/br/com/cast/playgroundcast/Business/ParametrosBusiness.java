package br.com.cast.playgroundcast.Business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.playgroundcast.DTO.ParametrosDTO;
import br.com.cast.playgroundcast.DTO.ResultParametrosDTO;
import br.com.cast.playgroundcast.Repository.ParametrosRep;
import br.com.cast.playgroundcast.entidade.Concessao;
import br.com.cast.playgroundcast.entidade.Parametros;

@Service
public class ParametrosBusiness {
	@Autowired
	private ParametrosRep prep;
	
	public void inserir(ResultParametrosDTO dto) {
		for(ParametrosDTO p : dto.getParametros()) {			
			Parametros parametros = new Parametros();
			parametros.setGrupo(dto.getGrupo());
			Concessao c = new Concessao();
			c.setId(Integer.parseInt(dto.getConcessao()));
			parametros.setConcessao(c);
			parametros.setDescricao(p.getDescricao());
			parametros.setSigla(p.getSigla());
			parametros.setValor(p.getValor());
			parametros.setAtivo(p.isAtivo());
			System.out.println(parametros.toString());
			prep.inserir(parametros);
		}
	}
	
	public List<Parametros> buscarTodos(){
		List<Parametros> p = prep.buscarTodos();
		return p;
	}
}
