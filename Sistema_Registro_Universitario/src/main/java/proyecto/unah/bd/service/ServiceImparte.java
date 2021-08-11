package proyecto.unah.bd.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.IdImparte;
import proyecto.unah.bd.model.Imparte;
import proyecto.unah.bd.repository.RepositoryImparte;

@Service
public class ServiceImparte {

	@Autowired
	RepositoryImparte repositoryImparte;
	
	public void crearImparte(Imparte imparte) {
		this.repositoryImparte.save(imparte);		
	}
	
	@SuppressWarnings("deprecation")
	public Imparte buscarImparte(IdImparte imparteId) {
	return this.repositoryImparte.getOne(imparteId);
	}
	
	
	public List<Imparte> obtenerTodasImparte(){
		return this.repositoryImparte.findAll();
	}
}
