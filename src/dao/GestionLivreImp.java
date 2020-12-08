package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livre;

public class GestionLivreImp implements InterfaceGestionLivre{
EntityManager entity;

public GestionLivreImp() {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pers");
	entity=emf.createEntityManager();
	
}
	public Livre getLivreById(int id) {
		// TODO Auto-generated method stub
        return entity.find(Livre.class, id);	}

	public List<Livre> getAllLivres() {
		// TODO Auto-generated method stub
		return entity.createQuery("Select l from Livre l").getResultList();
	}

	public void addLivre(Livre l) {
     entity.getTransaction().begin();
     entity.persist(l);
     entity.getTransaction().commit();
	}

	public void editLivre(Livre l) {
    entity.getTransaction().begin();
    entity.merge(l);
    entity.getTransaction().commit();
    
	}

	public void deleteLivreById(int id) {
		Livre livre=getLivreById(id);
entity.getTransaction().begin();
entity.remove(livre);
entity.getTransaction().commit();
	}

}
