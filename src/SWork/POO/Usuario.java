package SWork.POO;
import java.util.*;
public class Usuario implements Comparable<Usuario>
{
	private String NombreUsuario;
    private String password;
    private int TUsuario;
    private Empresa empresa;
    private Empleador empleador;
    private Trabajador trabajador;
    public Usuario(String NombreUsuario, int TUsuario, String password, Trabajador trabajador) 
    {
        super();
        this.TUsuario = TUsuario;
        this.trabajador = trabajador;
        this.NombreUsuario = NombreUsuario;
    }
    public Usuario() {
    	super();
    }
    public Usuario(String NombreUsuario,int TUsuario, String password, Empleador empleador) {
    	super();
    	this.TUsuario = TUsuario;
    	this.password = password;
    	this.empleador = empleador;
    	this.NombreUsuario = NombreUsuario;
    }
    public Usuario(String NombreUsuario,String password) {
    	super();
    	this.NombreUsuario = NombreUsuario;
    	this.password = password;
    }
    public Usuario(String nombreUsuario, int TUsuario, String password, Empresa o) {
		super();
    	this.NombreUsuario = nombreUsuario;
    	this.TUsuario = TUsuario;
    	this.password = password;
    	this.empresa = o;
    	
	}
	public String getPassword() 
    {
        return password;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }
    @SuppressWarnings("resource")
	public static Usuario ingresar1(Trabajador o) {
    	Scanner in = new Scanner(System.in);
    	String opcion;
    	System.out.println("BIENVENIDO!, AL PARECER USTED ES UN NUEVO Usuario TRABAJADOR POR FAVOR INGRESE SUS DATOS");
    	System.out.println("Su nombre de usuario recomendado es:"+o.getNombres()+" "+o.getApellidos()+"Desea cambiarlo?(Si/No)");
    	opcion = in.next();
    	while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))) {
    		System.out.println("Error al ingresar la opcion, por favor ingrese (Si/No)");
    	}
    	if(opcion.equalsIgnoreCase("No")) {
    		String NombreUsuario = o.getNombres()+" "+o.getApellidos();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,1,password,o);
    	}
    	else {
    		System.out.println("Por favor ingrese su nombre de usuario");
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,1,password,o);
    	}
    }
	public static Usuario ingresar2(Empresa o) {
		Scanner in = new Scanner(System.in);
    	String opcion;
    	System.out.println("<========\tNuevo Usuario\t=======>");
    	System.out.println("BIENVENIDO!, AL PARECER USTED ES UN NUEVO Usuario EMPRESA POR FAVOR INGRESE SUS DATOS");
    	System.out.println("Su nombre de usuario recomendado es:"+"Empresa"+o.NombreEmpresa+"Desea cambiarlo?(Si/No)");
    	opcion = in.next();
    	while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))) {
    		System.out.println("Error al ingresar la opcion, por favor ingrese (Si/No)");
    	}
    	if(opcion.equalsIgnoreCase("No")) {
    		String NombreUsuario = "Empresa "+o.NombreEmpresa;
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,2,password,o);
    	}
    	else {
    		System.out.println("Por favor ingrese su nombre de usuario");
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,2,password,o);
    	}
    }
    public static Usuario ingresar3(Empleador o) {
    	Scanner in = new Scanner(System.in);
    	String opcion;
    	String passwordV = " ";
    	System.out.println("BIENVENIDO!, AL PARECER USTED ES UN NUEVO Usuario EMPLEADOR POR FAVOR INGRESE SUS DATOS");
    	System.out.println("Su nombre de usuario recomendado es:"+o.getNombres()+" "+o.getApellidos()+"Desea cambiarlo?(Si/No)");
    	opcion = in.next();
    	while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase("No"))) {
    		System.out.println("Error al ingresar la opcion, por favor ingrese (Si/No)");
    	}
    	if(opcion.equalsIgnoreCase("No")) {
    		String NombreUsuario = o.getNombres()+" "+o.getApellidos();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		return new Usuario(NombreUsuario,3,password,o);
    	}
    	else {
    		System.out.println("Por favor ingrese su nombre de usuario");
    		String NombreUsuario = in.next();
    		System.out.println("Ingrese su contraseña:");
    		String password = in.next();
    		while(password.equals(passwordV)) {
    			System.out.println("Por favor confirme su contraseña:");
    			
    		}
    		return new Usuario(NombreUsuario,3,password,o);
    	}
    }
    public void verPerfil() {
    	System.out.println("Su Nombre de Usuario es:"+this.NombreUsuario);
        System.out.println("Su Contraseña es:"+this.password);
    }
    public void actualizar() 
    {
        Scanner s = new Scanner(System.in);
    	int opcion;
        System.out.println("<=======\tActualizacion de Datos\t=======>");
        System.out.println("Su Nombre de Usuario es:"+this.NombreUsuario);
        System.out.println("Su Contraseña es:"+this.password);
        System.out.println("Usted es: "+this.ObtenerTipoUsuario());
        System.out.println("Por favor ingrese una opcion para modificar: \n\t1. Cambiar Usuario\n\t 2. Cambiar Contraseña");
        opcion = s.nextInt();
        
    }
    @SuppressWarnings("resource")
	public static Usuario Login(Object o){
    	Scanner s = new Scanner(System.in);
    	if(o instanceof Trabajador) {
    		System.out.println("<=======\tINICIANDO SESION TRABAJADOR\t=======>");
    		System.out.println("|Ingrese nombre de usuario:\t|");
    		String NombreUsuario = s.next();
    		System.out.println("|Ingrese contraseña:\t|");
    		String password = s.next();
    		return new Usuario(NombreUsuario, password);
    	}
    	else if(o instanceof Empresa) {
    		System.out.println("<=======\tINICIANDO SESION EMPRESA\t=======>");
    		System.out.println("|Ingrese nombre de usuario:\t|");
    		String NombreUsuario = s.next();
    		System.out.println("|Ingrese contraseña:\t|");
    		String password = s.next();
    		return new Usuario(NombreUsuario, password);
    	}
    	else if(o instanceof Empleador) {
    		System.out.println("<=======\tINICIANDO SESION EMPLEADOR\t=======>");
    		System.out.println("|Ingrese nombre de usuario:\t|");
    		String NombreUsuario = s.next();
    		System.out.println("|Ingrese contraseña:\t|" );
    		String password = s.next();
    		return new Usuario(NombreUsuario,password);
    	}
		return null;
    }
    public String ObtenerTipoUsuario() {
    	if(this.TUsuario == 1) {
    		return "Un Trabajador";
    	}
    	if(this.TUsuario == 2) {
    		return "Una Empresa";
    	}
    	if(this.TUsuario == 3) {
    		return "Un Empleador";
    	}
    	else {
    		return "Tipo de Usuario no especificado";
    	}
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
	public int getTUsuario() {
		return TUsuario;
	}
	public void setTUsuario(int tUsuario) {
		TUsuario = tUsuario;
	}
	public String toString(){
		return "El usuario es: "+this.NombreUsuario+" Tipo de Usuario:"+this.TUsuario;
	}
}