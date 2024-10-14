public class Main {
    public static void main(String[] args){
        Campo campo= new Campo();

        Jugador jugador1= new Jugador(85, 70, 75, "a");
        Jugador jugador2= new Jugador(80, 65, 80, "b");
        Jugador jugador3= new Jugador(75, 80, 70,"c");
        Jugador jugador4= new Jugador(70, 85, 65, "d");
        Jugador jugador5= new Jugador(82, 75, 78, "e");
        Jugador jugador6= new Jugador(78, 82, 73, "f");
        Jugador jugador7= new Jugador(75, 70, 80, "g");
        Jugador jugador8= new Jugador(79, 73, 85, "h");
        Jugador jugador9= new Jugador(81, 68, 75, "i");
        Jugador jugador10= new Jugador(73, 80, 77, "j");
        Jugador jugador11= new Jugador(77, 75, 78, "k");

        campo.añadirJugador(jugador1);
        campo.añadirJugador(jugador2);
        campo.añadirJugador(jugador3);
        campo.añadirJugador(jugador4);
        campo.añadirJugador(jugador5);
        campo.añadirJugador(jugador6);
        campo.añadirJugador(jugador7);
        campo.añadirJugador(jugador8);
        campo.añadirJugador(jugador9);
        campo.añadirJugador(jugador10);
        campo.añadirJugador(jugador11);

        campo.conectarJugadores(jugador1, jugador2);
        campo.conectarJugadores(jugador1, jugador3);
        campo.conectarJugadores(jugador1, jugador4);
        campo.conectarJugadores(jugador1, jugador5);

        campo.conectarJugadores(jugador2, jugador3);
        campo.conectarJugadores(jugador2, jugador6);
        campo.conectarJugadores(jugador2, jugador7);

        campo.conectarJugadores(jugador3, jugador4);
        campo.conectarJugadores(jugador3, jugador6);
        campo.conectarJugadores(jugador3, jugador7);
        campo.conectarJugadores(jugador3, jugador8);

        campo.conectarJugadores(jugador4, jugador5);
        campo.conectarJugadores(jugador4, jugador7);
        campo.conectarJugadores(jugador4, jugador8);
        campo.conectarJugadores(jugador4, jugador9);

        campo.conectarJugadores(jugador5, jugador8);
        campo.conectarJugadores(jugador5, jugador9);

        campo.conectarJugadores(jugador6, jugador7);
        campo.conectarJugadores(jugador6, jugador10);

        campo.conectarJugadores(jugador7, jugador8);
        campo.conectarJugadores(jugador7, jugador10);
        campo.conectarJugadores(jugador7, jugador11);

        campo.conectarJugadores(jugador8, jugador9);
        campo.conectarJugadores(jugador8, jugador10);
        campo.conectarJugadores(jugador8, jugador11);

        campo.conectarJugadores(jugador9, jugador11);
        

        campo.imprimir();

    }
}
