package SWork.POO;

public class CV {
	String Nombres;
	String Apellidos;
	String EstiloCV;
	Carrera carrera;
	public CV() {
		
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEstiloCV() {
		return EstiloCV;
	}
	public void setEstiloCV(String estiloCV) {
		EstiloCV = estiloCV;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
}
