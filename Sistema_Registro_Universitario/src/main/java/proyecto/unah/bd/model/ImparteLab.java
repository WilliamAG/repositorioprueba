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
@Table(name = "imparteLab")
@IdClass(IdImparteLab.class)


public class ImparteLab implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	//Atributos
	@Id
	public String numCuentaDocente;
	@Id
	public int idSeccionLab;
	
	//Relalcion
	@ManyToOne
	@JoinColumn(name = "numCuentaDocente", referencedColumnName = "numCuentaDocente",  insertable = false, updatable = false)
	@JsonBackReference
	public Docente docente;
	
	@ManyToOne//puede tirar error con ManyToMany
	@JoinColumn(name = "idSeccionLab", referencedColumnName = "idSeccionLab", insertable = false, updatable = false)
	@JsonBackReference
	public SeccionLab seccionLab;
	
	//COnstructor vacio
	public ImparteLab() {
		
	}
	
	//Constructor
	public ImparteLab(String numCuentaDocente, int idSeccionLab, Docente docente, SeccionLab seccionLab) {
		super();
		this.numCuentaDocente = numCuentaDocente;
		this.idSeccionLab = idSeccionLab;
		this.docente = docente;
		this.seccionLab = seccionLab;
	}
	
	//Gets $ Sets

	public String getNumCuentaDocente() {
		return numCuentaDocente;
	}

	public void setNumCuentaDocente(String numCuentaDocente) {
		this.numCuentaDocente = numCuentaDocente;
	}

	public int getIdSeccionLab() {
		return idSeccionLab;
	}

	public void setIdSeccionLab(int idSeccionLab) {
		this.idSeccionLab = idSeccionLab;
	}

}
