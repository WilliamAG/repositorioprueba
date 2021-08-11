package proyecto.unah.bd.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "facultad")

public class Facultad {
	
	//Atributos
	@Id
	public int idFacultad;
	public String nombreFacultad;
	public int numCarreras;
	
	//Relacion con carrera
	@OneToMany(mappedBy="facultad",fetch=FetchType.LAZY)
	public List<Carrera> carrera;
	
	//Maestria
	@OneToMany(mappedBy="facultad",fetch=FetchType.LAZY)
	public List<Maestria> maestria;
	
	//Constructor Vacio
	public Facultad() {
		
	}
	
	//Constructor
	public Facultad(int idFacultad, String nombreFacultad, int numCarreras) {
		super();
		this.idFacultad = idFacultad;
		this.nombreFacultad = nombreFacultad;
		this.numCarreras = numCarreras;
	}
	
	//Gets & Sets
	public int getIdFacultad() {
		return idFacultad;
	}
	public void setIdFacultad(int idFacultad) {
		this.idFacultad = idFacultad;
	}
	public String getNombreFacultad() {
		return nombreFacultad;
	}
	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}
	public int getNumCarreras() {
		return numCarreras;
	}
	public void setNumCarreras(int numCarreras) {
		this.numCarreras = numCarreras;
	}
	
}
