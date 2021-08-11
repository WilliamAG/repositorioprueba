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
@Table (name="laboratorio")
public class Laboratorio {
	
	//Atributos
	@Id
	public String idLab;
	public String nombreLab;
	public String descripcion;
	
	//Relacion con Clase
	@ManyToOne
	@JoinColumn(name="idClase")
	@JsonBackReference
	public Clase clase;
	
	//Relacion con Seccion
	@OneToMany(mappedBy="laboratorio",fetch=FetchType.EAGER)
	public List<SeccionLab> seccionLab;
	
	//Constructor Vacio
	public Laboratorio() {
		
	}
	
	//Constructor
	public Laboratorio(String idLab, String nombreLab, String descripcion, Clase clase) {
		super();
		this.idLab = idLab;
		this.nombreLab = nombreLab;
		this.descripcion = descripcion;
		this.clase = clase;
	}
	
	//Gets & Sets
	public String getIdLab() {
		return idLab;
	}
	public void setIdLab(String idLab) {
		this.idLab = idLab;
	}
	public String getNombreLab() {
		return nombreLab;
	}
	public void setNombreLab(String nombreLab) {
		this.nombreLab = nombreLab;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}

