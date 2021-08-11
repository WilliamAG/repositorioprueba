package proyecto.unah.bd.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.datatype.jsr310.deser.key.ZonedDateTimeKeyDeserializer;

import proyecto.unah.bd.model.Carrera;
import proyecto.unah.bd.model.Clase;
import proyecto.unah.bd.model.Departamento;
import proyecto.unah.bd.model.Docente;
import proyecto.unah.bd.model.Edificio;
import proyecto.unah.bd.model.Estudiante;
import proyecto.unah.bd.model.Facultad;
import proyecto.unah.bd.model.IdImparte;
import proyecto.unah.bd.model.IdSe_Imparten;
import proyecto.unah.bd.model.Imparte;
import proyecto.unah.bd.model.Laboratorio;
import proyecto.unah.bd.model.Maestria;
import proyecto.unah.bd.model.Matricula;
import proyecto.unah.bd.model.Se_Imparten;
import proyecto.unah.bd.model.Seccion;
import proyecto.unah.bd.model.SeccionLab;
import proyecto.unah.bd.service.ServiceCarrera;
import proyecto.unah.bd.service.ServiceClase;
import proyecto.unah.bd.service.ServiceDepartamento;
import proyecto.unah.bd.service.ServiceDocente;
import proyecto.unah.bd.service.ServiceEdificio;
import proyecto.unah.bd.service.ServiceEstudiante;
import proyecto.unah.bd.service.ServiceFacultad;
import proyecto.unah.bd.service.ServiceImparte;
//import proyecto.unah.bd.service.ServiceImparteLab;
import proyecto.unah.bd.service.ServiceLaboratorio;
import proyecto.unah.bd.service.ServiceMaestria;
import proyecto.unah.bd.service.ServiceMatricula;
//import proyecto.unah.bd.service.ServiceSe_ImparteLab;
import proyecto.unah.bd.service.ServiceSe_Imparten;
import proyecto.unah.bd.service.ServiceSeccion;
//import proyecto.unah.bd.service.ServiceSeccionLab;
import proyecto.unah.bd.service.ServiceSeccionLab;

/**
 * 
 * @author: Varios
 *
 *@Controller
 */

@Controller

public class Controlador {
	

		
	@Autowired
	ServiceCarrera servicecarrera;
	
	@Autowired
	ServiceClase serviceclase;
	
	@Autowired
	ServiceDepartamento servicedepartamento;
	
	@Autowired
	ServiceDocente servicedocente;
	
	@Autowired
	ServiceEdificio serviceedificio;
	
	@Autowired
	ServiceEstudiante serviceestudiante;
	
	@Autowired
	ServiceFacultad servicefacultad;
	
	@Autowired
	ServiceImparte serviceimparte;
	
	//@Autowired
	//ServiceImparteLab serviceimpartelab;
	
	@Autowired
	ServiceLaboratorio servicelaboratorio;
	
	@Autowired
	ServiceMaestria servicemaestria;
	
	@Autowired
	ServiceMatricula servicematricula;
	/*
	@Autowired
	ServiceSe_ImparteLab servicese_impartelab;
	*/
	@Autowired
	ServiceSe_Imparten serviceSe_imparten;
	
	@Autowired
	ServiceSeccion serviceseccion;
	
	@Autowired
	ServiceSeccionLab serviceseccionlab;
	
	
	//-------------------------------Paginas Iniciales-------------------------------
	
	@GetMapping("/")
	public String paginaPrincipal() {
		return "PaginaPrincipal";
	}
	
	@GetMapping("/desarrolladores")
	public String paginaDesarrolladores() {
		return "equipo";
	}
	
	@GetMapping("/maestrias")
	public String paginaMaestrias() {
		return "maestrias";
	}
	
	@GetMapping("/facultades")
	public String paginaFacultades() {
		return "facultades";
	}
	
	//-------------------------Estudiante-----------------------
	@GetMapping("/estudiante/RegistrarEstudiante")
	public String estudianteRegistro () {
		return "EstudianteRegistro";
	}
	
