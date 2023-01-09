public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        System.out.println("El resultado de la suma es: " + suma(num1,num2,num3));
        Coche miCoche = new Coche(1);
        miCoche.incrementarPuertas();
        System.out.println("El número de puertas de mi coche es: " + miCoche.getNumPuertas());
    }
    public static int suma(int num1,int num2,int num3){
        int result = num1+num2+num3;
        return result;
    }
}