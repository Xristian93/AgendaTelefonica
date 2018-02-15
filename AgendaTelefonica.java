import java.util.HashMap;

/**
 * Write a description of class AgendaTelefonica here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    HashMap<String, String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        // initialise instance variables
        agenda = new HashMap<>();
    }

    /**
     * Introducir numero de telefono
     */
    public void enterNumber (String nombre, String numero){
        agenda.put(nombre, numero);
    }
    
    /**
     * Leer numero de telefono
     */
    public void lookupNumber (String nombre){
        System.out.println(agenda.get(nombre));
    }
    
    /**
     * Imprime todas las claves
     */
    public void printAllNames(){
        System.out.println(agenda.values());
    }
}