	@GetMapping("/estudiante/LoginEstudiante")
	public String loginEstudiante () {
		return "estudianteLogin";
	}
	
	@GetMapping("/estudiante/infoEstudianteMatricula")
	public String EstudianteMatricula () {
		return "matriculaEstudiante";
	}
	
	@GetMapping("/estudiante/infoEstudianteHistorial")
	public String EstudianteHistorial () {
		return "historialEstudiante";
	}
	
	//--------------------------Docente-----------------------
	@GetMapping("/docente/RegistrarDocente")
	public String docenteRegistro() {
		return "";
	}
	
	@GetMapping("/docente/LoginDocente")
	public String loginDocente () {
		return "";
	}
	
	@GetMapping("/docente/informacionDocente")
	public String infoDocente () {
		return "";
	}
	
	
	//--------------------------Admin--------------------------
	
	@GetMapping("/adminLogin")
	public String adminLogin() {
		return "";
	}
	
	@GetMapping("/adminInfo")
	public String adminInfo() {
		return "";
	}
	
	//====================================================================
	// FACULTAD
	//====================================================================


			@RequestMapping(value ="/facultad/crearFacultad",method=RequestMethod.GET)
			public Facultad crearFacultad(@RequestParam(name = "id") int idFacultad,
				                          @RequestParam(name = "nombre") String nombreFacultad,
				                          @RequestParam(name = "numCarreras") int numCarreras){
				
				Facultad facultad = new Facultad( idFacultad, nombreFacultad,numCarreras);
				this.servicefacultad.crearFacultad(facultad);
				return facultad;
				
				}
			
			@RequestMapping(value = "/facultad/listaFacultad" , method=RequestMethod.GET)
			public List<Facultad> listadoFacultad() {	
				return this.servicefacultad.obtenerFacultades();
			}
			
			@RequestMapping(value ="/facultad/buscarFacultad",method=RequestMethod.GET)
			public Facultad buscarFacultad(@RequestParam(name = "id") int idFacultad) {
				return this.servicefacultad.buscarFacultad( idFacultad);
			}
			
			//====================================================================
			// CARRERA
			//====================================================================
			
				
					@RequestMapping(value ="/carrera/crearCarrera",method=RequestMethod.GET)
					public Carrera crearCarrera(@RequestParam(name = "id") int idCarrera,
						                          @RequestParam(name = "nombre") String nombreCarrera,
						                          @RequestParam(name = "descripcion") String descripcionCarrera,
						                          @RequestParam(name = "numAsignaturas") int numAsignaturas,
						                          @RequestParam(name = "grado") String grado,
						                          @RequestParam(name = "duracionCarrera") String duracionCarrera,
						                          @RequestParam(name = "facultad") int facultadCarrera){
						
					Facultad facultad1 = this.servicefacultad.buscarFacultad(facultadCarrera);
					
					Carrera carrera = new Carrera( idCarrera, nombreCarrera,descripcionCarrera,numAsignaturas,grado,duracionCarrera, facultad1);
					this.servicecarrera.crearCarrera(carrera);
					return carrera;    
						
					}
					
					@RequestMapping(value ="/carrera/listaCarrera",method=RequestMethod.GET)
					public List<Carrera>listadoCarrera() {	
						return this.servicecarrera.obtenerCarrera();
					}
					
					@RequestMapping(value ="/carrera/buscarCarrera",method=RequestMethod.GET)
					public Carrera buscarCarrera(@RequestParam(name = "id") int idCarrera) {
						return this.servicecarrera.buscarCarrera( idCarrera);
					}
					
