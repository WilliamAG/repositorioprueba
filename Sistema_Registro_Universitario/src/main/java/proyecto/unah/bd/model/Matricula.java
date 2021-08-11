package proyecto.unah.bd.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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
@Table (name = "matricula")

public class Matricula {
	
	//Atributos
	@Id
	public int idMatricula;
	public ZonedDateTime fechaMatricula;
	public String periodo;
	public String anio;
	
	//Relacion con Estudiante
	@ManyToOne
	@JoinColumn(name = "numCuentaEstu")
	@JsonBackReference
	public Estudiante estudiante;	
	
	//Relacion con Clase
	@OneToMany(mappedBy = "matricula", fetch = FetchType.EAGER)
	public List<Clase> clase;
	
	
	//Constructor vacio
	public Matricula() {
		
	}
	
	//Constructor
	public Matricula(int idMatricula, ZonedDateTime fechaMatricula, String periodo, String anio,
			Estudiante estudiante) {
		super();
		this.idMatricula = idMatricula;
		this.fechaMatricula = fechaMatricula;
		this.periodo = periodo;
		this.anio = anio;
		this.estudiante = estudiante;
	}

	//Gets & Sets
	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public ZonedDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(ZonedDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
		
}
