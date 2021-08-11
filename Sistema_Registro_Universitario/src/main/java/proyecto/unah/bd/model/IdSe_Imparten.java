package proyecto.unah.bd.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializaer","handler"})
@Embeddable

public class IdSe_Imparten implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public int idEdificio;
	public int idSeccion;
	
	//Constructor vacio
	public IdSe_Imparten () {}
	
	//Constructor
	public IdSe_Imparten(int idEdificio, int idSeccion) {
		super();
		this.idEdificio = idEdificio;
		this.idSeccion = idSeccion;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IdSe_Imparten) {
			IdSe_Imparten tmpid = (IdSe_Imparten)obj;
			if(this.idEdificio == tmpid.getIdEdificio()
				&& this.idSeccion == tmpid.getIdSeccion()){
				return true;
			}else
				return false;
			
		}else return false;
	}

	//Puede tirar error
	public int hashCode() {
		return (int) this.idEdificio + this.idSeccion;
	}
	
	//Gets & Sets
	public int getIdEdificio() {
		return idEdificio;
	}

	public void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}
}
