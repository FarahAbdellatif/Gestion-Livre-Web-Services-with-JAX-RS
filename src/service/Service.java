package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.GestionLivreImp;
import model.Livre;
@Path("service")
public class Service {
	GestionLivreImp gestionLivreImp=new GestionLivreImp();
	@GET
	@Path("livres")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Livre> allLivres(){
		return gestionLivreImp.getAllLivres();
	}
	
	@POST
	@Path("/add")
	@Consumes("application/x-www-form-urlencoded")
   	public void add(@FormParam("id") int id,@FormParam("description") String description ,@FormParam("quantity") int quantity) {
		gestionLivreImp.addLivre(new Livre(id,description,quantity));
	}
	
	@DELETE
	@Path("/delete/{id}")
	public void delete(@PathParam("id") int id) {
		gestionLivreImp.deleteLivreById(id);
	}
}
