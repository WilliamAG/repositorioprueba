package proyecto.unah.bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.IdSe_ImpartenLab;
import proyecto.unah.bd.model.Se_ImpartenLab;
import proyecto.unah.bd.repository.RepositorySe_ImpartenLab;

@Service
public class ServiceSe_ImparteLab {
	@Autowired
	RepositorySe_ImpartenLab repositorySe_ImpartenLab;
	
	public void crearSe_ImpartenLab (Se_ImpartenLab se_impartenlab) {
		this.repositorySe_ImpartenLab.save(se_impartenlab);
	}
	
	@SuppressWarnings("deprecation")
	public Se_ImpartenLab buscarSe_ImpartenLab(IdSe_ImpartenLab se_impartenlabId) {
		return this.repositorySe_ImpartenLab.getOne(se_impartenlabId);
	}
	
	public List<Se_ImpartenLab> obtenerTodasSe_ImpartenLab(){
		return this.repositorySe_ImpartenLab.findAll();
	}
}
