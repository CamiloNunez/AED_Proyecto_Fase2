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
    	ListLinked<Empresa> SistemaT = new ListLinked<Empresa>();
    	ListLinked<Usuario> Usuarios = new ListLinked<Usuario>();
    	ListLinked<Trabajador> SistemaTrabajador = new ListLinked<Trabajador>();
    	ListLinked<Empleador> SistemaEmpleadores = new ListLinked<Empleador>();
    	String opcion;
    	int opcion1;
    	System.out.println("Desea ingresar a la plataforma?(Si/No)");
    	opcion = in.next();
    	while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))){
    		System.out.println("Ingrese una opcion Correcta!, (Si/No)");
    		opcion = in.next();
    	}
    }
}
