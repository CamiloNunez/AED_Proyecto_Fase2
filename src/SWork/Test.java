package SWork;
import java.util.*;

import SWork.POO.*;
import SWork.tools.Colas.ExceptionIsEmpty;
import SWork.tools.lineales.ListLinked;

@SuppressWarnings("unused")
public class Test 
{
    public static void main(String[] args) throws ExceptionIsEmpty 
    {
    	Scanner in = new Scanner(System.in);
    	ListLinked<Usuario> Usuarios = new ListLinked<Usuario>();
    	String opcion;
    	int opcion1;
    	int posicion;
    	int opcion2 = 0;
    	int opcion4;
    	String opcion3;
    	int posicion1;
    	System.out.println("Desea ingresar a la plataforma?(Si/No)");
    	opcion = in.next();
    	while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))){
    		System.out.println("Ingrese una opcion Correcta!, (Si/No)");
    		opcion = in.next();
    	}
    	while(!opcion.equalsIgnoreCase("No")) {
    		System.out.println("<========\tBienvenido al Sistema General Para Trabajadores S-Work\t=======>");
    		System.out.println("Porfavor Ingrese una opcion:\n\t 1. Crear cuenta \n\t 2. Iniciar Sesion\n\t 3. Salir del Sistema");
    		opcion1 = in.nextInt();
    		while(opcion1<1 || opcion1 > 3) {
    			System.out.println("Porfavor ingrese una opcion correcta");
    			opcion1 = in.nextInt();
    		}
    		switch(opcion1) {
	    		case 1:
	    			System.out.println("Por favor ingrese el tipo de cuenta que desea crear: \n\t1. Trabajador\n\t2. Empresa\n\t3. Empleador Independiente");	    			
	    			opcion1 = in.nextInt();
	    			switch(opcion1) {
	    			case 1:
	    				Usuarios.insertLast(Usuario.ingresar1(Trabajador.RegistrarTrabajador()));
	    				Usuarios.getLastNode().getData().getTrabajador().setUsuario(Usuarios.getLastNode().getData());
	    				break;
	    			case 2:
	    				Usuarios.insertLast(Usuario.ingresar2(Empresa.AgregarEmpresa()));
	    				Usuarios.getLastNode().getData().getTrabajador().setUsuario(Usuarios.getLastNode().getData());
	    				break;
	    			case 3:
	    				Usuarios.insertLast(Usuario.ingresar3(Empleador.IngresarEmpleador()));
	    				Usuarios.getLastNode().getData().getTrabajador().setUsuario(Usuarios.getLastNode().getData());
	    				break;
	    			}
	    			break;
	    		case 2:
	    			System.out.println("Por favor ingrese el tipo de cuenta al que desea ingresar: \n\t1. Trabajador\n\t2. Empresa\n\t3. Empleador Independiente\n\t4. Salir");
	    			opcion1 = in.nextInt();
	    			switch(opcion1) {
	    			case 1:
	    				
		    				posicion = Usuarios.search(Usuario.Login(new Trabajador()));
		    				if(posicion == -1) {
		    					System.out.println("Usuario no encontrado");
		    				}
		    				else {
		    					while(opcion2 != 7) {
			    					System.out.println("Bienvenido de nuevo: "+Usuarios.getNodeAt(posicion).getData().getNombreUsuario()+
			    							", por favor ingrese una opcion \n\t1. Obtener Calificacion \n\t2. Ver Perfil \n\t3. Actualizar Datos \n\t4. Ver anuncios de Trabajo"
			    							+ "\n\t5. Agregar Carrera a CV \n\t6. Mostrar CV\n\t7.CerrarSesion");
			    					opcion2 = in.nextInt();
			    					switch(opcion2) {
			    					case 1:
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().ObtenerCalificacion();
			    						break;
			    					case 2:
				    					Usuarios.getNodeAt(posicion).getData().verPerfil();	
			    						break;
			    					case 3:
			    						Usuarios.getNodeAt(posicion).getData().actualizar();
			    						break;
			    					case 4:
			    						Empresa.MostrarAnuncios(Usuarios);
			    						System.out.println("Desea Postular?(Si/No");
			    						opcion3 = in.next();
			    						while(!(opcion3.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))){
			    				    		System.out.println("Ingrese una opcion Correcta!, (Si/No)");
			    				    		opcion3 = in.next();
			    				    	}
			    						if(opcion3.equalsIgnoreCase("Si")) {
			    							System.out.println("Ingrese el numero de anuncio que desea postular");
			    							opcion4 = in.nextInt();
			    							System.out.println("Usted esta postulando al anuncio N°:"+opcion4);
			    							posicion1 = Usuarios.search(Empresa.BuscarAnuncio(Usuarios, opcion4));
			    							Usuarios.getNodeAt(posicion).getData().getTrabajador().Postular(Usuarios.getNodeAt(posicion1).getData().getEmpresa());
			    						}
			    						break;
			    					case 5:
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().IngresarCarrera();
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().ActualizarCV();
			    						break;
			    					case 6:
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().ActualizarCV();
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().getCurriculum().MostrarCV();
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().ActualizarCV();
			    						break;
			    					case 7:
			    						System.out.println("Cerrando Sesion...");
			    						break;
			    					}
		    					}
		    				}
	    				break;
	    			case 2:
	    				posicion = Usuarios.search(Usuario.Login(new Empresa()));
	    				if(posicion == -1) {
	    					System.out.println("Usuario no encontrado");
	    				}
	    				else {
	    					while(opcion2 != 7) {
		    					System.out.println("Bienvenido de nuevo: "+Usuarios.getNodeAt(posicion).getData().getNombreUsuario()+
		    							", por favor ingrese una opcion \n\t1. Crear Anuncio \n\t2. Ver Perfil \n\t3. Actualizar Datos \n\t4. Ver los anuncios de la empresa"
		    							+ "\n\t5. VerPostulantes \n\t6. Reporte Trabajadores\n\t7.Eliminar Anuncio \n\t8.CerrarSesion");
		    					opcion2 = in.nextInt();
		    					switch(opcion2) {
		    					case 1:
		    						Usuarios.getNodeAt(posicion).getData().getEmpresa().CrearAnuncio();
		    						break;
		    					case 2:
			    					Usuarios.getNodeAt(posicion).getData().verPerfil();	
		    						break;
		    					case 3:
		    						Usuarios.getNodeAt(posicion).getData().actualizar();
		    						break;
		    					case 4:
		    						Usuarios.getNodeAt(posicion).getData().getEmpresa().MostrarAnuncio();
		    						break;
		    					case 5:
		    						Usuarios.getNodeAt(posicion).getData().getEmpresa().MostrarPostulantes();
		    						System.out.println("Desea Contratar?(Si/No");
		    						opcion3 = in.next();
		    						while(!(opcion3.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))){
		    				    		System.out.println("Ingrese una opcion Correcta!, (Si/No)");
		    				    		opcion3 = in.next();
		    				    	}
		    						if(opcion3.equalsIgnoreCase("Si")) {
		    							Usuarios.getNodeAt(posicion).getData().getEmpresa().Contratar();
		    						}
		    						break;
		    					case 6:
		    						Usuarios.getNodeAt(posicion).getData().getTrabajador().ActualizarCV();
		    						Usuarios.getNodeAt(posicion).getData().getTrabajador().getCurriculum().MostrarCV();
		    						Usuarios.getNodeAt(posicion).getData().getTrabajador().ActualizarCV();
		    						break;
		    					case 7:
		    						Usuarios.getNodeAt(posicion).getData().getEmpresa().MostrarAnuncio();
		    						System.out.println("Ingrese un numero de Anuncio");
		    						opcion4 = in.nextInt();
		    						Usuarios.getNodeAt(posicion).getData().getEmpresa().EliminarAnuncios(new Anuncio(opcion4));
		    						break;
		    					case 8:
		    						System.out.println("Cerrando sesion: ");
	    					}
	    					}
	    				}
	    				break;
	    			case 3:
	    				posicion = Usuarios.search(Usuario.Login(new Empleador()));
	    				if(posicion == -1) {
	    					System.out.println("Usuario no encontrado");
	    				}
	    				else {
	    					while(opcion2 != 7) {
		    					System.out.println("Bienvenido de nuevo: "+Usuarios.getNodeAt(posicion).getData().getNombreUsuario()+
		    							", por favor ingrese una opcion \n\t1. Crear Anuncio \n\t2. Ver Perfil \n\t3. Actualizar Datos \n\t4. Ver los anuncios de la empresa"
		    							+ "\n\t5. VerPostulantes \n\t6. Reporte Trabajadores\n\t7.Eliminar Anuncio \n\t8.CerrarSesion");
		    					opcion2 = in.nextInt();
		    					switch(opcion2) {
			    					case 1:
			    						Usuarios.getNodeAt(posicion).getData().getEmpleador().CrearAnuncio();
			    						break;
			    					case 2:
				    					Usuarios.getNodeAt(posicion).getData().verPerfil();	
			    						break;
			    					case 3:
			    						Usuarios.getNodeAt(posicion).getData().actualizar();
			    						break;
			    					case 4:
			    						Usuarios.getNodeAt(posicion).getData().getEmpleador().MostrarAnuncio();
			    						break;
			    					case 5:
			    						Usuarios.getNodeAt(posicion).getData().getEmpleador().MostrarPostulantes();
			    						System.out.println("Desea Contratar?(Si/No");
			    						opcion3 = in.next();
			    						while(!(opcion3.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))){
			    				    		System.out.println("Ingrese una opcion Correcta!, (Si/No)");
			    				    		opcion3 = in.next();
			    				    	}
			    						if(opcion3.equalsIgnoreCase("Si")) {
			    							Usuarios.getNodeAt(posicion).getData().getEmpresa().Contratar();
			    						}
			    						break;
			    					case 6:
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().ActualizarCV();
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().getCurriculum().MostrarCV();
			    						Usuarios.getNodeAt(posicion).getData().getTrabajador().ActualizarCV();
			    						break;
			    					case 7:
			    						Usuarios.getNodeAt(posicion).getData().getEmpresa().MostrarAnuncio();
			    						System.out.println("Ingrese un numero de Anuncio");
			    						opcion4 = in.nextInt();
			    						Usuarios.getNodeAt(posicion).getData().getEmpresa().EliminarAnuncios(new Anuncio(opcion4));
			    						break;
			    					case 8:
			    						System.out.println("Cerrando sesion: ");
		    					}
	    					}
	    				}
	    				break;
	    			case 4:
	    				System.out.println("Saliendo...");
	    				break;
	    			}
	    			break;
	    		case 3:
	    			System.out.println("Saliendo del Sistema, Hasta luego...");
	    			opcion = "No";
	    			break;
    		}	
    	}
    }
}
