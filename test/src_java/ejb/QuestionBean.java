package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Question;

@Stateless
public class QuestionBean {

	@PersistenceContext
	EntityManager em;
	
	public void salvar(Question question) {
		em.persist(question);
	}
	
	public List<Question> buscarQuestion() {
		return em.createQuery("From Question").getResultList();
	}
}
