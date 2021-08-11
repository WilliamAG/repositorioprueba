package proyecto.unah.bd.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializaer","handler"})
@Embeddable

public class IdImparteLab implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public String numCuentaDocente;
	public int idSeccionLab;
	
	//Constructor Vacio
	public IdImparteLab() {
		
	}
	
	//Constructor
	public IdImparteLab(String numCuentaDocente, int idSeccionLab) {
		super();
		this.numCuentaDocente = numCuentaDocente;
		this.idSeccionLab = idSeccionLab;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IdImparteLab) {
			IdImparteLab tmpid = (IdImparteLab)obj;
			if(this.numCuentaDocente == tmpid.getNumCuentaDocente()
				&& this.idSeccionLab == tmpid.getIdSeccionLab()){
				return true;
			}else
				return false;
			
		}else return false;
	}
	
	
	public int hashCode() {
		return (int) this.numCuentaDocente.hashCode()+this.idSeccionLab;
	}
	
	/*
	public int hashCode() {
		return (int) this.numDocente.hashCode()+this.idSeccionLab;
	}
	*/



	//Gets & Sets
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
