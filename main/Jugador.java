import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int velocidad;
    private int posesion;
    private int habilidadRemate;
    private static int numeroVertices=0;
    private int id;
    private ArrayList<Jugador> jugadoresAdyacentes;
    
    //Constructor
    public Jugador(int velocidad, int habilidadRemate, int posesion, String nombre){
        this.velocidad= velocidad;
        this.posesion= posesion;
        this.habilidadRemate= habilidadRemate;
        this.nombre= nombre;
        id= numeroVertices++;
        jugadoresAdyacentes= new ArrayList<>();
    }
    
    //Obtener
    public String obtenerNombre(){
        return nombre;
    }

    public int obtenerVelocidad(){
        return velocidad;
    }

    public int obtenerHabilidadRemate(){
        return habilidadRemate;
    }

    public int obtenerPosesion(){
        return posesion;
    }

    //Añado jugadores adyacentes al jugador
    public void añadirJugadorAdyacente(Jugador jugador){
        jugadoresAdyacentes.add(jugador);
    }

    public int obtenerId(){
        return id;
    }

}
