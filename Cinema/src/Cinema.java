import java.util.Random;

public class Cinema {
    Movie pelicula1 = new Movie("Spiderman",118,7, "Sam Raimi",5.8);
    Movie pelicula2 = new Movie("El señor de los Anillos",120,12, "Peter Jackson",13);
    Movie pelicula3 = new Movie("Harry Potter",109,7, "David Yates",14.7);
    Movie pelicula4 = new Movie("Los Vengadores",134,12, "Joss Whedon",16.3);

    Movie pelicula_actual;
    CinemaHall sala;
    Viewer espectador;

    //CONSTRUCTORES//

    public Cinema() {
        this.pelicula_actual = null;
        this.sala = new CinemaHall();
        this.espectador = new Viewer();
    }
    //GENERACIÓN DE LA SALA//

    public void generar_sala() {
        //Aqui rellenamos la matriz con numeros y letras, y concatenamos los numeros y los caracteres
        // para poder formar un String

        Random rand = new Random();
        char letra = 'A';

        for (int i = 0; i < sala.asiento.length; i++) {
            for (int j = 0; j < sala.asiento[i].length; j++) {
                if (rand.nextInt(100)<(60)){
                    sala.asiento[i][j] = "X" + " "; //Asiento ocupado
                }
                else {
                    sala.asiento[i][j] = (i + 1) + String.valueOf((char) (letra + j));
                }
            }
        }
        //Pasamos a ordenar la matriz de la manera que nos pide el enunciado
        for (int i = sala.asiento.length - 1; i >= 0; i--) {
            for (int j = 0; j < sala.asiento[i].length; j++) {
                System.out.print(sala.asiento[i][j] + " ");
            }
            System.out.println();
        }
    }
    //PARA MOSTRAR LA SALA
    public void mostrar_sala() {
        for (int i = sala.asiento.length - 1; i >= 0; i--) {
            for (int j = 0; j < sala.asiento[i].length; j++) {
                System.out.print(sala.asiento[i][j] + " ");
            }
            System.out.println();
        }
    }

    //VERIFICACIÓN PELICULA//

    //Es un metodo de Java para comparar cadenas. Compara el contenido de dos String ignorando mayúsculas y minúsculas
    public boolean seleccionarPelicula(String titulo) {
        if (titulo.equalsIgnoreCase(pelicula1.getTitulo())) {
            pelicula_actual = pelicula1;
        } else if (titulo.equalsIgnoreCase(pelicula2.getTitulo())) {
            pelicula_actual = pelicula2;
        } else if (titulo.equalsIgnoreCase(pelicula3.getTitulo())) {
            pelicula_actual = pelicula3;
        } else if (titulo.equalsIgnoreCase(pelicula4.getTitulo())) {
            pelicula_actual = pelicula4;
        } else {
            System.out.println("Película no disponible.");
            return false;
        }
        System.out.println("Película seleccionada: " + pelicula_actual.getTitulo());
        return true;
    }

    //VERIFICACIÓN DE ASIENTOS//

    public Boolean verificacion_asiento (String nombre_espectador, int edad_espectador, double dinero_espectador, String pelicula_elegida, int fila_index, int col_index){

        if (edad_espectador < pelicula_actual.getEdad_minima()) {
            System.out.println("No cumple la edad mínima.");
            return false;

        } else if(dinero_espectador < pelicula_actual.getPrecio()) {
            System.out.println("No tiene suficiente dinero.");
            return false;

        } else if (pelicula_elegida == null) {
            System.out.println("Primero debe seleccionar una película.");
            return false;
        } else if (sala.asiento[fila_index][col_index].equals("X" + " ")) {
            System.out.println("Asiento ocupado.");
            return false;
        } else{
            sala.asiento[fila_index][col_index] = "X" + " ";
            System.out.println("¡Enhorabuena " + nombre_espectador +"!" + " Ha conseguido su asiento para la película de " + pelicula_actual.getTitulo());
            return true;
        }
    }
}
