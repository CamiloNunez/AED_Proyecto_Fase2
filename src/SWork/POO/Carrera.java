package SWork.POO;

public class Carrera {
	String NombreCarrera;
	int Tipo;
	String NombreUniversidad;
	boolean Estado;
	public Carrera(String NombreCarrera,String NombreUniversidad, int Tipo, boolean Estado) {
		this.NombreCarrera = NombreCarrera;
		this.NombreUniversidad = NombreUniversidad;
		this.Tipo = Tipo;
		this.Estado = Estado;
	}
	public String ObtenerEstado() {
		if(Estado == true) {
			return "terminado";
		}
		else {
			return "en curso";
		}
	}
	public String ObtenerTipoProfesional() {
		if(Tipo == 1) {
			return "Tecnico";
		}
		if(Tipo == 2) {
			return "Ingeniero";
		}
		if(Tipo == 3) {
			return "Licenciado";
		}
		else {
			return "Tipo Profesional no especificado";
		}
	}
	public String getNombreCarrera() {
		return NombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		NombreCarrera = nombreCarrera;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public String getNombreUniversidad() {
		return NombreUniversidad;
	}
	public void setNombreUniversidad(String nombreUniversidad) {
		NombreUniversidad = nombreUniversidad;
	}
	public boolean getEstado() {
		return Estado;
	}
	public void setEstado(boolean estado) {
		Estado = estado;
	}
	public String toString() {
		return "Carrera: "+this.NombreCarrera+"Centro de Estudios: "+this.NombreUniversidad+"Tipo de Profesional: "+this.ObtenerTipoProfesional()+"Estado: "+this.ObtenerEstado();
	}
}
