package proyecto.unah.bd.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializaer","handler"})
@Entity
@Table(name = "se_impartenLab")
@IdClass(IdSe_ImpartenLab.class)

public class Se_ImpartenLab implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	//Atributos
	@Id
	public int idEdificio;
	@Id
	public int idSeccionLab;
	
	//Relacion con Edificio
	@ManyToOne
	@JoinColumn(name = "idEdificio", referencedColumnName = "idEdificio", insertable = false, updatable = false)
	@JsonBackReference
	private Edificio edificio;
	
	//Relacion con Seccion
	@ManyToOne
	@JoinColumn(name = "idSeccionLab", referencedColumnName = "idSeccionLab", 
	insertable = false, updatable = false)
	@JsonBackReference
	private SeccionLab seccionLab;
	
	//Constructor vacio
	public Se_ImpartenLab () {
		
	}
	
	//Constructor
	public Se_ImpartenLab(int idEdificio, int idSeccionLab, Edificio edificio, SeccionLab seccionLab) {
		super();
		this.idEdificio = idEdificio;
		this.idSeccionLab = idSeccionLab;
		this.edificio = edificio;
		this.seccionLab = seccionLab;
	}

	//Gets & Sets
	public int getIdEdificio() {
		return idEdificio;
	}

	public void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}

	public int getIdSeccionLab() {
		return idSeccionLab;
	}

	public void setIdSeccionLab(int idSeccionLab) {
		this.idSeccionLab = idSeccionLab;
	}
}
