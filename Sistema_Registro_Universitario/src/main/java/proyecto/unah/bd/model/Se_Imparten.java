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
@Table(name = "se_imparten")
@IdClass(IdImparte.class)

public class Se_Imparten implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	//Atributos
	@Id
	public int idEdificio;
	@Id
	public int idSeccion;
	@Id
	public int numCuentaDocente;
	
	//Relacion con Edificio
	@ManyToOne
	@JoinColumn(name = "idEdificio", referencedColumnName = "idEdificio", insertable = false, updatable = false)
	@JsonBackReference
	private Edificio edificio;
	
	//Relacion con Seccion
	@ManyToOne
	@JoinColumn(name = "idSeccion", referencedColumnName = "idSeccion", 
	insertable = false, updatable = false)
	@JsonBackReference
	private Seccion seccion;
	
	//Constructor vacio
	public Se_Imparten () {
		
	}
	
	//Constructor
	public Se_Imparten(int idEdificio, int idSeccion, Edificio edificio, Seccion seccion) {
		super();
		this.idEdificio = idEdificio;
		this.idSeccion = idSeccion;
		this.edificio = edificio;
		this.seccion = seccion;
	}

	//Gets & Sets
	public int getIdEdificio() {
		return idEdificio;
	}

	public void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}
}