					//====================================================================
					// MAESTRIA
					//====================================================================
			
				
					@RequestMapping(value ="/maestria/crearMaestria",method=RequestMethod.GET)
					public Maestria crearMaestria(@RequestParam(name = "id") int idMaestria,
						                          @RequestParam(name = "nombre") String nombreMaestria,
						                          @RequestParam(name = "orientacion") String orientacion,
						                          @RequestParam(name = "grado") String grado,
						                          @RequestParam(name = "duracion") String duracion,
						                          @RequestParam(name = "cantidadClases") int cantidadClases,
					                              @RequestParam(name = "descripcion") String descripcionMaestria,
					                              @RequestParam(name = "facultad") int idFacultad) {
						
						Facultad facultad2 = this.servicefacultad.buscarFacultad(idFacultad);
						Maestria maestria= new Maestria( idMaestria, nombreMaestria,orientacion,grado,duracion,cantidadClases,descripcionMaestria, facultad2);
						
						this.servicemaestria.crearMaestria(maestria);
						return maestria;
						
						}
					
					@RequestMapping(value ="/maestria/listaMaestria",method=RequestMethod.GET)
					public List<Maestria>listadoMaestria() {	
						return this.servicemaestria.obtenerMaestrias();
					}
					
					@RequestMapping(value ="/maestria/buscarMaestria",method=RequestMethod.GET)
					public Maestria buscarMestria(@RequestParam(name = "id") int idMaestria) {
						return this.servicemaestria.buscarMaestria( idMaestria);
					}
					
		//====================================================================
		// Estudiante
		//===================================================================
				
					@GetMapping
					public String EstudianteRegistro() {
						return "EstudianteRegistro";
					}
				
				@RequestMapping (value = "/estudiante/crearEstudiante", method = RequestMethod.POST)
				public String crearEstudiante(@RequestParam(name = "dni") String dni,
												  @RequestParam(name = "nombre") String nombreEstudiante,
												  @RequestParam(name = "fechanacimiento") @DateTimeFormat(iso = ISO.DATE) LocalDate fechaNac,
												  @RequestParam (name = "sexo") char sexo,
												  @RequestParam (name = "telefono") String telefono,
												  @RequestParam (name = "ciudadOrigen") String ciudadOrigen,
												  @RequestParam (name = "correoElectronico") String correoElectronico,
												  @RequestParam (name = "contrasenia") String contrasenia,
												  @RequestParam (name = "carrera") int idCarrera) {
						
						//Le damos vuelta al Dni para que ese sea su numero de cuenta
						String numCuentaEstu = "";
						for (int i = dni.length()-1; i >= 0; i--)
							  numCuentaEstu = numCuentaEstu + dni.charAt(i);
						
						//Buscar la carrera
						Carrera carreraE = this.servicecarrera.buscarCarrera(idCarrera);
						
						Estudiante estudiante1 = new Estudiante(numCuentaEstu, dni, nombreEstudiante, fechaNac, sexo, telefono, ciudadOrigen, correoElectronico, contrasenia, carreraE);
						
						this.serviceestudiante.crearEstudiante(estudiante1);
						
						return "RegistroEstudiante";
						//return estudiante1;
					}
					
					@RequestMapping (value = "/estudiante/listaEstudiante", method = RequestMethod.GET)
					public List<Estudiante> listadoEstudiante(){
						return this.serviceestudiante.obtenerEstudiante();
					}
					
					@RequestMapping(value ="/estudiante/buscarEstudiante",method=RequestMethod.GET)
					public Optional<Estudiante> buscarEstudiante(@RequestParam(name = "id") String numCuentaEstu) {
						return this.serviceestudiante.buscarEstudiante(numCuentaEstu);
					}
					
					
					//====================================================================
					// MATRICULA
					//====================================================================
					@RequestMapping (value = "/matricula/crearMatricula", method = RequestMethod.GET)
					public Matricula crearMatricula(@RequestParam(name = "id") int idMatricula,
												  //@RequestParam(name = "FechaMatricula") @DateTimeFormat(iso = ISO.DATE) LocalDateTime fechaMatri,
												  @RequestParam (name = "Periodo") String periodo,
												  @RequestParam (name = "Anio") String anio,
												  @RequestParam (name = "numCuentaEstudiante") String numCuentaEstu) {
							
						//Buscar el Estudiante
						Optional <Estudiante> estudiante2 = this.serviceestudiante.buscarEstudiante(numCuentaEstu);
						
						//Capturar la fecha actual
						ZoneId zoneId = ZoneId.of("America/Tegucigalpa");
						ZonedDateTime fecha;
						fecha = ZonedDateTime.now();
						
						Matricula matricula1 = new Matricula(idMatricula, fecha, periodo, anio, estudiante2.get());
						this.servicematricula.crearMatricula(matricula1);
						return matricula1;
						
					}
					
