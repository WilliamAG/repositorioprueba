package proyecto.unah.bd.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

//simport jdk.vm.ci.meta.Local;

@Entity
@Table(name = "docente")

public class Docente {
	
	//Atributos
	@Id
	public String numCuentaDocente;
	public String  dni;
	public String nombreDocente;
	public LocalDate fechaNac;
	public String sexo; //puede tirar error porque en la base, este atributo es de tipo char
	private String telefono;
	private String ciudadOrigen;
	public String correoElectronico;
	private String contrasenia;
	
	//Relacion con Departamento
	@ManyToOne
	@JoinColumn(name = "idDepto")
	@JsonBackReference
	public Departamento departamento;
	
	//Constructor vacio
	public Docente() {}

	//Constructor 
	public Docente(String numCuentaDocente, String dni, String nombreDocente, LocalDate fechaNac, String sexo,
			String telefono, String ciudadOrigen, String correoelectronico, String contrasenia, Departamento departamento) {
		super();
		this.numCuentaDocente = numCuentaDocente;
		this.dni = dni;
		this.nombreDocente = nombreDocente;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.telefono = telefono;
		this.ciudadOrigen = ciudadOrigen;
		this.correoElectronico = correoelectronico;
		this.contrasenia = contrasenia;
		this.departamento = departamento;
	}

	//Gets & Sets
	

	public String getDni() {
		return dni;
	}

	public String getNumCuentaDocente() {
		return numCuentaDocente;
	}

	public void setNumCuentaDocente(String numCuentaDocente) {
		this.numCuentaDocente = numCuentaDocente;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreDocente() {
		return nombreDocente;
	}

	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
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

	public String getcorreoElectronico() {
		return correoElectronico;
	}

	public void setcorreoElectronico(String correoelectronico) {
		correoElectronico = correoelectronico;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	

}
