package org.ambulatorio.ibim.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ambulatorio.ibim.models.Operatore;

@Stateless
public class OperatoreDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Operatore getOperatoreBy(String username, String psw){
		Operatore operatore;
		
		TypedQuery<Operatore> q = em.createQuery("from Operatore u where u.username=? and u.password=?", Operatore.class);
		
		q.setParameter(1, username);
		q.setParameter(2, psw);
		
		try {
			operatore = q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

		return operatore;
		
		
	}
}