					@RequestMapping (value = "/matricula/listaMatricula", method = RequestMethod.GET)
					public List<Matricula> listadoMatricula(){
						return this.servicematricula.obtenerMatricula();
					}
					
					@RequestMapping(value ="/matricula/buscarMatricula",method=RequestMethod.GET)
					public Matricula buscarMatricula(@RequestParam(name = "id") int idMatricula) {
						return this.servicematricula.buscarMatricula(idMatricula);
					}
					
					//====================================================================
					// Departamento
					//====================================================================
					
					@RequestMapping (value = "/departamento/crearDepartamento", method = RequestMethod.GET)
					public Departamento crearDepartamento(@RequestParam(name = "id") int idDepto,
														@RequestParam (name = "nombreDepto") String nombreDepto,
														@RequestParam (name = "idCarrera") int idCarrera) {
								
						//Buscar la Carrera
						Carrera carreraD = this.servicecarrera.buscarCarrera(idCarrera);
						
						Departamento departamento4 = new Departamento (idDepto, nombreDepto, carreraD);
						this.servicedepartamento.crearDepartamento(departamento4);
						
						return departamento4;
					}
					
					@RequestMapping (value = "/departamento/listaDepartamento", method = RequestMethod.GET)
					public List<Departamento> listadoDepartamento(){
						return this.servicedepartamento.obtenerDepartamento();
					}
					
					@RequestMapping(value ="/departamento/buscarDepartamento",method=RequestMethod.GET)
					public Departamento buscarDepartamento(@RequestParam(name = "id") int idDepto) {
						return this.servicedepartamento.buscarDepartamento(idDepto);
					}
					
					
					//====================================================================
					// CLASE
					//====================================================================
					
					@RequestMapping (value = "/clase/crearClase", method = RequestMethod.GET)
					public Clase crearClase(@RequestParam(name = "id") String idClase,
											@RequestParam (name = "nombreClase") String nombreClase,
											@RequestParam (name = "descripcion") String descripcion,
											@RequestParam (name = "idMatricula") int idMatricula,
											@RequestParam (name ="departamento") int idDepto) {
							
						//Buscar la matricula
						Matricula matricula1 = this.servicematricula.buscarMatricula(idMatricula);
						
						//Buscar depto
						Departamento departamentoC = this.servicedepartamento.buscarDepartamento(idDepto);
						
						Clase clase1 = new Clase(idClase, nombreClase, descripcion, matricula1, departamentoC);
						this.serviceclase.crearClase(clase1);
						
						//return "RegistroEstudiante";
						return clase1;
					}
					
					@RequestMapping (value = "/clase/listaClase", method = RequestMethod.GET)
					public List<Clase> listadoClase(){
						return this.serviceclase.obtenerClase();
					}
					
					@RequestMapping(value ="/clase/buscarClase",method=RequestMethod.GET)
					public Optional<Clase> buscarClase(@RequestParam(name = "id") String idClase) {
						return this.serviceclase.buscarClase(idClase);
					}
	
			
			
			//=====================================================================
			                        //SECCION
			//======================================================================
			@RequestMapping (value = "/seccion/crearSeccion",method=RequestMethod.GET)
			public Seccion crearSeccion(@RequestParam(name = "id") int idSeccion,
					                    @RequestParam(name = "clase") String clase,
					                    @RequestParam(name = "numero") int numSeccion,
					                    @RequestParam(name = "hora") String horaSeccion,
					                    @RequestParam(name = "dia") String diaSeccion,
					                    @RequestParam(name = "estudiantes") int numEstudiantes) {
				
				Optional <Clase> clase4 = this.serviceclase.buscarClase(clase);
						
				Seccion seccion = new Seccion(idSeccion,clase4.get(),numSeccion,horaSeccion,diaSeccion,numEstudiantes);
				this.serviceseccion.crearSeccion(seccion);
				return seccion;
			}
			
