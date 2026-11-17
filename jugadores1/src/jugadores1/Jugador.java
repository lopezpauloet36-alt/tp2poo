package jugadores1;


public class Jugador {
    private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntos = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void ganarPuntos(int cantidad) {
        if (cantidad > 0) {
            this.puntos += cantidad;
            System.out.println(this.nombre + " ganó " + cantidad + " puntos.");
        } else {
            System.out.println("Error: No se pueden sumar puntos negativos o cero (" + cantidad + ") a " + this.nombre + ".");
        }
    }

    public void subirNivel() {
        this.nivel++;
        System.out.println("¡" + this.nombre + " subió al nivel " + this.nivel + "!");
    }

    public void mostrarDatos() {
        System.out.println("Jugador: " + nombre + " | Nivel: " + nivel + " | Puntos: " + puntos);
    }
}