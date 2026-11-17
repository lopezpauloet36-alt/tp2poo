package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Docente("Alan Uzal", 27, "redes");
        Persona p2 = new Preceptor("Pablo Greco", 31, "5to 3ra");

        Persona[] personal = { p1, p2 };

        System.out.println("--- DATOS INICIALES ---");
        for (Persona p : personal) {

            p.mostrarInformacion();
        }


        System.out.println("\n--- MODIFICANDO EDAD ---");
        p1.setEdad(-5);
        p1.setEdad(43);

        System.out.println("\n--- DATOS ACTUALIZADOS ---");
        for (Persona p : personal) {
            p.mostrarInformacion();
        }
    }
}