package proyecto.unah.bd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.IdSe_Imparten;
import proyecto.unah.bd.model.Se_Imparten;
import proyecto.unah.bd.repository.RepositorySe_Imparten;

@Service
public class ServiceSe_Imparten {

	@Autowired
	RepositorySe_Imparten repositorySe_Imparte;
	
	public void crearSe_Imparte(Se_Imparten se_imparte) {
		this.repositorySe_Imparte.save(se_imparte);		
	}

	@SuppressWarnings("deprecation")
	public Se_Imparten buscarSe_Imparte(IdSe_Imparten se_imparteId) {
	return this.repositorySe_Imparte.getOne(se_imparteId);
	}
	
	public List<Se_Imparten> obtenerTodasSe_Imparte(){
		return this.repositorySe_Imparte.findAll();
	}
}
