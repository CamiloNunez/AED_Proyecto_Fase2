package SWork.POO;
import java.util.*;

import SWork.tools.lineales.ListLinked;
public class Trabajador extends Persona implements Comparable<Trabajador>
{
    private String categoria;
    private double salario;
    private int telefono;
    private int codigo;
    double calificacion;
    private CV Curriculum;
    private Empresa Empresa;
    private Usuario usuario;
    private String correo;
    private ListLinked<Carrera> carreras;
    public static int contador = 0;
    public Trabajador(int codigo,String nombres, String apellidos, int edad, String categoria, double salario, int telefono, double calificacion, CV cv)
    {
        super(nombres,apellidos,edad);
        this.categoria = categoria;
        this.salario = salario;
        this.telefono = telefono;
        this.codigo = codigo;
        this.Curriculum = cv;
    }
    public Trabajador(String nombres,String apellidos, int edad, int telefono, String correo) {
    	super(nombres,apellidos,edad);
    	this.telefono = telefono;
    	this.correo = correo;
    	contador++;
    	codigo = contador;
    }
    public Trabajador(int codigo) {
    	this.codigo = codigo;
    }
    public Trabajador() {}
    public static Trabajador RegistrarTrabajador() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("<=======\tINGRESANDO NUEVO TRABAJADOR\t=======>");
    	System.out.println("Ingrese Nombre:");
    	String Nombres = in.next();
    	System.out.println("Ingrese Apellidos");
    	String Apellidos = in.next();
    	System.out.println("Ingrese edad");
    	int edad = in.nextInt();
    	System.out.println("Ingrese telefono");
    	int telefono = in.nextInt();
    	System.out.println("Ingrese correo");
    	String correo = in.next();
    	return new Trabajador(Nombres,Apellidos,edad,telefono,correo);
    }
    public void ObtenerCalificacion() {
    	Scanner in = new Scanner(System.in);
    	int opcion;
    	System.out.println("<=======\tInicializando Test para obtener calificacion\t========>");
    	System.out.println("Tiene experiencia laboral?, 0Ingrese una opcion: \n\t1. Poca \n\t2. Moderada \n\t3. Parcialmente \n\t4. En buena proporcion \nt5. En grande Proporcion");
    	opcion = in.nextInt();
    	while(opcion < 1 || opcion > 5) {
    		System.out.println("Opcion incorrecta Por favor ingrese (1/2/3/4 o 5)");
    		opcion = in.nextInt();
    	}
    	switch(opcion) {
    	case 1:
    		this.calificacion = 1;
    		break;
    	case 2:
    		this.calificacion = 2;
    		break;
    	case 3:
    		this.calificacion = 3;
    		break;
    	case 4:
    		this.calificacion = 4;
    		break;
    	case 5:
    		this.calificacion = 5;
    		break;
    	}
    	System.out.println("Tiene experiencia en trabajar en equipo?\n\t1. Poca \\n\\t2. Moderada \\n\\t3. Parcialmente \\n\\t4. En buena proporcion \\nt5. En grande Proporcion");
    	opcion = in.nextInt();
    	while(opcion < 1 || opcion > 5) {
    		System.out.println("Opcion incorrecta Por favor ingrese (1/2/3/4 o 5)");
    		opcion = in.nextInt();
    	}
    	switch(opcion) {
    	case 1:
    		this.calificacion += 1;
    		break;
    	case 2:
    		this.calificacion += 2;
    		break;
    	case 3:
    		this.calificacion += 3;
    		break;
    	case 4:
    		this.calificacion += 4;
    		break;
    	case 5:
    		this.calificacion += 5;
    		break;
    	}
    	System.out.println("Se siente Capacitado para resolver cualquier tipo de problema?\n\t1. Poco \\n\\t2. Moderado \\n\\t3. Parcialmente \\n\\t4. En buena proporcion \\nt5. En grande Proporcion");
    	opcion = in.nextInt();
    	while(opcion < 1 || opcion > 5) {
    		System.out.println("Opcion incorrecta Por favor ingrese (1/2/3/4 o 5)");
    		opcion = in.nextInt();
    	}
    	switch(opcion) {
    	case 1:
    		this.calificacion += 1;
    		break;
    	case 2:
    		this.calificacion += 2;
    		break;
    	case 3:
    		this.calificacion += 3;
    		break;
    	case 4:
    		this.calificacion += 4;
    		break;
    	case 5:
    		this.calificacion += 5;
    		break;
    	}
    	System.out.println("Su calificacion final es:"+this.calificacion);
    }
    public void Postular(Empresa empresa) {
    	empresa.postulantes.enqueue(Trabajador.this);
    }
    
    public void IngresarCarrera() {
    	Scanner in = new Scanner(System.in);
    	String opcion;
    	int opcion1;
    	opcion = in.next();
    	int TipoCarrera = 0;
    	boolean EstadoCarrera = false;
    	while(!(opcion.equalsIgnoreCase("No")||opcion.equalsIgnoreCase("Si"))) {
    		System.out.println("Ingrese una opcion correcta (Si/No)");
    	}
    	while(!opcion.equalsIgnoreCase("No")) {
		    System.out.println("<=======Ingresando nueva carrera=======>");
		    System.out.println("Ingrese el tipo de Carrera, por favor escoja una opcion: \n\t1.Tecnica\n\t2.Ingenieria\n\t3.\nLicenciado");
		    opcion1 = in.nextInt();
		    while(opcion1 < 1 || opcion1 >3) {
		    	System.out.println("Por favor ingrese una opcion correcta (1/2/3)");
		    	opcion1 = in.nextInt();
		    }
		    switch(opcion1) {
		    case 1:
		    	TipoCarrera = 1;
		    case 2:
		    	TipoCarrera = 2;
		    case 3:
		    	TipoCarrera = 3;
		    }
		    System.out.println("Ingrese nombre Carrera: ");
		    String NombreCarrera = in.next();
		    System.out.println("Ingrese Centro de Estudios ");
		    String NombreUniversidad = in.next();
		    System.out.println("Estado de su Carrera: \n\t1. En Curso 2.Finalizado");
		    opcion1 = in.nextInt();
		    while(opcion1 < 1 || opcion1 > 2) {
		    	System.out.println("Por favor ingrese una opcion correcta (1/2)");
		    	opcion1 = in.nextInt();
		    }
		    switch(opcion1) {
		    case 1:
		    	EstadoCarrera = false;
		    	break;
		    case 2:
		    	EstadoCarrera = true;
		    	break;
		    }
		    System.out.println("Desea Guardar los datos ingresados?(Si/No)");
		    opcion = in.next();
		    while(!(opcion.equalsIgnoreCase("Si")||opcion.equalsIgnoreCase(opcion))) {
		    	System.out.println("Opcion incorrecta ingrese, ingrese opcion correcta (Si/No)");
		    	opcion = in.next();
		    }
		    if(opcion.equalsIgnoreCase("Si")) {
		    	this.carreras.insertLast(new Carrera(NombreCarrera,NombreUniversidad,TipoCarrera,EstadoCarrera));
		    }
    	}
    }
    public void ActualizarCV() {
    	this.Curriculum = new CV(Trabajador.this);
    }
    public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public ListLinked<Carrera> getCarreras() {
		return carreras;
	}
	public void setCarreras(ListLinked<Carrera> carreras) {
		this.carreras = carreras;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Trabajador.contador = contador;
	}
	public String getCategoria() 
    {
        return categoria;
    }
    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }
    public double getSalario() 
    {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getTelefono() 
    {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void guardar() 
    {
       System.out.println();
    }
    @Override
    public String toString() 
    {
        return "Codigo: "+this.codigo+"Apellidos: " + this.getApellidos() + 
                ", Nombres: " + this.getNombres() +
                ", Categoria: " + this.getCategoria() + ", Salario: S/." +
                this.getSalario() + ", Telefono: " + this.getTelefono() + ", Calificacion: "+this.calificacion+"\n";
    }
    public boolean equals(Object o) {
    	if(o instanceof Trabajador) {
    		Trabajador a = (Trabajador) o;
    		return this.codigo==a.codigo;
    	}
    	return false;
    }
    public int compareTo(Trabajador o) {
    	if(this.calificacion <o.calificacion) return -1;
    	else if(this.calificacion > o.calificacion) return 1;
    	else {
    		return 0;
    	}
    }
	public CV getCurriculum() {
		return Curriculum;
	}
	public void setCurriculum(CV curriculum) {
		Curriculum = curriculum;
	}
	public Empresa getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(Empresa empresa) {
		Empresa = empresa;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
