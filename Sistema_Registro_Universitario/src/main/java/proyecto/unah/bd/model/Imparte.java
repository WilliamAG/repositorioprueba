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
@Table(name = "imparte")
@IdClass(IdImparte.class)


public class Imparte implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	//Atributos
	@Id
	public String numCuentaDocente;
	@Id
	public int idSeccion;
	
	//Relalcion
	@ManyToOne
	@JoinColumn(name = "numCuentaDocente", referencedColumnName = "numCuentaDocente",  insertable = false, updatable = false)
	@JsonBackReference
	public Docente docente;
	
	@ManyToOne//puede tirar error con ManyToMany
	@JoinColumn(name = "idSeccion", referencedColumnName = "idSeccion", insertable = false, updatable = false)
	@JsonBackReference
	public Seccion seccion;
	
	//COnstructor vacio
	public Imparte() {
		
	}
	
	//Constructor
	public Imparte(String numCuentaDocente, int idSeccion, Docente docente, Seccion seccion) {
		super();
		this.numCuentaDocente = numCuentaDocente;
		this.idSeccion = idSeccion;
		this.docente = docente;
		this.seccion = seccion;
	}
	
	//Gets $ Sets

	public String getNumCuentaDocente() {
		return numCuentaDocente;
	}

	public void setNumCuentaDocente(String numCuentaDocente) {
		this.numCuentaDocente = numCuentaDocente;
	}

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}

}
