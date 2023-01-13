package EjerciciosTema8;

public class Main {
    public static void main(String[] args){
        Persona señor = new Persona();
        señor.setNombre("Luis");
        señor.setEdad(11);
        señor.setTelefono(315774);
        System.out.println("Edad: "+señor.getEdad()+" "+"Nombre: " +señor.getNombre()+" "+ "Telefono: "+señor.getTelefono());

    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}