			@RequestMapping(value = "/seccion/listarSeccion",method=RequestMethod.GET)
			public List<Seccion> listarSecciones(){
				return this.serviceseccion.obtenerSecciones();
			}
			@RequestMapping(value ="/seccion/buscarSeccion",method=RequestMethod.GET)
			public Optional<Seccion> buscarSeccion(@RequestParam(name = "id") String idSeccion) {
				return this.serviceseccion.buscarSeccion( idSeccion);
			}
			
	
			
			//=======================================================================
			                          //LABORATORIO
			//======================================================================
			@RequestMapping (value = "/laboratorio/crearLaboratorio",method=RequestMethod.GET)
			public Laboratorio crearLaboratorio(@RequestParam(name = "id") String idLab,
					                 @RequestParam(name = "nombre") String nombreLab,
					                 @RequestParam(name = "descripcion") String descripcion,
					                 @RequestParam(name = "clase") String clase) {
				
				Optional <Clase> clase2 = this.serviceclase.buscarClase(clase);
				Laboratorio laboratorio = new Laboratorio(idLab,nombreLab,descripcion, clase2.get());
				this.servicelaboratorio.crearLaboratorio(laboratorio);
				return laboratorio;
			}
			
			@RequestMapping(value = "/laboratorio/listarLaboratorio",method=RequestMethod.GET)
			public List<Laboratorio> listarLaboratorios(){
				return this.servicelaboratorio.obtenerlaboratorios();
			}
			@RequestMapping(value ="/laboratorio/buscarLaboratorio",method=RequestMethod.GET)
			public Optional<Laboratorio> buscarLaboratorio(@RequestParam(name = "id") String idLab) {
				return this.servicelaboratorio.buscarlaboratorio( idLab);
				
			}
			
			//=======================================================================
                  //EDIFICIO
             //======================================================================
			
             @RequestMapping(value ="/edificio/crearEdificio",method=RequestMethod.POST)
             public Edificio crearEdificio(@RequestParam(name = "id") int idEdificio,
	                          @RequestParam(name = "aula") int aula,
	                          @RequestParam(name = "aulaLab") int aulaLab,
	                          @RequestParam(name = "estado") String estado){
	          Edificio edificio = new Edificio (idEdificio,aula,aulaLab,estado);
	          this.serviceedificio.crearEdificio(edificio);
	          return edificio;
	
             }
             
             @RequestMapping(value ="/edificio/listaEdificio",method=RequestMethod.GET)
 			  public List<Edificio> listaredificios(){
 				return this.serviceedificio.obtenerEdificios();
             }

               @RequestMapping(value ="/edificio/buscarEdificio",method=RequestMethod.GET)
               public Optional<Edificio> buscarEdificio(@RequestParam(name = "id") String idEdificio) {
	           return this.serviceedificio.buscarEdificio( idEdificio);
	           
               }


		//====================================================================
		// Docente
		//====================================================================
	
		@RequestMapping(value = "/docente/crearDocente", method = RequestMethod.GET)
		public Docente crearDocente(@RequestParam(name = "Identificacion") String dni,
				 					@RequestParam(name = "Nombre ") String nombre,
				 					@RequestParam(name = "Fecha de Nacimiento") @DateTimeFormat(iso = ISO.DATE) LocalDate fechaNacD,
				 					@RequestParam(name = "Sexo") String sexo,//cambiar a char
				 					@RequestParam(name = "Telefono") String telefono,
				 					@RequestParam(name = "Ciudad de Origen") String ciudadOrigen,
				 					@RequestParam(name = "CorreoElectronico") String Correo_Electronico,
				                    @RequestParam(name = "Contraseña") String contrasenia,
				                    @RequestParam(name = "Departamento") int departamento) {
		//Buscar Departamento
		Departamento departamento3 = this.servicedepartamento.buscarDepartamento(departamento);
		
		//Numero de cuenta Docente
		String numCuentaD = "";
		for (int i = dni.length()-1; i >= 0; i--)
			  numCuentaD = numCuentaD + dni.charAt(i);
		
		Docente docente = new Docente (numCuentaD, dni ,nombre, fechaNacD, sexo,telefono, ciudadOrigen, Correo_Electronico,contrasenia,departamento3);
		this.servicedocente.crearDocente(docente);
		return docente;
		
		}
		
