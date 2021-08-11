package proyecto.unah.bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import proyecto.unah.bd.model.IdImparteLab;
import proyecto.unah.bd.model.ImparteLab;
import proyecto.unah.bd.repository.RepositoryImparteLab;

public class ServiceImparteLab {
	@Autowired
	RepositoryImparteLab repositoryImparteLab;
	
	public void crearImparteLab(ImparteLab imparte) {
		this.repositoryImparteLab.save(imparte);
	}
	@SuppressWarnings("deprecation")
	public ImparteLab buscarImparteLab(IdImparteLab impartelabId) {
		return this.repositoryImparteLab.getOne(impartelabId);
	}
	public List<ImparteLab> obtenerTodasImparteLab(){
		return this.repositoryImparteLab.findAll();
	}
	
}
