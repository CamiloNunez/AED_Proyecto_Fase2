import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
    	
        Linked a = new Linked();

        Node root = null;
        Usuario Fab = new Usuario(727445,"fabri","jaja");
        Fab.Login();
        
        root = a.insertRec(new Trabajador(72478667,"Johan","Mendoza","Programacion",234,72464,1), root);
        root = a.insertRec(new Trabajador(7564545,"Gonzalo","Mendoza","Programacion",234,72464,2), root);
        root = a.insertRec(new Trabajador(4564654,"","Quispe","Programacion",234,72464,4), root);
        root = a.insertRec(new Trabajador(4545454,"Gabriel","Josue","Programacion",234,72464,2), root);
        root = a.insertRec(new Trabajador(7984515,"Roxana","Saldivar","Programacion",234,72464,1), root);
        System.out.println("Lista de trabajadores");
        a.printListRec(root);
        System.out.println("Ordenados Por Calificacion");
        Node sorted = a.mergeSortRec(root);
        a.printListRec(sorted);
       
    }
}