		@RequestMapping(value = "/docente/listaDocente", method = RequestMethod.GET)
		public List<Docente> listadoDocente() {
			return this.servicedocente.obtenerTodosDocentes();
			}
		
		@RequestMapping(value ="/docente/buscarDocente",method=RequestMethod.GET)
		public Optional<Docente> buscarDocente(@RequestParam(name = "id") String numCuentaDocente) {
			return this.servicedocente.buscarDocente(numCuentaDocente);
		}
		
		
		//=====================================================================
        //SECCION LABORATORIO
		//======================================================================
		@RequestMapping (value = "/seccionLab/crearSeccionLab",method=RequestMethod.GET)
		public SeccionLab crearSeccionLab(@RequestParam(name = "id") int idSeccion,
		            @RequestParam(name = "laboratorio") String laboratorio,
		            @RequestParam(name = "numero") int numSeccion,
		            @RequestParam(name = "hora") String horaSeccion,
		            @RequestParam(name = "dia") String diaSeccion,
		            @RequestParam(name = "estudiantes") int numEstudiantes) {
		
		Optional <Laboratorio> lab4 = this.servicelaboratorio.buscarlaboratorio(laboratorio);
		
		SeccionLab seccionLab0 = new SeccionLab(idSeccion,lab4.get(),numSeccion,horaSeccion,diaSeccion,numEstudiantes);
		this.serviceseccionlab.crearSeccionLab(seccionLab0);
		return seccionLab0;
		}
		
		@RequestMapping(value = "/seccionLab/listarSeccionLab",method=RequestMethod.GET)
		public List<SeccionLab> listarSeccionesLab(){
		return this.serviceseccionlab.obtenerSeccioneslab();
		}
		
		@RequestMapping(value ="/seccionLab/buscarSeccionLab",method=RequestMethod.GET)
		public SeccionLab buscarSeccionLab(@RequestParam(name = "id") int idSeccionLab) {
		return this.serviceseccionlab.buscarSeccion(idSeccionLab);
		}
		
		
		//====================================================================
		// Imparte
		//====================================================================
				
				@RequestMapping(value = "/imparte/buscarImparte", method = RequestMethod.GET)
				public Imparte buscarImparte(@RequestParam(name = "numCuentaDocente") String numeroDocente,
						                     @RequestParam(name = "idSeccion") int idSeccion) {
				
				Optional<Docente> docenteI = this.servicedocente.buscarDocente(numeroDocente);
				
				IdImparte idImparte = new IdImparte (numeroDocente, idSeccion);	
				return this.serviceimparte.buscarImparte(idImparte);
				
				}
				@RequestMapping(value = "/imparte/listarImparte", method = RequestMethod.GET)
				public List<Imparte> listarImparte(){
					return this.serviceimparte.obtenerTodasImparte();
				}
				
				
				@RequestMapping(value = "/se_imparten/buscar_se_imparten", method = RequestMethod.GET)
				public Se_Imparten buscarSe_Imparten(@RequestParam(name = "idEdificio") int idEdificio,
						                     @RequestParam(name = "idSeccion") int idSeccion) {
						
				IdSe_Imparten idse_Imparte = new IdSe_Imparten (idEdificio, idSeccion);	
				return this.serviceSe_imparten.buscarSe_Imparte(idse_Imparte);
				
				}
				@RequestMapping(value = "/se_imparten/listar_se_imparten", method = RequestMethod.GET)
				public List<Se_Imparten> listarSe_Imparte(){
					return this.serviceSe_imparten.obtenerTodasSe_Imparte();
				}
		
		
}
		
		
