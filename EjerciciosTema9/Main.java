package EjerciciosTema9;

public class Main {
    public static void main(String[]args){
        Cliente cliente1 = new Cliente(1000, "Juan",19,391093091);
        System.out.println("Nombre: "+cliente1.getNombre());
        System.out.println("Edad: "+cliente1.getEdad());
        System.out.println("Telefono: "+cliente1.getTelefono());
        System.out.println("Credito: "+cliente1.getCredito());
        System.out.println(" ");
        Trabajador trabajador1 = new Trabajador(10000000, "Camilo",27,2121214);
        System.out.println("Nombre: "+trabajador1.getNombre());
        System.out.println("Edad: "+trabajador1.getEdad());
        System.out.println("Telefono: "+trabajador1.getTelefono());
        System.out.println("salario: "+trabajador1.getSalario());
    }

}
class Persona{
    public int edad;
    public String nombre;
    public int telefono;

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

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
class Cliente extends Persona{
    public int credito;

    public Cliente(int edad, String nombre, int telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    public int salario;
    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}