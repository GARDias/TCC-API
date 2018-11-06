package br.com.cast.playgroundcast.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cast.playgroundcast.entidade.Parametros;

@Repository
public class ParametrosRep {
	
	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void inserir(Parametros p) {
		em.persist(p);
	}
	
	public List<Parametros> buscarTodos(){
		return em.createQuery("FROM " + Parametros.class.getName()).getResultList();
	}
}
