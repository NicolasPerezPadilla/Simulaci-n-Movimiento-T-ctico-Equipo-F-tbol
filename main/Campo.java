import java.util.ArrayList;

public class Campo {
    private ArrayList<Jugador> jugadores;
    private int [][] matrizAdyacencia;
    
    //Constructor
    public Campo(){
        jugadores= new ArrayList<>();
    }

    //Añado jugadores al campo
    public void añadirJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    //Conecto jugadores con sus adyacentes y agrego a la matriz de adyacencia
    public void conectarJugadores(Jugador jugador1, Jugador jugador2) {

        if (this.matrizAdyacencia == null) {
            this.matrizAdyacencia = new int[jugadores.size()][jugadores.size()];
        }

        jugador1.añadirJugadorAdyacente(jugador2);
        jugador2.añadirJugadorAdyacente(jugador1);

        this.matrizAdyacencia[jugador1.obtenerId()][jugador2.obtenerId()] = 1;
        this.matrizAdyacencia[jugador2.obtenerId()][jugador1.obtenerId()] = 1;

    }

    //Imprimo la lista de jugadores y la matriz de adyacencia
    public void imprimir(){
    
        // Imprimir jugadores
        System.out.println("Jugadores: ");

        for (Jugador jugador : jugadores) {
            System.out.println(" | "+ jugador.obtenerNombre()+": Velocidad = "+jugador.obtenerVelocidad()+"; Habilidad de Remate = "+jugador.obtenerHabilidadRemate()+"; Posesion = "+jugador.obtenerPosesion());
        }
        
        System.out.println("");
        System.out.println("");
        

        // Impirmir matriz de adyacencia
        System.out.println("Matriz de Adyacencia: ");
        
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                System.out.print(" | "+matrizAdyacencia[i][j]);
            }
            System.out.println("");
        }
        
    }

}
