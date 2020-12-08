package dao;

import java.util.List;

import model.Livre;

public interface InterfaceGestionLivre {
public Livre getLivreById(int id);
public List<Livre> getAllLivres();
public void addLivre(Livre l);
public void editLivre(Livre l);
public void deleteLivreById(int id);
}
