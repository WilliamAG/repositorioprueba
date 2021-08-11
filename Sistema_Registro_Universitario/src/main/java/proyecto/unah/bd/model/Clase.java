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
@Table (name = "clase")

public class Clase {
	
	//Atributos
	@Id
	public String idClase;
	public String nombreClase;
	public String descripcionClase;
	
	//Relacion Con Matricula
	@ManyToOne
	@JoinColumn(name = "idMatricula")
	@JsonBackReference
	public Matricula matricula;
	
	
	//Relacion con Departamento
	@ManyToOne
	@JoinColumn(name = "idDepto")
	@JsonBackReference
	public Departamento departamento;
	
	
	//Relacion con Secciones
	@OneToMany(mappedBy = "clase", fetch = FetchType.LAZY)
	public List<Seccion> seccion;
	
	//Relacion con Laboratorio
	@OneToMany(mappedBy = "clase", fetch = FetchType.LAZY)
	public List<Laboratorio> laboratorio;
	
	//Constructor Vacio
	public Clase() {
		
	}
	
	//Constructor
	public Clase(String idClase, String nombreClase, String descripcionClase, Matricula matricula, Departamento departamento) {
		super();
		this.idClase = idClase;
		this.nombreClase = nombreClase;
		this.descripcionClase = descripcionClase;
		this.matricula = matricula;
		this.departamento = departamento;
	}

	//Gets & Sets
	public String getIdClase() {
		return idClase;
	}


	public void setIdClase(String idClase) {
		this.idClase = idClase;
	}


	public String getNombreClase() {
		return nombreClase;
	}


	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}


	public String getDescripcionClase() {
		return descripcionClase;
	}


	public void setDescripcionClase(String descripcionClase) {
		this.descripcionClase = descripcionClase;
	}
}
