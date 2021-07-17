package SWork.POO;

import java.util.*;

import SWork.tools.Colas.LinkedQueue;
import SWork.tools.lineales.ListLinked;

public class Empleador extends Persona{
	Empresa empresa;
	int IdEmpleador;
	Usuario usuario;
	ListLinked<Trabajador> trabajadores;
	public static int contador;
	LinkedQueue<Trabajador> postulantes = new LinkedQueue<Trabajador>();
	public Empleador(String Nombre, String Apellido,int edad, Empresa empresa) {
		super(Nombre,Apellido,edad);
		this.empresa = empresa;
		contador++;
		this.IdEmpleador = contador;
	}
	
	public static Empleador IngresarEmpleador() {
		Scanner in = new Scanner(System.in);
		Empresa EmpresaEmpleador = new Empresa();
		String opcion;
		System.out.println("<=======NUEV0 EMPLEADOR INDEPENDIENTE=======>");
		System.out.println("Ingrese Nombre:");
		String nombre = in.next();
		System.out.println("Ingrese Apellidos:");
		String Apellidos = in.next();
		System.out.println("Ingrese Edad");
		int edad = in.nextInt();
		System.out.println("Ingrese Nombre de su Empresa");
		EmpresaEmpleador.setNombreEmpresa(in.next());
		System.out.println("Ingrese Rubro de su Empresa");
		EmpresaEmpleador.setRubro(in.next());
		System.out.println("Desea Guadar Los datos ingresados? (Si/No)");
		opcion = in.next();
		while(!(opcion.equalsIgnoreCase("No")||opcion.equalsIgnoreCase("Si"))) {
			System.out.println("Opcion Incorrecta Por favor Ingresar una opcion correcta");
			opcion = in.next();
		}
		if(opcion.equalsIgnoreCase("Si")) {
			System.out.println("Datos Guardados Correctamente!");
			return new Empleador(nombre,Apellidos,edad,EmpresaEmpleador);
		}
		else if(opcion.equalsIgnoreCase("No")) {
			return null;
		}
		else {
			return null;
		}
	}
	public void Contratar(Trabajador o) {
		Scanner s = new Scanner(System.in);
		String opcion;
		System.out.println("<=======\tContratando a Trabajador\t=======>");
		System.out.println("");
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
			o.setEmpresa(this.empresa);
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
		}
		else {
			System.out.println("Trabajador No contratado");	
		}
	}
}
