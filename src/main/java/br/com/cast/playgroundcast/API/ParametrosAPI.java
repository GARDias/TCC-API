package br.com.cast.playgroundcast.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.playgroundcast.Business.ParametrosBusiness;
import br.com.cast.playgroundcast.DTO.ResultParametrosDTO;
import br.com.cast.playgroundcast.entidade.Parametros;

@RestController
@RequestMapping(path="/Parametros")
public class ParametrosAPI {
	
	@Autowired
	private ParametrosBusiness pbus;
	
	public ParametrosAPI() {
		pbus = new ParametrosBusiness();
	}
	
	@PostMapping
	public void inserir(@RequestBody ResultParametrosDTO dto) {
		pbus.inserir(dto);
	}
	
	@GetMapping
	public List<Parametros> buscarTodos(){
		return pbus.buscarTodos();
	}
}
