import java.util.Random;

public class Cinema {
    Movie movie1 = new Movie("Spiderman",118,7, "Sam Raimi",5.8);
    Movie movie2 = new Movie("El señor de los Anillos",120,12, "Peter Jackson",13);
    Movie movie3 = new Movie("Harry Potter",109,7, "David Yates",14.7);
    Movie movie4 = new Movie("Los Vengadores",134,12, "Joss Whedon",16.3);


    Movie currentMovie;
    CinemaHall cinemaHall;
    Viewer viewer;

    //CONSTRUCTORES//

    public Cinema() {
        this.currentMovie = null;
        this.cinemaHall = new CinemaHall();
        this.viewer = new Viewer();
    }
    //GENERACIÓN DE LA SALA//

    public void cinemaHall_generate() {
        //Aqui rellenamos la matriz con numeros y letras, y concatenamos los numeros y los caracteres
        // para poder formar un String

        Random rand = new Random();
        char letter = 'A';

        for (int i = 0; i < cinemaHall.seat.length; i++) {
            for (int j = 0; j < cinemaHall.seat[i].length; j++) {
                if (rand.nextInt(100)<(60)){
                    cinemaHall.seat[i][j] = "X" + " "; //Asiento ocupado
                }
                else {
                    cinemaHall.seat[i][j] = (i + 1) + String.valueOf((char) (letter + j));
                }
            }
        }
        //Pasamos a ordenar la matriz de la manera que nos pide el enunciado
        for (int i = cinemaHall.seat.length - 1; i >= 0; i--) {
            for (int j = 0; j < cinemaHall.seat[i].length; j++) {
                System.out.print(cinemaHall.seat[i][j] + " ");
            }
            System.out.println();
        }
    }
    //PARA MOSTRAR LA SALA
    public void show_cinemaHall() {
        for (int i = cinemaHall.seat.length - 1; i >= 0; i--) {
            for (int j = 0; j < cinemaHall.seat[i].length; j++) {
                System.out.print(cinemaHall.seat[i][j] + " ");
            }
            System.out.println();
        }
    }

    //VERIFICACIÓN PELICULA//

    //Es un metodo de Java para comparar cadenas. Compara el contenido de dos String ignorando mayúsculas y minúsculas
    public boolean selectMovie(String title) {
        if (title.equalsIgnoreCase(movie1.getTitle())) {
            currentMovie = movie1;
        } else if (title.equalsIgnoreCase(movie2.getTitle())) {
            currentMovie = movie2;
        } else if (title.equalsIgnoreCase(movie3.getTitle())) {
            currentMovie = movie3;
        } else if (title.equalsIgnoreCase(movie4.getTitle())) {
            currentMovie = movie4;
        } else {
            System.out.println("Película no disponible.");
            return false;
        }
        System.out.println("Película seleccionada: " + currentMovie.getTitle());
        return true;
    }

    //VERIFICACIÓN DE ASIENTOS//

    public Boolean seat_verification (String viewer_name, int viewer_age, double viewer_money, String chosen_movie, int row_index, int col_index){

        if (viewer_age < currentMovie.getMinimum_age()) {
            System.out.println("No cumple la edad mínima.");
            return false;

        } else if(viewer_money < currentMovie.getPrice()) {
            System.out.println("No tiene suficiente dinero.");
            return false;

        } else if (chosen_movie == null) {
            System.out.println("Primero debe seleccionar una película.");
            return false;
        } else if (cinemaHall.seat[row_index][col_index].equals("X" + " ")) {
            System.out.println("Asiento ocupado.");
            return false;
        } else{
            cinemaHall.seat[row_index][col_index] = "X" + " ";
            System.out.println("¡Enhorabuena " + viewer_name +"!" + " Ha conseguido su asiento para la película de " + currentMovie.getTitle());
            return true;
        }
    }
}
