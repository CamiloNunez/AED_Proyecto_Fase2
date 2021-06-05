import java.util.*;
public class Usuario extends Persona implements Comparable
{
    private String nickname;
    private String password;
    public Usuario(int dni, String nombres, String apellidos) 
    {
        super(dni, nombres, apellidos);
    }
    public String getNickname() 
    {
        return nickname;
    }
    public void setNickname(String nickname) 
    {
        this.nickname = nickname;
    }
    public String getPassword() 
    {
        return password;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }
    @Override
    public void guardar() {
    
    }
    public void ingresar() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Ingrese NickName");
    	this.nickname=in.next();
    	System.out.println("Ingrese Password");
    	this.password=in.next();
    	System.out.println("Usuario registrado exitosamente");
    }
    @Override
    public void actualizar() 
    {
        
    }
    @Override
    public String toString() 
    {
        return "Nombre";
    }
    public void Login(){
    	Scanner s = new Scanner(System.in);
    	System.out.println("Desea ingresar a la plataforma? si/no");
    	String res;
    	res = s.next();
    	if(res.compareTo("si")==0) {
    		ingresar();
    	}
    	else {
    		System.out.println("Saliendo del programa");
    	}
    	
    }
    public int compareTo(Object o) {
       return 0;
    }
}