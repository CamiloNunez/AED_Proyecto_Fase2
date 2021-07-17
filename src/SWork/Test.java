package SWork;
import java.util.*;

import SWork.POO.*;
import SWork.tools.lineales.ListLinked;

@SuppressWarnings("unused")
public class Test 
{
    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
    	ListLinked<Usuario> Usuarios = new ListLinked<Usuario>();
    	String opcion;
    	int opcion1;
    	int posicion;
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
	    			System.out.println("Por favor ingrese el tipo de cuenta al que desea ingresar: \n\t1. Trabajador\n\t2. Empresa\n\t3. Empleador Independiente");
	    			opcion1 = in.nextInt();
	    			switch(opcion1) {
	    			case 1:
	    				posicion = Usuarios.search(Usuario.Login(new Trabajador()));
	    				if(posicion == -1) {
	    					System.out.println("Usuario no encontrado");
	    				}
	    				else {
	    					System.out.println("Bienvenido de nuevo: "+Usuarios.getNodeAt(posicion).getData().getNombreUsuario()+
	    							", por favor ingrese una opcion \n\t1. Obtener Calificacion \n\t2. Ver Perfil \n\t3. Actualizar Datos \n\t4. Ver anuncios de Trabajo"
	    							+ "\n\t5. Agregar Carrera a CV \n\t6. Mostrar CV");
	    					opcion1 = in.nextInt();
	    				}
	    			}
	    			
	    			break;
	    		case 3:
	    			break;
    		}
    	}
    }
}
