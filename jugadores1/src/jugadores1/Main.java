package jugadores1;

public class Main {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Aragorn");
        Jugador j2 = new Jugador("Legolas");

  
        System.out.println("--- ESTADO INICIAL ---");
        j1.mostrarDatos();
        j2.mostrarDatos();


        System.out.println("\n--- ACCIONES ---");
        j1.ganarPuntos(150);
        j2.ganarPuntos(200);
        j1.ganarPuntos(-50); 
        j2.subirNivel();


        System.out.println("\n--- ESTADO FINAL ---");
        j1.mostrarDatos();
        j2.mostrarDatos();
    }
}
