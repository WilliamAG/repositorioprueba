package proyecto.unah.bd.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table (name = "carrera")

public class Carrera {
	
	//Atributos
	@Id
	public int idCarrera;
	public String nombreCarrera;
	public String descripcionCarrera;
	public int    numAsignaturas;
	public String grado;
	public String duracionCarrera;
	
	//Relacion con Facultad
	@ManyToOne
	@JoinColumn(name = "idFacultad")
	@JsonBackReference
	public Facultad facultad;
	
	//Relacion con Departamento
	@OneToMany(mappedBy = "carrera",fetch=FetchType.LAZY)
	public List<Departamento> departamento;
		
	//Relacion con estudiante
	@OneToMany(mappedBy = "carrera", fetch = FetchType.LAZY)
	public List<Estudiante> estudiante;
	
	//Constructor vacio
	public Carrera() {
		
	}
	
	//Constructor
	public Carrera(int idCarrera, String nombreCarrera, String descripcionCarrera, int numAsignaturas,
			String grado,String duracionCarrera, Facultad facultad) {
		super();
		this.idCarrera = idCarrera;
		this.nombreCarrera = nombreCarrera;
		this.descripcionCarrera = descripcionCarrera;
		this.numAsignaturas = numAsignaturas;
		this.grado=grado;
		this.duracionCarrera = duracionCarrera;
		this.facultad = facultad;
	}
	
	//Gets & Sets
	public int getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public String getDescripcionCarrera() {
		return descripcionCarrera;
	}
	public void setDescripcionCarrera(String descripcionCarrera) {
		this.descripcionCarrera = descripcionCarrera;
	}
	public int getNumAsignaturas() {
		return numAsignaturas;
	}
	public void setNumAsignaturas(int numAsignaturas) {
		this.numAsignaturas = numAsignaturas;
	}
	public String getDuracionCarrera() {
		return duracionCarrera;
	}
	public void setDuracionCarrera(String duracionCarrera) {
		this.duracionCarrera = duracionCarrera;
	}
	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
}