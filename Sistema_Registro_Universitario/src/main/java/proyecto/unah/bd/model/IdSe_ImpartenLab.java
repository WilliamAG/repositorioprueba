package proyecto.unah.bd.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializaer","handler"})
@Embeddable

public class IdSe_ImpartenLab implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public int idEdificio;
	public int idSeccionLab;
	
	//Constructor vacio
	public IdSe_ImpartenLab () {}
	
	//Constructor
	public IdSe_ImpartenLab(int idEdificio, int idSeccionLab) {
		super();
		this.idEdificio = idEdificio;
		this.idSeccionLab = idSeccionLab;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IdSe_ImpartenLab) {
			IdSe_ImpartenLab tmpid = (IdSe_ImpartenLab)obj;
			if(this.idEdificio == tmpid.getIdEdificio()
				&& this.idSeccionLab == tmpid.getIdSeccionLab()){
				return true;
			}else
				return false;
			
		}else return false;
	}

	
	public int hashCode() {
		return (int) this.idEdificio+this.idSeccionLab;
	}
		
	//Gets & Sets
	public int getIdEdificio() {
		return idEdificio;
	}

	public void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}

	public int getIdSeccionLab() {
		return idSeccionLab;
	}

	public void setIdSeccionLab(int idSeccionLab) {
		this.idSeccionLab = idSeccionLab;
	}
}
