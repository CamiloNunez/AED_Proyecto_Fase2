package SWork.POO;

import java.util.Scanner;

public class CV {
	Trabajador trabajador;
	int EstiloCV;
	public CV() {
		
	}
	public static void MostrarEstilos() {
		System.out.println("<=======\tMostrando Estilos\t=======>");
		System.out.println("Estilo 1");
		System.out.println(".=======================.");
		System.out.println("|Nombre: \t\t|");
		System.out.println("|Apellidos: \t\t|");
		System.out.println("|Universidad: \t\t|");
		System.out.println("|Carrera: \t\t|");
		System.out.println("|Tipo: \t\t\t|");
		System.out.println("|Estado: \t\t|");
		System.out.println(".=======================.");
		System.out.println("Estilo 2");
		System.out.println(".=======================__======================.");
		System.out.println("|Nombre: \t\t||Apellidos: \t\t|");
		System.out.println("|Universidad: \t\t||Carrera: \t\t|");
		System.out.println("|Tipo: \t\t\t||Estado: \t\t|");
		System.out.println(".=======================__======================.");
		System.out.println("Estilo 3");
		System.out.println(".=======================.");
		System.out.println("||Nombre: \t\t||");
		System.out.println("||Apellidos: \t\t||");
		System.out.println("||Universidad: \t\t||");
		System.out.println("||Carrera: \t\t||");
		System.out.println("||Tipo: \t\t||");
		System.out.println("||Estado: \t\t||");
		System.out.println(".=======================.");
	}
	public void MostrarCV(){
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor escoja un estilo para mostrar su cv ");
		CV.MostrarEstilos();
		System.out.println("Ingrese un numero por favor: ");
		this.EstiloCV = in.nextInt();
		while(this.EstiloCV <1 || this.EstiloCV >3){
			System.out.println("Estilo cv invalido por favor ingrese un numero valido 1/2/3");
			this.EstiloCV = in.nextInt();
		}
		System.out.println("<=======\tMOSTRANDO CURRICULUM\t=======");
		switch(EstiloCV) {
		case 1:
			System.out.println(".=======================.");
			System.out.println("|Nombre: "+trabajador.getNombres()+"\t\t|");
			System.out.println("|Apellidos: "+trabajador.getApellidos()+"\t\t|");
			for(int i = 0;i<trabajador.getCarreras().length();i++) {
				System.out.println("<=======\tCarrera "+i+"\t=======>");
				System.out.println("|Universidad: "+trabajador.getCarreras().getNodeAt(i).getData().getNombreUniversidad()+"\t\t|");
				System.out.println("|Carrera: "+trabajador.getCarreras().getNodeAt(i).getData().getNombreCarrera()+"\t\t|");
				System.out.println("|Tipo: "+trabajador.getCarreras().getNodeAt(i).getData().ObtenerTipoProfesional()+"\t\t|");
				System.out.println("|Estado: "+trabajador.getCarreras().getNodeAt(i).getData().ObtenerTipoProfesional()+"\t\t|");
			}
			System.out.println(".=======================.");
			break;
		case 2:
			System.out.println(".=======================__======================.");
			System.out.println("|Nombre: "+trabajador.getNombres()+"\t\t|| Apellidos: "+trabajador.getApellidos()+"\t\t|");
			for(int i = 0;i<trabajador.getCarreras().length();i++) {
				System.out.println("|Universidad: "+trabajador.getCarreras().getNodeAt(i).getData().getNombreUniversidad()+"\t\t||Carrera:"+trabajador.getCarreras().getNodeAt(i).getData().getNombreCarrera()+"\t\t|");
				System.out.println("|Tipo: "+trabajador.getCarreras().getNodeAt(i).getData().ObtenerTipoProfesional()+"\t\t||Estado: "+trabajador.getCarreras().getNodeAt(i)+"\t\t|");
			}
			System.out.println(".=======================__======================.");
			break;
		case 3:
			System.out.println(".=======================.");
			System.out.println("||Nombre: "+trabajador.getNombres()+"\t\t||");
			System.out.println("||Apellidos "+trabajador.getApellidos()+"\t\t||");
			for(int i = 0;i<trabajador.getCarreras().length();i++) {
				System.out.println("<=======\tCarrera "+i+"\t=======>");
				System.out.println("||Universidad: "+trabajador.getCarreras().getNodeAt(i).getData().getNombreUniversidad()+"\t\t|");
				System.out.println("||Carrera: "+trabajador.getCarreras().getNodeAt(i).getData().getNombreCarrera()+"\t\t|");
				System.out.println("||Tipo: "+trabajador.getCarreras().getNodeAt(i).getData().ObtenerTipoProfesional()+"\t\t|");
				System.out.println("||Estado: "+trabajador.getCarreras().getNodeAt(i).getData().ObtenerTipoProfesional()+"\t\t|");
			}
			System.out.println(".=======================.");
			break;
		}
	}
	public int getEstiloCV() {
		return EstiloCV;
	}
	public void setEstiloCV(int estiloCV) {
		EstiloCV = estiloCV;
	}
	
}
