package proyecto.unah.bd.model;

import java.time.LocalDate;
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
@Table(name = "estudiante")

public class Estudiante {
	
	//Atributos
	@Id
	public String numCuentaEstu;
	public String dni;
	public String nombreEstudiante;
	public LocalDate fechaNac;
	public char sexo;
	private String telefono;
	private String ciudadOrigen; //
	public String correoElectronico;
	private String contrasenia;
	
	
	//Relacion con Matricula
	@OneToMany(mappedBy = "estudiante", fetch = FetchType.EAGER)
	public List<Matricula> matricula;
	
	
	//Relacion Con Carrera
	@ManyToOne
	@JoinColumn(name = "idCarrera")
	@JsonBackReference
	public Carrera carrera;
	
	//Constructor Vacio
	public Estudiante () {
		
	}
	
	//Constructor
	public Estudiante(String numCuentaEstu, String dni, String nombreEstudiante, LocalDate fechaNac, char sexo,
			String telefono, String ciudadOrigen, String correoElectronico, String contrasenia, Carrera carrera) {
		super();
		this.numCuentaEstu = numCuentaEstu;
		this.dni = dni;
		this.nombreEstudiante = nombreEstudiante;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.telefono = telefono;
		this.ciudadOrigen = ciudadOrigen;
		this.correoElectronico = correoElectronico;
		this.contrasenia = contrasenia;
		this.carrera = carrera;
		//this.matricula = matricula; por si se llega a ocupar
	}
	
	
	//Gets & Sets
	public String getNumCuentaEstu() {
		return numCuentaEstu;
	}
	
	public void setNumCuentaEstu(String numCuentaEstu) {
		this.numCuentaEstu = numCuentaEstu;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}
