package proyecto.unah.bd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table (name = "seccion")

public class Seccion {
	
	//Atributos
	@Id
	public int    idSeccion;
	public int    numSeccion;
	public String horaSeccion;
	public String diaSeccion;
	public int numEstudiantes;
	
	//Relacion con la Clase
	@ManyToOne
	@JoinColumn(name = "idClase")
	@JsonBackReference
	public Clase clase;
	
	//Constructor Vacio
	public Seccion() {
		
	}
	
	//Constructor
	public Seccion(int idSeccion, Clase clase, int numSeccion, String horaSeccion,
			String diaSeccion, int numEstudiantes) {
		super();
		this.idSeccion = idSeccion;
		this.clase = clase;
		this.numSeccion = numSeccion;
		this.horaSeccion = horaSeccion;
		this.diaSeccion = diaSeccion;
		this.numEstudiantes = numEstudiantes;
	}
	
	//Gets & Sets
	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
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
	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}
}
