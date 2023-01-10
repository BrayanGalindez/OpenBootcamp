package EjerciciosTema4;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 4;

        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("Valor de la variable en el bucle While: " + numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 0;

        do {
            System.out.println("Valor de la variable en el bucle Do While: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        int numeroFor = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.println("Valor de la variable en el bucle For: " + numeroFor);
            numeroFor++;
        }

        String estacion = "Primavera";

        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en Primavera.");
                break;
            case "Verano":
                System.out.println("Estamos en Verano.");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño.");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno.");
                break;
            default:
                System.out.println("Estación no reconocida.");
        }
    }
}