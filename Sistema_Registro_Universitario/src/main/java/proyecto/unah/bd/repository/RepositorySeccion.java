package proyecto.unah.bd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Seccion;

public interface RepositorySeccion extends JpaRepository <Seccion, String>{
	
	public Optional<Seccion> findById(String Id);
	
	//public Estudiante findById(String Id); deberia ser de esa forma si la Id fuese de tipo int
	
}
