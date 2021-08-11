package proyecto.unah.bd.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table (name = "seccionLab")

public class SeccionLab {
	
	//Atributos
	@Id
	public int    idSeccionLab;
	public int    numSeccion;
	public String horaSeccion;
	public String diaSeccion;
	public int numEstudiantes;
	
	//Relacion Con Laboratorio
	@ManyToOne
	@JoinColumn(name = "idLab" )
	@JsonBackReference
	public Laboratorio laboratorio;
	
	//Constructor Vacio
	public SeccionLab() {
		
	}
	
	//Constructor
	public SeccionLab(int idSeccionLab, Laboratorio laboratorio, int numSeccion, String horaSeccion,
			String diaSeccion, int numEstudiantes) {
		super();
		this.idSeccionLab = idSeccionLab;
		this.laboratorio = laboratorio;
		this.numSeccion = numSeccion;
		this.horaSeccion = horaSeccion;
		this.diaSeccion = diaSeccion;
		this.numEstudiantes = numEstudiantes;
	}
	
	//Gets & Sets
	public int getIdSeccionLab() {
		return idSeccionLab;
	}

	public void setIdSeccionLab(int idSeccionLab) {
		this.idSeccionLab = idSeccionLab;
	}

	public int getNumSeccion() {
		return numSeccion;
	}

	public void setNumSeccion(int numSeccion) {
		this.numSeccion = numSeccion;
	}

	public String getHoraSeccion() {
		return horaSeccion;
	}

	public void setHoraSeccion(String horaSeccion) {
		this.horaSeccion = horaSeccion;
	}

	public String getDiaSeccion() {
		return diaSeccion;
	}

	public void setDiaSeccion(String diaSeccion) {
		this.diaSeccion = diaSeccion;
	}

	public int getNumEstudiantes() {
		return numEstudiantes;
	}

	public void setNumEstudiantes(int numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
	}
	
	//Tal vez con los gets de abajo nos proporciona el resto de info
	//En lab
	
	//Resp: Ojalá que si jeje
	
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
}

