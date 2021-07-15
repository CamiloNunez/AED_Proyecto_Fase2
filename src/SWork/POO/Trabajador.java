package SWork.POO;
import java.util.*;
public class Trabajador extends Persona
{
    private String categoria;
    private double salario;
    private int telefono;
    private int codigo;
    int calificacion;
    private CV Curriculum = new CV();
    private Empresa Empresa = new Empresa();
    private Usuario a = new Usuario();
    public Trabajador(int codigo,String nombres, String apellidos, int edad, String categoria, double salario, int telefono, int calificacion, CV cv)
    {
        super(nombres,apellidos,edad);
        this.categoria = categoria;
        this.salario = salario;
        this.telefono = telefono;
        this.codigo = codigo;
        this.Curriculum = cv;
        
    }
    public Trabajador(int codigo, String nombres,String apellidos, int edad, int telefono) {
    	super(nombres,apellidos,edad);
    	this.telefono = telefono;
    }
    public Trabajador() {}
    public static Trabajador RegistrarTrabajador() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("<=======\tINGRESANDO NUEVO TRABAJADOR\t=======>");
    	System.out.println("Ingrese Codigo");
    	int codigo = in.nextInt();
    	System.out.println("Ingrese Nombre:");
    	String Nombres = in.next();
    	System.out.println("Ingrese Apellidos");
    	String Apellidos = in.next();
    	System.out.println("Ingrese edad");
    	int edad = in.nextInt();
    	System.out.println("Ingrese telefono");
    	int telefono = in.nextInt();
    	return new Trabajador(codigo,Nombres,Apellidos,edad,telefono);
    }
    public void ObtenerCalificacion() {
    	
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
    public void actualizar() 
    {
        System.out.println();
        
    }
    @Override
    public String toString() 
    {
        return "Apellidos: " + this.getApellidos() + 
                ", Nombres: " + this.getNombres() +
                ", Categoria: " + this.getCategoria() + ", Salario: S/. " +
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
}
