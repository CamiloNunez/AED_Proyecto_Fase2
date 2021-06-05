
public abstract class Persona
{
    private int dni;
    private String nombres;
    private String apellidos;
    public Persona(int dni, String nombres, String apellidos)
    {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public int getDni() 
    {
        return dni;
    }
    public void setDni(int dni) 
    {
        this.dni = dni;
    }
    public String getNombres() 
    {
        return nombres;
    }
    public void setNombres(String nombres) 
    {
        this.nombres = nombres;
    }
    public String getApellidos() 
    {
        return apellidos;
    }
    public void setApellidos(String apellidos) 
    {
        this.apellidos = apellidos;
    }
    public abstract void guardar();
    public abstract void actualizar();
    public abstract String toString();
	public int CompareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
