package SWork.POO;

import java.util.Scanner;

import SWork.tools.lineales.ListLinked;

public class Anuncio {
	int idAnuncio;
	String NombreAnuncio;
	ListLinked<String> Requerimientos = new ListLinked<String>();
	ListLinked<String> Beneficios = new ListLinked<String>();
	public static int contador = 0;
	public Anuncio(int idAnuncio) {
		this.idAnuncio = idAnuncio;
	}
	public Anuncio(ListLinked<String> Requerimientos, ListLinked<String> Beneficios,String NombreAnuncio) {
		this.NombreAnuncio = NombreAnuncio;
		this.Requerimientos = Requerimientos;
		this.Beneficios = Beneficios;
		contador++;
		this.idAnuncio = contador;
	}
	public static Anuncio PonerAnuncio() {
		Scanner s = new Scanner(System.in);
		String opcion = " ";
		String opcion1 = " ";
		int i = 0;
		ListLinked<String> requerimientos = new ListLinked<String>();
		ListLinked<String> Beneficios = new ListLinked<String>();
		System.out.println("<=======CREANDO NUEVO ANUNCIO=======>");
		System.out.println("Ingrese Nombre de Anuncio: ");
		String NombreAnuncio = s.next();
		while(!opcion1.equalsIgnoreCase("No")) {
			i++;
			System.out.println("Ingrese Requerimiento "+i+": ");
			requerimientos.insertLast(s.next());
			System.out.println("Desea Agregar mas Requerimientos?(Si/No)");
			opcion1 = s.next();
			while(!(opcion1.equalsIgnoreCase("Si")||opcion1.equalsIgnoreCase("No"))) {
				System.out.println("Ingrese una opcion correcta (Si/No)");
				opcion1 = s.next();
			}
		}
		opcion1 = "Si";
		while(!opcion1.equalsIgnoreCase("No")) {
			i++;
			System.out.println("Ingrese Beneficio "+i+": ");
			Beneficios.insertLast(s.next());
			System.out.println("Desea Agregar mas Requerimientos?(Si/No)");
			opcion1 = s.next();
			while(!(opcion1.equalsIgnoreCase("Si")||opcion1.equalsIgnoreCase("No"))) {
				System.out.println("Ingrese una opcion correcta (Si/No)");
				opcion1 = s.next();
			}
		}
		return new Anuncio(requerimientos,Beneficios,NombreAnuncio);
	}
	public boolean equals(Object o) {
		if(o instanceof Anuncio){
			Anuncio a = (Anuncio) o;
			if(this.idAnuncio == a.idAnuncio) {
				return true;
			}
		}
		return false;
		
	}
	
	public int getIdAnuncio() {
		return idAnuncio;
	}
	public void setIdAnuncio(int idAnuncio) {
		this.idAnuncio = idAnuncio;
	}
	public String getNombreAnuncio() {
		return NombreAnuncio;
	}
	public void setNombreAnuncio(String nombreAnuncio) {
		NombreAnuncio = nombreAnuncio;
	}
	public ListLinked<String> getRequerimientos() {
		return Requerimientos;
	}
	public void setRequerimientos(ListLinked<String> requerimientos) {
		Requerimientos = requerimientos;
	}
	public ListLinked<String> getBeneficios() {
		return Beneficios;
	}
	public void setBeneficios(ListLinked<String> beneficios) {
		Beneficios = beneficios;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Anuncio.contador = contador;
	}
	public String toString() {
		return "ID: "+this.idAnuncio+"Nombre: "+this.NombreAnuncio+"\nRequerimientos: \n"+this.Requerimientos+"Beneficios: \n"+this.Beneficios;
	}
}
