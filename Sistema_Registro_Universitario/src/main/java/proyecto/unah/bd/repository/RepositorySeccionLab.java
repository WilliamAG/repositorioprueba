package proyecto.unah.bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.SeccionLab;

public interface RepositorySeccionLab extends JpaRepository <SeccionLab, Integer>{
	public SeccionLab findById(int id);
}
