
package paquete2;


public class Persona {
    
    private String nombre;
    private String cedula;
    private int edad;
    
    public Persona(String n, String ide, int ed){
        nombre = n;
        cedula = ide;
        edad = ed;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCedula(String n){
        cedula = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
}
