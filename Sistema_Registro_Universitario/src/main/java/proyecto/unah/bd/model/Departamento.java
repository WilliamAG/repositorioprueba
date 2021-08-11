package proyecto.unah.bd.model;

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
@Table (name = "departamento")

public class Departamento {
	
	//Atributos
	@Id
	public int idDepto;
    public String nombreDepto;
 		
	//Relacion con carrera
    @ManyToOne
	@JoinColumn(name = "idCarrera")
	@JsonBackReference
	public Carrera carrera;
    
    
    //Relacion con Clase
    @OneToMany(mappedBy = "departamento", fetch = FetchType.EAGER)
    public List <Clase> clase;
    //si es private en lugar de public, no nos muestra esa relacion en el json
    //Relacion con Docente
    @OneToMany(mappedBy = "departamento", fetch = FetchType.LAZY)
    public List <Docente> docente;
     
	//Constructor vacio
	public Departamento() {
		
	}
	
	//Constructor
	public Departamento(int idDepto, String  nombreDepto, Carrera carrera) {
		super();
		this.idDepto = idDepto;
		this.nombreDepto = nombreDepto;
		this.carrera = carrera;
	}
	
	//Gets & Sets
	public int getIdDepto() {
		return idDepto;
	}
	public void setidDepto(int idDepto) {
		this.idDepto = idDepto;
	}
	public String getnombreDepto() {
		return nombreDepto;
	}
	public void setnombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}
}

