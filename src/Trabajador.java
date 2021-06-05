public class Trabajador extends Persona
{
    private String categoria;
    private double salario;
    private int telefono;
    private int codigo;
    int calificacion;
    public Trabajador(int dni, String nombres, String apellidos, String categoria, double salario, int telefono, int calificacion)
    {
        super(dni,nombres,apellidos);
        this.categoria = categoria;
        this.salario = salario;
        this.telefono = telefono;
        if(calificacion<1 || calificacion>5) {
        	System.out.println("Calficacion fuera de rango, ingrese una calficacion correcta");
        	
        }
        else {
        	this.calificacion = calificacion;
        }
        
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
    
    @Override
    public void guardar() 
    {
       System.out.println();
    }
    @Override
    public void actualizar() 
    {
        System.out.println();
        
    }
    @Override
    public String toString() 
    {
        return "DNI: " + this.getDni() + ", Apellidos: " + this.getApellidos() + 
                ", Nombres: " + this.getNombres() +
                ", Categoria: " + this.getCategoria() + ", Salario: S/. " +
                this.getSalario() + ", Telefono: " + this.getTelefono() + ", Calificacion: "+this.calificacion+"\n";
    }
    
    public int compareTo(Trabajador o) {
    	if(this.calificacion <o.calificacion) return -1;
    	else if(this.calificacion > o.calificacion) return 1;
    	else {
    		return 0;
    	}
    }
}
