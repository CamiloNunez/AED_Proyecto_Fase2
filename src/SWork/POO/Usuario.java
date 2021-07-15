package SWork.POO;
import java.util.*;
public class Usuario extends Persona implements Comparable<Usuario>
{
	private String NombreUsuario;
    private String password;
    private String TUsuario;
    private Empresa empresa;
    private Empleador empleador;
    private Trabajador trabajador;
    private String correo;
    public Usuario(String NombreUsuario, String nombres, String apellidos,int edad,String TUsuario, String password, Trabajador trabajador) 
    {
        super(nombres, apellidos,edad);
        this.TUsuario = TUsuario;
        this.trabajador = trabajador;
        this.NombreUsuario = NombreUsuario;
    }
    public Usuario() {
    	super();
    }
    public Usuario(String NombreUsuario, String nombres, String apellidos, int edad,String TUsuario, String password, Empleador empleador) {
    	super(nombres, apellidos, edad);
    	this.TUsuario = TUsuario;
    	this.password = password;
    	this.empleador = empleador;
    	this.NombreUsuario = NombreUsuario;
    }
    public Usuario(String NombreUsuario, String nombres, String apellidos, int edad,String TUsuario, String password, Empresa empresa) {
    	super(nombres, apellidos, edad);
    	this.TUsuario = TUsuario;
    	this.password = password;
    	this.empresa = empresa;
    	this.NombreUsuario = NombreUsuario;
    }
    public Usuario(String NombreUsuario,String password) {
    	this.NombreUsuario = NombreUsuario;
    	this.password = password;
    }
    public String getPassword() 
    {
        return password;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }
    public void guardar() {
    
    }
    @SuppressWarnings("resource")
	public static Usuario ingresar1(Trabajador o) {
    	Scanner in = new Scanner(System.in);
    	String opcion;
    	System.out.println("BIENVENIDO!, AL PARECER USTED ES UN NUEVO TRABAJADOR POR FAVOR INGRESE SUS DATOS");
    	System.out.println("Ingrese Nombres:");
    	String nombre = in.next();
    	System.out.println("Ingrese Apellidos:");
    	String apellidos = in.next();
    	System.out.println("Ingrese su Edad:");
    	int edad = in.nextInt();
    	System.out.println("Su nombre de usuario recomendado es:"+nombre+" "+apellidos+"Desea cambiarlo?(Si/No)");
    	opcion = in.next();
    	while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))) {
    		System.out.println("Error al ingresar la opcion, por favor ingrese (Si/No)");
    	}
    	if(opcion.equalsIgnoreCase("No")) {
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,nombre,apellidos,edad,"1",password,o);
    	}
    	else {
    		System.out.println("Por favor ingrese su nombre de usuario");
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,nombre,apellidos,edad,"1",password,o);
    	}
    }
	public static Usuario ingresar2(Trabajador o) {
		Scanner in = new Scanner(System.in);
    	String opcion;
    	System.out.println("BIENVENIDO!, AL PARECER USTED ES UN NUEVO TRABAJADOR POR FAVOR INGRESE SUS DATOS");
    	System.out.println("Ingrese Nombres:");
    	String nombre = in.next();
    	System.out.println("Ingrese Apellidos:");
    	String apellidos = in.next();
    	System.out.println("Ingrese su Edad:");
    	int edad = in.nextInt();
    	System.out.println("Su nombre de usuario recomendado es:"+nombre+" "+apellidos+"Desea cambiarlo?(Si/No)");
    	opcion = in.next();
    	while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))) {
    		System.out.println("Error al ingresar la opcion, por favor ingrese (Si/No)");
    	}
    	if(opcion.equalsIgnoreCase("No")) {
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,nombre,apellidos,edad,"1",password,o);
    	}
    	else {
    		System.out.println("Por favor ingrese su nombre de usuario");
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,nombre,apellidos,edad,"1",password,o);
    	}
    }
    public static Usuario ingresar3(Trabajador o) {
    	Scanner in = new Scanner(System.in);
    	String opcion;
    	System.out.println("BIENVENIDO!, AL PARECER USTED ES UN NUEVO TRABAJADOR POR FAVOR INGRESE SUS DATOS");
    	System.out.println("Ingrese Nombres:");
    	String nombre = in.next();
    	System.out.println("Ingrese Apellidos:");
    	String apellidos = in.next();
    	System.out.println("Ingrese su Edad:");
    	int edad = in.nextInt();
    	System.out.println("Su nombre de usuario recomendado es:"+nombre+" "+apellidos+"Desea cambiarlo?(Si/No)");
    	opcion = in.next();
    	while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))) {
    		System.out.println("Error al ingresar la opcion, por favor ingrese (Si/No)");
    	}
    	if(opcion.equalsIgnoreCase("No")) {
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,nombre,apellidos,edad,"1",password,o);
    	}
    	else {
    		System.out.println("Por favor ingrese su nombre de usuario");
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,nombre,apellidos,edad,"1",password,o);
    	}
    }
    public void actualizar() 
    {
        
    }
    @Override
    public String toString() 
    {
        return "Nombre";
    }
    @SuppressWarnings("resource")
	public static Usuario Login(Object o){
    	Scanner s = new Scanner(System.in);
    	if(o instanceof Trabajador) {
    		System.out.println("<=======\tINICIANDO SESION TRABAJADOR\t=======>");
    		System.out.println("Ingrese nombre de usuario:");
    		String NombreUsuario = s.next();
    		System.out.println("Ingrese contraseña: ");
    		String password = s.next();
    		return new Usuario(NombreUsuario, password);
    	}
    	else if(o instanceof Empresa) {
    		System.out.println("<=======\tINICIANDO SESION EMPRESA\t=======>");
    	}
    	else if(o instanceof Empleador) {
    		System.out.println("<=======\tINICIANDO SESION EMPLEADOR\t=======>");
    	}
		return null;
    	
    }
    public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Empleador getEmpleador() {
		return empleador;
	}
	public void setEmpleador(Empleador empleador) {
		this.empleador = empleador;
	}
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean equals(Object o) {
		if(o instanceof Usuario) {
			Usuario a = (Usuario) o;
			if(a.NombreUsuario.equalsIgnoreCase(a.NombreUsuario) && a.password.equals(a.NombreUsuario)) return true;
			else {
				return false;
			}
		}
		return false;
	}
	public String getTUsuario() {
		return TUsuario;
	}
	public void setTUsuario(String tUsuario) {
		TUsuario = tUsuario;
	}
}