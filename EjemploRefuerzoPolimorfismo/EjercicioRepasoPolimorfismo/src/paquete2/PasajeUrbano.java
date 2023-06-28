
package paquete2;

public abstract class PasajeUrbano{
    
    protected double valorPasaje;
    protected double valorFijo;
    protected Persona usuario;
    
    public PasajeUrbano(double pasajeFijo){
        valorFijo = pasajeFijo;
    }
    
    public void establecerPersona(Persona u, double fijo){
        usuario = u;
        valorFijo = fijo;
    }
    
       
    public void establecerPersona(Persona p){
        usuario = p;
    }
    
    public Persona obtenerPersona(){
        return usuario;
    }
    
    public void establecerValorFijo(double p){
        valorFijo = p;
    }
    
    public double obtenerValorFijo(){
        return valorFijo;
    }
    
    public abstract void establecerValorPasaje();
    
    public double obtenerValorPasaje(){
        return valorPasaje;
    }
    
    
    @Override
    public String toString(){
        return String.format("Pasajero: %s\n"
                    + "Cédula: %s\n"
                    + "Valor Pasaje: %.2f\n"
                    + "---------------------\n",
                    obtenerPersona().obtenerNombre(),
                    obtenerPersona().obtenerCedula(),
                    obtenerValorPasaje());
    }
    
    
}
