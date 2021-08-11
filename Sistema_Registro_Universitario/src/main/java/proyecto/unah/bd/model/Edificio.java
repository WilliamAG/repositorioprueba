package proyecto.unah.bd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="edificio")

public class Edificio {
	
	//Atributos
	@Id
	public int idEdificio;
	public int     aula;
	public int     aulaLab;
	public String estado;
	
	//Falta relacion con se imparten secciones
	
	//Constructor vacio
	public Edificio() {
		
	}
	
	//Constructor
	public Edificio(int idEdificio, int aula, int aulaLab, String estado) {
		super();
		this.idEdificio = idEdificio;
		this.aula = aula;
		this.aulaLab = aulaLab;
		this.estado = estado;

	}
	
	//Gets & Sets
	public int getIdEdificio() {
		return idEdificio;
	}
	public void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}
	public int getAula() {
		return aula;
	}
	public void setAula(int aula) {
		this.aula = aula;
	}
	public int getAulaLab() {
		return aulaLab;
	}
	public void setAulaLab(int aulaLab) {
		this.aulaLab = aulaLab;
	}
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
