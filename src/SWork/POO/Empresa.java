package SWork.POO;

import java.util.Scanner;

import SWork.tools.Colas.ExceptionIsEmpty;
import SWork.tools.Colas.LinkedQueue;
import SWork.tools.HashC.HashC;
import SWork.tools.lineales.ListLinked;
public class Empresa {
	int idEmpresa;
	String NombreEmpresa;
	String Rubro;
	ListLinked<Trabajador> trabajadores = new ListLinked<Trabajador>();
	ListLinked<Anuncio> Anuncios = new ListLinked<Anuncio>();
	LinkedQueue<Trabajador> postulantes = new LinkedQueue<Trabajador>();
	public static int contador= 0;
	Usuario usuario = new Usuario();
	
	public String getNombreEmpresa() {
		return NombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}
	
	public LinkedQueue<Trabajador> getPostulantes() {
		return postulantes;
	}
	public void setPostulantes(LinkedQueue<Trabajador> postulantes) {
		this.postulantes = postulantes;
	}
	public String getRubro() {
		return Rubro;
	}
	public void setRubro(String rubro) {
		Rubro = rubro;
	}
	public ListLinked<Trabajador> getTrabajadores() {
		return trabajadores;
	}
	public void setTrabajadores(ListLinked<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Empresa.contador = contador;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public ListLinked<Anuncio> getAnuncios() {
		return Anuncios;
	}
	public void setAnuncios(ListLinked<Anuncio> anuncios) {
		Anuncios = anuncios;
	}
	public Empresa(String NombreEmpresa, String Rubro){
		contador++;
		idEmpresa = contador;
		this.NombreEmpresa = NombreEmpresa;
		this.Rubro = Rubro;
	}
	public Empresa() {
		
	}
	public Empresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public static Empresa AgregarEmpresa() {
		Scanner in = new Scanner(System.in);
		System.out.println("<=======\tAGREGANDO NUEVA EMPRESA\t=======>");
		System.out.println("Ingresar Nombre Empresa:");
		String NombreEmpresa = in.next();
		System.out.println("Ingresar Rubro Empresa");
		String Rubro = in.next();
		return new Empresa(NombreEmpresa,Rubro);
	}
	public void Contratar(Trabajador o) throws ExceptionIsEmpty {
		Scanner s = new Scanner(System.in);
		String opcion;
		System.out.println("<=======\tContratando a Trabajador\t=======>");
		System.out.println("Nombre: "+o.getNombres());
		System.out.println("Apellidos: "+o.getApellidos());
		System.out.println(o.getCarreras());
		System.out.println("Telefono"+o.getTelefono());
		System.out.println("Correo"+o.getCorreo());
		System.out.println("Edad"+o.getEdad());
		System.out.println("Calificacion: "+o.getCalificacion());
		System.out.println("Desea contratar a este Trabajador? (Si/No)");
		opcion = s.next();
		while(!(opcion.equalsIgnoreCase("si")||opcion.equalsIgnoreCase("No"))) {
			System.out.println("Opcion no valida por favor ingrese (Si/No)");
			opcion =s.next();
		}
		if(opcion.equalsIgnoreCase("si")) {
			o.setEmpresa(Empresa.this);
			System.out.println("Ingrese a que area de la empresa pertenecera:");
			o.setCategoria(s.next());
			System.out.println("Ingrese su salario de trabajador");
			o.setSalario(s.nextDouble());
			while(o.getSalario() <0) {
				System.out.println("Ingrese Salario");
				o.setSalario(s.nextDouble());
			}
			this.trabajadores.insertLast(o);
			System.out.println("Trabajador contratado con exito!");
			this.postulantes.dequeue();
		}
		else {
			System.out.println("Trabajador No contratado");	
		}
	}
	public static void MostrarAnuncios(ListLinked<Usuario> usuario) {
		for(int i = 0;i<usuario.length();i++) {
			System.out.println("Anuncios de: "+usuario.getNodeAt(i).getData().getEmpresa().getNombreEmpresa());
			usuario.getNodeAt(i).getData().getEmpresa().getAnuncios();
		}
	}
	public void EliminarAnuncios(Anuncio anuncio) {
		int posicion = this.Anuncios.search(anuncio);
		if(posicion == -1) {
			System.out.println("Anuncio ingresado no existe");
			return;
		}
		else {
			System.out.println("Estas eliminando el anuncio: \n"+this.Anuncios.getNodeAt(posicion));
			this.Anuncios.remove(anuncio);
		}
		
	}
	public void ReporteTrabajadores() {
		HashC<Trabajador> reporte = new HashC<Trabajador>(this.trabajadores.length());
		for(int i = 0;i<this.trabajadores.length();i++) {
			reporte.insertarEncadenamiento(trabajadores.getNodeAt(i).getData().getCodigo(), trabajadores.getNodeAt(i).getData());
		}
		System.out.println(reporte);
	}
	public void CrearAnuncio() {
		this.Anuncios.insertLast(Anuncio.PonerAnuncio());
	}
	public String toString() {
		return "id Empresa"+this.idEmpresa+"Nombre Empresa: "+this.NombreEmpresa+"Rubro Empresa"+this.getRubro();
	}
}
